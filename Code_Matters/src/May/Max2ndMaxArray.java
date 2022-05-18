package May;

public class Max2ndMaxArray {
    // find the max and the second max in an array

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};

        findMax(arr);

    }
    public static void findMax(int[] arr){
        int max1 = arr[0];
        int max2 = arr[0];

        for (int i = 0; i<arr.length;i++){
            if (arr[i] > max2){
                max1 = max2;
                max2 = arr[i];
            }
        }
        System.out.println("Max1 "+max1);
        System.out.println("Max2 "+max2);
    }
}
