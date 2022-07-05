package com.framework.dd.pages.ya;

import com.framework.dd.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YaHomePage extends BasePage {

    public YaHomePage(WebDriver driver) {
        super(driver);
    }

    private final By submitBtn = By.xpath("//*/button[@type='submit']");

    public void clickSearch() {
        driver.findElement(submitBtn).click();
    }

}

