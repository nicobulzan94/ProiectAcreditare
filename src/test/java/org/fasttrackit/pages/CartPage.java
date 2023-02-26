package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage {

    @FindBy(css = "h3.entry-title")
    private WebElementFacade cartPageTile;

    @FindBy(id = "coupon_code")
    private WebElementFacade couponCodeField;
    @FindBy(css = ".coupon input.button")
    private WebElementFacade applyCouponButton;
    @FindBy(css = ".woocommerce-error li")
    private WebElementFacade enterCouponCodeErrMsg;
    @FindBy(css = ".woocommerce-message")
    private WebElementFacade woocommerceMessage;

    @FindBy(css = ".cart_item .product-price span.amount")
    private List<WebElementFacade> cartListOfPrices;

    @FindBy(css = ".cart-discount span.amount")
    private WebElementFacade cartDiscount;
    @FindBy(css = ".shipping span.amount")
    private WebElementFacade cartShippingAmount;
    @FindBy(css = ".order-total span.amount")
    private WebElementFacade cartOrderTotalAmount;
    @FindBy(css = ".cart_item:first-of-type input.qty")
    private WebElementFacade changeQty;
    @FindBy(css = ".coupon .button")
    private WebElementFacade updateCartButton;
    @FindBy(css = ".wc-proceed-to-checkout a.checkout-button")
    private WebElementFacade proceedToCheckoutButton;



    public String getCartTitle() {
        return cartPageTile.getText();
    }

    public void setCouponCode(String couponCode) {
        typeInto(couponCodeField,couponCode);
    }

    public void typeCouponCodeAndEnter(String couponCode) {
        couponCodeField.typeAndEnter(couponCode);
    }


    public void clickApplyCouponButton() {
        clickOn(applyCouponButton);
    }
    public String getEnterCouponCodeErrMsg() {
        return enterCouponCodeErrMsg.getText();
    }
    public String getWoocommerceMessage() {
        return woocommerceMessage.getText();
    }

    public int verifySubtotalOfPrice() {
        int subtotal = 0;
        for (WebElementFacade element: cartListOfPrices) {
            int x = getIntFromPrice(element.getText());
            subtotal = subtotal + x;

        }
        return subtotal;
    }

    public boolean verifyOrderTotal() {
        int discount = getIntFromPrice(cartDiscount.getText());
        int shipping = getIntFromPrice(cartShippingAmount.getText());
        int subtotal = verifySubtotalOfPrice();
        int orderTotal = getIntFromPrice(cartOrderTotalAmount.getText());

        System.out.println(discount);
        System.out.println(shipping);
        System.out.println(subtotal);
        System.out.println(orderTotal);

        return orderTotal == shipping + subtotal - discount;
    }

    public void clearChangeQty() {
        changeQty.clear();
    }

    public void setChangeQty(String value) {
        changeQty.typeAndEnter(value);
    }

    public void clickUpdateCartButton() {
        clickOn(updateCartButton);
    }
    public void clickProceedToCheckoutButton() {
        clickOn(proceedToCheckoutButton);
    }













}
