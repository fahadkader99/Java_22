package a_practice;

public class MissingNumArray {

    public static void main(String[] args) {
        // find the missing num in array
        int[]arr = {1,2,3,5};
        int min = arr[0];
        int max = arr[arr.length-1];

        int rangeSum =0;
        int arrSum = 0;

        for(int i=0; i<arr.length; i++){
            arrSum+= arr[i];
        }

        System.out.println("ArrSum " + arrSum);

        for (int i= min; i<=max; i++){
            rangeSum+= i;
        }
        System.out.println("RangeSum " + rangeSum);

        int missingNum = rangeSum - arrSum;
        System.out.println("Missing Num " + missingNum);

    }

}
