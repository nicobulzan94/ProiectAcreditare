package org.fasttrackit.features;

import org.junit.Test;

public class BlogTest extends BaseTest {

    @Test
    public void postWithEmptyFieldsTest() {
        blogSteps.navigateToBlogPage();
        blogSteps.clickOnPostCommentButton();
        commSubmissionFailSteps.errMsgFillRequiredFields();
        commSubmissionFailSteps.clickOnBackLink();
    }

    @Test
    public void postWithInvalidEmailTest() {
        blogSteps.navigateToBlogPage();
        blogSteps.typeName("Ana");
        blogSteps.typeEmail("1@");
        blogSteps.clickOnPostCommentButton();
        commSubmissionFailSteps.errMsgEnterValidEmail();
        commSubmissionFailSteps.clickOnBackLink();
    }

    @Test
    public void postWithoutCommentTest() {
        blogSteps.navigateToBlogPage();
        blogSteps.typeName("Ana");
        blogSteps.typeEmail("test@test.com");
        blogSteps.clickOnPostCommentButton();
        commSubmissionFailSteps.errMsgTypeComment();
        commSubmissionFailSteps.clickOnBackLink();
    }

    @Test
    public void postCommentSuccessfullyTest() {
        blogSteps.navigateToBlogPage();
        blogSteps.typeComment("I like FastTrackIT.");
        blogSteps.typeName("Ana");
        blogSteps.typeEmail("test@test.com");
        blogSteps.clickOnPostCommentButton();
        blogSteps.verifyIfTheCommentAwaitsModeration();

    }

    @Test
    public void postDuplicateCommentTest() {
        blogSteps.navigateToBlogPage();
        blogSteps.typeComment("The products on this site are very good.");
        blogSteps.typeName("Ana");
        blogSteps.typeEmail("test@test.com");
        blogSteps.clickOnPostCommentButton();
        commSubmissionFailSteps.errMsgDuplicateCommentDetected();
    }









}
