package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class AccountRegPage extends BasePage {

    @FindBy(css = ".u-column2.col-2 h2")
    private WebElementFacade registerTitle;
    @FindBy(id = "reg_email")
    private WebElementFacade regEmailField;

    @FindBy(id = "reg_password")
    private WebElementFacade regPassField;

    @FindBy(css = ".u-column2.col-2 .button")
    private WebElementFacade registerButton;

    @FindBy(css = ".woocommerce-error")
    private WebElementFacade registrationErrorMsg;

    @FindBy(css = ".woocommerce-password-strength")
    private WebElementFacade passwordStrengthMsg;


    public void registerTitleIsVisible() {
        registerTitle.isVisible();
    }

    public void setRegEmailField(String value) {
        typeInto(regEmailField, value);
    }

    public void setRegPassField(String value) {
        typeInto(regPassField, value);
    }
    public void clickRegisterButton() {
        clickOn(registerButton);
    }

    public String getRegErrorMsg() {
        return registrationErrorMsg.getText();
    }

    public void getPasswordStrengthErrMsg() {
        passwordStrengthMsg.isDisplayed();
    }











}
