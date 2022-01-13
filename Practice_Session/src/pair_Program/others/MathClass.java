package pair_Program.others;

import java.util.Scanner;

public class MathClass {

    public static void main(String[] args) {

//        int a = 10;
//        int b = a+(--a);
//        System.out.println(Math.abs(b));

        /**
         * take input from the user of a name
         * if the length is even then print 2 middle
         * if the length is odd then print 1 middle.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name to find the middle: ");
        String name = input.nextLine();


        int length = name.length();
        char c;
        String str = "";
        if (length % 2 != 0){
          c = name.charAt(length/2);
          str = name.valueOf(c);

        }else {
            str = name.substring(length/2 -1, length/2+1);
        }
        System.out.println("Middle = "+ str );





    }
}
