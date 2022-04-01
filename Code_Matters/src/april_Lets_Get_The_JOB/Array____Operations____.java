package april_Lets_Get_The_JOB;

import org.testng.annotations.Test;

public class Array____Operations____ {


    public static void main (String [] args){


        reverseArray();



    }
    public static void reverseArray(){
        int[] arr = {0,9,8,7,6,5,4,3,2,1};

        for (int i = 0; i<arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i -1];
            arr[arr.length-i -1] = temp;
        }

        for (Integer i : arr){
            System.out.print(i+" ");
        }
    }
}
