package common_Interview_Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

        method2(str);


    }
    public static void method1(String str){
        String rev = "";

        for (int i = 0; i <str.length();i++){
            rev = str.charAt(i)+rev;
        }

        System.out.println(rev);
    }
    public static void method2(String str){

        char[]ch = str.toCharArray();
        System.out.println("Before reverse: "+Arrays.toString(ch));

        char[]ch1 = new char[str.length()];
        List<Character> list = new ArrayList<>();

        for (int i = ch.length-1;i>=0;i--){
            //System.out.print(ch[i]);
            list.add(ch[i]);
        }
        //System.out.println(Arrays.toString(ch1));
        System.out.println(list);

    }


}
