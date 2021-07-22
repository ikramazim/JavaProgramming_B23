package day30_recap;

public class LoopsRreview3 {
    public static void main(String[] args) {


        String sentence = "i love Java, Java is fun";
        String word = "Java";
        int count = 0;

        while (sentence.contains(word)) {
            sentence = sentence.replaceFirst(word, "");

            count++;
        }
        System.out.println(count);
        System.out.println(sentence);

        System.out.println("-----------------------------------------------------");


        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " ");
        }
        System.out.println();

        System.out.println("-----------------------------------------------------------");

        String str = "aabcccd";

        for (int j = 0; j <= str.length()-1; j++) {


            char ch = str.charAt(j);
            int frequency = 0;
            for (int i = 0; i<= str.length()-1; i++) {
                if (str.charAt(i) == ch) {
                    frequency++;
                }

            }
            if (frequency==1){
                System.out.println(ch);
            }
        }

    }
}