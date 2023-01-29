package jan_23;

import java.util.Scanner;

public class CharSequence {
    //
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String a = sc.nextLine();
        sc.close();

        for (int i = 0; i< a.length(); i++){
            if (Character.isAlphabetic(a.charAt(i))){
                System.out.print(a.charAt(i));
            }
            else {
                int b = Character.getNumericValue(a.charAt(i));
                for (int j = 1; j<b; j++){
                    System.out.print(a.charAt(i-1));
                }
            }
        }
    }
}
