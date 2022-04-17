package april_Fool;

import java.util.Arrays;

public class Array_Operations {


    public static void main(String[] args) {


        //reverseArray();
        //rightRotateBy1();
        //rightRotateBy3();
        //leftRotationBy1();
        //leftRotateBy3();
        //swapFirstWithLast();
        //multipleArr();
        longestString();


    }

    public static void reverseArray() {
        int[] arr = {0, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        for (Integer i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void rightRotateBy1() {
        int[] arr = {1, 2, 3, 4, 5};

        int last = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;


        System.out.println(Arrays.toString(arr));


    }

    public static void rightRotateBy3() {

        int[] arr = {1, 2, 3, 4, 5};

        for (int j = 0; j < 3; j++) {
            int last = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last;
        }

        System.out.println(Arrays.toString(arr));


    }

    public static void leftRotationBy1() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int left = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = left;

        System.out.println(Arrays.toString(arr));


    }

    public static void leftRotateBy3() {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        for (int j = 0; j < 3; j++) {
            int left = arr[0];
            for (int i = 0; i < arr.length-1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = left;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void swapFirstWithLast(){
        int [] arr = {1,2,3,4,5};

        int temp = arr[0];                                  // with temp variable
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = temp;

        System.out.println(Arrays.toString(arr));



    }
    public static void multipleArr(){
        int[] num = {10,20,30,40,50};
        int [] num2 = {1,2,3,4,5};

        for (int i = 0; i< num.length;i++){
            System.out.println(num[i] * num2[i]+" ");
        }

    }

    public static void longestString(){
        String [] arr = {"Fahad","Ashikul","Kader"};

        int index = 0;
        int max = arr[0].length();

        for (int i = 0; i<arr.length;i++){
            if (arr[i].length()>max){
                index=i;
                max = arr[i].length();
            }
        }

        System.out.println(arr[index]);

    }

}
