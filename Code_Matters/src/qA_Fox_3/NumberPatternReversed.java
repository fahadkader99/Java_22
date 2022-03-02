package qA_Fox_3;

public class NumberPatternReversed {
    // print a number patterns in reversed order
    public static void main(String[] args) {
        int num = 5;

        for (int i = num; i>=1;i-- ){

            for (int j = 1; j <=i;j++){

                System.out.print(i);
            }
            System.out.println();
        }
    }
}
