package com.framework.dd.tests.lanit.e2e;

import org.testng.annotations.Test;
import com.framework.dd.tests.base.BaseTest;

import static com.framework.dd.constants.Constant.Urls.LANIT_HOME_PAGE;

public class ResumeSendingTest extends BaseTest {

    @Test
    public void checkIsRedirectToVacancyPage() {
        basePage.open(LANIT_HOME_PAGE);

        lanitHomePage.enterVacancyPage();
        lanitVacancyPage.checkElement();

    }

}
