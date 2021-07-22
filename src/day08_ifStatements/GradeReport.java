package day08_ifStatements;

public class GradeReport {
    public static void main(String[] args) {

        int score = 85;

        if (score >= 90 && score <= 100){
            System.out.println("Excellent, You made an A");
        }

        if (score >= 80 && score <= 89){
            System.out.println("Great Job, You made to B");
        }
        if (score >= 70 && score <= 79){
            System.out.println("Good, you made a C");
        }
        if (score >= 60 && score <= 69){
            System.out.println("You made a D");
        }
        if (score < 60){
            System.out.println("Failed");
        }

    }
}
/*
score

grade:
A: 90 <= SCORE <=100
B: 80 <= SCORE <=89
C: 70 <= SCORE <=79
D: 60 <= SCORE <=69
F: SCORE < 60
 */