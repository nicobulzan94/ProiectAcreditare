package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class BlogSteps extends BaseSteps {

    @Step
    public void navigateToBlogPage() {
        homePage.clickBlogButton();
        Assert.assertTrue(blogPage.blogTitleIsVisible());
    }

    @Step
    public void typeComment(String comment) {
        blogPage.setCommentField(comment);
    }

    @Step
    public void typeName(String name) {
        blogPage.setNameField(name);
    }

    @Step
    public void typeEmail(String email) {
        blogPage.setEmailField(email);
    }

    @Step
    public void clickOnPostCommentButton() {
        blogPage.clickPostCommentButton();
    }

    @Step
    public void verifyIfTheCommentAwaitsModeration() {
        Assert.assertTrue("The comment was not posted.", blogPage.getCommentAwaitingModerationTxt());
    }




}
