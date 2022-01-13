package practice2022.january.jan1;

public class FindAvgOfNNumber {
    // find avg of given range of number , will do it with array.

    public static void main(String[] args) {

        int [] arr = {20,45,67,23,77,99,57,23,10,12,14,78}; // find avg of this array

        int sum = 0;


        for (int i = 0; i < arr.length; i++){
            sum = arr[i]+ sum;
        }
        System.out.println("Sum = "+ sum);
        int avg = 0;
        System.out.println("Avg = "+ (sum / arr.length));


    }
}
