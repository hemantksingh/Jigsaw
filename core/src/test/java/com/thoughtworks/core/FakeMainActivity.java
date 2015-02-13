package com.thoughtworks.core;

/**
 * Created by hkumar on 13/02/2015.
 */
public class FakeMainActivity implements IMainActivity {
    private Activity startedActivity;

    @Override
    public void showMessage(String message) {

    }

    @Override
    public void startActivity(Activity activity) {
        startedActivity = activity;
    }

    public Activity getStartedActivity() {
        return startedActivity;
    }
}
