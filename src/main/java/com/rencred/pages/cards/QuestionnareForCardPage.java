package com.rencred.pages.cards;

import com.rencred.driver.HelpBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QuestionnareForCardPage extends HelpBase {

    public QuestionnareForCardPage(WebDriver wd) {
        super(wd);
    }

    public WebElement lastNameField() {
        return inputField(By.cssSelector("[name='ClientLastName']"));
    }

    public WebElement nameField() {
        return inputField(By.cssSelector("[name='ClientName']"));
    }

    public WebElement secondNameField() {
        return inputField(By.cssSelector("[name='ClientSecondName']"));
    }

    public WebElement mobilePhoneField() {
        return inputField(By.cssSelector("[name='ClientMobilePhone']"));
    }

    public WebElement emailField() {
        return inputField(By.cssSelector("[name='AdditionalEmail']"));
    }

    public void chosePlaceForGetCard(String name) {
        openDropdown("Где Вы желаете получить карту?");
        selectValueInDropDown("" + name + "");
    }

    public WebElement questionBlock() {
        return blockElement(By.cssSelector(".order-form__step"));
    }

    public void selectNoSecondName() {
        questionBlock().findElement(By.xpath("//label[contains(text(), 'отчества')]/div")).click();
    }

    public void openDropdown(String name) {
        clickElement(By.xpath("//div[@class='jq-selectbox__select' and .//div[text()='" + name + "']]"));
    }

    public void selectValueInDropDown(String name) {
        clickElement(By.xpath("//li[contains(text(), '" + name + "')]"));
    }

    public void choseMan() {
        clickElement(By.cssSelector(".man"));
    }

    public void choseWoman() {
        clickElement(By.cssSelector(".girl"));
    }


}
