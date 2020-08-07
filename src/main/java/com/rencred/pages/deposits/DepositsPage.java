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

    @Step("Поле Сумма")
    public WebElement sumOfDepositField() {
        return inputField(By.cssSelector("[name='amount']"));
    }

    public WebElement calculatorBlock() {
        return blockElement(By.cssSelector(".calculator__content"));
    }

    public WebElement calculatorResultBlock() {
        return blockElement(By.cssSelector(".calculator__result-block"));
    }

    public WebElement slider(String name) {
        return sliderElement(By.xpath("//div[@class='calculator__slide-section' and .//label[text()='" + name + "']]"));
    }

    @Step("Двигаем слайдер \"{0}\"")
    public void getSliderAndMoveToPosition(String name, String value) {
        slider(name).findElement(By.xpath("//*[contains(text(), '" + value + "')]")).click();
    }

    @Step("Отмечаем чекбокс \"{0}\" ")
    public WebElement selectOpenDeposit(String type) {
        return calculatorBlock().findElement(By.xpath("//*[contains(text(), '" + type + "')]"));
    }

    @Step("Начальная установленная сумма вклада")
    public WebElement getStartDepositSum() {
        return calculatorResultBlock().findElement(By.cssSelector("[class = 'js-calc-amount']"));
    }

    @Step("Срок вклада")
    public WebElement getDepositPeriod() {
        return calculatorBlock().findElement(By.cssSelector("[class = 'jq-selectbox__select-text']"));
    }


}
