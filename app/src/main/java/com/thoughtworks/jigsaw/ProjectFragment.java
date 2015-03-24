package com.thoughtworks.jigsaw;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.thoughtworks.core.Project;

/**
 * Created by hkumar on 23/03/2015.
 */
public class ProjectFragment extends Fragment {

    private static int layoutResource;
    private Project project;

    public static ProjectFragment newInstance(int layoutResource, Project project) {
        return new ProjectFragment()
                .setLayoutResource(layoutResource)
                .setProject(project);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(layoutResource, container, false);
        TextView txtViewProjectName = (TextView) view.findViewById(R.id.txtView_projectName);
        txtViewProjectName.setText(project.displayName());
        return view;
    }

    private ProjectFragment setLayoutResource(int layoutResource) {
        this.layoutResource = layoutResource;
        return this;
    }

    private ProjectFragment setProject(Project project) {
        this.project = project;
        return this;
    }
}
