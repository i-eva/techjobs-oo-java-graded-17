package org.launchcode.techjobs.oo;

import java.util.Objects;

// Sally's demo of how to assign a unique ID:
public class Employer {

    // Two fields: ID and value
    private int id;

    // Because nextId is static, its changing value is NOT stored within any Employer object
    private static int nextId = 1;
    private String value;

    // Two constructors: Employer() and Employer(String value):

    // Employer () assigns the value of nextId to the id field
    public Employer() {
        id = nextId;
        // Increments so every new Employer object will get a different ID number
        nextId++;
    }

    // Employer (String value) assigns aValue to the value field
    // Employer (String value) initializes id for the object by calling the first constructor with the this(); statement
    // Including this(); in any Employer constructor makes initializing id a default behavior
    public Employer(String value) {
        this();
        this.value = value;
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer employer = (Employer) o;
        return getId() == employer.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}


