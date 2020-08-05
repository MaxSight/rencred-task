package com.rencred.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelpBase {

    protected WebDriver wd;

    public HelpBase (WebDriver wd){
        this.wd = wd;
    }

    public void clickElement(By locator) {
        wd.findElement(locator).click();
    }

    public WebElement blockElement(By locator) {
        return wd.findElement(locator);
    }

    public WebElement inputField(By locator) {
        return wd.findElement(locator);
    }

    public WebElement sliderElement(By locator) {
        return wd.findElement(locator);
    }


}
