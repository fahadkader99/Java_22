package practice2022.january.jan1;

import java.util.Scanner;

public class SumOfOddOrEven {
    public static void main(String[] args) {
        int count = 1;
        int sum = 0;

        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("\nEnter a Num for N: ");
                int n = input.nextInt();
                System.out.println("1. for sum off odd. ");
                System.out.println("2. for sum of even");
                int ch = input.nextInt();

                if (ch==1){
                    for(int i = 0; i < n; i++){
                        if (i % 2 !=0){
                            sum += i;
                           count=2;
                        }
                    }
                    System.out.println("Sum of odd: "+ sum);
                }

                if (ch==2){
                    for (int i = 0; i < n; i++){
                        if (i % 2 ==0){
                            sum += i;
                            count=2;
                        }
                    }
                    System.out.println("Sum of even: "+ sum);
                }


            }catch (Exception e){
                System.out.println("Exception found. Try Again....!");
            }
        }while (count==1);




    }
}
