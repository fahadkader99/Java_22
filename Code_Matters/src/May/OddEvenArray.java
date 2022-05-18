package May;

public class OddEvenArray {

    public static void main(String[] args) {
        // print out the even and odd numbers in an array

        int[] arr = {1,2,3,4,5,6,7,8,9,0};

        for (int i = 0; i<arr.length;i++){
            if (arr[i] %2==0){
                System.out.print(arr[i]+" ");
            }
        }

        System.out.println("\n");
        for (int i = 0; i< arr.length;i++){
            if (arr[i] %2!=0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}