package com.thoughtworks.jigsaw;

import android.content.Context;
import android.content.Intent;

/**
 * Created by hkumar on 10/02/2015.
 */
public interface IMainActivity {
    void startActivity(Intent intent);
    Context context();
    void showMessage(String message);
}
