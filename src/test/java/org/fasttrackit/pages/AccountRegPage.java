package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    public void passwordStrengthErrMsgIsDisplayed() {
        passwordStrengthMsg.isDisplayed();
    }

    public String getPasswordStrengthErrMsg() {
        return passwordStrengthMsg.getText();
    }

    public boolean listOfPassStrengthTexts() {
        List<String> myList = new ArrayList<>();
        myList.add("Very weak - Please enter a stronger password.");
        myList.add("Weak - Please enter a stronger password.");
        myList.add("Medium");
        myList.add("Strong");

        String passStrengthText = getPasswordStrengthErrMsg();
        System.out.println("After entering the password, the text is: " + passStrengthText);

        for(int i = 0; i < myList.size(); i++) {
            System.out.println("In the list there also is: " + myList.get(i));
            if (Objects.equals(passStrengthText, myList.get(i))) {
                System.out.println("Success, the text from the page is in the list.");
                return true;
            }
        }
        return false;
    }
















}
