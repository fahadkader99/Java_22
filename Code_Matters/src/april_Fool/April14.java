package april_Fool;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class April14 {

    public static void main(String[] args) {

        //arrayEquals();
       // missingNumArray();
        //MaxAndMinArray();
        //duplicateElementArray();
        //linear_Search_Array();
        binary_Search_array();


    }
    public static void arrayEquals(){
        int[] arr = {1,2,3,4,5};
        int[]arr2 = {1,2,3,4,5};

        boolean isEqual = false;

        if (arr.length==arr2.length){

            for (int i = 0; i<arr.length;i++){
                if (arr[i] == arr2[i]){
                    isEqual = true;
                }
            }
        }

        if (isEqual){
            System.out.println("Equal");
        }else {
            System.out.println("not equals");
        }

        Arrays.sort(arr);
        Arrays.sort(arr2);

        boolean isSame = Arrays.equals(arr, arr2);
        System.out.println(isSame);


    }
    public static void missingNumArray(){
        int[] arr = {1,2,3,5};

        int rangeSum = 0;
        int actualSum = 0;

        int first = arr[0];
        int last = arr[arr.length-1];


        for (int i = 0; i<arr.length;i++){
            actualSum += arr[i];
        }
        System.out.println(actualSum);

        for (int i = first; i<=last;i++){
            rangeSum += i;
        }
        System.out.println(rangeSum);

        System.out.println("Missing Num: "+ (rangeSum-actualSum));

    }

    public static void MaxAndMinArray(){
        int[] arr = {1,2,3,5};

        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i<arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }

        for (int i = 0; i<arr.length;i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("Max "+ max);
        System.out.println("Min "+ min);


    }
    public static void duplicateElementArray(){
        int[] arr = {1,2,3,4,5,1,2,3,4,5,6,7,8,9,0};
        int count = 1;
        Map<Integer,Integer> map = new HashMap<>();


        for (int i = 0; i<arr.length;i++){
            if (!map.containsKey(arr[i])){
                map.put(arr[i],count );
            }
            else {
                map.put(arr[i], map.get(arr[i])+1 );
            }
        }

        // Print
        for (Integer i: map.keySet()){
            if (map.get(i)>1){
                System.out.println(i+" = "+ map.get(i));
            }
        }


    }

    public static void linear_Search_Array(){
        int[] num = {1,2,10,3,4,5,11,6,7,8,9,0};
        int target = 20;
        boolean flag = false;

        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        for (int i = 0; i< num.length;i++){
            if (num[i]==target){
                System.out.println("Index: "+ i);
                flag = true;
                break;
            }
        }

        if (flag==false){
            System.out.println("Element not found");
        }


    }

    public static void binary_Search_array(){
        int[] num = {1,2,10,3,4,5,11,6,7,8,9,20};
        int target = 22;
        Arrays.sort(num);
        System.out.println("\nAfter sort: "+ Arrays.toString(num));

        int low = 0;
        int high = num.length-1;
        int mid = 0;
        boolean flag = false;

        while ( low<=high){

            mid = (low+high)/2;

            if (num[mid]==target){
                System.out.println("Target index: "+ mid);
                flag = true;
                break;
            }
            else if (target<num[mid]){
                high = mid-1;
            }
            else if (target>num[mid]){
                low = mid+1;
            }

        }

        if (flag==false){
            System.out.println("Target not found..>!");
        }
    }
}
