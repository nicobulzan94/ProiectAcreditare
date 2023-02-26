package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ShopPage extends BasePage {

    @FindBy(css = "h1.page-title")
    private WebElementFacade shopTitle;
    @FindBy(css = ".products.columns-4 li")
    private List<WebElementFacade> listOfProducts;
    @FindBy(css = ".woocommerce-result-count")
    private WebElementFacade resultCount;
    @FindBy(css = ".woocommerce-ordering select.orderby")
    private WebElementFacade sortByDropdown;
    @FindBy(css = "span.price span.amount:not(del span.amount)")
    private List<WebElementFacade> listOfPrices;
    @FindBy(css = "li.product:first-of-type a.add_to_cart_button")
    private WebElementFacade addToCartButtonFromFirstProduct;
    @FindBy(css = "li.product:first-of-type a.added")
    private WebElementFacade productAddedToCart;



    public String getShopTitle() {
        return shopTitle.getText();
    }
    public String getResultCountText() {
        return resultCount.getText();

    }

    //In order to test the testcases where there are 2 or even 3 numbers for results (ex: 45-50, 123-128)
    //I would make another method where I would first parseInt for 3-3 digits (123-126), and after I would get into an ErrorHandling
    //in that ErrorHandling I would try an "if" for 3-2 digits(91-100) and I would nest another ErrorHandling for the testcase with 2-2 digits(22-28)
    //in the end I would add one last errorHandling with the testcase 2-1 digits (1-16)
    //for the below method I covered only simple testcase for 1-2 digits (1-16):
    public boolean verifyNrOfProductsOnPage() {
        String resultString = getResultCountText();
        System.out.println(resultString);
        int firstNr = Integer.parseInt(resultString.substring(8,9));
        int secondNr = Integer.parseInt(resultString.substring(10,12));
        int defaultNrOfProductsOnPg = secondNr - firstNr + 1;
        System.out.println("This is the nr of products from resultCount " + defaultNrOfProductsOnPg);

            if(listOfProducts.size()  == defaultNrOfProductsOnPg){
                return true;
            }
        return false;
    }

    public void selectByPriceHighToLowFromDropdown() {
        sortByDropdown.selectByIndex(4);
    }

    public boolean isPriceDescending() {

        int firstPrice = getIntFromPrice(listOfPrices.get(0).getText());
        System.out.println(firstPrice);
        int lastPrice = getIntFromPrice(listOfPrices.get(listOfPrices.size() -1).getText());
        System.out.println(lastPrice);

        return firstPrice > lastPrice;

    }

    public void selectByNewnessFromDropdown() {
        sortByDropdown.selectByIndex(2);
    }

    public void clickAddToCartButtonFromFirstProduct() {
        clickOn(addToCartButtonFromFirstProduct);
    }

    public boolean productAddedToCartElementIsPresent() {
        if(productAddedToCart.isVisible()) {
            System.out.println("Product was successfully added to cart.");
            return true;
        }
        System.out.println("Product was not added to cart the the OK sign is not present.");
        return false;
    }









}
