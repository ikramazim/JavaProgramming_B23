package day04_Varibles;

import javax.lang.model.element.NestingKind;
import java.sql.SQLOutput;

public class EmployeeInfo {

    public static void main(String[] args) {

        String firstName = "Ikram";
        String lastName = "Azim";
        String fullName = firstName + " " + lastName;
        // Ikram Azim
        // Employee' full name is: Ikram Azim
        System.out.println("Employee' full name is: "+fullName);
        String gender = "Male";
        //Ikram Azim is male
        System.out.println( fullName +" is " + gender);
        int age = 25;
        String companyName = "Microsoft";
        //fullName' job title is Jobtitle
        String jobTitle = "SDET";
        // fullName is age years old
        System.out.println(fullName + " is " +age+ " years old ");
        //fullName works at companyName
        System.out.println(fullName + " works at " + companyName);
        System.out.println(fullName + " jobTitle is " + "SDET");

        boolean isFullTime = true;
        boolean isMarried = true;
        int salary = 110000;

        System.out.println(fullName + " is full time employee: " + isFullTime);
        System.out.println(fullName + " is married: " + isMarried);
        System.out.println(fullName + " Salary is: " + salary);


    }
}
