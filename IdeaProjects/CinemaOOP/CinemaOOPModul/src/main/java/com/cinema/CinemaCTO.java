package com.cinema;
import java.lang.*;
import java.util.*;
/**
 * Created by kyrka on 2017.05.24..
 */
public class CinemaCTO  extends Leader {

    public CinemaCTO(int id, int salary, String name) {
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

    void makeCommentAboutWork(Buffeter buffeter) {
        System.out.println("Dolgozz gyorsabban, nem látod, hogy áll a sor?");
    }

    void makeCommentAboutWork(Cashier cashier) {
        System.out.println("Legyél kedvesebb a vendégekkel!");

    }

    void makeCommentAboutWork(Ticketer ticketer) {
        System.out.println("Ne engedd be kérlek ezt a problémás vendéget!");

    }
}
