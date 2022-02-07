package qA_Fox;

import java.util.Scanner;

public class StringDuplicate {
    // takes a string and print the duplicate character along with the number of times;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Enter no. of times: ");
        int times = sc.nextInt();


    }
    public static void str1(String str, int times){
        String r = "";
        for (int i = 0; i<times;i++){
            r = str+r;
        }
        System.out.println(r);
    }

}
