package november_22;

public class DUPLICATEWITHINDEX {
    public static void main(String[] args) {
        // find the duplicate element in array using index

        int[] arr = {1,2,3,4,5,6,2,3,4,5};
        //Arrays.sort(arr);

        for (int i = 0; i< arr.length; i++){

            for (int j = i+1; j< arr.length; j++){

                if (arr[i]==arr[j]){
                    System.out.println(arr[i] + " is duplicate");
                }
            }
        }
    }
}
