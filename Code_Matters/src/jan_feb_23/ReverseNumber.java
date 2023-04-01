package jan_feb_23;

import java.util.Scanner;

public class ReverseNumber {
    // reverse a number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num: ");
        int a = sc.nextInt();
        sc.close();

        one(a);
        two(a);
        three(a);

    }
    static void one(int a){
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        System.out.println("Reversed Num: " + sb.reverse());
    }
    static void two(int a){

        int rev = 0;

        while (a > 0){
            int rem = a % 10;
            rev = (rev * 10) + rem;
            a = a/ 10;
        }
        System.out.println("Reversed Num: " + rev);
    }
    static void three(int a){
        String b = String.valueOf(a);
        String c = "";

        for (int i = b.length()-1; i >=0;  i--){
            c+=b.charAt(i);
        }
        System.out.println("Reversed Num: " + c);
    }
}
