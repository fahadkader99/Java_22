package november_22;

import java.util.Scanner;

public class StringRev {
    // Reverse a String
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String a = sc.nextLine().trim();
        String b = a;
        sc.close();

        StringRev rev = new StringRev();
        rev.method1(b);
        rev.method2(b);


    }
    void method1(String str){
        String c ="";
        for (int i = str.length()-1; i>=0; i--){
            c+=str.charAt(i);
        }
        System.out.println("Rev = " + c);
    }
    void method2(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        System.out.println("Rev = " + sb.reverse());
    }
}
