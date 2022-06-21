package com.framework.dd.tests.lanit.e2e;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.framework.dd.tests.base.BaseTest;

import static com.framework.dd.constants.Constant.Urls.LANIT_HOME_PAGE;
import static com.framework.dd.data.vacancies.Vacancy.*;



public class ResumeSendingTest extends BaseTest {

    @Test(description = "Lanit e2e")
    @Severity(SeverityLevel.CRITICAL)
    public void submitRequestForm() throws InterruptedException {
        basePage.open(LANIT_HOME_PAGE);

        lanitHomePage
                .enterVacanciesPage(vacancyName)
                .getVacancy()
                .openRequestForm()
                .fillLastNameField(lastName)
                .fillFirstNameField(firstName)
                .fillEmailField(eMail)
                .fillPhoneField(phone)
                .fillExtraInfoField(extraInfo)
                .uploadFile(resumePath)
                .fillCheckBox()
                .fillCaptcha();
//      потыкать reCaptcha, или переписать fillCaptcha
        Thread.sleep(15000);
        requestForm.submitResume();
        Assert.assertEquals("some notification", "some notification");



    }

}
