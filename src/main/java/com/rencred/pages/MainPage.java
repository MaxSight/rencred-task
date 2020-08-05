package com.rencred.pages;

import com.rencred.driver.HelpBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends HelpBase {

    public MainPage(WebDriver wd) {
        super(wd);
    }

    public void selectProductBlock(String name){
        clickElement(By.xpath("//div[@class='service__title' and .//div='" + name + "']"));
    }
}
