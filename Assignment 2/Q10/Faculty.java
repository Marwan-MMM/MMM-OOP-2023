package com.company;

public class Faculty extends Employee{
    String officeHours;
    String rank;

    public Faculty(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
