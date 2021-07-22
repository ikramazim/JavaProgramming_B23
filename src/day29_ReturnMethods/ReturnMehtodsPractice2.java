package day29_ReturnMethods;

public class ReturnMehtodsPractice2 {
    public static void main(String[] args) {

    }

    public static void grade (int score){
        if (score > 100 || score <0){
            System.out.println("Invalid");
        return;
        }
    }
}
