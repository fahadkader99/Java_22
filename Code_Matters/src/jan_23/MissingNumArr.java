package jan_23;

public class MissingNumArr {
    // find the missing number in an Array
    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4,6};

        int arrSum = 0;
        int rangeSum = 0;

        for (int i = 0; i<arr.length; i++){
            arrSum+=arr[i];
        }

        for (int i = arr[0]; i <= arr[arr.length-1]; i++){
            rangeSum+= i;
        }

        System.out.println("Missing num: " + (rangeSum - arrSum));

    }
}
