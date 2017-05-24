package com.cinema;
import java.lang.*;

/**
 * Created by kyrka on 2017.05.24..
 */
public abstract class StudentWorker extends Worker{


    public StudentWorker(int id, double salary, String name) {
        super(id, salary, name);

    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public abstract double raiseSalary(Cinema cinema, int itemCount);
}
