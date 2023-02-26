package org.fasttrackit.features;

import org.junit.Test;

public class CartTest extends BaseTest {

    @Test
    public void noCouponAppliedTest() {
        shopSteps.navigateToShopPage();
        shopSteps.orderProductsByNewness();
        shopSteps.clickAddToCartButtonOnFirstProduct();
        homeSteps.clickOnCartIcon();
        cartSteps.clickOnApplyCouponButton();
        cartSteps.verifyEnterCouponCodeErrMsg();
    }

    @Test
    public void invalidCouponAppliedTest() {

        String invalidCoupon = "nico";
        shopSteps.navigateToShopPage();
        shopSteps.orderProductsByNewness();
        shopSteps.clickAddToCartButtonOnFirstProduct();
        homeSteps.clickOnCartIcon();
        cartSteps.typeCouponCode(invalidCoupon);
        cartSteps.clickOnApplyCouponButton();
        cartSteps.verifyInvalidCouponErrMsg(invalidCoupon);

    }

    @Test
    public void applyCorrectCouponSuccessfullyTest() {
        shopSteps.navigateToShopPage();
        shopSteps.orderProductsByNewness();
        shopSteps.clickAddToCartButtonOnFirstProduct();
        homeSteps.clickOnCartIcon();
        cartSteps.typeCouponCode("voucher20");
        cartSteps.clickOnApplyCouponButton();
        cartSteps.verifyCouponAppliedSuccessfullyMsg();
    }

    @Test
    public void applySameCouponAgainTest() {
        shopSteps.navigateToShopPage();
        shopSteps.orderProductsByNewness();
        shopSteps.clickAddToCartButtonOnFirstProduct();
        homeSteps.clickOnCartIcon();
        cartSteps.typeCouponCodeAndEnter("voucher20");
        cartSteps.typeCouponCodeAndEnter("voucher20");
        cartSteps.verifyCouponAlreadyAppliedErrMsg();

    }


    @Test
    public void checkTotalOrderAmountIsCorrectTest() {
        searchResultsSteps.openSearchBlock();
        searchResultsSteps.searchAProduct("shirt");
        searchResultsSteps.clickOnSearchSubmitButton();
        searchResultsSteps.clickOnAProduct();
        productDetailSteps.addToCartTheProduct();
        shopSteps.navigateToShopPage();
        shopSteps.orderProductsByNewness();
        shopSteps.clickAddToCartButtonOnFirstProduct();
        homeSteps.clickOnCartIcon();
        cartSteps.typeCouponCodeAndEnter("voucher20");
        cartSteps.verifyTotalOrderAmountIsCorrect();

    }

    @Test
    public void changeQtyAndUpdateCartTest() {
        shopSteps.navigateToShopPage();
        shopSteps.orderProductsByNewness();
        shopSteps.clickAddToCartButtonOnFirstProduct();
        homeSteps.clickOnCartIcon();
        cartSteps.clearExistingQty();
        cartSteps.changeQty("2");
        cartSteps.verifyCartUpdatedSuccessfullyMsg();

    }
}
