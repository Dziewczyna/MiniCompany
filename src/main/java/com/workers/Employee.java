package com.workers;

public class Employee {
    private String name;
    private String surname;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void work()
    {
        System.out.println("Employee "+name+" "+surname+" is working");
    }
}
