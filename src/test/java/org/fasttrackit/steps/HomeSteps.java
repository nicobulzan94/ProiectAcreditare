package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;

public class HomeSteps extends BaseSteps {

    @Step
    public void clickOnLogInOrRegLink() {
        homePage.clickOnLogInOrRegLink();
    }

    @Step
    public void clickOnCartIcon() {
        homePage.clickHeaderCartIcon();
    }











}
