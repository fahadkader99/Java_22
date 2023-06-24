package may_22;

public class SmallLargeArray {

    public static void main(String[] args) {
        // find the small and large element in array

        int[] arr = {1,2,3,4,5,6,7,8,9,0};


        maxMin(arr);


    }
    public static void maxMin(int[] arr){
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }


        for (int i = 0; i<arr.length;i++){
            if (arr[i] <min){
                min = arr[i];
            }
        }

        System.out.println("Min "+ min);
        System.out.println("Max "+max);
    }


}
