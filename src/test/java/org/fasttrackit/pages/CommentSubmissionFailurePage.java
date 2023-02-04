package org.fasttrackit.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CommentSubmissionFailurePage extends BasePage {


    @FindBy(css = "#error-page p:nth-child(2)")
    private WebElementFacade errorMsg;
    @FindBy(css = "#error-page p:nth-child(4) a")
    private WebElementFacade backLink;

    public String getCommentsErrMsg() {
        return errorMsg.getText();
    }

    public void clickBackLink() {
        clickOn(backLink);
    }











}
