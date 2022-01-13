package practice_session.Array.Single_Dimension;

import java.util.Arrays;

public class ArrayForEachLoop {

    // find the sum of array elements by using for and for each loop
    public static void main(String[] args) {

        int[] n = {10,20,30,40,50};
        int sum = 0;

        for (int i = 0 ; i < n.length; i++){
            sum = sum+ n[i];
        }
        System.out.println("Sum with for loop is: " + sum);

        ArrayForEachLoop obj = new ArrayForEachLoop();
        System.out.println("Sum using For_each loop is: "+ obj.findSUm(n));

        System.out.println("Updated Index value of 4 is: " + findSumWithInt(n));
        System.out.println(Arrays.toString(n));

    }
    int findSUm(int[] n ){

        int sum = 0;

        for (int x: n){
            sum = sum + x;
        }
        return sum;
    }
    static int findSumWithInt(int[] n){
        int sum = 0;

        sum = n[0] + n[2];
        n[4] = sum;
        return sum;
    }

}
