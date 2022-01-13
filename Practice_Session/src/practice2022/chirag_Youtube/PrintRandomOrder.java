package practice2022.chirag_Youtube;

import java.util.Scanner;

public class PrintRandomOrder {
    // print number in random order up to n number

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("ENter a No. ");
        int n = s.nextInt();
        s.close();


        int j = n;
        for (int i = 0; i <=n; i++){
            System.out.println(i);
            System.out.println(j);
            j--;
        }



    }
}
