package random;

import java.util.Arrays;
import java.util.Scanner;

public class Array2DWarmUp {
    public static void main(String[] args) {


        //access2D();
        //matrix1();
       // printValue();
        jaggedArray();


    }

    static void access2D() {
        int[][] a = new int[3][4];

        System.out.println(a.length);
        System.out.println(Arrays.toString(a[0]));

        for (int i = 0; i < a.length; i++) {            // print suing for loop
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
        }

        for (int[] x : a) {                              // print using for loop
            for (int b : x) {
                System.out.print(b + " ");
            }
        }

    }

    static void matrix1() {
        // Print a matrix of 2 multidimensional array, then add, multiply, subs, div.
        Scanner scan = new Scanner(System.in);

        int[][] a = new int[2][3];
        int[][] b = new int[2][3];

        System.out.println("Enter elements for Matrix A: ");

        for (int i = 0; i < a.length; i++) {             // taking input for A
            for (int j = 0; j < a[0].length; j++) {
                System.out.printf("A[%d][%d]= ",i,j);
                a[i][j] = scan.nextInt();
            }
        }

        System.out.println("\nEnter elements for Matrix B: ");

        for (int i = 0; i < b.length; i++) {                //input for B
            for (int j = 0; j < b[0].length; j++) {
                System.out.printf("B[%d][%d]= ",i,j);
                b[i][j] = scan.nextInt();
            }
        }

        System.out.println("\nA=");
        for (int i = 0; i < a.length; i++) {             // printing A
            for (int j = 0; j < a[0].length; j++) {
                System.out.print("\t "+ a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nB=");
        for (int i = 0; i < b.length; i++) {             // printing B
            for (int j = 0; j < b[0].length; j++) {
                System.out.print("\t "+ b[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("\nA + B = ");
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[0].length; j++){
                System.out.print("\t "+ (a[i][j] + b[i][j]));
            }
            System.out.println();
        }

        System.out.println("\nA - B = ");
        for(int i = 0; i < a.length; i++){
            for (int j = 0; j < a[0].length; j++){
                System.out.print("\t "+ (a[i][j] - b[i][j]));
            }
            System.out.println();
        }

        System.out.println("\nA * B = ");
        for(int i = 0; i < a.length; i++){
            for (int j = 0; j < a[0].length; j++){
                System.out.print("\t "+ (a[i][j] * b[i][j]));
            }
            System.out.println();
        }

        System.out.println("\nA / B = ");
        for(int i = 0; i < a.length; i++){
            for (int j = 0; j < a[0].length; j++){
                System.out.print("\t "+ (a[i][j] / b[i][j]));
            }
            System.out.println();
        }

    }
    static void printValue(){
        /**
         * Run a program to match this output       // need to  use 2D array
         * 0 1 2 3 4            // we have 4 Row and 5 column
         * 5 6 7 8 9
         * 10 11 12 13 14
         * 15 16 17 18 19
         */

        int[][] a = new int[4][5];
        int counter = 0;

        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[0].length; j++){
                a[i][j] = counter;
                counter++;
            }
        }

        for (int i = 0; i < a.length; i++){
            for (int  j = 0; j < a[0].length; j++){
                System.out.print("\t "+ a[i][j]);
            }
            System.out.println();
        }


    }
    static void jaggedArray(){
        /** Print the following way using 2D array
         *
         * 0
         * 1 2
         * 3 4 5
         * 6 7 8 9
         *
         */

        int[][] a = new int[4][];

        a[0] = new int[1];
        a[1] = new int[2];
        a[2] = new int[3];
        a[3] = new int[4];

        int counter = 0;

        for (int i = 0; i < a.length; i++){
            for (int j = 0 ; j < i+1;j++){              // why i+1
                a[i][j] = counter;
                counter++;
            }
        }

        for(int i = 0; i < a.length; i++){
            for (int j = 0 ; j < i+1; j++){             // why i+1
                System.out.print("\t "+ (a[i][j]));
            }
            System.out.println();
        }

    }









}