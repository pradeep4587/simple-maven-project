package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testAdd() {
        App app = new App();
        int result = app.add(1, 2);
        assertEquals(3, result);  // The test will pass if the result is 3
    }
}

