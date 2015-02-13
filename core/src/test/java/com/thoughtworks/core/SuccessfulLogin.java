package com.thoughtworks.core;

import org.junit.Assert;

public class SuccessfulLogin {

    @org.junit.Test
    public void startsTheDashboard() throws Exception {
        FakeMainActivity activity =  new FakeMainActivity();
        MainController controller = new MainController(activity);
        controller.onLogin();

        Assert.assertEquals(Activity.Dashboard, activity.getStartedActivity());
    }
}