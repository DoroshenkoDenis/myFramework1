package com.framework.dd.pages.lanit;

import com.framework.dd.pages.base.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RequestForm extends BasePage {
    public RequestForm(WebDriver driver) {
        super(driver);
    }

    private final String resumeTbxLocator = "ctl00_ucLandingHeader_ucResume_tbxAttachResume_";

    private final By lastNameField = By.id(resumeTbxLocator + "LastName");
    private final By firstNameField = By.id(resumeTbxLocator + "FirstName");
    private final By eMailField = By.id(resumeTbxLocator + "Email");
    private final By phoneField = By.id(resumeTbxLocator + "Phone");
    private final By extraInfoField = By.id(resumeTbxLocator + "ExtraInfo");
    private final By uploadFile = By.id("ctl00_ucLandingHeader_ucResume_fileAttachResume_File");
    private final By checkbox = By.id("ctl00_ucLandingHeader_ucResume_cbxAttachResume_AgreeTerms");
    private final By submitBtn = By.id("ctl00_ucLandingHeader_ucResume_btnAttachResume");


    public RequestForm fillFirstNameField(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
        return this;
    }

    public RequestForm fillLastNameField(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
        return this;
    }

    public RequestForm fillEmailField(String eMail) {
        driver.findElement(eMailField).sendKeys(eMail);
        return this;
    }

    public RequestForm fillPhoneField(String phone) {
        driver.findElement(phoneField).sendKeys(phone);
        return this;
    }

    public RequestForm fillExtraInfoField(String extraInfo) {
        driver.findElement(extraInfoField).sendKeys(extraInfo);
        return this;
    }

    public RequestForm uploadFile(String filePath) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "document.getElementById('ctl00_ucLandingHeader_ucResume_fileAttachResume_File').style.cssText = 'display: block !important';";
        js.executeScript(script);
        driver.findElement(uploadFile).sendKeys(filePath);
        return this;
    }

    public RequestForm fillCheckBox() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "document.getElementById('ctl00_ucLandingHeader_ucResume_cbxAttachResume_AgreeTerms').style.display = 'block';";
        js.executeScript(script);
        driver.findElement(checkbox).click();
        return this;
    }

    public RequestForm fillCaptcha() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
                By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]")));
        wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[@class='recaptcha-checkbox-border']"))).click();
        driver.switchTo().defaultContent();
        return this;
    }

    public RequestForm submitResume(){
        driver.findElement(submitBtn).click();
        return this;
    }

}
