package day20_loops;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int result = 0;

        for (int i = 0; i == 0; ) {
            System.out.println("Enter a Number");
            int n = scan.nextInt();

            if (n <0){
                break;
            }
            result += n;

        }

        System.out.println("result = " + result);




    }
}
