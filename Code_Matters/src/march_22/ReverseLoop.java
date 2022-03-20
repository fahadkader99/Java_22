package march_22;

import java.util.Scanner;

public class ReverseLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = sc.nextInt();

        for (int i = num; i>=0;i--){
            System.out.print(i+" ");
        }
    }
}
