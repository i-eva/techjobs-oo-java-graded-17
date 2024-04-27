package org.launchcode.techjobs.oo;

import java.util.Objects;

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
        PositionType that = (PositionType) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
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
