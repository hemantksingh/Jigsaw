package com.thoughtworks.core;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UnsuccessfulLogin {

    private FakeMainActivity mainActivity;

    @Before
    public void setUp() {
        FakeAuthorization authorization = new FakeAuthorization();
        authorization.setAuthenticated(false);
        mainActivity = new FakeMainActivity();
        MainController controller = new MainController(mainActivity, authorization);

        controller.onLogin();
    }

    @Test
    public void showsAMessage() throws Exception {
        Assert.assertEquals("Unable to authenticate", mainActivity.getDisplayedMessage());
    }

    @Test
    public void doesNotStartTheDashboard(){
        Assert.assertNull(mainActivity.getStartedActivity());
    }
}