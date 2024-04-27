package org.launchcode.techjobs.oo;

public class PositionType {
    // The constructors, getters, and setters are completed in the starter code.

    private int id;
    private static int nextId = 1;
    private String value;

    public PositionType() {
        id = nextId;
        nextId++;
    }

    public PositionType(String value) {
        this();
        this.value = value;
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.
    // Code a toString method that just returns the value of a PositionType object.
    @Override
    public String toString() {
        return value;
    }

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.
    //Use the Generate option again to add the equals and hashCode methods.
    // Refer to the Classes and Objects Part 2 IntelliJ Generator Shortcut section if you need a quick review.
    //Assume that two PositionType objects are equal when their id fields match.

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
