package chirag_YT;

import java.util.Scanner;

public class FindMax {
    // find Max and Min from 4 num:

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter 4 Numbers: ");
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int n3 = s.nextInt();
        int n4 = s.nextInt();

        System.out.println("Max: ");
        if (n1 > n2 && n1 > n3 && n1 > n4 ){
            System.out.println( n1);
        }else if (n2 > n1 && n2 > n3 && n2 > n4){
            System.out.println(n2);
        }else if (n3 > n1 && n3 > n2&& n3 > n4){
            System.out.println(n4);
        }else System.out.println(n4);


        System.out.println("Min: ");
        if (n1 < n2 && n1 < n3 && n1 < n4 ){
            System.out.println( n1);
        }else if (n2 < n1 && n2 < n3 && n2 < n4){
            System.out.println(n2);
        }else if (n3 < n1 && n3 < n2&& n3 < n4){
            System.out.println(n4);
        }else System.out.println(n4);


    }
}
