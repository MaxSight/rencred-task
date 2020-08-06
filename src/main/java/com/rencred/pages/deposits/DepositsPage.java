package com.rencred.pages.deposits;

import com.rencred.driver.HelpBase;
import com.rencred.driver.allure.NamedBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class DepositsPage extends HelpBase {

    public DepositsPage(WebDriver wd) {
        super(wd);
    }

    public WebElement sumOfDepositField() {
        return inputField(NamedBy.css("[name='amount']").as("Поле Сумма вклада"));
    }

    public WebElement calculatorBlock() {
        return blockElement(NamedBy.css(".calculator__content").as("Блок Калькулятор"));
    }

    public WebElement slider(String name) {
        return sliderElement(NamedBy.xpath("//div[@class='calculator__slide-section' and .//label[text()='" + name + "']]").as("Сайдер " + name + ""));
    }

    public void getSliderAndMoveToPosition(String name, String value) {
        slider(name).findElement(NamedBy.xpath("//*[contains(text(), '" + value + "')]").as("Сайдер " + name + "")).click();
    }

    public void selectOpenDeposit(String type) {
        calculatorBlock().findElement(NamedBy.xpath("//*[contains(text(), '" + type + "')]").as("Чекбокс " + type + "")).click();
    }


}
