package Challenging_Problem_1;

public class LargeNumInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,80};

        int max = arr[0];
        for (int  i = 0; i<arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
                //break;
            }
        }
        System.out.println(max);


    }
}
