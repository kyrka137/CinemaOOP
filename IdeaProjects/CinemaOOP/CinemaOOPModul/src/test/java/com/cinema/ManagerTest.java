package com.cinema;

import org.junit.Test;

/**
 * Created by kyrka on 2017.05.24..
 */
public class ManagerTest {
    Manager manager = new Manager(0, 0, "name");

    @Test
    public void testMakeCommentAboutWork() throws Exception {
        manager.makeCommentAboutWork(new Buffeter(0, 0, "name"));
    }

    @Test
    public void testMakeCommentAboutWork2() throws Exception {
        manager.makeCommentAboutWork(new Cashier(0, 0, "name"));
    }

    @Test
    public void testMakeCommentAboutWork3() throws Exception {
        manager.makeCommentAboutWork(new Ticketer(0, 0d, "name"));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme