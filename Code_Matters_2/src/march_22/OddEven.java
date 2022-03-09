package march_22;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num");
        int num = sc.nextInt();

        for (int i = 1; i<=num;i++ ){

            if (i % 2 ==0){
                System.out.print("\nEven: "+ i+" ");
            }
        }

        System.out.println();
        for(int i = 1; i<=num;i++){
            if (i % 2 != 0){
                System.out.print("\nODD: "+ i+" ");
            }
        }


    }
}
