package com.thoughtworks.jigsaw;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thoughtworks.core.ProjectRepository;

/**
 * Created by hkumar on 19/03/2015.
 */
public class ProjectsFragment extends Fragment {

    public ProjectsFragment(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_projects, container, false);

        ViewPager viewPager = (ViewPager) view.findViewById(R.id.pager);
        viewPager.setAdapter(new ProjectFragmentAdapter(getFragmentManager(), new ProjectRepository()));
        return view;
    }
}
