package day19_Loops;

import sun.text.resources.cldr.ti.FormatData_ti;

import java.util.Scanner;

public class ForLoopPractice3 {
    public static void main(String[] args) {
        for (int i = 1; i <=50 ; i++) {
            System.out.println("Push Up "+i);

        }
        for (int i = 1; i <=8 ; i++) {
            System.out.println("\t\t********");
            
        }
        System.out.println("-------------------------------");

        System.out.println(" ********");
        for (int i = 1; i <=8 ; i++) {
            System.out.println("*        *");

        }
        System.out.println(" ********");
        System.out.println("---------------------------------------------------");

        int sum = 0;
        for (int i = 1; i <= 100 ; i++) {
            sum += 1;
            System.out.println("sum = " + sum);

        }
        System.out.println("-----------------------------------------------------");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = scan.nextInt();




    }
}
/*1. Write a method which prints out the numbers from 1 to 100 butfor numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number,  for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number.

        ex:
            output:
                1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN ....



2.  print the following shape:
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *

3. print the following shape:
                        * * * * * *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        *         *
                        * * * * * *

    Hint: in the loop body , only place the statements that you need to repeat
    4. write a program that can calculate the sum of all numbers between 1 to 100

5. write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275

                input : 200
                output : 20100


 */

