package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(css = ".site-header-right-link a")
    private WebElementFacade loginOrRegisterLink;

    public void clickOnLogInOrRegLink() {
        clickOn(loginOrRegisterLink);
    }



}
