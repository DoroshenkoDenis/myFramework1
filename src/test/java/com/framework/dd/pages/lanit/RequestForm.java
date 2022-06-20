package com.framework.dd.pages.lanit;

import com.framework.dd.data.vacancies.Vacancy;
import com.framework.dd.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RequestForm extends BasePage {
    public RequestForm(WebDriver driver) {
        super(driver);
    }

    private final By lastNameField = By.id("ctl00_ucLandingHeader_ucResume_tbxAttachResume_LastName");
    private final By firstNameField = By.id("ctl00_ucLandingHeader_ucResume_tbxAttachResume_FirstName");
    private final By eMailField = By.id("ctl00_ucLandingHeader_ucResume_tbxAttachResume_Email");
    private final By phoneField = By.id("ctl00_ucLandingHeader_ucResume_tbxAttachResume_Phone");
    private final By extraInfoField = By.id("ctl00_ucLandingHeader_ucResume_tbxAttachResume_ExtraInfo");

    public RequestForm fillFirstNameField() {
        driver.findElement(firstNameField).sendKeys(Vacancy.firstName);
        return this;
    }

    public RequestForm fillLastNameField() {
        driver.findElement(lastNameField).sendKeys(Vacancy.lastName);
        return this;
    }

    public RequestForm fillEmailField() {
        driver.findElement(eMailField).sendKeys(Vacancy.eMail);
        return this;
    }
    public RequestForm fillPhoneField() {
        driver.findElement(phoneField).sendKeys(Vacancy.phone);
        return this;
    }
    public RequestForm fillExtraInfoField() {
        driver.findElement(extraInfoField).sendKeys(Vacancy.extraInfo);
        return this;
    }
}
