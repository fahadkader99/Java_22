package naveen_Automation;

import org.testng.annotations.Test;

public class MissingNumArray {
    // find the missing number in the array

    @Test
    void findMissingNum(){
        int[] arr = {1,2,4,5};
        int arrSum = 0;
        for (int i=0; i<arr.length; i++){
            arrSum+= arr[i];
        }
        System.out.println(arrSum);
        int a = arr[0];
        int b = arr[arr.length-1];
        int sum = 0;
        for(int i=a; i<=b; i++){
            sum += i;
        }
        System.out.println(sum);
        System.out.println("Missing Num " + (sum-arrSum));
    }
}
