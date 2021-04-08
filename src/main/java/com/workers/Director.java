package com.workers;

public class Director extends EmployeeDecorator{
    private String name;
    private String surname;

    public Director(String name, String surname) {
        super(name, surname);
        this.name = name;
        this.surname = surname;
    }

    @Override
    public void work() {
        super.work();
        System.out.println("Director "+name+" "+surname+" is working as employee\n");
    }

    @Override
    public void workAsManager() {
        super.workAsManager();
        System.out.println("Director "+name+" "+surname+" is working as manager\n");
    }

    @Override
    public void workAsDirector() {
        super.workAsManager();
        System.out.println("Director "+name+" "+surname+" is working as director\n");
    }
}
