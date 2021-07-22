package day13_Scanner;
import java.util.Scanner;// only imports scanner class from "java.util" package
import java.util.*;  // imports everything from "java.util" package
public class CentsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter cents");
        int cents = scan.nextInt(); //225 === 2.25
        int dollars = cents/100; //2
        int remainder = cents % 100; //25

        if (cents>=0) { // if the input is valid

            if (remainder == 0) {
                System.out.println(cents + " cents equal to " + dollars + " dollars and " + remainder + " cents");
            } else {
                System.out.println(cents + " is equal to " + dollars + " dollars and " + remainder + "cents");
            }
        }else{ // if the input is not valid
            System.err.println("invalid amount");
        }
    }
    /*
    package name: day13_Scanner

warmup tasks:
	1. Write a program that can convert cents to dollars, if there is any remainder include them in the result as cents
			Ex:
				Enter cents
				225

				output:
				225 cents equal to: 2 dollars and 25 cents

				Enter cents
				300 cents equal to: 3 dolloars
     */
}
