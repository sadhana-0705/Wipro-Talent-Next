package com.wipro.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;
import com.wipro.task.DailyTasks;

public class TestCheckPresence {

    @Test
    public void testCheckPresence() {
        DailyTasks tasks = new DailyTasks();
        
        // Tests checkPresence using assertTrue and assertFalse
        assertTrue(tasks.checkPresence("Learning Java JUnit", "Java"));
        assertFalse(tasks.checkPresence("Learning Java JUnit", "Python"));
    }
}

