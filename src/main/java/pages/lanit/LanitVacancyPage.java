package pages.lanit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import data.vacancies.Vacancy;


public class LanitVacancyPage extends BasePage {

    public LanitVacancyPage(WebDriver driver) {
        super(driver);
    }

    private final By vacancy = By.xpath("//*[text()='" + Vacancy.vacancyName + "']");

    public LanitVacancyPage checkElement() {
        driver.findElement(vacancy).isDisplayed();
        return this;
    }

}
