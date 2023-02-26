package org.fasttrackit.features;

import org.junit.Test;

public class ShopTest extends BaseTest {

    @Test
    public void checkNumberOfProductsOnPageTest() {
        shopSteps.navigateToShopPage();
        shopSteps.checkNumberOfProducts();
    }

    @Test
    public void verifyPriceDescendingTest() {
        shopSteps.navigateToShopPage();
        shopSteps.orderProductsByPriceHighToLow();
        shopSteps.productsAreSortedByDescendingPrice();
    }

    @Test
    public void addToCartSuccessfullyFromShopPageTest() {
        shopSteps.navigateToShopPage();
        shopSteps.orderProductsByNewness();
        shopSteps.clickAddToCartButtonOnFirstProduct();
        shopSteps.verifyThatTheProductWasAddedToCart();
        homeSteps.clickOnCartIcon();
        cartSteps.verifyCartTitle();

    }



}
