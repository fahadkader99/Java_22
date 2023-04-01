package march_april_23;

public class SumArr {
    //sum up the values of all the array elements
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
