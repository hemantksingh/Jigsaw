package com.thoughtworks.jigsaw;

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

    private final int layoutResource;
    List<Project> projects;

    public ProjectFragmentAdapter(FragmentManager fm, int projectFragment,
                                  ProjectRepository repository) {
        super(fm);
        this.layoutResource = projectFragment;
        this.projects = repository.getProjects();
    }

    @Override
    public Fragment getItem(int position) {
        return ProjectFragment.newInstance(layoutResource,
                projects.get(position));
    }

    @Override
    public int getCount() {
        return projects.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return projects.get(position).Name;
    }
}
