package may_22;

public class CompareArray {
    // compare 2 arrays

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,4};
        boolean even = true;

        if (arr1.length== arr2.length){

            for (int i  = 0; i< arr1.length;i++){

                if (arr1[i] != arr2[i]){
                    even = false;
                }
            }
        }else {
            even = false;
        }


        if (even){
            System.out.println("Arrays are equal");
        }else {
            System.out.println("Not equal");
        }
    }



}
