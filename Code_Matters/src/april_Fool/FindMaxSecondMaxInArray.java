package april_Fool;

public class FindMaxSecondMaxInArray {
    // find the max and the second max value in the array

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};

        findMax(arr);

    }
    public static void findMax(int[] arr){

        int max1 = arr[0];
        int max2 = arr[0];

        for (int i = 0; i<arr.length;i++){
            if (arr[i] > max2){
                max2 = max1;
                max1 = arr[i];
            }
        }

        System.out.println(max1);
        System.out.println(max2);
    }
}
