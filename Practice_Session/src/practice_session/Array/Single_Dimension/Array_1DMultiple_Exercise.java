package practice_session.Array.Single_Dimension;
//import sun.security.util.ArrayUtil;

import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

public class Array_1DMultiple_Exercise {
    public static void main(String[] args) {
        /**
         * what is array/ different types of array
         * user defined size of array
         * toString & asList method Demo    (both works well in 1D array, however toString works in everywhere)
         * deepToString method (for 2D as parameter)
         * Print array in reverse order by taking input
         * Again user Input 2
         * Copy array elements
         * sum of elements
         * sum of elements from user input
         *
         * <<<<<<< >>>>>>>>>>
         *  Rotating elements from left to right
         *  sort & binary search method
         * inserting an element (note: to insert element from the left, element have to move towards right, so elements have to have enough size)
         * find a common element between two array, return true or false.
         *  printing array in Ascending order
         *  Printing array in Descending order
         *  Equals() Method
         *  CopyOf() Method
         *  FindMax
         *  FindMin
         *  Find Second Max
         *  Search element at the index (also I can use: BinarySearch method)
         *  search after sorting
         */

//        whatIsArray();
//        firstUserInput();
//        toStringMethod();
//        asListMethod();
//        deepToStringMethod();
//        reversePrintFromUser();
//        userInput2();
//        copyElementsFromUser();
//        sumOfElements();
//        sumOfUserInput();
//        leftRotationOfElement();
//        sortAndBinarySearch();
//        insertElement();
        compareArray();
//        ascendingOrder();
//        descendingOrder();
//        equalsMethod();
//        copyOfMethod();
//        findMax();
//        findMin();
//        searchIndex();
//        equalArray();
//        searchEasy();





    }
    public static void whatIsArray(){

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
        System.out.println("\n ");
    }
    public static void firstUserInput(){

        int size, i;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of Array: ");
        size = input.nextInt();

        int a[] = new int[size];    // size is passing inside the parameter and user will decide the size of array

        for (i = 0; i < a.length; i++){     //here size is unknown, user defined.
            a[i] = input.nextInt();     // this loop is for taking user input
        }

        System.out.println("Printed elements are: ");
        for (i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("\n ");
    }

    static void toStringMethod(){      // it is a static method and no object needs to be created.

        String a [] = {"Learn", "Coding", "Good", "For", "Education"};

        System.out.println("toString method: "+Arrays.toString(a));     // to String method

        System.out.println("asList method with Str: "+ Arrays.toString(a));     // asList method



        System.out.println(" \n");

    }

    static void asListMethod(){

        int []a = {1,2,3,4,5,6,7,8,9};

        System.out.println("asList method: " + Arrays.asList(a));   // asList works well with string but not with int value, with int it gives reference value not elements
        System.out.println("toString Method with Int: " + Arrays.toString(a));
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
        for (int i = a.length-1; i >= 0; i--){              // this loop is for reversing the elements
            System.out.print(a[i]+ " ");
        }

        System.out.println("\n");

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
        System.out.println("The size of given array is: " + a.length);
        System.out.println("\n");
    }

    public static void copyElementsFromUser(){

        int [] a = new int[4];
        int [] b = new int [5];

        Scanner input = new Scanner(System.in);
        System.out.println("Enter elements for Array a [4]: ");

        for (int i = 0; i < a.length; i++){             // this array is for taking input from user
            a[i] = input.nextInt();
        }

        System.out.println("Element of Array a: ");     // this array is for printing array a elements
        for (int i = 0; i < a.length; i ++){
            System.out.print(a[i]+ " ");
        }

        System.out.println("\nElement of Array b: ");   // this loop is for copying
        for(int i = 0; i < a.length; i ++){
            b[i]=a[i];
        }
        System.out.print(Arrays.toString(b));

        System.out.println("\nThe size of array a: " + a.length);
        System.out.println("The size of array b: " + b.length);
        System.out.println("\n");

    }
    public static void sumOfElements(){
        int []a = {1,2,3,4,5,6,7,8,9};

        int sum=0;

        for (int x : a){
            sum = sum + x;
        }
        System.out.println("Sum of all elements area: " + sum);
        System.out.println("\n");
    }

    public static void sumOfUserInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Size & Elements for the array (Your Choice) :");
        int scan = input.nextInt();
        int sum = 0;

        int a[] = new int[scan];

        for (int i = 0; i < a.length; i++){     // this loop for taking input
            a[i] = input.nextInt();
        }

        System.out.println("The given elements are: ");
        for (int i = 0; i < a.length; i ++){
            System.out.print(a[i]+ " ");
        }

        for (int x : a){
            sum = sum + x;
        }
        System.out.println("\nThe sum of all elements are: " + sum);
        System.out.println("\n");

    }

    public static void leftRotationOfElement(){
        int a[] = {1,2,3,4,5,6,7,8,9};

        int first = a[0];
        System.out.println("Before rotation" + Arrays.toString(a));

        for (int i = 1; i < a.length; i++){
            a[i-1] = a[i];                      // here we are rotating the elements
        }
        a[a.length-1] = first;              // first index is assigned to last index

        for (int x : a){
            System.out.print(x + " ");

        }
        System.out.println("\n");
    }

    public static void sortAndBinarySearch(){
        int a [] = {9,8,7,6,5,4,3,2,1};

        System.out.println("Before sorting: "+ Arrays.toString(a));

        Arrays.sort(a);

        System.out.println("After sorting " + Arrays.toString(a));

        System.out.println("Binary search at index : " + Arrays.binarySearch(a,8));

        //........................................................................................//

        String[] name = {"cd", "bc", "cc", "dd", "ef", "aa", "bb"};

        System.out.println("Before sorting: " + Arrays.toString(name));

        Arrays.sort(name);

        System.out.println("After sorting " + Arrays.toString(name));

        System.out.println("Binary search at index "+ Arrays.binarySearch(name, "bc"));
        System.out.println("Binary search at index "+ Arrays.binarySearch(name, "fg"));     // why output: -8 ?

        System.out.println("\n");
    }

    public static void insertElement(){

        int n = 6;
        int []a = new int[10];

        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;
        a[5] = 60;

        for (int i =0; i < n; i++){      // this loop is for printing
            System.out.print(a[i] + " ");
        }

        int insertX = 15;
        int index = 3;

        for (int i = n; i > index; i--){
            a[i] = a[i-1];
            a[index] = insertX;
        }

        System.out.println("\n");

        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");


    }
    static boolean compareArray(){
        String[] name1 = {"Fahad", "Ashikul", "Baha", "Bakai", "Fenton", "Jahan", "Mariya"};
        String[] name2 = {"Ashikul", "Jahan", "Sagar", "Dell", "Lenovo", "Apple", "Sony"};

        boolean duplicate = false;

        for (int i = 0; i < name1.length; i++){
            for (int j = 0; j < name2.length; j++){
                if (name1[i] == name2[j]){
                    System.out.println("There is " + name1[i] + " common element ");
                    duplicate = true;
                }
            }
        }
        return duplicate;


    }

    static void ascendingOrder(){

        int a[] = new int[4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter elements [4]:");

        for (int i = 0; i < a.length; i++){         // for taking input
            a[i] = input.nextInt();
        }

        // Ascending Sort
        Arrays.sort(a);
        System.out.println("After sorting to ascending order: "+ Arrays.toString(a));

        // Descending sort

        System.out.println("Descending sorting: ");             // use this method for descending sorting!
        for (int i = a.length-1; i >= 0 ; i--){
            System.out.print(a[i]+ " ");
        }

        System.out.println("\n");
    }

    static void descendingOrder(){          // this descending is too much, above formula is much easier to follow.
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

        boolean c = Arrays.equals(a,b);
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
        //System.out.println("Copy of Array b is: "+ Arrays.toString(b));           // if i use this line then i don't need the below loop, but both works! for printing b[i]
        System.out.println("Copy Aof Array b is: ");
        for (int i = 0; i < b.length; i++){
            System.out.print(b[i]+ " ");
        }


        System.out.println("\n");

    }
    static void findMax(){
        int[] a = {3,9,7,8,12,6,15,5,4,10};
        int max = a[0];

        for (int i = 0; i < a.length; i++){
            if (a[i] > max){
                max = a[i];
            }
        }
        System.out.println("The max is : "+ max);

    }

    static void findMin(){
        int[] a = {3,9,7,8,12,6,15,5,4,10};
        int min = a[0];

        for (int i = 0;i < a.length; i++){
            if (a[i] < min){
                min = a[i];
            }
        }
        System.out.println("The minimum is : " + min);


    }
    static void searchIndex(){
        int[] a = {3,9,7,8,12,6,15,5,4,10};

        Scanner input = new Scanner(System.in);
        System.out.println("The elements are: " + Arrays.toString(a));
        System.out.println("Enter the element looking for: ");
        int key = input.nextInt();

        for(int i = 0; i <a.length; i++){
            if (a[i] == key){
                System.out.println("The element is at index : " + i);
                System.exit(0);
            }
        }
        System.out.println("Not found!");

    }
    static void equalArray(){

        int a [] = {1,2,3,4,5,6,7,8,9};
        int b [] = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.equals(a,b));


    }
    static void searchEasy(){

        int[] a = {3, 9, 7, 8, 12, 6, 15, 5, 4, 10};
        Arrays.sort(a);
        System.out.println("Elements are: " + Arrays.toString(a));

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter element to look for ");
        int find = scan.nextInt();

        System.out.println("At index: "+ Arrays.binarySearch(a,find));
    }


}

















































