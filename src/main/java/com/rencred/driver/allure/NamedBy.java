package com.rencred.driver.allure;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NamedBy extends By {

    private final By origin;
    private String name;

    public NamedBy(By origin) {
        this.origin = origin;
    }

    public NamedBy as(String name) {
        this.name = name;
        return this;
    }

    public static NamedBy css(String css) {
        return new NamedBy(By.cssSelector(css));
    }

    public static NamedBy xpath(String xpathExpression) {
        return new NamedBy(By.xpath(xpathExpression));
    }


    @Override
    public List<WebElement> findElements(SearchContext context) {
        return origin.findElements(context);
    }

}
