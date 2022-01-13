package practice2022.january.jan1;

import java.util.Scanner;

public class OddOrEven {
    // ask user odd or even?

    public static void main(String[] args) {
        int count = 1;

        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("\nEnter a num for N: ");
                int n = input.nextInt();
                System.out.println("1. to find odd.");
                System.out.println("2. to find even.");
                int ch = input.nextInt();

                if (ch==1){
                    for (int i = 0; i <=n; i++){
                        if (i % 2 ==0){
                            System.out.println(i);
                            count = 2;
                        }
                    }
                }
                if (ch==2){
                    for(int i = 0; i <= n; i++){
                        if (i %2 !=0){
                            System.out.println(i);
                            count = 2;
                        }
                    }
                }
            }catch (Exception e){
                System.out.println("Exception Detected. Try again....!");
            }
        }while (count==1);

    }
}
