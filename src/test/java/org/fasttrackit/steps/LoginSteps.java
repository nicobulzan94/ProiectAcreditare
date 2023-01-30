package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginSteps extends BaseSteps {

    public void verifyLogInTileIsVisible() {
        accountPage.logInTitleIsVisible();
    }

    public void clickLoginButton() {
        accountPage.clickOnLogInButton();
    }

    public void getLoginEmailErrorMessage() {
        Assert.assertEquals("Error: Username is required.", accountPage.getLoginEmailErrorMsg());
    }

    @Step
    public void typeUserEmail(String email) {
        accountPage.setEmailField(email);
    }

    @Step
    public void typePassword(String password) {
        accountPage.setPasswordField(password);
    }



}
