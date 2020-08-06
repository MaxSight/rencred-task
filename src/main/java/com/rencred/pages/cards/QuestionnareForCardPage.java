package com.rencred.pages.cards;

import com.rencred.driver.HelpBase;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QuestionnareForCardPage extends HelpBase {

    public QuestionnareForCardPage(WebDriver wd) {
        super(wd);
    }


    @Step("Поле \"Фамилия\"")
    public WebElement lastNameField() {
        return inputField(By.cssSelector("[name='ClientLastName']"));
    }

    @Step("Поле \"Имя\"")
    public WebElement nameField() {
        return inputField(By.cssSelector("[name='ClientName']"));
    }

    @Step("Поле \"Отчество\"")
    public WebElement secondNameField() {
        return inputField(By.cssSelector("[name='ClientSecondName']"));
    }

    @Step("Поле \"Мобильный телефон\"")
    public WebElement mobilePhoneField() {
        return inputField(By.cssSelector("[name='ClientMobilePhone']"));
    }

    @Step("Поле \"Email\"")
    public WebElement emailField() {
        return inputField(By.cssSelector("[name='AdditionalEmail']"));
    }

    @Step("Заполняем селект")
    public void chosePlaceForGetCard(String name) {
        openDropdown("Где Вы желаете получить карту?");
        selectValueInDropDown("" + name + "");
    }

    public WebElement questionBlock() {
        return blockElement(By.cssSelector(".order-form__step"));
    }

    @Step("Нажимаем чекбокс \"Нет отчества\"")
    public void selectNoSecondName() {
        questionBlock().findElement(By.xpath("//label[contains(text(), 'отчества')]/div")).click();
    }

    @Step("Открываем выбор селекта \"Где вы желаете получать карту?\"")
    public void openDropdown(String name) {
        clickElement(By.xpath("//div[@class='jq-selectbox__select' and .//div[text()='" + name + "']]"));
    }

    @Step("Выбираем значение \"{0}\"")
    public void selectValueInDropDown(String name) {
        clickElement(By.xpath("//li[contains(text(), '" + name + "')]"));
    }

    @Step("Выбираем радиобаттон \"Мужчина\"")
    public void choseMan() {
        clickElement(By.cssSelector(".man"));
    }

    @Step("Выбираем радиобаттон \"Женщина\"")
    public void choseWoman() {
        clickElement(By.cssSelector(".girl"));
    }


}
