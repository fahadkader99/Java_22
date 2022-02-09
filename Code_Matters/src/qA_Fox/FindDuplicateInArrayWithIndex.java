package qA_Fox;

public class FindDuplicateInArrayWithIndex {
    // find duplicate elements in an array using array
    public static void main(String[] args) {
        int[] num = {1,1,2,2,3,3,4,4,5,5,5,6,7,8,9,0,6,6,4,5,8};

//        for (int i = 0; i< num.length-1;i++){
//            if (num[i] == num[i+1]){
//                System.out.print("Duplicate: "+ num[i]+" ");
//            }
//        }

        for (int i = 0; i< num.length;i++){

            for (int j = i+1; j< num.length;j++){

                if (num[i]==num[j]){
                    System.out.println(num[j] + " is duplicate in the array");
                }
            }
        }

    }
}
