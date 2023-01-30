package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class HomeSteps extends BaseSteps {

    @Step
    public void clickOnLogInOrRegLink() {
        homePage.clickOnLogInOrRegLink();
    }

}
