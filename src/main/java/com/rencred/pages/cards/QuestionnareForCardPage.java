package com.rencred.pages.cards;

import com.rencred.driver.HelpBase;
import com.rencred.driver.allure.NamedBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QuestionnareForCardPage extends HelpBase {

    public QuestionnareForCardPage(WebDriver wd) {
        super(wd);
    }

    public WebElement lastNameField() {
        return inputField(NamedBy.css("[name='ClientLastName']").as("Поле Фамилия"));
    }

    public WebElement nameField() {
        return inputField(NamedBy.css("[name='ClientName']").as("Поле Имя"));
    }

    public WebElement secondNameField() {
        return inputField(NamedBy.css("[name='ClientSecondName']").as("Поле Отчество"));
    }

    public WebElement mobilePhoneField() {
        return inputField(NamedBy.css("[name='ClientMobilePhone']").as("Поле Мобильный телефон"));
    }

    public WebElement emailField() {
        return inputField(NamedBy.css("[name='AdditionalEmail']").as("Поле Email"));
    }

    public void chosePlaceForGetCard(String name) {
        openDropdown("Где Вы желаете получить карту?");
        selectValueInDropDown("" + name + "");
    }

    public WebElement questionBlock() {
        return blockElement(NamedBy.css(".order-form__step").as("Блок анкеты"));
    }

    public void selectNoSecondName() {
        questionBlock().findElement(NamedBy.xpath("//label[contains(text(), 'отчества')]/div")
                .as("Чекбокс Нет отчества")).click();
    }

    public void openDropdown(String name) {
        clickElement(NamedBy.xpath("//div[@class='jq-selectbox__select' and .//div[text()='" + name + "']]")
                .as("Селект Где вы желаете получать карту?"));
    }

    public void selectValueInDropDown(String name) {
        clickElement(NamedBy.xpath("//li[contains(text(), '" + name + "')]").as("Выбрать значение в " + name + " списке"));
    }

    public void choseMan() {
        clickElement(NamedBy.css(".man").as("Радиобаттон Мужчина"));
    }

    public void choseWoman() {
        clickElement(NamedBy.css(".girl").as("Радиобаттон Женщина"));
    }


}
