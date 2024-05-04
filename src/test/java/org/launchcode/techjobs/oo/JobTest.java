package org.launchcode.techjobs.oo;

import org.junit.Test;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId()  {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId()); //tests for unique ID numbers
    }

    @Test
    public void testJobConstructorSetsAllFields()  {
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        // Use assertTrue and assertEquals statements to test that the constructor correctly assigns both the class and value of each field.
        // Sticking point: why not just check assertTrue(techJob instance of Job)?
        // Answer: "The instanceof keyword compares the instance with type." W3 Schools
        // If LaunchCode wants 5 assertTrue statements using instanceof, they must want to test the type of each argument
        // name field is an instance of... String? Because the argument is a string, and strings belong to Java class String
        assertTrue(job3.getName() instanceof String);
        // name field has expected value?
        assertEquals("Product tester", job3.getName());
        // Employer field is an instance of Employer class?
        assertTrue(job3.getEmployer() instanceof Employer);
        // Employer field has expected value?
        assertEquals("ACME", job3.getEmployer().toString());
        // Location field is an instance of Location class?
        assertTrue(job3.getLocation() instanceof Location);
        // Location field has expected value?
        assertEquals("Desert", job3.getLocation().toString());
        // PositionType field is an instance of PositionType class?
        assertTrue(job3.getPositionType() instanceof PositionType);
        // PositionType field has expected value?
        assertEquals("Quality control", job3.getPositionType().toString());
        // CoreCompetency field is an instance of CoreCompetency class?
        assertTrue(job3.getCoreCompetency() instanceof CoreCompetency);
        // CoreCompetency field has expected value?
        assertEquals("Persistence", job3.getCoreCompetency().toString());
    }

    @Test
    public void testJobsForEquality() {
        Job job4 = new Job("Gofer", new Employer("Jim Henson Productions"), new Location("Backstage"), new PositionType("Nephew of Theatre Owner"), new CoreCompetency("Makes coffee"));
        Job job5 = new Job("Gofer", new Employer("Jim Henson Productions"), new Location("Backstage"), new PositionType("Nephew of Theatre Owner"), new CoreCompetency("Makes coffee"));
        assertNotEquals(job4, job5); //tests for unique ID numbers while setting all other fields to the same values
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        // When passed a Job object (ToString(job6)), it should return a string that contains a blank line before and after the job information.
        // Use assertEquals to verify that these characters are correct, in correct format
        Job job6 = new Job("Zoot", new Employer("Jim Henson Productions"), new Location("Orchestra Pit"), new PositionType("Musician"), new CoreCompetency("Plays Saxophone"));
        String firstChar = String.valueOf(job6.toString().charAt(0));
        String lastChar = String.valueOf(job6.toString().charAt(job6.toString().length()-1));
        assertEquals(firstChar, lineSeparator());
        assertEquals(lastChar, lineSeparator());
    }
}
