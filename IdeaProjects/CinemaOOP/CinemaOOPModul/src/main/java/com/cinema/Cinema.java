package com.cinema;

import java.io.*;
import java.lang.*;
//import java.awt.*;
import java.util.*;
/**
 * Created by kyrka on 2017.05.24..
 */
public class Cinema {

    int itemCount;
    ArrayList<StudentWorker> studentWorkersArrayList;
    ArrayList<Leader> leaderArrayList;


    public Cinema(int itemCount) {
        this.itemCount = itemCount;
        ArrayList<StudentWorker> studentWorkersArrayList = new ArrayList<StudentWorker>();
        ArrayList<Leader> leaderArrayList = new ArrayList<Leader>();
        this.studentWorkersArrayList = studentWorkersArrayList;
        this.leaderArrayList = leaderArrayList;

    }

    public int itemCountAdder(int itemNumber) {
        for (int i = 0; i < itemNumber; i++) {
            this.itemCount++;

        }
        return itemCount;
    }



}
