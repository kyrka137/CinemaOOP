package com.cinema;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by kyrka on 2017.05.24..
 */
public class BuffeterTest {
    Buffeter buffeter = new Buffeter(0, 0, "name");

    @Test
    public void testRaiseSalary() throws Exception {
        double result = buffeter.raiseSalary(new Cinema(0), 0);
        Assert.assertTrue(0==result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme