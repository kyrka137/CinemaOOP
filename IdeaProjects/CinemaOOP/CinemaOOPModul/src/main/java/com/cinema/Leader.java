package com.cinema;
import java.lang.*;
import java.util.*;
/**
 * Created by kyrka on 2017.05.24..
 */
public abstract class Leader extends Worker{


    public Leader(int id, int salary, String name) {
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

    abstract void makeCommentAboutWork(Buffeter buffeter);
    abstract void makeCommentAboutWork(Cashier cashier);
    abstract void makeCommentAboutWork(Ticketer ticketer);

}
