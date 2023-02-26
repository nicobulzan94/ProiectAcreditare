package org.fasttrackit.features;

import org.junit.Test;

public class SearchResultsTest extends BaseTest {

    @Test
    public void searchForNonExistingProductTest(){
        searchResultsSteps.openSearchBlock();
        searchResultsSteps.searchAProduct("oradea");
        searchResultsSteps.clickOnSearchSubmitButton();
        searchResultsSteps.verifyThatNoResultsContentIsDisplayed();
    }

    @Test
    public void searchResultsSuccessTest() {
        String searchTerm = "shirt";
        searchResultsSteps.openSearchBlock();
        searchResultsSteps.searchAProduct(searchTerm);
        searchResultsSteps.clickOnSearchSubmitButton();
        searchResultsSteps.verifyThatPageHasResults(searchTerm);
    }

    @Test
    public void navigateToPDPFromSearchResultsPgTest() {
        searchResultsSteps.openSearchBlock();
        searchResultsSteps.searchAProduct("shirt");
        searchResultsSteps.clickOnSearchSubmitButton();
        searchResultsSteps.clickOnAProduct();
        productDetailSteps.arrivedOnPDPSuccessfully();
    }





}
