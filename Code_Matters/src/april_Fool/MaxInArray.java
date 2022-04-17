package april_Fool;

public class MaxInArray {

    public static void main(String[] args) {
        int[]arr = {5,4,13,2,1};

        int max = arr[0];

        for (int i = 0; i<arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
                break;
            }
        }
        System.out.println(max);
        System.out.println();
        SecondMax(arr);
    }
    public static void SecondMax(int[] arr){
        int max1 = arr[0];
        int max2 = arr[0];

        for (int i = 0; i<arr.length;i++){
            if (arr[i] > max2){
                max2 = max1;
                max1=arr[i];
            }
        }

        System.out.println(max1);
        System.out.println(max2);

    }
}
