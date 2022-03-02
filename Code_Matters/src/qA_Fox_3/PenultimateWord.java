package qA_Fox_3;

import java.util.Scanner;

public class PenultimateWord {
    // program to find penultimate word of a sentence
    // it is the word before the last word, or we can say the second last word is penultimate
     // name is fahad - is

    public static void main(String[] args) {

        int count  = 1;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a sentence: ");
                String str = sc.nextLine();


                String[] words = str.split(" ");     // 1st split into multiple words

                if (words.length> 1){       // 2nd check if the length is greater than 1 then the second last word is the one
                    System.out.println("The penultimate word is: "+ words[words.length-2]);
                    count=2;
                }else {
                    System.out.println("No Penultimate found...!");
                    count = 1;
                }

            }catch (Exception e){
                e.printStackTrace();
            }
        }while (count==1);



    }
}
