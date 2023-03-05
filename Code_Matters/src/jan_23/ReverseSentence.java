package jan_23;

import java.util.Scanner;

public class ReverseSentence {
    // reverse a given sentence;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Line: ");
        String a = sc.nextLine().trim().toLowerCase();
        sc.close();

        String [] str = a.split("\\s+");
        String reverse = "";

        for(int i = str.length-1; i>=0;  i--){
            reverse+= str[i]+" ";
        }
        System.out.println(reverse);

    }
}
