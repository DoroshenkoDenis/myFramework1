package com.framework.dd.pages.lanit;

import com.framework.dd.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VacancyPage extends BasePage {
    public VacancyPage(WebDriver driver) {
        super(driver);
    }

    private final By requestBtn = By.id("btnResponseInContacts");

    public RequestForm openRequestForm() {
        driver.findElement(requestBtn).click();
        return new RequestForm(driver);
    }
}