package day07_ShotHand_Relational;

public class EligibleForLoan {
    public static void main(String[] args) {

        String name = "Randy";
        int age = 49;
        int workHistory = 7;
        int creditScore = 760;
        double income = 75000;

        boolean isEligible = age >= 18 && workHistory >= 2 && creditScore >= 700 && income >= 60000;


        System.out.println(name + " is eligible for loan: "+isEligible);


    }




    /*

     */
}
