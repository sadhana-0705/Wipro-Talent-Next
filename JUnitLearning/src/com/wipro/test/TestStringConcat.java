package com.wipro.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.wipro.task.DailyTasks;

public class TestStringConcat {

    @Test
    public void testDoStringConcat() {
        DailyTasks tasks = new DailyTasks();
        
        // Test case: combining "Hello" and "World" should result in "Hello World"
        String result = tasks.doStringConcat("Hello", "World");
        
        assertEquals("Hello World", result);
    }
}
