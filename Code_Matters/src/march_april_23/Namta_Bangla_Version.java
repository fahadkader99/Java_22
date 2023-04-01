package march_april_23;

import java.util.Scanner;

public class Namta_Bangla_Version {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num for the Namta to Displaye :: ");
        int num = sc.nextInt();
        sc.close();
        System.out.println();

        for (int i = 1; i<= 10; i++){
            System.out.println(num +" * "+ i +" = " + (num*i));
        }


    }
}
