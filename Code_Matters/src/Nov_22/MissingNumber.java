package Nov_22;

public class MissingNumber {
    // find the missing number
    // in an Array
    public static void main(String[] args) {
        int[] arr  = {1,2,3,4,6};
        int sum1 = 0;

        for (int i=0; i<arr.length; i++){
            sum1+= arr[i];
        }

        System.out.println(sum1);

        int sum2 = 0;
        for (int i = arr[0]; i<=arr[arr.length-1] ; i++){
            sum2+= i;
        }
        System.out.println(sum2);

        System.out.println("Missing num " + (sum2-sum1));
    }
}
