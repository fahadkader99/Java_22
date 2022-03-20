package march_22;

import java.util.Scanner;

public class PrintFollowing
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = sc.nextInt();

        int j = 10;
        for (int i = 1 ; i<=num;i++){
            System.out.print(i+" " );
            System.out.print(j+" ");
            j--;
        }


    }
}
