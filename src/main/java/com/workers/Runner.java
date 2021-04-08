package com.workers;

public class Runner {
    public static void main(String[] args){
        Employee employee1 = new Employee("Jan","Kowalski");
        employee1.work();

        Manager manager1 = new Manager("Janusz","Nowak");
        manager1.work();
        manager1.workAsManager();

        Director director1 = new Director("Grażyna","Zaradna");
        director1.work();
        director1.workAsManager();
        director1.workAsDirector();
    }

}
