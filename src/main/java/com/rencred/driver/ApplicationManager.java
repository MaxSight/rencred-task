package com.rencred.driver;

import com.rencred.pages.MainPage;
import com.rencred.pages.cards.CardsPage;
import com.rencred.pages.cards.QuestionnareForCardPage;
import com.rencred.pages.deposits.DepositsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    WebDriver wd;
    private MainPage mainPage;
    private DepositsPage depositsPage;
    private CardsPage cardsPage;
    private QuestionnareForCardPage questionnareForCardPage;

    public void init(){
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");

        wd = new ChromeDriver();

        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.get("https://rencredit.ru/");
        wd.manage().window().maximize();

        mainPage = new MainPage(wd);
        depositsPage = new DepositsPage(wd);
        cardsPage = new CardsPage(wd);
        questionnareForCardPage = new QuestionnareForCardPage(wd);
    }

    public void stop() {
        wd.quit();
    }

    public MainPage mainPage(){
        return mainPage;
    }

    public DepositsPage depositPage() {
        return depositsPage;
    }

    public CardsPage cardsPage() {
        return cardsPage;
    }

    public QuestionnareForCardPage questionnareForCardPage() {
        return questionnareForCardPage;
    }

}
