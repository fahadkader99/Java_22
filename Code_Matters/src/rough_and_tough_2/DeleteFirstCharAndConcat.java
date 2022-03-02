package rough_and_tough_2;

import java.util.Scanner;

public class DeleteFirstCharAndConcat {

    /*
    Given 2 strings, return their concatenation, except omit the first char of each.
    The strings will be at least length 1. nonStart("java", "code") → "avaode" nonStart("shotl", "java") → "hotlava"
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENter str1");
        String a = sc.nextLine();
        System.out.println("Enter str2");
        String b = sc.nextLine();


        if (a.length()<=1 && b.length()<=1){
            System.out.println(a+b);
        }

        else if((a.length()>=2)&&(b.length()>=2)){
            a = a.substring(1);
            b= b.substring(1);
            System.out.println(a+b);
        }
        else if ((b.length()>=2)&&(a.length()<=1)){
            b= b.substring(1);
            a = a;
            System.out.println(a+b);
        }
        else if((b.length()<=1)&&(a.length()>=2)){
            a =a.substring(1);
            b=b;
            System.out.println(a+b);
        }





    }
}
