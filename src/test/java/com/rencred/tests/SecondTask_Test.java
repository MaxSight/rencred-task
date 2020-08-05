package com.rencred.tests;

import com.rencred.driver.BaseTest;
import org.testng.annotations.Test;

public class SecondTask_Test extends BaseTest {

    @Test
    public void logic() {
        app.mainPage().selectProductBlock("Карты");
        app.cardsPage().fillQuestionnaireOnCard("Дебетовая карта 365");
        app.questionnareForCardPage().lastNameField().sendKeys("Петров");
        app.questionnareForCardPage().nameField().sendKeys("Петр");
        app.questionnareForCardPage().mobilePhoneField().sendKeys("91294325512");
        app.questionnareForCardPage().emailField().sendKeys("test@mail.ru");
        app.questionnareForCardPage().selectNoSecondName();
        app.questionnareForCardPage().choseMan();
        app.questionnareForCardPage().chosePlaceForGetCard("Брянская область");
    }
}