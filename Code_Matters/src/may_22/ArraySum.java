package may_22;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraySum {
    // find sum of all element in array

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 9};

//        sumArray(arr);
//        maxArray(arr);
        compareArrays();
    }

    public static void sumArray(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

    public static void maxArray(int[] arr) {

        Arrays.sort(arr);
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i<arr.length;i++){
            set.add(arr[i]);
        }

        Integer[] arr1 = set.toArray(Integer[] :: new);
        System.out.println(Arrays.toString(arr1));

        int max = arr1[0];
        int max2 = arr1[0];

        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i] > max2) {
                max2 = max;
                max = arr1[i];
            }
        }
        System.out.println("Max 1 -" + max);
        System.out.println("Max 2 -" + max2);
    }

    public static void compareArrays(){
        int[] num = {1,2,3,4,5};
        int[] num2 = {1,2,3,4,6};
        boolean even = true;

      if (num.length==num2.length){

          for (int i = 0;i<num.length;i++){

              if (num[i]!=num2[i]){
                 even = false;
              }
          }
      }
      else {
          even = false;
      }

      if (even){
          System.out.println("Arrays are equals");
      }else {
          System.out.println("Arrays are not equals");
      }
    }
}
