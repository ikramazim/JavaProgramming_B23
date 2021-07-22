package day19_Loops;

public class StringReverseInterview {
    public static void main(String[] args) {
        String name = "Muhtar";
        // index       012345
        String reversename = "";

        for (int i = 5; i >= 0; i--) {
            reversename += name.charAt(i);
            System.out.println(reversename);
        }
    }
}
