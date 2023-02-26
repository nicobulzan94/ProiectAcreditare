package org.fasttrackit.features;

import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class CheckoutTest extends BaseTest {

    //Below is logged in test with user billing address updated
    @Test
    public void placeAnOrderSuccessfully() {
        loginSteps.doLogin(Constants.USER_EMAIL, Constants.USER_PASS);
        shopSteps.addToCartProductFromShopPage();
        homeSteps.clickOnCartIcon();
        cartSteps.clickOnProceedToCheckoutButton();
        checkoutSteps.verifyCheckoutTitle();
        checkoutSteps.clickOnPlaceOrderButton();
        checkoutSteps.verifyOrderReceivedMsgIsPresent();

    }


}
