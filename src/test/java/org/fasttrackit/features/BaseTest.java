package org.fasttrackit.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.*;
import org.fasttrackit.utils.Constants;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class BaseTest {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Steps
    protected HomeSteps homeSteps;
    @Steps
    protected LoginSteps loginSteps;
    @Steps
    protected AccountSteps accountSteps;
    @Steps
    protected RegisterSteps registerSteps;
    @Steps
    protected BlogSteps blogSteps;
    @Steps
    protected CommSubmissionFailSteps commSubmissionFailSteps;
    @Steps
    protected SearchResultsSteps searchResultsSteps;
    @Steps
    protected ShopSteps shopSteps;
    @Steps
    protected CartSteps cartSteps;
    @Steps
    protected ProductDetailSteps productDetailSteps;
    @Steps
    protected CheckoutSteps checkoutSteps;


    @Before
    public void initTests(){
        driver.manage().window().maximize();
        driver.get(Constants.BASE_URL);
    }





}
