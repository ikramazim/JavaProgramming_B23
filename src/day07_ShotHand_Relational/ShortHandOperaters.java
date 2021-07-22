package day07_ShotHand_Relational;

public class ShortHandOperaters {

    public static void main(String[] args) {

        String name1 = "Muhtar";
        String name2 = "Mehmet";

        String name3 = name2; // name3 = "Mehmat"

        name2 = name1; // name2 = "Muhtar"
        //name1 = name2; // nam1 = "Muhtar"
        name1 = name3; // name1 = "Mehmat"

        System.out.println("name1 = " + name1);
        System.out.println("name2 = " + name2);

        System.out.println("--------------------------------");

        int a = 200;
        System.out.println("a = " + a);
        int b = a;
        a = 100 + 300;
        System.out.println("a = " + a);

        System.out.println("----------------------------------------");




    }
}
