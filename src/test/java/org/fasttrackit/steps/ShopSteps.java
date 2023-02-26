package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class ShopSteps extends BaseSteps {

    @Step
    public void navigateToShopPage() {
        homePage.clickShopButton();
        Assert.assertEquals("Shop", shopPage.getShopTitle());

    }

    @Step
    public void checkNumberOfProducts() {
        Assert.assertTrue(shopPage.verifyNrOfProductsOnPage());
    }

    @Step
    public void orderProductsByPriceHighToLow() {
        shopPage.selectByPriceHighToLowFromDropdown();
    }

    @Step
    public void productsAreSortedByDescendingPrice() {
        Assert.assertTrue("The price is not descending, try again.", shopPage.isPriceDescending());
    }

    @Step
    public void orderProductsByNewness() {
        shopPage.selectByNewnessFromDropdown();
    }

    @Step
    public void clickAddToCartButtonOnFirstProduct() {
        shopPage.clickAddToCartButtonFromFirstProduct();
    }
    @Step
    public void verifyThatTheProductWasAddedToCart() {
        Assert.assertTrue("The 'added' attribute is not present, therefore the product was not added to cart.", shopPage.productAddedToCartElementIsPresent());
    }

    @Step
    public void addToCartProductFromShopPage() {
        navigateToShopPage();
        orderProductsByNewness();
        clickAddToCartButtonOnFirstProduct();

    }









}
