package com.rencred.tests;

import com.rencred.driver.BaseTest;
import io.qameta.allure.Step;
import org.testng.annotations.Test;

public class SecondTask_Test extends BaseTest {

    @Test
    public void logic() {

        step1_2();
        step3();
        step4();
        step5();
    }

    @Step("1) Открыть сайт rencredit.ru \n" +
            "2) Перейти на страницу \"Карта\" ")
    private void step1_2() {
        app.mainPage().selectProductBlock("Карты");
        app.cardsPage().fillQuestionnaireOnCard("Дебетовая карта 365");
    }

    @Step("3) Ввести в поля \"Фамилия\", \"Имя\", \"Мобильный телефон\", \"e-mail\" значения ")
    private void step3() {
        app.questionnareForCardPage().lastNameField().sendKeys("Петров");
        app.questionnareForCardPage().nameField().sendKeys("Петр");
        app.questionnareForCardPage().mobilePhoneField().sendKeys("9129432551");
        app.questionnareForCardPage().emailField().sendKeys("test@mail.ru");
    }

    @Step("4) Выбрать чекбокс \"Нет отчества\" ")
    private void step4() {
        app.questionnareForCardPage().selectNoSecondName();
        app.questionnareForCardPage().choseMan();
    }

    @Step("5) Выбрать значение из выпадающего списка \"Где вы желаете получить карту\"")
    private void step5() {
        app.questionnareForCardPage().chosePlaceForGetCard("Брянская область");
    }
}