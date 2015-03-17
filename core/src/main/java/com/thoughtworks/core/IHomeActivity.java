package com.thoughtworks.core;

/**
 * Created by hkumar on 17/03/2015.
 */
public interface IHomeActivity {
    void createOptionView(Option option);
    String[] getAllOptions();
    void closeDrawer();
}
