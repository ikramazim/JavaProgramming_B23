package day12_Scanner;
import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int addition = num1 + num2;
        int subtraction = num1 -num2;
        int multiplication = num1 * num2;
        int Division = num1/num2;

        System.out.println("addition = " + addition);

    }
}

