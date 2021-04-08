package com.workers;

public class Manager extends EmployeeDecorator {
    private String name;
    private String surname;

    public Manager(String name, String surname) {
        super(name, surname);
        this.name = name;
        this.surname = surname;
    }

    @Override
    public void work() {
        super.work();
        System.out.println("Manager "+name+" "+surname+" is working as employee\n");
    }

    @Override
    public void workAsManager() {
        super.workAsManager();
        System.out.println("Manager "+name+" "+surname+" is working as manager\n");
    }
}
