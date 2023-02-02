package org.fasttrackit.steps;

import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrackit.pages.AccountLoginPage;
import org.fasttrackit.pages.MyAccountPage;
import org.fasttrackit.pages.AccountRegPage;
import org.fasttrackit.pages.HomePage;

public class BaseSteps extends ScenarioSteps {

    protected HomePage homePage;
    protected AccountLoginPage loginPage;
    protected AccountRegPage regPage;
    protected MyAccountPage accountPage;

}
