package com.rencred.pages.cards;

import com.rencred.driver.HelpBase;
import com.rencred.driver.allure.NamedBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CardsPage extends HelpBase {

    public CardsPage(WebDriver wd) {
        super(wd);
    }

    public WebElement cardBlock(String name) {
        return blockElement(NamedBy.xpath("//div[@class='cards-list__item' and .//a[text()='" + name + "']]").as("Блок Карты"));
    }

    public void fillQuestionnaireOnCard(String name) {
        cardBlock(name).findElement(NamedBy.xpath(".//a[text()='Заполнить заявку на карту']").as("Кнопка Заполнить заявку на карту")).click();
    }
}
