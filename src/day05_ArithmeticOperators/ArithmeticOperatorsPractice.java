package day05_ArithmeticOperators;

public class ArithmeticOperatorsPractice {
    public static void main(String[] args) {
        System.out.println();

        int number = 15;

        boolean isEvenlydivisibleBy3 = number%3 == 0;  // ==; equal operator

        boolean isEvenlyDivisibleBy5 = number%5 == 0; // if the remainder of number/5 is zero, than it's evenly

        System.out.println(number+ " is evenly divisible by 3: "+isEvenlydivisibleBy3);
        System.out.println(number+ " is evenly divisible by 5: "+isEvenlyDivisibleBy5);



    }
}
