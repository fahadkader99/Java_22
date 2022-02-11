package qA_Fox;

public class SumOfElementsInArray {
    // find the sum of all elements in the array

    public static void main(String[] args) {
        int []num = {1,2,3,4,5,6,7,8,9,0};

        int sum = 0;

        for (int i = 0; i< num.length;i++){
            sum = sum+ num[i];
        }
        System.out.println(sum);

    }

}
