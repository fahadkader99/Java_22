package rough_and_tough_2;

import java.util.Scanner;

public class StringNumSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();


        int sum = 0;

        for (int i = 0; i <str.length();i++){
            char ch = str.charAt(i);
            if (Character.isDigit(ch)){
                int a = Integer.parseInt(String.valueOf(ch));
                sum=sum+a;
            }
        }
        System.out.println(sum);

    }
}
