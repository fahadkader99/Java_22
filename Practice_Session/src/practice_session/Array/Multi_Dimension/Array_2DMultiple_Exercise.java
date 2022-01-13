package practice_session.Array.Multi_Dimension;

import java.util.Arrays;
import java.util.Scanner;

public class Array_2DMultiple_Exercise {
    public static void main(String[] args) {
        /**
         * 2D Array Intro & Accessing with
         * ForEach Loop
         * Matrix -1
         * Print according to Output
         * Print Jagged array value according to output
         */


    //twoDArray();
    //forEachLoop();
    //matrix1();
        printValue();
        printJagged();



    }
    static void twoDArray(){
        int a [] [] = new int[3][4];

        System.out.println("The size of array is: "+ a.length);

        for (int i = 0; i < a.length; i++){

            for (int j = 0; j < a[0].length; j++){      // using for loop to access
                System.out.print(a[i][j] + " ");
            }

        }
        System.out.println("\n");

//===========================================================================================================

        int n [][] = new int[2][3];

        n[0][0] = 10;
        n[0][1] = 20;
        n[1][0] = 30;
        n[1][1] = 40;
        n[0][2] = 500;
        n[1][2] = 600;

        System.out.println("The length of the array is: "+ n.length);
        System.out.println(n[1][1]);

        for (int i = 0; i < n.length; i++) {         // outer loop for Row
            for (int j = 0; j < n[0].length; j++) {   // inner loop for Column.
                System.out.print(n[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    static void forEachLoop(){
        int n [][] = new int[2][3];

        n[0][0] = 10;
        n[0][1] = 20;
        n[0][2] = 500;

        n[1][0] = 30;
        n[1][1] = 40;
        n[1][2] = 600;





        for (int[] x : n){
            for (int num : x){
                System.out.print(num + " ");
            }
            System.out.println("");
        }

    }

    static void matrix1(){
        Scanner input = new Scanner(System.in);

        int [][] a = new int [2] [3];
        int [][] b = new int [2] [3];
        System.out.println("Please enter elements Matrix-A [6]: ");

        for (int i = 0; i < a.length;i++){          // taking input from user for A
            for (int j = 0; j < a[0].length; j++){
                System.out.printf("A[%d][%d] = ",i,j);    // using format specifier for better visibility
                a[i][j] = input.nextInt();
            }
        }

        System.out.println("\nPlease enter elements Matrix-B [6]: ");
        for (int i =0; i < b.length; i++){              // taking input for B
            for (int j = 0; j < b[0].length; j++){
                System.out.printf("B[%d][%d] = ", i,j);
                b[i][j] = input.nextInt();
            }
        }
        System.out.println("");
        System.out.println("A = ");
        for (int i = 0 ; i < b.length; i++){        // printing Matrix B
            for (int j = 0; j < b[0].length; j++){
                System.out.print("\t "+ b[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("B = ");
        for (int i = 0; i < a.length; i++){         // for printing Matrix A
            for (int j = 0; j <a [0].length; j++){
                System.out.print("\t "+ a[i][j]);
            }
            System.out.println();
        }
        System.out.println("");

        // add A and B Matrix

        System.out.println("A + B = ");
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[0].length; j++){
                System.out.print("\t "+ (a[i][j] + b[i][j]));
            }
            System.out.println();
        }
        System.out.println(" ");

        // A * B

        System.out.println("A * B = ");
        for (int i =0; i < a.length; i++){
            for (int j = 0; j < a[0].length; j++){
                System.out.print("\t " + (a[i][j] * b[i][j]));
            }
            System.out.println();
        }
        // A / B
        System.out.println("");

        System.out.println("A / B = ");
        for (int i = 0; i < a.length; i ++){
            for (int j = 0; j < a[0].length; j++){
                System.out.print("\t " + (a[i][j] / b[i][j]));
            }
            System.out.println();
        }
        System.out.println("");
        // A - B

        System.out.println("A-B = ");
        for (int i = 0; i < a.length; i ++){
            for (int j = 0; j < a[0].length; j++){
                System.out.print("\t " + (a[i][j] - b[i][j]));
            }
            System.out.println();
        }
        System.out.println("\n");




    }
    static void printValue(){
        /**
         * Run a program to match this output       // need to  use 2D array
         * 0 1 2 3 4            // we have 4 Row and 5 column
         * 5 6 7 8 9
         * 10 11 12 13 14
         * 15 16 17 18 19
         */

        int k = 0;      // took k for counter

        int n[][] = new int[4][5];

        for (int i =0; i < n.length;i++){               // this loop is for assigning value
            for (int j = 0; j < n[0].length; j++){
                n[i][j] = k;
                k++;
            }
        }
        for (int i = 0; i < n.length; i++){
            for (int j = 0; j < n[0].length; j++){
                System.out.print(n[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("\n");

    }
    static void printJagged(){
        /** Print the following way using 2D array
         *
         * 0
         * 1 2
         * 3 4 5
         * 6 7 8 9
         *
         */

        int k = 0;  // k is used for counter
        int [][] n = new int[4][];

        n [0] = new int[1];
        n [1] = new int[2];
        n [2] = new int[3];
        n [3] = new int[4];

        for (int i = 0; i < n.length; i++){
            for (int j = 0; j < i+1; j++){
                n[i][j] = k;
                k++;
            }
        }

        for (int i = 0; i < n.length; i++){
            for (int j = 0; j < i+1; j++){
                System.out.print(n[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n");
    }



}
