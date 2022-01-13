package practice_session.Basics_Code;

import java.util.Scanner;

public class Times_of_Char_appear_loops {

        /**
         *
         * write a method to :
         * find how many times the given character appears in the given string.
         */
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a sentence or word: ");
            String wordOrSentence = scan.nextLine();
            System.out.println("Enter a character to look for: ");

            char target = scan
                    .next()
                    .toLowerCase()
                    .charAt(0);

            System.out.println("The no. of times is appears: "+ findNumberOfTimes(wordOrSentence.toLowerCase(), target));

        }
        public static int findNumberOfTimes(String str, char c){
            int numberOfTimes = 0;

            for (int i = 0; i <str.length(); i ++){

                if (str.charAt(i) == c){
                    numberOfTimes++;
                }

            }

            return numberOfTimes;
        }



    }
