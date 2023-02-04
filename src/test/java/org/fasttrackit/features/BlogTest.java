package org.fasttrackit.features;

import org.junit.Test;

public class BlogTest extends BaseTest {

    @Test
    public void postWithEmptyFields() {
        blogSteps.navigateToBlogPage();
        blogSteps.clickOnPostCommentButton();
        commSubmissionFailSteps.errMsgFillRequiredFields();
        commSubmissionFailSteps.clickOnBackLink();
    }

    @Test
    public void postWithInvalidEmail() {
        blogSteps.navigateToBlogPage();
        blogSteps.typeName("Ana");
        blogSteps.typeEmail("1@");
        blogSteps.clickOnPostCommentButton();
        commSubmissionFailSteps.errMsgEnterValidEmail();
        commSubmissionFailSteps.clickOnBackLink();
    }

    @Test
    public void postWithoutComment() {
        blogSteps.navigateToBlogPage();
        blogSteps.typeName("Ana");
        blogSteps.typeEmail("test@test.com");
        blogSteps.clickOnPostCommentButton();
        commSubmissionFailSteps.errMsgTypeComment();
        commSubmissionFailSteps.clickOnBackLink();
    }

    @Test
    public void postCommentSuccessfully() {
        blogSteps.navigateToBlogPage();
        blogSteps.typeComment("This is good.");
        blogSteps.typeName("Ana");
        blogSteps.typeEmail("test@test.com");
        blogSteps.clickOnPostCommentButton();
        blogSteps.verifyIfTheCommentAwaitsModeration();

    }

    @Test
    public void postDuplicateComment() {
        blogSteps.navigateToBlogPage();
        blogSteps.typeComment("The products on this site are very good.");
        blogSteps.typeName("Ana");
        blogSteps.typeEmail("test@test.com");
        blogSteps.clickOnPostCommentButton();
        commSubmissionFailSteps.errMsgDuplicateCommentDetected();
    }









}
