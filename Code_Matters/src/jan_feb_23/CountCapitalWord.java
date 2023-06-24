package jan_feb_23;

import java.util.Scanner;

public class CountCapitalWord {
    public static void main(String[] args) {
        // count the number of capital words
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String a = sc.nextLine().trim();
        sc.close();

        int count = 0;
        for (int i = 0; i<a.length(); i++){
            if(a.charAt(i) >= 'A' && a.charAt(i) <='Z'){
                count++;
            }
        }
        System.out.println("Total capital word: " + count);

    }
}
