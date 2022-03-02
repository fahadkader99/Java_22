package qA_Fox_3;

public class DivisibleBy2Or3 {
    // display the number from 1-25 which are divisible by 2 and 3
    public static void main(String[] args) {

        for (int i = 1; i<=25;i++){
            if (i % 2 == 0 && i % 3 ==0){
                System.out.print(i+" ");
            }
        }

    }
}
