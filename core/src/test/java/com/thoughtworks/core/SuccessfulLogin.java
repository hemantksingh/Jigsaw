package com.thoughtworks.core;

import org.junit.Assert;

public class SuccessfulLogin {

    @org.junit.Test
    public void startsTheDashboard() throws Exception {
        FakeAuthorization fakeAuthorization = new FakeAuthorization();
        fakeAuthorization.setAuthenticated(true);
        FakeMainActivity fakeMainActivity =  new FakeMainActivity();
        MainController controller = new MainController(fakeMainActivity, fakeAuthorization);
        controller.onLogin();

        Assert.assertEquals(Activity.Dashboard, fakeMainActivity.getStartedActivity());
    }
}

