package rough_and_tough;

import java.util.Scanner;

public class LargestOf3Num {
    // find the largest num in 3 number.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int large = 0;

        if (a>b && b>c ){
            large = a;
        }else if(b > a && b >c){
            large = b;
        }else large = c;

        System.out.println(large);
    }
}
