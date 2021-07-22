package day19_Loops;

import java.util.Scanner;

public class PalindromeInterviewQuestion {
    public static void main(String[] args) {

        String word = new Scanner(System.in).next();

        String reverseWord = "";

        for (int i = word.length()-1; i >= 0 ; i --){
            reverseWord += word.charAt(i);
        }

        boolean isPalindrom = word.equalsIgnoreCase(reverseWord);

        System.out.println("isPalindrom = " + isPalindrom);



    }
}
