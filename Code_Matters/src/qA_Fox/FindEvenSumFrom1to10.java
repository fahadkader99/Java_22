package qA_Fox;

public class FindEvenSumFrom1to10 {

    public static void main(String[] args) {
        int num = 10;
        /// find the sum of all even numbers:
        int sum = 0;
        int even;

        for (int i = 0; i<=num; i++){
            if (i % 2==0){
                sum = sum+i;
            }
        }
        System.out.println("Sum of even num: "+ sum);
    }




}
