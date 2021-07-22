package day04_Varibles;

public class CarShop {
    public static void main(String[] args) {
        String brand = "Toyota",
                model = "Camry",
                color = "White";
        int Year = 2015,
                miles = 45000;

        double price = 25000;
        // 2015 Toyota Camry, White, 45000 miles, $25000

        System.out.println(Year + " " +brand + " " +model+", "+color +", "+miles + " miles, " + price+" dollars");

    }
}
