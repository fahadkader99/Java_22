package June;

public class MissingNumArray {

    public static void main(String[] args) {
        // find the missing number from the array

        int[] arr = {1,2,3,4,6};
        int rangeSum = 0;
        int actualSum = 0;

        // sum of the element of the array
        for (int i = 0; i< arr.length;i++){
            actualSum+= arr[i];
        }

        System.out.println(actualSum);

        for (int i= arr[0]; i <= arr[arr.length-1]; i++){
            rangeSum += i;
        }
        System.out.println(rangeSum);

        System.out.println("Missing Num " + (rangeSum-actualSum));

    }
}
