package org.launchcode.techjobs.oo;

import org.junit.Test;

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
        Job techJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        // Use assertTrue and assertEquals statements to test that the constructor correctly assigns both the class and value of each field.
        // Sticking point: why not just check assertTrue(techJob instance of Job)?
        // Answer: "The instanceof keyword compares the instance with type." W3 Schools
        // If LaunchCode wants 5 assertTrue statements using instanceof, they must want to test the type of each argument
        // name field is an instance of... String? Because the argument is a string, and strings belong to type String
        assertTrue(techJob.getName() instanceof String);
        // name field has expected value?
        assertEquals("Product tester", techJob.getName());
        // Employer field is an instance of Employer class?
        assertTrue(techJob.getEmployer() instanceof Employer);
        // Employer field has expected value?
        // assertEquals("ACME", techJob.getEmployer());
        // Location field is an instance of Location class?
        assertTrue(techJob.getLocation() instanceof Location);
        // Location field has expected value?
        // assertEquals("Desert", techJob.getLocation());
        // PositionType field is an instance of PositionType class?
        assertTrue(techJob.getPositionType() instanceof PositionType);
        // PositionType field has expected value?
        // assertEquals("Quality control", techJob.getPositionType());
        // CoreCompetency field is an instance of CoreCompetency class?
        assertTrue(techJob.getCoreCompetency() instanceof CoreCompetency);
        // CoreCompetency field has expected value?
        // assertEquals("Persistence", techJob.getCoreCompetency());
    }

}
