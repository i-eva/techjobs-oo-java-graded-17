package org.launchcode.techjobs.oo;

import java.util.Objects;

public class CoreCompetency {
// The constructors and custom methods are completed in starter code
    private int id;
    private static int nextId = 1;
    private String value;

    public CoreCompetency() {
        this.id = nextId;
        nextId++;
    }

    public CoreCompetency(String value) {
        this();
        this.value = value;
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CoreCompetency)) return false;
        CoreCompetency that = (CoreCompetency) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Use the "Generate" tool to add a getter and setter for the 'value' field but
    //  ONLY a getter for the 'id' field.
// Right-click in the editor pane and select Generate.
//Select the Getter and Setter option.
//Select the value option, then click OK. you should now see the getters and setters.
//Since the unique value of id is set with the constructors, we only need to add a getter for this field.
// Select Generate again and use the Getter option for id.
// Note
//Want to use fewer clicks? You could always Generate getters and setters for both id and value, and then delete the setID method.
//
//Be careful, though. If you forget to remove setID, then users can change the id value, which may cause problems in the program.

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }
}
