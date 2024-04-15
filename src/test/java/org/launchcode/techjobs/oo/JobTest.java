package org.launchcode.techjobs.oo;


import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {

    @Test
    public void testSettingJobId() {
        Job test_job = new Job();
        Job test_job2 = new Job();
        assertNotEquals(test_job, test_job2);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(3, test_job.getId());
        assertEquals(test_job.getName(), "Product tester");
        assertEquals(test_job.getEmployer().getValue(), "ACME");
        assertEquals(test_job.getLocation().getValue(), "Desert");
        assertEquals(test_job.getPositionType().getValue(), "Quality control");
        assertEquals(test_job.getCoreCompetency().getValue(), "Persistence");
        assertTrue(test_job instanceof Job);
        assertTrue(test_job.getName() != null);
        assertTrue(test_job.getEmployer() instanceof Employer);
        assertTrue(test_job.getLocation() instanceof Location);
        assertTrue(test_job.getPositionType() instanceof PositionType);
        assertTrue(test_job.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(test_job.equals(test_job2));
    }
}