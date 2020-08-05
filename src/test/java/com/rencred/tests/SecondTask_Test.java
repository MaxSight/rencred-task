package com.rencred.tests;

import com.rencred.driver.BaseTest;
import org.testng.annotations.Test;

public class SecondTask_Test extends BaseTest {

    @Test
    public void logic() {
        app.mainPage().selectProductBlock("Карты");

    }
}