package May;

public class FindDuplicateWithIndex {
    public static void main(String[] args) {
        // find duplicate element with index

        int[] arr = {1,2,3,4,5,6,7,8,9,1,2,3,4,5,9};

        for (int i = 0; i< arr.length;i++){

            for (int j = i+1; j< arr.length;j++){

                if (arr[i]== arr[j]){
                    System.out.print(arr[j]+" ");
                }
            }
        }
    }
}
