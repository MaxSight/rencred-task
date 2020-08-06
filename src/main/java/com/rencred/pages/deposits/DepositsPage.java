package com.rencred.pages.deposits;

import com.rencred.driver.HelpBase;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class DepositsPage extends HelpBase {

    public DepositsPage(WebDriver wd) {
        super(wd);
    }

    @Step()
    public WebElement sumOfDepositField() {
        return inputField(By.cssSelector("[name='amount']"));
    }

    //Блок Калькулятора
    public WebElement calculatorBlock() {
        return blockElement(By.cssSelector(".calculator__content"));
    }

    public WebElement slider(String name) {
        return sliderElement(By.xpath("//div[@class='calculator__slide-section' and .//label[text()='" + name + "']]"));
    }

    @Step("Двигаем слайдер \"{0}\"")
    public void getSliderAndMoveToPosition(String name, String value) {
        slider(name).findElement(By.xpath("//*[contains(text(), '" + value + "')]")).click();
    }

    @Step("Отмечаем чекбокс \"{0}\" ")
    public void selectOpenDeposit(String type) {
        calculatorBlock().findElement(By.xpath("//*[contains(text(), '" + type + "')]")).click();
    }


}
