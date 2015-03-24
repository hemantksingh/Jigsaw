package com.thoughtworks.jigsaw;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by hkumar on 19/03/2015.
 */
public class ProjectsFragment extends Fragment {

    private ProjectFragmentAdapter mAdapter;
    private int mLayoutResource;

    public static ProjectsFragment newInstance(int layoutResource, ProjectFragmentAdapter adapter) {
       return new ProjectsFragment()
               .setLayoutResource(layoutResource)
               .setAdapter(adapter);
    }

    private ProjectsFragment setAdapter(ProjectFragmentAdapter adapter) {
        mAdapter = adapter;
        return this;
    }

    private ProjectsFragment setLayoutResource(int layoutResource) {
        this.mLayoutResource = layoutResource;
        return this;
    }

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(mLayoutResource, container, false);
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.pager);
        viewPager.setAdapter(mAdapter);
        return view;
    }
}
