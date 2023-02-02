package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class AccountLoginPage extends BasePage {

    @FindBy(css = ".u-column1.col-1 h2")
    private WebElementFacade logInTitle;

    @FindBy(css = ".u-column1.col-1 .button")
    private WebElementFacade loginButton;

    @FindBy(css = ".woocommerce-error")
    private WebElementFacade loginErrorMsg;

    @FindBy(id = "username")
    private WebElementFacade emailField;

    @FindBy(id = "password")
    private WebElementFacade passwordField;

    @FindBy(css = ".woocommerce-MyAccount-content strong:first-child")
    private WebElementFacade userNameTextElement;

    @FindBy(id = "rememberme")
    private WebElementFacade rememberMeCheckbox;


    public void logInTitleIsVisible() {
        logInTitle.isVisible();
    }

    public void clickOnLogInButton() {
        clickOn(loginButton);
    }

    public String getLoginErrorMsg() {
        return loginErrorMsg.getText();
    }

    public void setEmailField(String value) {
        typeInto(emailField, value);
    }

    public void setPasswordField(String value) {
        typeInto(passwordField, value);
    }

    public String userIsLoggedIn(){
        return userNameTextElement.getText();
    }

    public void clickRememberCheckbox() {
        clickOn(rememberMeCheckbox);
    }













}
