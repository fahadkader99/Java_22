package c_Bat.string2;

import java.util.Scanner;

public class getSwandwich {
    /*A sandwich is two pieces of bread with something in between.
    Return the string that is between the first and last appearance of "bread" in the given string,
    or return the empty string "" if there are not two pieces of bread.


getSandwich("breadjambread") → "jam"
getSandwich("xxbreadjambreadyy") → "jam"
getSandwich("xxbreadyy") → ""
    * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();

        int first = -1;
        int last = -1;

        for(int i = 0; i<str.length()-5;i++){
            if (str.substring(i,i+5).equals("bread")){
                first = i;
                break;
            }
        }
        for (int i = str.length()-5; i>=0; i--){
            if (str.substring(i, i+5).equals("bread")){
                last = i;
                break;
            }
        }


        if (first != -1 && last != -1 & first != last){
            System.out.println(str.substring(first+5, last));
        }else {
            System.out.println("Null");
        }

        sc.close();
    }
}
