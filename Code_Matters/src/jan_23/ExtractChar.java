package jan_23;

import java.util.Scanner;

public class ExtractChar {
    public static void main(String[] args) {

        // extract first 4 & last 4 char from a given string
        int count = 0;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a String ");
            String a = sc.nextLine().trim();

            if (a.length()>=8){
                String first4 = a.substring(0,4);
                String last4 = a.substring(a.length()-4);
                count = 0;

                System.out.println(first4);
                System.out.println(last4);
            }
            else {
                System.out.println("Length not enough...Try again");
                count = 1;
            }
        }while (count !=0);





    }
}
