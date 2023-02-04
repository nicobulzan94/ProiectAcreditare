package org.fasttrackit.pages;


import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class BlogPage extends BasePage {

    @FindBy(css = "h3.entry-title")
    private WebElementFacade blogTitle;
    @FindBy(id = "comment")
    private WebElementFacade commentField;
    @FindBy(id = "author")
    private WebElementFacade nameField;
    @FindBy(id = "email")
    private WebElementFacade emailField;
    @FindBy(id = "submit")
    private WebElementFacade postCommentButton;
    @FindBy(css = "p.comment-awaiting-moderation")
    private WebElementFacade commentAwaitingModeration;


    public boolean blogTitleIsVisible() {
        return blogTitle.isVisible();
    }

    public void setCommentField(String value) {
        typeInto(commentField,value);
    }

    public void setNameField(String value) {
        typeInto(nameField, value);
    }

    public void setEmailField(String value) {
        typeInto(emailField, value);
    }

    public void clickPostCommentButton() {
        clickOn(postCommentButton);
    }

    public boolean getCommentAwaitingModerationTxt() {
        if(commentAwaitingModeration.isDisplayed()) {
            return true;
        }
        return false;
    }







}
