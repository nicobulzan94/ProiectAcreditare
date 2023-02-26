package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.fasttrackit.utils.Constants;
import org.junit.Assert;

public class LoginSteps extends BaseSteps {

    @Step
    public void verifyLogInTileIsVisible() {
        loginPage.logInTitleIsVisible();
    }

    @Step
    public void typeUserEmail(String email) {
        loginPage.setEmailField(email);
    }

    @Step
    public void typePassword(String password) {
        loginPage.setPasswordField(password);
    }

    @Step
    public void checkRememberMeBox() {
        loginPage.clickRememberCheckbox();
    }
    @Step
    public void clickLoginButton() {
        loginPage.clickOnLogInButton();
    }
    @Step
    public void getUsernameIsRequiredErrMessage() {
        Assert.assertEquals("Error: Username is required.", loginPage.getLoginErrorMsg());
    }

    @Step
    public void getInvalidEmailErrMessage() {
        Assert.assertEquals("ERROR: Invalid email address. Lost your password?", loginPage.getLoginErrorMsg());
    }

    @Step
    public void getInvalidPasswordErrMessage() {
        Assert.assertEquals("ERROR: The password you entered for the email address " + Constants.USER_EMAIL + " is incorrect. Lost your password?", loginPage.getLoginErrorMsg());
    }

    @Step
    public void getToAccountLoginPage() {
        homePage.clickOnLogInOrRegLink();
        verifyLogInTileIsVisible();
    }

    @Step
    public void doLogin(String email, String password) {
        getToAccountLoginPage();
        typeUserEmail(email);
        typePassword(password);
        clickLoginButton();
    }




}
