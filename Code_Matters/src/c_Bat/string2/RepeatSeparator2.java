package c_Bat.string2;

import java.util.Scanner;

public class RepeatSeparator2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        System.out.println("Enter a separator");
        String sep = sc.nextLine();
        System.out.println("Enter the count");
        int count = sc.nextInt();


        newStr(str,sep,count);


    }
    public static void newStr(String str, String sep, int count){
        StringBuilder sb = new StringBuilder();

        if (count==0){
            System.out.println("");
        }
        for (int i = 0; i<count-1;i++){
            sb.append(str);
            sb.append(sep);
        }

        System.out.println(sb.append(str));
    }
}
