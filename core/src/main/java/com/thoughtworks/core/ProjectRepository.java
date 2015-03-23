package com.thoughtworks.core;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by hkumar on 18/03/2015.
 */
public class ProjectRepository {

    private final List<Project> mProjects = new ArrayList<>();


    public List<Project> getProjects() {

        mProjects.add(new Project(
                "Elsevier Ltd", "Science Direct", "Delivery July'15 to Dec'15 (Phase 2)", 6, "Parvinder S kalra",
                new GregorianCalendar(2015, 7, 1).getTime(), "London", 80, "", "Target", ""));
        mProjects.add(new Project(
                "D-Cent / Nesta", "D-Cent Pilot Release 2", "", 4, "John Michaelides",
                new GregorianCalendar(2015, 5, 1).getTime(), "London Office", 90, "", "Tactical", ""));
        mProjects.add(new Project(
                "Global Blue SA", "GB:Programme/advisory 2015 Q2", "", 3, "Barbara Philips",
                new GregorianCalendar(2015, 7, 1).getTime(), "London", 80, "", "Target", ""));
        mProjects.add(new Project(
                "Morrisons", "Tablet Apps", "", 11, "Joe Lubczynskj",
                new GregorianCalendar(2015, 4, 27).getTime(), "", 60, "", "Grow", ""));

        return mProjects;
    }
}
