package com.cinema;

import jdk.nashorn.internal.runtime.arrays.IteratorAction;

import java.io.*;
import java.lang.*;
//import java.awt.*;
import java.util.*;


/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {

        StudentWorker buffeter = new Buffeter(1,137,"Bufcsi");
        StudentWorker cashier = new Cashier(1,137,"Cashcsi");
        StudentWorker ticketer = new Ticketer(1,137,"Ticketcsi");

        Leader cinemaCTO = new CinemaCTO(1,137,"Ctocska");
        Leader manager = new Manager(1,137,"Managerecske");

        Cinema cinema = new Cinema(150);

        cinema.studentWorkersArrayList.add(buffeter);
        cinema.studentWorkersArrayList.add(cashier);
        cinema.studentWorkersArrayList.add(ticketer);

        cinema.leaderArrayList.add(cinemaCTO);
        cinema.leaderArrayList.add(manager);

        cinemaCTO.makeCommentAboutWork((Buffeter) buffeter);
        cinemaCTO.makeCommentAboutWork((Cashier) cashier);

        manager.makeCommentAboutWork((Ticketer) ticketer);


        for (int i = 0; i < cinema.leaderArrayList.size(); i++) {
            System.out.println(cinema.leaderArrayList.get(i).getName());
        }
        for (int i = 0; i < cinema.studentWorkersArrayList.size(); i++) {
            System.out.println(cinema.studentWorkersArrayList.get(i).getName());
        }

        System.out.println("Buffeter salary:"+buffeter.getSalary()+"Ticketer salary"+ticketer.getSalary()+"Cashier salary"+cashier.getSalary());
        buffeter.raiseSalary( cinema, 0);
        ticketer.raiseSalary(cinema,150);
        cashier.raiseSalary(cinema,77);

        System.out.println("Buffeter salary:"+buffeter.getSalary()+"Ticketer salary"+ticketer.getSalary()+"Cashier salary"+cashier.getSalary());




    }
}
