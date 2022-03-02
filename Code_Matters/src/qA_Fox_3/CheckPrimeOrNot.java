package qA_Fox_3;

public class CheckPrimeOrNot {
    // is a number which is divisible by 1 and the number itself
    public static void main(String[] args) {

        int num = 12;

        int count = 0;

        for (int i = 1; i<=num;i++){
            if (num % i ==0){
                count++;
            }
        }
        if (count==2){
            System.out.println("Prime");
        }else System.out.println("Not Prime");
    }
}
