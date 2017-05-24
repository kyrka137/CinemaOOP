package com.cinema;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by kyrka on 2017.05.24..
 */
public class TicketerTest {
    Ticketer ticketer = new Ticketer(0, 0d, "name");

    @Test
    public void testRaiseSalary() throws Exception {
        double result = ticketer.raiseSalary(new Cinema(0), 0);
        Assert.assertTrue(0 == result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme