package com.company;

public class Student extends Person{

    protected final String[] status = {"Senior"+"Junior"+"Cadet"};

    public Student(String name)
    {
        super(name);
    }

    @Override
    public String toString()
    {
        return name;
    }
}
