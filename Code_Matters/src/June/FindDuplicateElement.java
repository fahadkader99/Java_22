package June;

import java.util.Arrays;

public class FindDuplicateElement {
    // find the duplicate elements in the array

    public static void main(String[] args) {

        //dup1();
        dup2();
    }

    public static void dup1(){
        int[] num = {1,2,3,4,1,2,3,5,6,7,8};

        Arrays.sort(num);

        System.out.println(Arrays.toString(num));

        for (int i =0; i <num.length-1; i++){
            if (num[i] == num[i+1]){
                System.out.print(num[i] + " ");
            }
        }
    }

    public static void dup2(){
        int[] num = {1,2,3,4,1,2,3,5,6,7,8};
        Arrays.sort(num);

        for (int i =0; i<num.length; i++){
            for (int j = i+1; j<num.length; j++){
                if (num[i]==num[j]){
                    System.out.print(num[j] + " ");
                }
            }
        }
    }
}
