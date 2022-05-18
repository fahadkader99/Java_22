package Challenging_Problem_Imp;

import java.util.Arrays;
import java.util.Scanner;
// Rotate an Array for the left 2.
public class RotateArray {
    public static void main(String[] args) {



    //reverseArray();
    //leftRotateArray();
    //left2Rotate();
        rightRotation();


    }
    public static void leftRotateArray(){
        int[] arr = {1,2,3,4,5,6};  //output = {3,4,5,6,1,2}

        int temp = arr[0];  // first taking the element into temp variable
        for (int i = 1; i < arr.length;i++){
            arr[i-1]=arr[i];
        }

        arr[arr.length-1]= temp;

        System.out.println(Arrays.toString(arr));


    }
    public static void reverseArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();

        int[]arr = new int[size];
        for (int i =0; i <size; i++){
            System.out.println("Enter element "+ (i+1));
            arr[i]=sc.nextInt();
        }
        //System.out.println(Arrays.toString(arr));

        for (int i = arr.length-1; i >=0; i--){
            System.out.print(arr[i]+" ");
        }


    }
    public static void left2Rotate(){
        int []arr = {1,2,3,4,5,6,7,8};

        int first = arr[0];
        int second = arr[1];

        for (int i = 2; i <arr.length;i++){
            arr[i-2]=arr[i];
        }

        arr[arr.length-1]=first;
        arr[arr.length-2]=second;

        System.out.println(Arrays.toString(arr));


    }

    public static void rightRotation(){
        int []arr = {1,2,3,4,5,6,7,8};

        int temp1 = arr[arr.length-1];
        int temp2 = arr[arr.length-2];

        for (int i = arr.length-1; i >0; i--){
            arr[i] = arr[i-1];
        }
        arr[0]=temp1;
        //arr[1]= temp2;

        for (int x : arr){
            System.out.print(x+" ");
        }


    }
























}
