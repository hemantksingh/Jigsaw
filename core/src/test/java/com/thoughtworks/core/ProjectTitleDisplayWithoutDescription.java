package com.thoughtworks.core;

import org.junit.Assert;
import org.junit.Test;

public class ProjectTitleDisplayWithoutDescription {

    Project mProject;

    @Test
    public void containsClientNameAndProjectName() {
        mProject = new Project("Client A", "Project 1",
                "", 20,"", null, "", 0, "", "", "");

        Assert.assertEquals("Client A - Project 1", mProject.displayName());
    }
}
