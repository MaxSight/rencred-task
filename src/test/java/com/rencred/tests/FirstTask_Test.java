package com.rencred.tests;


import com.rencred.driver.BaseTest;
import org.testng.annotations.Test;

public class FirstTask_Test extends BaseTest {

    @Test
    public void logic(){
        app.mainPage().selectProductBlock("Вклады");
        app.depositPage().selectOpenDeposit("В отделении банка");
        app.depositPage().selectOpenDeposit("В отделении банка");

    }
}
