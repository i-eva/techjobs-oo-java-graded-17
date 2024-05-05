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
    // In the IntelliJ editor, right-click on the class name then select Generate from the menu.
    // Select equals() and hashCode(). You will be asked which template to use.
    // Select java.util.Objects.equals() and hashCode() (java 7+). This is all we will select for now.
    // When you are asked to Choose fields to be included in equals() choose the fields you want equals to consider.
    // The next menu will ask you to Choose the fields you want included in hashCode().
    // This should match the fields you selected when you were setting up the equals() method. Select Create.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: create a toString method that passes the first test in TestTaskFive.
    //  Since the test only checks if the returned string starts and ends with a blank line, make that happen.

    @Override
    public String toString() {
        String printName;
        String printEmployer;
        String printLocation;
        String printPositionType;
        String printCoreCompetency;
        if (getName().isBlank()) {
            printName = "Data not available";
        } else {
            printName = getName();
        }
        if (getEmployer().getValue().isBlank()) {
            printEmployer = "Data not available";
        } else {
            printEmployer = getEmployer().getValue();
        }
        if (getLocation().getValue().isBlank()) {
            printLocation = "Data not available";
        } else {
            printLocation = getLocation().getValue();
        }
        if (getPositionType().getValue().isBlank()) {
            printPositionType = "Data not available";
        } else {
            printPositionType = getPositionType().getValue();
        }
        if (getCoreCompetency().getValue().isBlank()) {
            printCoreCompetency = "Data not available";
        } else {
            printCoreCompetency = getCoreCompetency().getValue();
        }
        String jobString =
        System.lineSeparator() + "ID: " + getId() +
        System.lineSeparator() + "Name: " + printName +
        System.lineSeparator() + "Employer: " + printEmployer +
        System.lineSeparator() + "Location: " + printLocation +
        System.lineSeparator() + "Position Type: " + printPositionType +
        System.lineSeparator() + "Core Competency: " + printCoreCompetency +
        System.lineSeparator();
        return jobString;
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    // Generate getters and setters for id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Generate setter only for nextId

    public static void setNextId(int nextId) {
        Job.nextId = nextId;
    }

    // Generate getters and setters for five fields in second constructor.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }


}
