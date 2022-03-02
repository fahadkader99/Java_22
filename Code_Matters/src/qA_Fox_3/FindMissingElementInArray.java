package qA_Fox_3;

public class FindMissingElementInArray {
    // find the missing element in the array
    // condition: array has to be sorted and no repetitive numbers
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,6,7};

        int first = arr[0];
        int last = arr[arr.length-1];
        int fSum = 0;

        for (int i = first; i<=last;i++){
            fSum = fSum+i;
        }
        System.out.println(fSum);

        int lSum = 0;

        for (int i = 0; i<arr.length;i++){
            lSum = lSum+arr[i];
        }
        System.out.println(lSum);

        int missing = fSum-lSum;
        System.out.println("Missing num in array: "+ missing);

    }
}
