package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {

    @FindBy(css = "h3.entry-title")
    private WebElementFacade checkoutPageTile;
    @FindBy(id = "place_order")
    private WebElementFacade placeOderButton;
    @FindBy(css = "p.woocommerce-notice.woocommerce-notice--success.woocommerce-thankyou-order-received")
    private WebElementFacade thankYouOrderReceivedMsg;

    public String getCheckoutTitle() {
        return checkoutPageTile.getText();
    }
    public void clickPlaceOrderButton() {
        clickOn(placeOderButton);
    }

    public String getThankYouOrderReceivedMsg() {
        waitABit(3000);
        return thankYouOrderReceivedMsg.getText();

    }



}
