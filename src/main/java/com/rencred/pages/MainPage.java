package com.rencred.pages;

import com.rencred.driver.HelpBase;
import com.rencred.driver.allure.NamedBy;
import org.openqa.selenium.WebDriver;

public class MainPage extends HelpBase {

    public MainPage(WebDriver wd) {
        super(wd);
    }

    public void selectProductBlock(String name) {
        clickElement(NamedBy.xpath("//div[@class='service__title' and .//div='" + name + "']").as("Выбираем продукт " + name + ""));
    }
}
