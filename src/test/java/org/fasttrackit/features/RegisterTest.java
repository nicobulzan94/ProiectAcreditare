package org.fasttrackit.features;

import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class RegisterTest extends BaseTest {


    @Test
    public void registerWithEmptyFieldsTest() {
        homeSteps.clickOnLogInOrRegLink();
        registerSteps.verifyRegisterTileIsVisible();
        registerSteps.clickOnRegisterButton();
        registerSteps.getProvideEmailErrMessage();
    }

    @Test
    public void registerWithEmptyPasswordFieldTest() {
        registerSteps.getToAccountRegisterPage();
        registerSteps.typeRegistrationEmail("nico@yopmail.com");
        registerSteps.clickOnRegisterButton();
        registerSteps.getEnterAPasswordErrMessage();

    }

    @Test
    public void registerWithInvalidPasswordTest() {
        registerSteps.getToAccountRegisterPage();
        registerSteps.typeRegistrationEmail("nico@yopmail.com");
        registerSteps.typeRegistrationPass("123");
        registerSteps.verifyIfThePassIsInTheListOfPassStrengthTexts();
    }

    @Test
    public void registerWithExistingEmailTest() {
        registerSteps.getToAccountRegisterPage();
        registerSteps.typeRegistrationEmail(Constants.USER_EMAIL);
        registerSteps.typeRegistrationPass(Constants.USER_PASS);
        registerSteps.clickOnRegisterButton();
        registerSteps.getAccountAlreadyRegisteredErrMessage();
    }

    @Test
    public void registerSuccessfullyTest() {
        registerSteps.getToAccountRegisterPage();
        registerSteps.typeRegistrationEmail("Test05@yopmail.com");
        registerSteps.typeRegistrationPass(Constants.USER_PASS);
        registerSteps.clickOnRegisterButton();
        accountSteps.userIsLoggedIn("Test05");

    }

















}
