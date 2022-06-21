package com.framework.dd.pages.lanit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.framework.dd.pages.base.BasePage;

import static com.framework.dd.data.vacancies.Vacancy.vacancyName;


public class LanitVacanciesPage extends BasePage {

    public LanitVacanciesPage(WebDriver driver) {
        super(driver);
    }

    private final By vacancy = By.xpath("//*[text()='" + vacancyName + "']");

    public VacancyPage getVacancy() {
        driver.findElement(vacancy).click();
        // Switch to new window opened
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        return new VacancyPage(driver);
    }

}
