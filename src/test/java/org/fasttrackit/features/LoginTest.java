package org.fasttrackit.features;

import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginWithEmptyFieldsTest() {
        homeSteps.clickOnLogInOrRegLink();
        loginSteps.verifyLogInTileIsVisible();
        loginSteps.clickLoginButton();
        loginSteps.getUsernameIsRequiredErrMessage();
    }

    @Test
    public void loginWithInvalidEmailTest() {
        loginSteps.getToAccountLoginPage();
        loginSteps.typeUserEmail("nico@yopmail.com");
        loginSteps.typePassword(Constants.USER_PASS);
        loginSteps.clickLoginButton();
        loginSteps.getInvalidEmailErrMessage();
    }

    @Test
    public void loginWithInvalidPasswordTest() {
        loginSteps.getToAccountLoginPage();
        loginSteps.typeUserEmail(Constants.USER_EMAIL);
        loginSteps.typePassword("123");
        loginSteps.clickLoginButton();
        loginSteps.getInvalidPasswordErrMessage();
    }

    @Test
    public void validLoginTestTest() {
        loginSteps.getToAccountLoginPage();
        loginSteps.typeUserEmail(Constants.USER_EMAIL);
        loginSteps.typePassword(Constants.USER_PASS);
        loginSteps.checkRememberMeBox();
        loginSteps.clickLoginButton();
        accountSteps.userIsLoggedIn(Constants.USER_NAME);
    }
}
