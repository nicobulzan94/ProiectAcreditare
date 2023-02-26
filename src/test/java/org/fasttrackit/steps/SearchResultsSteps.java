package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class SearchResultsSteps extends BaseSteps {

    @Step
    public void openSearchBlock() {
        homePage.clickSearchButton();
        homePage.searchBlockIsDisplayed();
    }

    @Step
    public void searchAProduct(String product) {
        homePage.setSearchField(product);
    }

    @Step
    public void clickOnSearchSubmitButton() {
        homePage.clickSearchSubmitButton();
    }

    @Step
    public void verifyThatNoResultsContentIsDisplayed() {
        Assert.assertTrue("Nothing Found".equalsIgnoreCase(searchResultsPage.getPageTitle()));
        searchResultsPage.searchAgainButtonIsVisible();
    }

    @Step
    public void verifyThatPageHasResults(String product) {
        Assert.assertEquals("Search Results for: "+ product, searchResultsPage.getPageTitle());
    }

    @Step
    public void clickOnAProduct() {
        searchResultsPage.clickOnProduct();
    }













}
