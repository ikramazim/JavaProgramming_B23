package day23_Arrays;

public class FrequencyOfEachCharacters {
    public static void main(String[] args) {
        String str = "aabccc";

        String removeDup = ""; //abc

        for (int i = 0; i <= str.length()-1 ; i++) {
            char ch = str.charAt(i);

            if ( removeDup.contains( ""+ch)){
                continue;

            }
            removeDup += ch;
        }
        System.out.println(removeDup);

    }




    String result = ""; // a2b1c3
    // a b c
    // 2 1 3
}
