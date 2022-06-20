package com.framework.dd.tests.base;

import com.framework.dd.common.CommonActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import com.framework.dd.pages.base.BasePage;
import com.framework.dd.pages.lanit.LanitHomePage;
import com.framework.dd.pages.lanit.LanitVacancyPage;

import static com.framework.dd.common.Config.CLEAR_COOKIES_AND_STORAGE;
import static com.framework.dd.common.Config.HOLD_BROWSER_OPEN;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected LanitHomePage lanitHomePage = new LanitHomePage(driver);
    protected LanitVacancyPage lanitVacancyPage = new LanitVacancyPage(driver);

    @AfterTest
    public void clearCookiesAndLocalStorage() {
        if (CLEAR_COOKIES_AND_STORAGE) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    @AfterSuite(alwaysRun = true)
    public void close() {
        if (HOLD_BROWSER_OPEN) {
            driver.quit();
        }
    }

}
