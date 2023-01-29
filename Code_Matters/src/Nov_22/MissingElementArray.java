package Nov_22;

public class MissingElementArray {
    // find the missing element from the aray
    public static void main(String[] args) {

        int[] arr = {1,2,3,5};

        int aSum = 0;
        for (int i = 0; i<arr.length; i++){
            aSum+= arr[i];
        }

        int bSum = 0;
        for (int i = arr[0]; i<=arr[arr.length-1]; i++){
            bSum+=i;
        }

        System.out.println(aSum);
        System.out.println(bSum);
        System.out.println("Missing Num: " + (bSum-aSum));
    }
}
