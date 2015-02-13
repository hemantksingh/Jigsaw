package com.thoughtworks.core;

import org.junit.Assert;
import org.junit.Test;

public class UnsuccessfulLogin {

    @Test
    public void showsAMessage() throws Exception {
        FakeAuthorization fakeAuthorization = new FakeAuthorization();
        fakeAuthorization.setAuthenticated(false);

        FakeMainActivity fakeMainActivity = new FakeMainActivity();
        MainController controller = new MainController(fakeMainActivity, fakeAuthorization);
        controller.onLogin();

        Assert.assertEquals("Unable to authenticate", fakeMainActivity.getDisplayedMessage());
    }
}