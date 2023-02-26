package org.fasttrackit.features;

import org.junit.Test;

public class ProductDetailTest extends BaseTest {

    @Test
    public void addToCartProductSuccessfullyTest(){
        searchResultsSteps.openSearchBlock();
        searchResultsSteps.searchAProduct("shirt");
        searchResultsSteps.clickOnSearchSubmitButton();
        searchResultsSteps.clickOnAProduct();
        productDetailSteps.addToCartTheProduct();
        productDetailSteps.verifyProductAddedToCartMsg();
        productDetailSteps.clickViewCartButton();
        cartSteps.verifyCartTitle();
    }
}
