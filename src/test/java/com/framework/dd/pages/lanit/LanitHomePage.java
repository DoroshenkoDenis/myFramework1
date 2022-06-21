package com.framework.dd.pages.lanit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.framework.dd.pages.base.BasePage;

public class LanitHomePage extends BasePage {

    public LanitHomePage(WebDriver driver) {
        super(driver);
    }

    private final By vacancyBtn = By.xpath("//*[text() = 'Открытые вакансии']");

    public LanitVacanciesPage enterVacanciesPage(String vacancyName) {
        WebElement vacancyButton = driver.findElement(vacancyBtn);
        waitElementIsVisible(vacancyButton).click();
        return new LanitVacanciesPage(driver);
    }

}
