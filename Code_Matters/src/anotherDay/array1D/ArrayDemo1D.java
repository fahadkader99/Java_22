package anotherDay.array1D;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayDemo1D {

    /*
    left rotation
    right rotation
    deleting element
    Split array and into char
    user defined size of array and user input
    sum of elements
    sort & binary search method
    search index
    FindMax
    FindMin

     */

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};

        //leftRotation(arr);
        //rightRotation(arr);
        //deleteElement(arr);
        //splitIntoChar();
        //userDefined();
        //sum(arr);
        //sortAndSearch();
        //searchIndex();
        //findMax(arr);
        findMin(arr);




    }
    public static void leftRotation(int[] arr){

        int first = arr[0];

        for (int i = 1; i<arr.length;i++){
            arr[i-1]=arr[i];                    // left rotation
        }
        arr[arr.length-1] = first;          // putting first value into the last index of arr

        for (int x : arr){
            System.out.print(x+" ");
        }

    }

    public static void rightRotation(int[] arr){

        int last = arr[arr.length-1];

        for (int i = arr.length-1; i>0;i--){        // for right rotation we have to reverse the array first then do the right rotation
            arr[i]=arr[i-1];
        }
        arr[0]=last;

        for (int x : arr){
            System.out.print(x+" ");
        }

    }

    public static void deleteElement(int[] arr){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index what to remove:");
        int index = sc.nextInt();

        for (int i = 0; i<arr.length;i++){
            arr[index] = arr[i];
        }
        arr[index]=0;

        for (int x :arr){
            System.out.print(x+" ");
        }

    }

    public static void splitIntoChar(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.nextLine();

        char[] ch = str.toCharArray();
        System.out.println(Arrays.toString(ch));

//        for (int i = 0; i < ch.length;i++){
//            System.out.print(ch[i]+" ");
//        }


    }
    public static void userDefined(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        int[]arr = new int[size];

        for (int i = 0; i <arr.length;i++){
            System.out.println("Enter element: "+ (i+1));
            arr[i] = sc.nextInt();
        }

        System.out.print(Arrays.toString(arr));

    }

    public static void sum(int[] arr){

        int sum = 0;

        for (int i = 0; i<arr.length;i++){
            sum = sum+arr[i];
        }
        System.out.println("Sum = "+sum);

    }

    public static void sortAndSearch(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you are looking for: ");
        int index = sc.nextInt();

        int[]arr = {3,2,6,8,12,4,9,10,11};

        Arrays.sort(arr);
        System.out.println("After sorting: "+Arrays.toString(arr));

        int search = 0;
        System.out.println("The given Num is at index : "+Arrays.binarySearch(arr,index));      // binary search return Index





    }
    public static void searchIndex(){
        int[]arr = {9,4,6,2,7,1,3,8};
        Arrays.sort(arr);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Element are : "+Arrays.toString(arr));
        System.out.println("Enter the element you are looking for ");
        int look = sc.nextInt();
        boolean isNot = false;

        for (int i = 0; i <arr.length;i++){
            if (arr[i]==look){
                System.out.println("The index "+i);
                isNot = true;
                break;

            }
        }
        if (!isNot){
            System.out.println("Not valid yet");
        }




    }

    public static void findMax(int [] arr){

        int max = arr[0];
        for (int i = 0; i <arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Max: "+max);

    }

    public static void findMin(int[] arr){
        int min = arr[0];

        for (int i = 0; i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Min: "+min);
    }



}
