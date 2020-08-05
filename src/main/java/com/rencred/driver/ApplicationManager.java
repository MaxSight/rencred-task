package com.rencred.driver;

import com.rencred.pages.DepositPage;
import com.rencred.pages.MainPage;
import javafx.scene.control.CheckBox;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    WebDriver wd;
    private MainPage mainPage;
    private DepositPage depositPage;

    public void init(){
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");

        wd = new ChromeDriver();

        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.get("https://rencredit.ru/");
        wd.manage().window().maximize();

        mainPage = new MainPage(wd);
        depositPage = new DepositPage(wd);
    }

    public void stop() {
        wd.quit();
    }

    public MainPage mainPage(){
        return mainPage;
    }

    public DepositPage depositPage(){ return depositPage;}

}
