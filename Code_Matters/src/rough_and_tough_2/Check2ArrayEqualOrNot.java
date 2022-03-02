package rough_and_tough_2;

import java.util.Arrays;

public class Check2ArrayEqualOrNot {
    // check 2 array are equal or not?

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6,7,8};
        int[] arr2 = {1,2,3,4,5,6,7,8};

        // 1st way using build in method.
        boolean isEqual = Arrays.equals(arr1,arr2);
        System.out.println(isEqual);

        System.out.println("====================================");
        // 2nd way without method

        boolean equal = false;
        if (arr1.length== arr2.length){
            for (int i = 0; i <arr1.length;i++){
                if (arr1[i]==arr2[i]){
                    equal = true;
                }
            }
        }

        if (equal==true){
            System.out.println("Both arr are equal");
        }else System.out.println("Not equal");

    }
}
