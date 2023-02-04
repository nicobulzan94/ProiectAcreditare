package org.fasttrackit.steps;

import org.junit.Assert;

public class CommSubmissionFailSteps extends BaseSteps {

    public void errMsgFillRequiredFields() {
        Assert.assertEquals("ERROR: please fill the required fields (name, email).", commentSubmissionFailurePage.getCommentsErrMsg());
    }

    public void errMsgTypeComment() {
        Assert.assertEquals("ERROR: please type a comment.", commentSubmissionFailurePage.getCommentsErrMsg());
    }

    public void errMsgEnterValidEmail() {
        Assert.assertEquals("ERROR: please enter a valid email address.", commentSubmissionFailurePage.getCommentsErrMsg());
    }

    public void errMsgDuplicateCommentDetected() {
        Assert.assertEquals("Duplicate comment detected; it looks as though you’ve already said that!", commentSubmissionFailurePage.getCommentsErrMsg());
    }

    public void clickOnBackLink() {
        commentSubmissionFailurePage.clickBackLink();
    }


}
