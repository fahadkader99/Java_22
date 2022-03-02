package qA_Fox_3;

public class PerfectNUmOrNot {
    // a perfect number is the number, where you add all the divisor except the number itself and the addition of the those number is equal to the given number
    public static void main(String[] args) {
        int num = 28;       // 6, 2
        int sum = 0;

        for (int i = 1; i<num;i++){
            if (num % i==0){
                sum = sum+i;
            }
        }

        if (sum==num){
            System.out.println("Perfect NUm");
        }else System.out.println("Not perfect Num");
    }

}
