package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductDetailPage extends BasePage {

    @FindBy(css = ".woocommerce-breadcrumb")
    private WebElementFacade breadcrumb;

    @FindBy(css = "button.single_add_to_cart_button")
    private WebElementFacade addToCartButton;
    @FindBy(css = ".woocommerce-message")
    private WebElementFacade productAddedToCartMessage;
    @FindBy(css = "a.button.wc-forward")
    private WebElementFacade viewCartButton;


    public void breadcrumbIsVisible() {
        breadcrumb.isVisible();
    }

    public void addToCartButtonIsVisible() {
        addToCartButton.isVisible();
    }

    public boolean productAddedToCartMsgIsVisible() {
        if(productAddedToCartMessage.isVisible()) {
            return true;
        }
        return false;
    }

    public void clickAddToCartButton() {
        clickOn(addToCartButton);
    }

    public void clickViewCartButton() {
        clickOn(viewCartButton);
    }






}
