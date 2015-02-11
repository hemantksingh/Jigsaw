package com.thoughtworks.jigsaw;

import android.util.Log;

/**
 * Created by hkumar on 09/02/2015.
 */
public class MainController {
    private IMainActivity mView;

    public MainController(IMainActivity view) {
        mView = view;
    }

    private boolean isAuthenticated() {
        return true;
    }

    public void onLogin() {
        if(isAuthenticated()) {
            Log.i("Main Activity", "Log in successful.");
            this.mView.startActivity(DashboardActivity.class);
        }
        else {
            this.mView.showMessage("Unable to authenticate");
        }
    }
}
