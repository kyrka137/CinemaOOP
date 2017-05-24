package com.cinema;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;

import static org.mockito.Mockito.*;

/**
 * Created by kyrka on 2017.05.24..
 */
public class CinemaTest {


    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testItemCountAdder() throws Exception {
        Cinema cinema = new Cinema(0);
        int result = cinema.itemCountAdder(1);
        Assert.assertTrue(1 == result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme