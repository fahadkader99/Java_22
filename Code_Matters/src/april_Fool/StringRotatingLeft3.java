package april_Fool;

import org.testng.annotations.Test;

import java.util.Arrays;

public class StringRotatingLeft3 {
    // rotate a string by left 3
    public static void main(String[] args) {

//        String a = "12345";
//
//        char[] arr = a.toCharArray();
//
//        System.out.println(Arrays.toString(arr));
//
//        for (int i = 0; i<3;i++){
//
//            char left = arr[0];
//
//            for (int j = 0; j< arr.length-1;j++){
//                arr[j] = arr[j+1];
//            }
//            arr[arr.length-1] = left;
//
//        }
//        System.out.println(Arrays.toString(arr));

       // leftRotation();
        rightRotateString2();
        //rightRotateBy1();
    }

    public static void leftRotation(){
        int[] arr = {1,2,3,4,5};
        int left = arr[0];

        for (int i = 0; i< arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = left;

        System.out.println(Arrays.toString(arr));

    }

    public static void rightRotateString2(){
        String a = "12345";

        char[] arr = a.toCharArray();

        for (int i = 0; i<2;i++){

            char right = arr[arr.length-1];

            for (int j = arr.length-1; j>0; j--){
                arr[j] = arr[j-1];
            }
            arr[0] = right;
        }

        System.out.println(Arrays.toString(arr));
    }


    public static void rightRotateBy1(){
        int[] arr = {1,2,3,4,5};
        int right = arr[arr.length-1];
        for (int i = arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = right;

        System.out.println(Arrays.toString(arr));

        StringBuilder sb = new StringBuilder();
        for (Integer a : arr){
            sb.append(a);
        }
        System.out.println(sb);
    }

}
