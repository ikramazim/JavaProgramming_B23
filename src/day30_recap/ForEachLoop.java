package day30_recap;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] numbers = {100, 200, 300, 400, 500};

            for (int each : numbers){
                System.out.println(each);
            }


        System.out.println("--------------------------------------");
            int max = numbers[0];
            for (int number : numbers){
                /*
                if (number > max){
                    max = number;
                }

                 */

                max = Math.max(number, max);

                System.out.println("max = " + max);

                System.out.println();

            }

        }
    }

