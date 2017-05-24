package com.cinema;
import java.lang.*;
import java.util.*;
/**
 * Created by kyrka on 2017.05.24..
 */
public class Cashier extends StudentWorker{

    private final static double SALARY_RAISE_PERCENT = 1.05;
    private final static int PRODUCT_COUNT = 50;

    public Cashier(int id, int salary, String name) {
        super(id, salary, name);
    }

    public double raiseSalary(Cinema cinema,int itemCount) {
        for (int i = 0; i < cinema.itemCountAdder(itemCount); i+=PRODUCT_COUNT) {
            double newSalary = salary * SALARY_RAISE_PERCENT;
            this.salary = newSalary;
        }
        return this.salary;
    }

    public static double getSalaryRaisePercent() {
        return SALARY_RAISE_PERCENT;
    }
}
