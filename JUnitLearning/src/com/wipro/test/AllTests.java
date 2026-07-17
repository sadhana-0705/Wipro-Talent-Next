package com.wipro.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

// Specifies that this class runs as a Suite collection
@RunWith(Suite.class)

// List all 3 test classes to execute together
@SuiteClasses({ 
    TestStringConcat.class, 
    TestSort.class, 
    TestCheckPresence.class 
})

public class AllTests {
    // This class remains empty. It only serves as a holder for the annotations above.
}
