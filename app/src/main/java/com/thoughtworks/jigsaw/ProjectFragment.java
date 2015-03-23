package com.thoughtworks.jigsaw;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by hkumar on 23/03/2015.
 */
public class ProjectFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_project, container, false);
        TextView txtViewProjectName = (TextView) view.findViewById(R.id.txtView_projectName);
        txtViewProjectName.setText(getArguments().getString("projectName"));
        return view;
    }
}
