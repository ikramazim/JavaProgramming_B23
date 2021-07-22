package day05_ArithmeticOperators;

public class OddOrEven {
    public static void main(String[] args) {
        int number = 200;

        boolean isEven = number%2 ==0;  // if the remainder of number /2is equal to zero, than number is even number.
        boolean isOdd = number%2 > 0; // if the remainder of number /2is equal to zero, than number is Odd number.

        System.out.println(number +" is an even number: " + isEven);
        System.out.println(number +" is an odd number: " + isOdd);


    }
}
