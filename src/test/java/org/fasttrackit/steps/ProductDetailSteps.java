package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class ProductDetailSteps extends BaseSteps{

    @Step
    public void arrivedOnPDPSuccessfully() {
        productDetailPage.breadcrumbIsVisible();
        productDetailPage.addToCartButtonIsVisible();
    }

    @Step
    public void addToCartTheProduct() {
        productDetailPage.clickAddToCartButton();
    }

    @Step
    public void verifyProductAddedToCartMsg() {
        Assert.assertTrue(productDetailPage.productAddedToCartMsgIsVisible());
    }

    @Step
    public void clickViewCartButton() {
        productDetailPage.clickViewCartButton();
    }


}
