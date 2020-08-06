package com.rencred.pages;

import com.rencred.driver.HelpBase;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends HelpBase {

    public MainPage(WebDriver wd) {
        super(wd);
    }

    @Step("Выбираем продукт \"{0}\"")
    public void selectProductBlock(String name) {
        clickElement(By.xpath("//div[@class='service__title' and .//div='" + name + "']"));
    }
}
