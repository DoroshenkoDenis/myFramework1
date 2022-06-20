package com.framework.dd.tests.lanit.e2e;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import com.framework.dd.tests.base.BaseTest;

import static com.framework.dd.constants.Constant.Urls.LANIT_HOME_PAGE;


public class ResumeSendingTest extends BaseTest {

    @Test
    @Severity(SeverityLevel.BLOCKER)
    public void submitRequestForm() throws InterruptedException {
        basePage.open(LANIT_HOME_PAGE);

        lanitHomePage.enterVacanciesPage();
        Thread.sleep(5000);
        lanitVacancyPage.getVacancy();
        Thread.sleep(5000);
        vacancyPage.openRequestForm();
        Thread.sleep(5000);
        requestForm
                .fillFirstNameField()
                .fillLastNameField()
                .fillEmailField()
                .fillPhoneField()
                .fillExtraInfoField();
        Thread.sleep(5000);

    }

}
