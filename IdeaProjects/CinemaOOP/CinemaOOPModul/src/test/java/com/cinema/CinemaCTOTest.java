package com.cinema;

import org.junit.Test;

/**
 * Created by kyrka on 2017.05.24..
 */
public class CinemaCTOTest {
    CinemaCTO cinemaCTO = new CinemaCTO(0, 0, "name");

    @Test
    public void testMakeCommentAboutWork() throws Exception {
        cinemaCTO.makeCommentAboutWork(new Buffeter(0, 0, "name"));
    }

    @Test
    public void testMakeCommentAboutWork2() throws Exception {
        cinemaCTO.makeCommentAboutWork(new Cashier(0, 0, "name"));
    }

    @Test
    public void testMakeCommentAboutWork3() throws Exception {
        cinemaCTO.makeCommentAboutWork(new Ticketer(0, 0d, "name"));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme