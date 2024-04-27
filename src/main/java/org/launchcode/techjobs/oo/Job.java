package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {
    // Fields provided in starter code
    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    // Code a constructor to initialize the id field with a unique value. This constructor should take no parameters.
    public Job() {
        id = nextId;
        // Increments so every new Job object will get a different ID number
        nextId++;
    }
    // Call the first constructor in order to initialize each of the five fields above
    // Make sure the parameters are defined in the specified order.
    // Job (String...) assigns values to each of the five fields
    // Job (String...) initializes fields for the object by calling the first constructor with the this(); statement
    // Including this(); in any Employer constructor makes initializing id a default behavior
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
