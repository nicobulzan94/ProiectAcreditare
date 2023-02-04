package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class RegisterSteps extends BaseSteps {

    @Step
    public void verifyRegisterTileIsVisible() {
        regPage.registerTitleIsVisible();
    }

    @Step
    public void typeRegistrationEmail(String email) {
        regPage.setRegEmailField(email);
    }

    @Step
    public void typeRegistrationPass(String pass) {
        regPage.setRegPassField(pass);
    }

    @Step
    public void clickOnRegisterButton() {
        regPage.clickRegisterButton();
    }

    @Step
    public void getProvideEmailErrMessage() {
        Assert.assertEquals("Error: Please provide a valid email address.", regPage.getRegErrorMsg());
    }

    @Step
    public void getEnterAPasswordErrMessage() {
        Assert.assertEquals("Error: Please enter an account password.", regPage.getRegErrorMsg());
    }

    @Step
    public void verifyPassStrengthMsgIsDisplayed() {
        regPage.passwordStrengthErrMsgIsDisplayed();
    }

    @Step
    public void getAccountAlreadyRegisteredErrMessage() {
        Assert.assertEquals("Error: An account is already registered with your email address. Please log in.", regPage.getRegErrorMsg());
    }

    @Step
    public void getToAccountRegisterPage() {
        homePage.clickOnLogInOrRegLink();
        verifyRegisterTileIsVisible();
    }

    @Step
    public void verifyIfThePassIsInTheListOfPassStrengthTexts() {
        Assert.assertTrue("The password strength text is not in the expected list.",regPage.listOfPassStrengthTexts());
    }
























}
