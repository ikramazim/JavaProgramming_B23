package Basic;
import sun.security.x509.InvalidityDateExtension;

import java.util.*;


public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String sentence = "Cat Dog";

                int numberOfCats = 0;   // "Cat"
                int numberOfDogs = 0; //"Dog"

                for(int i = 0; i <= sentence.length()-3; i++){
                    String each =    sentence.substring(i, i+3);
                    if(each.equals("Cat")){
                        numberOfCats++;
                    }

                    if(each.equals("Dog")){
                        numberOfDogs++;
                    }

                }


                // System.out.println (numberOfCats);
                //System.out.println(numberOfDogs);

                boolean equal =  numberOfCats == numberOfDogs;

                System.out.println(equal);


            }
        }