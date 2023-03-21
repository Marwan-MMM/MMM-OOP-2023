package com.company;

import java.util.Date;

public class Employee extends Person{
     String office;
     float salary;
     Date dateHired;

    public Employee(String name, String office, float salary) {
        super(name);
        this.office = office;
        this.salary = salary;
        dateHired = new Date();
    }
    public Employee(String name) {
        super(name);

    }

    @Override
    public String toString() {
        return office + salary  + dateHired;
    }
}
