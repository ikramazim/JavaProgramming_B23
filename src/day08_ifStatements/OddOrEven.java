package day08_ifStatements;

public class OddOrEven {
    public static void main(String[] args) {



        int number = 100;

        boolean odd = number%2 !=0;

        if (odd) { // if the number is odd number
            System.out.println(number + " is off number");
        }

        if(!odd) { // if number is not odd number
            System.out.println(number + " is even number");

        }
    }




}
