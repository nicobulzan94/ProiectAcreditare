package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CartSteps extends BaseSteps {

    @Step
    public void verifyCartTitle() {
        Assert.assertEquals("Cart", cartPage.getCartTitle());
    }

    @Step
    public void typeCouponCode(String coupon) {
        cartPage.setCouponCode(coupon);
    }

    @Step
    public void clickOnApplyCouponButton() {
        cartPage.clickApplyCouponButton();
    }

    @Step
    public void verifyEnterCouponCodeErrMsg() {
        Assert.assertEquals("Please enter a coupon code.", cartPage.getEnterCouponCodeErrMsg());
    }

    @Step
    public void verifyCouponAlreadyAppliedErrMsg() {
        Assert.assertEquals("Coupon code already applied!", cartPage.getEnterCouponCodeErrMsg());
    }

    @Step
    public void verifyInvalidCouponErrMsg(String invalidCoupon) {
        Assert.assertEquals("Coupon \"" + invalidCoupon + "\" does not exist!", cartPage.getEnterCouponCodeErrMsg());

    }

    @Step
    public void verifyCouponAppliedSuccessfullyMsg() {
        Assert.assertEquals("Coupon code applied successfully.", cartPage.getWoocommerceMessage());
    }


    @Step
    public void verifyTotalOrderAmountIsCorrect() {
        Assert.assertTrue(cartPage.verifyOrderTotal());
    }

    @Step
    public void typeCouponCodeAndEnter(String coupon) {
        cartPage.typeCouponCodeAndEnter(coupon);
    }


    @Step
    public void clearExistingQty() {
        cartPage.clearChangeQty();
    }
    @Step
    public void changeQty(String qtyNr) {
        cartPage.setChangeQty(qtyNr);

    }

    @Step
    public void clickOnUpdateCartButton() {
        cartPage.clickUpdateCartButton();
    }

    @Step
    public void verifyCartUpdatedSuccessfullyMsg() {
        Assert.assertEquals("Cart updated.", cartPage.getWoocommerceMessage());
    }

    @Step
    public void clickOnProceedToCheckoutButton() {
        cartPage.clickProceedToCheckoutButton();
    }









}
