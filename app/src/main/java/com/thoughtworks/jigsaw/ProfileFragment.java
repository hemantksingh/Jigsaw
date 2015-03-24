package com.thoughtworks.jigsaw;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by hkumar on 24/03/2015.
 */
public class ProfileFragment extends Fragment {
    public ProfileFragment() {
        // Empty constructor required for fragment subclasses
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
            /*Passing false indicates the view (fragment) is ready to be attached to the
            container but not actually attached at this point. This tells Android where
            this view needs to be placed when it is laid out. The actual layout is
            handled by Android*/
        View rootView = inflater.inflate(R.layout.fragment_profile, container, false);
        return rootView;
    }
}
