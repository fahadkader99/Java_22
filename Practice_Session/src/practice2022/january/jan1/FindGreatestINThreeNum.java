package practice2022.january.jan1;

import java.util.Scanner;

public class FindGreatestINThreeNum {
    public static void main(String[] args) {
        // find max num in 3 numbers

        int count = 1;

        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("\nEnter 3 numbers: ");
                int n1 = input.nextInt();
                int n2 = input.nextInt();
                int n3 = input.nextInt();

                System.out.println("1. Find Max ");
                System.out.println("2. Find Min ");
                int choice = input.nextInt();

                if (choice==1){
                    if (n1 > n2 && n1 > n3){
                        System.out.println("Max "+ n1);
                    }else if (n2 > n1 && n2 > n3){
                        System.out.println("Max "+ n2);
                    } else System.out.println("Max "+ n3);
                    count = 2;
                }
                if (choice == 2){
                    if (n1 < n2 && n1 < n3){
                        System.out.println("Min "+ n1);
                    }else if(n2 < n1 && n2 < n3){
                        System.out.println("Min "+ n2);
                    }else System.out.println("Min "+ n3);
                    count = 2;
                }

            }catch (Exception e){
                System.out.println("Try Again.....! ");
            }
        }while (count ==1);



    }
}
