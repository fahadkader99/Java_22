package May;

public class MissingNumberArray {
    // find the missing number in array

    public static void main(String[] args) {
        int[] arr = {1,2,3,5};

        missingNum(arr);

    }
    public static void missingNum(int[] arr){

        int rangeSum = 0;
        int actualSum = 0;

        for (int i = 0; i<arr.length;i++){
            actualSum+=arr[i];
        }
        System.out.println(actualSum);

        for (int i = arr[0]; i<= arr[arr.length-1];i++){
            rangeSum+= i;
        }
        System.out.println(rangeSum);

        int missing = rangeSum - actualSum;
        System.out.println("Missing Number: "+ missing);
    }
}
