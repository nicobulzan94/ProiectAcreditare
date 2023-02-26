package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(css = ".site-header-right-link a")
    private WebElementFacade loginOrRegisterLink;
    @FindBy(css = "#menu-item-1643 a")
    private WebElementFacade menuBlogButton;
    @FindBy(css = "i.search-btn")
    private WebElementFacade searchButton;
    @FindBy(css = "div.search-block")
    private WebElementFacade searchBlock;
    @FindBy(css = "input.search-field")
    private WebElementFacade searchField;
    @FindBy(css = "input.search-submit")
    private WebElementFacade searchSubmitButton;
    @FindBy(css = "#menu-item-1728 a")
    private WebElementFacade menuShopButton;
    @FindBy(css = ".header-cart i.fa-shopping-cart")
    private WebElementFacade headerCartIcon;


    public void clickOnLogInOrRegLink() {
        clickOn(loginOrRegisterLink);
    }

    public void clickBlogButton() {
        clickOn(menuBlogButton);
    }

    public void clickSearchButton() {
        clickOn(searchButton);
    }

    public void searchBlockIsDisplayed() {
        searchBlock.isDisplayed();
    }
    public void setSearchField(String value) {
        typeInto(searchField, value);
    }
    public void clickSearchSubmitButton() {
        clickOn(searchSubmitButton);
    }

    public void clickShopButton() {
        clickOn(menuShopButton);
    }

    public void clickHeaderCartIcon() {
        clickOn(headerCartIcon);
    }




}
