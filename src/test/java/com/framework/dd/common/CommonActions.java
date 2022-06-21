package com.framework.dd.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.time.Duration;

import static com.framework.dd.common.Config.PLATFORM_AND_BROWSER;
import static com.framework.dd.constants.Constant.TimeoutVariable.IMPLICIT_WAIT;

public class CommonActions {

    private static final String RESOURCES_PATH = "src/test/resources/";

    public static WebDriver createDriver() {
        WebDriver driver = null;

        switch (PLATFORM_AND_BROWSER) {
            case "win_chrome":
                System.setProperty("webdriver.chrome.driver", RESOURCES_PATH + "chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "win_firefox":
                System.setProperty("webdriver.firefox.driver", RESOURCES_PATH + "geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            default:
                Assert.fail("Incorrect platform or browser name: " + PLATFORM_AND_BROWSER);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
        return driver;
    }

}
