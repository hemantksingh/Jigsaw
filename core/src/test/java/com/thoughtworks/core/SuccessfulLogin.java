package com.thoughtworks.core;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SuccessfulLogin {

    private FakeMainActivity mainActivity;

    @Before
    public void setUp() {
        FakeAuthorization authorization = new FakeAuthorization();
        authorization.setAuthenticated(true);
        mainActivity = new FakeMainActivity();
        MainController controller = new MainController(mainActivity, authorization);

        controller.onLogin();
    }

    @Test
    public void startsTheDashboard() throws Exception {
        Assert.assertEquals(Activity.Dashboard, mainActivity.getStartedActivity());
    }

    @Test
    public void doesNotDisplayAMessage() {
        Assert.assertNull(mainActivity.getDisplayedMessage());
    }
}

