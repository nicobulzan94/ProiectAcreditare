package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

    @FindBy(css = ".woocommerce-MyAccount-content strong:first-child")
    private WebElementFacade userNameTextElement;


    public String userIsLoggedIn(){
        return userNameTextElement.getText();
    }









}
