package pair_Program.Strings;

import java.util.Scanner;

public class String11 {
    //How do you convert a given String into int like the atoi()?
    // so we are converting string to integers:

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter string to get as Integer: ");
        String n = input.nextLine();

        String11 s11 = new String11();
        System.out.println("Ans: "+ s11.method1(n));

    }

    public int method1(String n){

        int i = Integer.parseInt(n);
        return i;

////        int i = Integer.valueOf(n);
////        //System.out.println("Ans: "+ i);
//        return i;

    }

}
