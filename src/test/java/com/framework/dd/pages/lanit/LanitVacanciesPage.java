package com.framework.dd.pages.lanit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.framework.dd.pages.base.BasePage;
import com.framework.dd.data.vacancies.Vacancy;


public class LanitVacanciesPage extends BasePage {

    public LanitVacanciesPage(WebDriver driver) {
        super(driver);
    }

    private final By vacancy = By.xpath("//*[text()='" + Vacancy.vacancyName + "']");

    public LanitVacanciesPage getVacancy() {
        driver.findElement(vacancy).click();
        // Switch to new window opened
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        return this;
    }

}
