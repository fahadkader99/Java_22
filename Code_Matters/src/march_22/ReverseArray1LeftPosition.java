package march_22;

public class ReverseArray1LeftPosition {
    // reverse an array for left position by 1
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int first = arr[0];
        for (int i = 1; i <arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = first;
        for (int i : arr){
            System.out.print(i+" ");
        }
    }

}
