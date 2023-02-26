package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CheckoutSteps extends BaseSteps{

    @Step
    public void verifyCheckoutTitle() {
        Assert.assertEquals("Checkout", checkoutPage.getCheckoutTitle());
    }
    @Step
    public void clickOnPlaceOrderButton() {
        checkoutPage.clickPlaceOrderButton();
    }

    @Step
    public void verifyOrderReceivedMsgIsPresent() {
        Assert.assertEquals("Thank you. Your order has been received.", checkoutPage.getThankYouOrderReceivedMsg());
    }



}
