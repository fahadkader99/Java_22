package practice_session.Array.Single_Dimension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayExercises {
    public static void main(String[] args) {

       int a[] = {10,20,30,40,50};      // this is dynamic array

        System.out.println(a[2]);
        System.out.println(Arrays.toString(a));
       for (int x : a){
           System.out.print(x+ " ");
       }

        System.out.println(" ");

        int b[] = new int[5];   // static array
         b[0] = 1;
         b[1] = 2;
         b[2] = 3;
         b[3] = 4;
         b[4] = 5;

         for (int i = 0; i < b.length; i++){
             System.out.print(b[i]+ " ");
         }

        System.out.println(" \n");
         //userInput();
         //toStringMethod();
        // asListMethod();
        // deepToStringMethod();
        //reversePrintFromUser();
        //userInput2();
//       copyElementFromUser();
//        ascendingOrder();
//        descendingOrder();
//        equalsMethod();
        copyOfMethod();

    }
    static void userInput(){

        int size, i;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of Array: ");
        size = input.nextInt();

        int a[] = new int[size];    // size is passing inside the parameter and user will decide the size of array

        for (i = 0; i < size; i++){     //here size is unknown, user defined.
            a[i] = input.nextInt();     // this loop is for taking user input
        }

        System.out.println("Printed elements are: ");
        for (i = 0; i < size; i++){
            System.out.println(a[i] + " ");
        }


    }
    static void toStringMethod(){      // it is a static method and no object needs to be created.

        String a [] = {"Learn", "Coding", "keypoints", "Education"};

        System.out.println("toString method: "+Arrays.toString(a));     // to String method

        System.out.println("asList method: "+ Arrays.toString(a));     // asList method



        System.out.println(" \n");

    }
    static void asListMethod(){

        int []a = {1,2,3,4,5,6,7,8,9};

        System.out.println("asList method: " + Arrays.asList(a));   // asList works well with string but not with int value, with int it gives reference value not elements
        System.out.println("toString Method: " + Arrays.toString(a));
    }

    static void deepToStringMethod(){

        int [][] a = {{1,2,3,4,5,6,7,8,9}, {9,8,7,6,5,4,3,2,1}};

        System.out.println("Deep to String method: "+Arrays.deepToString(a)); // deepToString() accepts 2D arrays as a parameter.

        System.out.println(" \n");
    }

    public static void reversePrintFromUser(){

        int a[] = new int[4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the elements in Array [4] : ");

        for (int i = 0; i < a.length; i++){     // this loop is only for taking user input
            a[i] = input.nextInt();
        }
        System.out.println("\nRegular order of Array: ");
        for (int i = 0; i < a.length; i++){        // this loop is for printing the elements
            System.out.print( a[i]+ " ");
        }

        System.out.println("\nReverse order of Array: ");
        for (int i = a.length-1; i >= 0; i--){
            System.out.print(a[i]+ " ");
        }



    }
    public static void userInput2(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int scan = input.nextInt();

        int [] a = new int[scan];

        for (int i = 0; i < a.length; i++){     // this loop is only for taking user input
            a[i] = input.nextInt();
        }

        System.out.println("\nThe elements are: ");
        for (int i = 0; i < a.length; i ++){    // this loop is for printing result
            System.out.print(a[i] + ",");
        }

        System.out.println("\n");
        System.out.println("The size of given array is " + a.length);
        System.out.println("\n");
    }
    public static void copyElementFromUser(){

        int a[] = new int[4];
        int b[] = new int[5];

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Elements [4] : ");

        for (int i = 0; i < a.length; i++){     //this loop is fo taking user input
            a[i] = input.nextInt();
        }

        System.out.println("\nThe original elements: ");
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("\n");
        for(int i = 0; i < a.length; i++){
            b[i] = a[i];

        }

       System.out.print("The copied elements on b are: " + Arrays.toString(b));
        System.out.println("\nThe length of array a is: "+ a.length);
        System.out.println("The length of array b is: " + b.length);
        System.out.println("\n Array a: " + Arrays.toString(a));
        System.out.println("\n Array b: " + Arrays.toString(b));

        System.out.println("\n");
    }

    static void ascendingOrder(){

        int a[] = new int[4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter elements [4]:");

        for (int i = 0; i < a.length; i++){         // for taking input
            a[i] = input.nextInt();
        }

        Arrays.sort(a);
        System.out.println("After sorting to ascending order: "+ Arrays.toString(a));


    }
    static void descendingOrder(){
        int a[] = new int[4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter elements [4]: ");     // whenever taking multiple elements then we use loop.

        int temp = 0;
        for (int i = 0; i < a.length; i++){     // for taking input
            a[i]= input.nextInt();
        }
        for (int i = 0; i < a.length; i++){
            for (int j = i+1; j < a.length; j++){
                if (a[i] < a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("\nAfter Descending: ");
        for (int i = 0; i < a.length ; i++){
            System.out.print(a[i]+ " ");
        }

        System.out.println("\n");
    }

    static void equalsMethod(){
        int a[] = new int[3];
        int b[] = new int[3];

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter elements for Array1 [3]: ");

        for (int i = 0; i < a.length; i ++){
            a[i] = scan.nextInt();
        }

        System.out.println("Enter elements for Array 2 [3]:");

        for (int i = 0; i <b.length; i++){
            b[i] = scan.nextInt();
        }

        boolean c = Arrays.equals(a,b);     // .equals can be used for the size of 2 array size or by elements!
        System.out.println("Is both of the Arrays equals ? :" + c);

        System.out.println("\n");

    }

    static void copyOfMethod(){
        int a[] = new int[3];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter elements for Array [3]: ");

        for (int i = 0; i < a.length; i ++){
            a[i] = scan.nextInt();
        }

        int b[] = Arrays.copyOf(a,7);
        System.out.println("Copy of Array b is: ");
        for (int i = 0; i < b.length; i++){
            System.out.print(b[i]+ " ");
        }

        System.out.println("\n");
    }

}
