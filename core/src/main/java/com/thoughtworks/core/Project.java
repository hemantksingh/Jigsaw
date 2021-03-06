package com.thoughtworks.core;

import java.util.Date;

/**
 * Created by hkumar on 18/03/2015.
 */
public class Project {
    private final String clientName;
    public final String Name;
    private final String description;
    public final int Duration;
    public final String OpportunityOwner;
    public final Date EarliestStartDate;
    public final String LocationOfWork;
    public final int Probability;
    public final String ClientPrincipal;
    public final String Client;
    private final String Classification;

    public Project(String clientName, String name, String description, int duration,
                   String opportunityOwner, Date earliestStartDate, String locationOfWork,
                   int probability, String clientPrincipal, String client, String classification) {

        this.clientName = clientName;
        this.Name = name;
        this.description = description;
        this.Duration = duration;
        this.OpportunityOwner = opportunityOwner;
        this.EarliestStartDate = earliestStartDate;
        this.LocationOfWork = locationOfWork;
        this.Probability = probability;
        this.ClientPrincipal = clientPrincipal;
        this.Client = client;
        this.Classification = classification;
    }

    public String displayName() {
        if(description != null && description.trim() != "") {
            return clientName + " - " + Name + " - " + description;
        }

        return clientName + " - " + Name;
    }
}
