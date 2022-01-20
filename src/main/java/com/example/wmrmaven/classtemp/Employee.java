package com.example.wmrmaven.classtemp;

import java.time.LocalDate;

/**
 * @author wumoran
 * @version 1.0
 * @description Employee类
 * @date 2021/12/27 9:52
 */
public class Employee {

    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day)
    {
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public LocalDate getHireDay()
    {
        return hireDay;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public int  getBuddy(){
        System.out.println("12121");
        return 3;
    }
}