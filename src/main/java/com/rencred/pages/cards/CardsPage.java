package com.rencred.pages.cards;

import com.rencred.driver.HelpBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CardsPage extends HelpBase {

    public CardsPage(WebDriver wd) {
        super(wd);
    }

    public WebElement cardBlock(String name) {
        return blockElement(By.xpath("//div[@class='cards-list__item' and .//a[text()='" + name + "']]"));
    }

    public void fillQuestionnaireOnCard(String name) {
        cardBlock(name).findElement(By.xpath(".//a[text()='Заполнить заявку на карту']")).click();
    }
}
