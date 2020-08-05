package com.rencred.driver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeTest
    public void setUp(){
            System.out.println("............................. BEFORE_TEST ..........................................");
        app.init();
    }

    @AfterTest
     public void tearDown() {
        System.out.println("............................. AFTER_TEST ...........................................");
        app.stop();
    }
}
