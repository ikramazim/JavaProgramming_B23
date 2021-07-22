package day04_Varibles;

public class TaxCalculation {
    public static void main(String[] args) {

        int salary = 120000;
        double stateTax = 0;
        double federalTax = 0.021;

        double totalStateTax = salary * stateTax;
        double totalFederalTax = salary * federalTax;
        double salaryAfterTax = salary - totalStateTax - totalFederalTax;

        System.out.println("Your salary is $" + salary);
        // You need to pay totalStateTax of state tax
        System.out.println("you need to pay $" + totalStateTax + " of state tax ");
        System.out.println("you need to pay $"+ totalFederalTax + " of federal tax");
        System.out.println("your take home salary is " +salaryAfterTax);
    }
}
