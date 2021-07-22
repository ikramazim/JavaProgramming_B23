package day04_Varibles;

public class ConcatenationPractice {
    public static void main(String[] args) {
        /*
        +:
        Addition: when we have two numbers
        10+10 =20

        Concatenation: when there is at least one string
        "10" + "10" = "1010"
        1 + "10" = "110"
        "2" + 3 + 23
         */
        String Conversion = "C#";
        String word = "Java";
        System.out.println("my favorite language is " + word + " Programing");

        int dollar = 10000;
        double lira = dollar * 8.41;
        double euro = dollar * 0.88;

        System.out.println(dollar + " us dollars equal to " + lira + " Turkish Lira");
        System.out.println(dollar + " US dollars equal to " + euro + " euro");
        System.out.println("-----------------------------------");

        int a = 100;
        int b = 200;
        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        // 10 + 20 = 30
        // 10-20 = -10
        System.out.println(a + " + " + b + " = " + addition);
        System.out.println(a + " - " + b + " = " + subtraction);

        // 100 * 200 = 20000
        System.out.println(a + " * " + b + " = " + multiplication);
        System.out.println("______________________________________");

        String name = "Ikram";
        String FavoriteMusic = "Rock Music";
        String Favoritebook = "How to win friends";
        String FavoriteSeries = "The walking dead";

        System.out.println("\tHello my name is " + name + ", My favorite Music is \"" + FavoriteMusic + " \", myFavorite book is" + "How to win friends");


        String today = "Monday";
        String todayClass = "Java";
        String tomorrow = "Tuesday";
        String tomorrowClass = "Selenium";

        System.out.println("Today is " + today + ", today we have " + todayClass
                + ", tomorrow is " + tomorrow + ", tomorrow class will be " + tomorrowClass+" Class " );


    }

}
