package day08_ifStatements;

public class SingleIfStatementIntro {

    public static void main(String[] args) {
        String name = "Muhtar";

        int score = 90;
        boolean passed = score >= 60;


        if(passed){ //if student passed the exam
            System.out.println("Congrats " +name+ " passed the exam");

        }

        if(!passed){ //if student failed the exam
            System.out.println(name+ " You failed the exam");

        }




    }
}
