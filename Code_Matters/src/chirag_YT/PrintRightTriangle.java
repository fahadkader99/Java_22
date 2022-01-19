package chirag_YT;

import java.util.Scanner;

public class PrintRightTriangle {
    /*
    print following pattern (here we have to manage the spaces)
        1
       22
      333
     4444
    55555

     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num: ");
        int num = sc.nextInt();

        for(int i =1; i <=num;i++){

            for (int s = 1; s<=num-i ; s++){         // this for loop is to count the spaces in the pattern
                System.out.print(" ");
            }

            for (int j = 1; j <=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }


    }
}

/*
outer loop is for the number of lines
inner loop is for the columns
 */