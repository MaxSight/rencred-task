package com.rencred.pages.deposits;

import com.rencred.driver.HelpBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class DepositsPage extends HelpBase {

    public DepositsPage(WebDriver wd) {
        super(wd);
    }

    public WebElement sumOfDepositField() {
        return inputField(By.cssSelector("[name='amount']"));
    }

    public WebElement calculatorBlock() {
        return blockElement(By.cssSelector(".calculator__content"));
    }

    public WebElement slider(String name) {
        return sliderElement(By.xpath("//div[@class='calculator__slide-section' and .//label[text()='" + name + "']]"));
    }

    public void getSliderAndMoveToPosition(String name, String value) {
        slider(name).findElement(By.xpath("//*[contains(text(), '" + value + "')]")).click();
    }

    public void selectOpenDeposit(String type) {
        calculatorBlock().findElement(By.xpath("//*[contains(text(), '" + type + "')]")).click();
    }


}
