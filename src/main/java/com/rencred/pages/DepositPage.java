package com.rencred.pages;

import com.rencred.driver.HelpBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class DepositPage extends HelpBase {

    public DepositPage(WebDriver wd) {
        super(wd);
    }

    public WebElement calculatorBlock(){
         return blockElement(By.cssSelector(".calculator__content"));
    }

    public void selectOpenDeposit(String type){
        calculatorBlock().findElement(By.xpath("//*[contains(text(), '" + type + "')]")).click();
    }


}
