package org.fasttrackit.features;

import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginWithEmptyFields() {
        homeSteps.clickOnLogInOrRegLink();
        loginSteps.verifyLogInTileIsVisible();
        loginSteps.clickLoginButton();
        loginSteps.getLoginEmailErrorMessage();
    }

    @Test
    public void validLoginTest() {
        homeSteps.clickOnLogInOrRegLink();
        loginSteps.verifyLogInTileIsVisible();
        loginSteps.typeUserEmail(Constants.USER_EMAIL);
        loginSteps.typePassword(Constants.USER_PASS);
        loginSteps.clickLoginButton();
        accountSteps.userIsLoggedIn(Constants.USER_NAME);
    }
}
