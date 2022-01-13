package interview_Java_Q;

import java.util.Scanner;

public class ReverseStringManyWays {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter string to get reverse: ");
        String str = input.nextLine();

       // method1(str);
        //method2(str);
        //method3(str);
        reverseStringWithWords(str);



    }
   static void method1(String str){     // using concatenation operator.

        String reverse = "";
        int length = str.length();

        for (int i = length-1; i>=0; i--  ){
            // charAt method starts from 0 , and last index is always length-1.
            reverse = reverse+str.charAt(i);
        }
       System.out.println("Reverse: "+ reverse);


    }
    static void method2(String str){          // using char Array.
        String reverse = "";

        char[]a = str.toCharArray();    // the string is now converted and stored in Array.
        int length = a.length;

        for (int i = length-1; i >=0; i--){
            reverse= reverse+a[i];
        }

        System.out.println("Reverse: "+ reverse);

    }
    static void method3(String str){        // using string builder

        StringBuilder sb = new StringBuilder(str);
        //sb.reverse();

        System.out.println("Revers: "+ sb.reverse());
    }

    static void reverseStringWithWords(String str){     // reverse string word by word

// https://www.youtube.com/watch?v=tNNJWsVo748

      int  i = str.length()-1;
      String ans = "";

      while (i >=0){
          while (i >=0 && str.charAt(i)==' ') i--;
          int j =i;
          if (i < 0) break;

          while (i >=0 && str.charAt(i) != ' ')i--;

          if (ans.isEmpty()){
              ans = ans.concat(str.substring(i+1, j+1));

          }else{
              ans = ans.concat(" "+ str.substring(i+1, j+1));
          }

      }

        System.out.println("Reversed word: "+ ans);

    }

}
