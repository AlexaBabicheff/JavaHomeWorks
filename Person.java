package com.homeworks;

public class Person {
    public String FirstName = "Vasya";
    public String LastName = "Pupkin";
    public int DateOfBirth = 1956;

    public void Age() {
        int PresentYear = 2023;
        int YearsOld = PresentYear - DateOfBirth;
        System.out.println("Age " + YearsOld);
    }
}
