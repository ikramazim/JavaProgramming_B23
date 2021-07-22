package day12_Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Whats your hourly rate?");
        double hourlyRate = scan.nextDouble();

        System.out.println("how many hour do you work in a week");
        int weeklyHour = scan.nextInt();

        System.out.println(" how many week do you work in a year");
        int weeks = scan.nextInt();

        double salary = hourlyRate * weeklyHour * weeks;

        System.out.println("you are making $" + hourlyRate+" per hour");
        System.out.println("you are Working " +weeklyHour+ " per week");
        System.out.println("you are making " + weeks+ " per year");
        System.out.println();





}
    /*
    ask the use to enter:
        1. hourlyRate
        2. how many hours do you work in week
        3. how many weeks do you in a year
     */





}
