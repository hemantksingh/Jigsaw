package com.thoughtworks.jigsaw;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.thoughtworks.core.Project;
import com.thoughtworks.core.ProjectRepository;

import java.util.List;

/**
 * Created by hkumar on 23/03/2015.
 */
public class ProjectFragmentAdapter extends FragmentPagerAdapter {

    List<Project> mProjects;

    public ProjectFragmentAdapter(FragmentManager fm, ProjectRepository repository) {
        super(fm);
        mProjects = repository.getProjects();
    }

    @Override
    public Fragment getItem(int position) {
        Bundle args = new Bundle();
        args.putString("projectName", mProjects.get(position).displayName());

        Fragment fragment = new ProjectFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getCount() {
        return mProjects.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mProjects.get(position).Name;
    }
}
