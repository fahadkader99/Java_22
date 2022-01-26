package common_Interview_Question;

public class MaxMinArray {

    // find max and min number in a given array

    public static void main(String[] args) {

    findMax();
    findMin();

    }
    public static void findMax(){
        int []arr = {1,2,3,4,5,6,7,8,9};


        int max = arr[0];
        for (int i = 0; i <arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Max = "+ max);


    }
    public static void findMin(){
        int []arr = {1,2,3,4,5,6,7,8,9};

        int min = arr[0];
        for (int i = 0; i <arr.length;i++){
            if (arr[i] <min){
                min = arr[i];
            }
        }
        System.out.println("Min = "+ min);



    }

}
