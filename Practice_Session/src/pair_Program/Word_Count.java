package pair_Program;

import java.util.Scanner;

public class Word_Count {
    /*
    Write a Java method to count all words in a string. Go to the editor
    Test Data:
    Input the string: The quick brown fox jumps over the lazy dog.
    Expected Output:
    Number of words in the string: 9
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence to find out no. of words: ");
        String word = input.nextLine();

        System.out.println("No of word: "+ findWord(word));


    }
    public static int findWord(String word){
          int count = 0;

          if (!(" ".equals(word.substring(0,1))) || !(" ".equals(word.substring(word.length()-1)))){
              for (int i =0; i < word.length();i++){
                  if (word.charAt(i)== ' '){
                      count++;
                  }
              }
              count = count+1;
          }
          return count;

    }
}
