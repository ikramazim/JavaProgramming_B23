package day08_ifStatements;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "James";
        int age = 15;

        String citizen = "USA";

        boolean eligibleToVote = age >= 21 && citizen == "USA";

        if(eligibleToVote){
            System.out.println(name+ "is not elibile to vote");

        }

        if (!eligibleToVote){
            System.out.println(name+ " is not eligible to vote");
        }

    }
}
