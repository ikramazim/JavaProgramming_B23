package day07_ShotHand_Relational;

public class PosNegZero {

    public static void main(String[] args) {
        int  number = -100;

        boolean isPositive = number > 0;
        boolean isNegative = number <0;
        boolean isZero = number == 0;
        //boolean isZero = isNegative == false && isPositive == false;
       //boolean isPositive = isNegative == false && isZero == false;


        System.out.println(number+ " is a positive number: "+ isPositive);
        System.out.println(number+ " is a negative Number: "+ isNegative);
        System.out.println(number+ " is zero: "+isZero);
    }
}
