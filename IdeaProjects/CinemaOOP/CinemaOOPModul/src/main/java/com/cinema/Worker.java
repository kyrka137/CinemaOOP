package com.cinema;
import java.lang.*;

/**
 * Created by kyrka on 2017.05.24..
 */
public abstract class Worker {

    private  int id;
    double salary;
    private  String name;

    public Worker(int id, double salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }
}
