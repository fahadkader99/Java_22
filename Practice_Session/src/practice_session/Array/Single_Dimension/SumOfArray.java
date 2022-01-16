package practice_session.Array.Single_Dimension;

public class SumOfArray {
    public static void main(String[] args) {
        // Find sum of array.

        int[]arr = new int[4];
        int sum = 0;
        for (int i = 0; i <=4;i++){
            //System.out.println(arr[i]);
            sum = i+sum;
        }
        System.out.println(sum);
    }
}
