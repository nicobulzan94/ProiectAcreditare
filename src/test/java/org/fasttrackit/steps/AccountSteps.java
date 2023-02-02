package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class AccountSteps extends BaseSteps {

    @Step
    public void userIsLoggedIn(String userName) {
        Assert.assertEquals(userName, accountPage.userIsLoggedIn());
    }




















}
