package com.thoughtworks.jigsaw;

/**
 * Created by hkumar on 10/02/2015.
 */
public interface IMainActivity {
    void showMessage(String message);
    void startActivity(Class<?> activityClass);
}
