package com.framework.dd.tests.ya;

import com.framework.dd.tests.base.BaseTest;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.framework.dd.constants.Constant.Urls.YA_HOME_PAGE;

public class yaHomePageTest extends BaseTest {

    @Test(description = "Ya search click")
    @Severity(SeverityLevel.CRITICAL)
    public void submitRequestForm() throws InterruptedException {
        basePage.open(YA_HOME_PAGE);
        yaHomePage.clickSearch();
        Thread.sleep(5000);
        Assert.assertEquals("some notification", "some notification");

    }

}
