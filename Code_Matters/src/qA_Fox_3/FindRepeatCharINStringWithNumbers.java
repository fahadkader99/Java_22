package qA_Fox_3;

import java.util.Scanner;

public class FindRepeatCharINStringWithNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();

        int count = 0;
        char[] str = s.toCharArray();

        for (int i = 0; i<str.length;i++){
            for (int j = i+1; j<str.length;j++){
                if (str[i]==str[j]){
                    count++;
                    System.out.println("Duplicate char "+ str[j]+ " times "+ count);

                }
            }
        }


    }
}
