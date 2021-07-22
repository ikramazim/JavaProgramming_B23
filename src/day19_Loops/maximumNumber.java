package day19_Loops;

import java.util.Scanner;

public class maximumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = -2147483648; // whatever user enter it will be larger than -2147483648

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            int n = scan.nextInt();

            if (n > max){ // if the user enters number is greater than the max value
                max =n; // then use entered number will be assigned to max variable
            }
            System.out.println("max = " + max);
            scan.close();
        }
    }
}
/*
7. ask use to enter a number for 5 times, then return the maximum number
 */