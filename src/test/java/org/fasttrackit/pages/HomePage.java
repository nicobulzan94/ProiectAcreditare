package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(css = ".site-header-right-link a")
    private WebElementFacade loginOrRegisterLink;
    @FindBy(css = "#menu-item-1643 a")
    private WebElementFacade menuBlogButton;

    public void clickOnLogInOrRegLink() {
        clickOn(loginOrRegisterLink);
    }

    public void clickBlogButton() {
        clickOn(menuBlogButton);
    }



}
