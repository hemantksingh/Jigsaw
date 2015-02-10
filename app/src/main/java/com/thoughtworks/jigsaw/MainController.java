package com.thoughtworks.jigsaw;

import android.content.Intent;
import android.util.Log;

/**
 * Created by hkumar on 09/02/2015.
 */
public class MainController {
    private MainActivity mView;

    public MainController(MainActivity view) {
        mView = view;
    }

    private boolean isAuthenticated() {
        return true;
    }

    public void onLogin() {
        if(isAuthenticated()) {
            Log.i("Main Activity", "Log in successful.");
            Intent intent = new Intent(mView, DashboardActivity.class);
            this.mView.startActivity(intent);
        }
    }
}
