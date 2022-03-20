package march_22;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Array___Operations____ {
    // find the max and min value in the array

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        //findMaxMin(arr);
        //findMax(arr);
        //leftRotateBy1(arr);
        //leftRotateBy3(arr);
       // rightRotateBy1(arr);
        //rightRotateBy3(arr);
        //reverseArray(arr);
        //removeDuplicate();
        //remove_duplicate_from_sortedArray();
        //find_duplicate_using_index();
        //sum_Of_all_element();
        find_Odd_even_elements();



    }
    public static void findMaxMin(int[] arr){

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i<arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max"+max);

        for (int i = 0; i<arr.length;i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Min"+ min);
    }

    public static void findMax(int[]arr){                   // find max easy
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);


    }

    public static void leftRotateBy1(int[] arr){

        int first = arr[0];

        for (int i = 0; i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = first;

        for (Integer a : arr){
            System.out.print(a+" ");
        }

    }

    public static void leftRotateBy3(int [] arr){         // left rotate by 3 position

        for (int j = 1; j<=3;j++){
            int first = arr[0];

            for (int i = 0; i< arr.length-1;i++){
                arr[i] = arr[i+1];
            }
            arr[arr.length-1] = first;
        }


        System.out.println(Arrays.toString(arr));

    }

    public static void rightRotateBy1(int[] arr){

        int last = arr[arr.length-1];

        for (int i = arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last;

        System.out.println(Arrays.toString(arr));

    }

    public static void rightRotateBy3(int[] arr){

        for (int j = 1; j<=3;j++){
            int last = arr[arr.length-1];
            for (int i = arr.length-1; i>0; i--){
                arr[i] = arr[i-1];
            }
            arr[0] = last;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void reverseArray(int[] arr){

        for (int i = 0; i< arr.length / 2; i++){            // reverse with swapping method and return  the same array
            int temp = arr[i];
            arr[i] = arr[arr.length-1 - i];
            arr[arr.length-1-i] = temp;
        }

        System.out.println(Arrays.toString(arr));

    }

    public static void removeDuplicate(){
        int [] arr = {1,2,3,4,5,1,2,3,4,5,6,7,8,8,9};

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i< arr.length;i++){
//            if (set.add(arr[i])==false){                              // these are the duplicate value
//                System.out.println("Duplicate: "+ arr[i]);
//            }
            set.add(arr[i]);                                            // elements after removing the duplicates
        }
        System.out.println(set);

    }

    public static void remove_duplicate_from_sortedArray(){
        int [] arr = {1,2,3,4,5,1,2,3,4,5,6,7,8,8,9};               // need to be sorted for running all the operation

        Arrays.sort(arr);

        int j = 0;
        for (int i = 0; i<arr.length-1;i++){
            if (arr[i] != arr[i+1]){
                arr[j] = arr[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(arr));
        arr[j] = arr[arr.length-1];
        for (int k = 0; k<=j;k++){
            System.out.print(arr[k]+" ");
        }


    }

    public static void find_duplicate_using_index(){
        int [] arr = {1,2,3,4,5,1,2,3,4,5,6,7,8,8,9};
        Arrays.sort(arr);

        for (int i = 0; i< arr.length-1;i++){
            if (arr[i] == arr[i+1]){
                System.out.print(arr[i+1]+" ");
            }
        }


    }
    public static void sum_Of_all_element(){
        int [] arr = {1,2,3,4,5,1,2,3,4,5,6,7,8,8,9};

        int sum = 0;

        for (int i = 0; i< arr.length;i++){
            sum += arr[i];
        }
        System.out.println("Sum: "+ sum);

    }

    public static void find_Odd_even_elements(){
        int [] arr = {1,2,3,4,5,1,2,3,4,5,6,7,8,8,9};

        int even = 0;
        int odd = 0;

        System.out.println("\nEven elements");
        for (int i = 0; i< arr.length;i++){
            if (arr[i] % 2 ==0){
                even = arr[i];
                System.out.print(even+" ");
            }
        }

        System.out.println("\nOdd elements");
        for (int i = 0; i< arr.length;i++){
            if (arr[i] % 2 != 0){
                odd = arr[i];
                System.out.print(odd+" ");
            }
        }

    }




}
