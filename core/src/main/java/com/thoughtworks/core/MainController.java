package com.thoughtworks.core;

/**
 * Created by hkumar on 09/02/2015.
 */
public class MainController {
    private IMainActivity mView;
    private IAuthorization mAuthorization;

    public MainController(IMainActivity view, IAuthorization authorization) {
        mView = view;
        mAuthorization = authorization;
    }

    public void onLogin() {
        if(mAuthorization.isAuthenticated()) {
            //Log.i("Main Activity", "Log in successful.");
            this.mView.startActivity(Activity.Dashboard);
        }
        else {
            this.mView.showMessage("Unable to authenticate");
        }
    }
}
