package day07_ShotHand_Relational;

public class FreeShipping {

    public static void main(String[] args) {
        double price = 15; // > 25
        boolean isPrimeMember = true;

        boolean isEligibleForFreeShipping = price >= 25 || isPrimeMember == true;
        //                                  15>=25      ||          true == true
        //                                     false    ||       true
        //                                          true


        System.out.println("is Eligible For Free Shipping = " + isEligibleForFreeShipping);

    }
}
