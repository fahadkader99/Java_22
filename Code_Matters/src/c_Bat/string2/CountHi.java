package c_Bat.string2;

import java.util.Scanner;

public class CountHi {
    /*
    Return the number of times that the string "hi" appears anywhere in the given string.


countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A string: ");
        String str = sc.nextLine();
        int count = 0;

        for (int i = 0; i <=str.length()-1;i++){
            if (str.charAt(i)==('h')&&str.charAt(i+1)==('i')){
                count++;
            }
        }
        System.out.println(count);
    }
}
