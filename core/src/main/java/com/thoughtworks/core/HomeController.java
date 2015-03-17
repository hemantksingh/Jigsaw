package com.thoughtworks.core;

/**
 * Created by hkumar on 17/03/2015.
 */
public class HomeController {

    private IHomeActivity mActivity;

    public HomeController(IHomeActivity activity) {
        mActivity = activity;
    }

    public void onOptionSelected(int optionNumber) {
        String[] options = mActivity.getAllOptions();
        Option option = new Option(optionNumber, options[optionNumber]);
        mActivity.createOptionView(option);
        mActivity.closeDrawer();
    }
}
