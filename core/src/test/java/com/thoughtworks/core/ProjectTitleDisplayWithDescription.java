package com.thoughtworks.core;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hkumar on 23/03/2015.
 */
public class ProjectTitleDisplayWithDescription {

    Project mProject;

    @Test
    public void containsClientNameProjectNameAndDescription() {
        mProject = new Project("Client A", "Project 1",
                "Project to start in a month", 20,"",
                null, "", 0, "", "", "");

        Assert.assertEquals("Client A - Project 1 - Project to start in a month",
                mProject.displayName());
    }


}

