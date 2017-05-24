package com.cinema;
import java.lang.*;

/**
 * Created by kyrka on 2017.05.24..
 */
public class Ticketer extends StudentWorker {

    private final static double SALARY_RAISE_PERCENT = 1.01;
    private final static int PRODUCT_COUNT = 50;

    public Ticketer(int id, double salary, String name) {
        super(id, salary, name);
    }

    public static double getSalaryRaisePercent() {
        return SALARY_RAISE_PERCENT;
    }

    public double raiseSalary(Cinema cinema,int itemCount) {
        for (int i = 0; i < cinema.itemCountAdder(itemCount); i+=PRODUCT_COUNT) {
            double newSalary = salary * SALARY_RAISE_PERCENT;
            this.salary = newSalary;
        }
        return this.salary;
    }
}
