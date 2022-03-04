package c_Bat.string2;

import java.util.Scanner;

public class getSwandwich2 {
    /*A sandwich is two pieces of bread with something in between.
    Return the string that is between the first and last appearance of "bread" in the given string,
    or return the empty string "" if there are not two pieces of bread.


getSandwich("breadjambread") → "jam"
getSandwich("xxbreadjambreadyy") → "jam"
getSandwich("xxbreadyy") → ""*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();

        //System.out.println(middle(str));                  // both works
        System.out.println(middle2(str));
    }
    public static String middle(String str){

        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");
        if (first==last){
            return "";
        }
        return str.substring(first+5,last);

    }
    public static String middle2(String str){
        if (str.length()>10){
            return str.substring(str.indexOf("bread")+5,str.lastIndexOf("bread"));
        }
        return "";
    }
}
