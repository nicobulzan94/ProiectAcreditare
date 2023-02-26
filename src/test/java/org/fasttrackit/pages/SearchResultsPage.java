package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends BasePage {

    @FindBy(css = "h1.page-title")
    private WebElementFacade pageTile;

    @FindBy(css = ".button.no-results-btn.search-btn")
    private WebElementFacade searchAgainButton;

    @FindBy(css = "#main article:nth-of-type(1) h3.entry-title a")
    private WebElementFacade productLink;


    public String getPageTitle() {
        return pageTile.getText();
    }

    public void searchAgainButtonIsVisible() {
        searchAgainButton.isVisible();
    }

    public void clickOnProduct() {
        clickOn(productLink);
    }




}
