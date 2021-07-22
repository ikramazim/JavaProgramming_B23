package day08_ifStatements;

public class GradeReport2 {
    public static void main(String[] args) {
        int score = 95;

        boolean madeA = score >= 90 && score <= 100;
        boolean madeB = !madeA && score >= 80; // did not make A and score is greater or equal to 80
        boolean madeC = !madeB && score >= 70; // did not make A & B and score is greater than 70
        boolean madeD = !madeA && !madeB && !madeC && score >= 60; // did not makwe A, B, C and score is greater than 60
        boolean madeF = !madeA && !madeB && !madeC && !madeD;

        if (madeA){
            System.out.println("excellent you mad A");
        }
        if (madeB){
            System.out.println("Good Job, You made B");
        }
        if (madeC){
            System.out.println("Good, you made C");

        }
        if (madeF){
            System.out.println("Failed");
        }
    }
}
