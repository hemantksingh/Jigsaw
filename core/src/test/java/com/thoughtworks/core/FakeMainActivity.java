package com.thoughtworks.core;

/**
 * Created by hkumar on 13/02/2015.
 */
public class FakeMainActivity implements IMainActivity {
    private Activity startedActivity;
    private String displayedMessage;

    @Override
    public void showMessage(String message) {
        displayedMessage = message;
    }

    @Override
    public void startActivity(Activity activity) {
        startedActivity = activity;
    }

    public Activity getStartedActivity() {
        return startedActivity;
    }

    public String getDisplayedMessage() {
        return displayedMessage;
    }
}
