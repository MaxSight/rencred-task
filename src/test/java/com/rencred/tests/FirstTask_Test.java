package com.rencred.tests;


import com.rencred.driver.BaseTest;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import static java.lang.Thread.sleep;

public class FirstTask_Test extends BaseTest {

    @Test
    public void logic() throws InterruptedException, IOException {

        step1_2();
        step3();
        step4();
        step5();
        step6();

    }

    @Step("1) Открыть сайт rencredit.ru \n" +
            "2) Перейти на страницу \"Вклад\" ")
    private void step1_2() {
        app.mainPage().selectProductBlock("Вклады");
    }

    @Step("3) Выбрать чекбокс \"В отделении банка\" ")
    private void step3() {
        app.depositPage().selectOpenDeposit("В отделении банка");
    }

    @Step("4) Ввести сумму вклада ")
    private void step4() throws InterruptedException {
        app.depositPage().sumOfDepositField().sendKeys("500000");
        sleep(2000);
        Assert.assertTrue(app.depositPage().getStartDepositSum().getText().equals("500 000"));
    }

    @Step("5) Передвинуть ползунок \"На срок\" ")
    private void step5() {
        app.depositPage().getSliderAndMoveToPosition("На срок", "13");
        Assert.assertTrue(app.depositPage().getDepositPeriod().getText().equals("13 месяцев"));
        }

    @Step("6) Выгрузить Печатную Форму \"Общие условия по вкладам\" ")
    private void step6() throws IOException {
        saver.saveFile("bank.pdf", "https://rencredit.ru/upload/iblock/ac3/9_27_20.pdf");
        saver.checkFile("bank.pdf");
    }

}
