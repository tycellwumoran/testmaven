package com.example.wmrmaven.classtemp;

/**
 * @author wumoran
 * @version 1.0
 * @description child
 * @date 2021/12/27 9:52
 */
public class Manager extends Employee{

    private double bonus;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = salary;
    }
    @Override
    public double getSalary()
    {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double b)
    {
        bonus = b;
    }
    @Override
    public int getBuddy(){
        return 3;
    }


}