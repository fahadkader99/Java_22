package June;

public class MaxMinArray {
    // find max and min element in an array

    public static void main(String[] args) {


        maxMin();
    }

    public static void maxMin(){
        int [] num = {1,2,3,4,5};

        int min = num[0];
        int max = num[0];

        for (int i = 0; i<num.length;i++){
            if (num[i]>max){
                max = num[i];
            }
        }

        for (int i = 0; i<num.length;i++){
            if (num[i]<min){
                min = num[i];
            }
        }

        System.out.println("Max " + max);
        System.out.println("Min " + min);
    }
}
