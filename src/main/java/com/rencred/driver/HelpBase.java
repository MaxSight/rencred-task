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

    public void isDisplayedElement(By locator) {
        wd.findElement(locator).isDisplayed();
    }

    public WebElement blockElement(By locator) {
        return wd.findElement(locator);
    }


}
