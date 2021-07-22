package day03_Varibles;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class SalaryCalculator {

    public static void main(String[] args) {

        int hourlyRate = 60;
        int weeklyRate = 50;

        int numberOfWeekInAYear = 48;

        int salary = hourlyRate * weeklyRate * numberOfWeekInAYear;

        System.out.println(salary);

        double taxRate = 0.24;
        double totalRate = salary * taxRate;
        double salaryAfterTax = salary - totalRate;

        System.out.println(salaryAfterTax);
    }








}
