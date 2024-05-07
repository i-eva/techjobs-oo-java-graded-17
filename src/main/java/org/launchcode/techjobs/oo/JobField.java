package org.launchcode.techjobs.oo;

import java.util.Objects;

// DRY Employer, Location, PositionType, and CoreCompetency classes

public abstract class JobField {

    // Two fields: ID and value
    private int id;

    // Because nextId is static, its changing value is NOT stored within any JobField object
    private static int nextId = 1;
    private String value;

    // Two constructors: JobField() and JobField(String value)

    public JobField() {
        this.id = nextId; // in some classes this is id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    // Common custom methods

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField that = (JobField) o;
        return id == that.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Common getters and setters
    // Add a getter and setter for the 'value' field but ONLY a getter for the 'id' field.
    // Since the unique value of id is set with the constructors, we only need to add a getter for this field.

    public int getId() { return id; }

    public String getValue() { return value; }

    public void setValue(String value) { this.value = value; }

}

