package qA_Fox_3;

public class NumberPattern {
    public static void main(String[] args) {
        // print a number patterns

        int num = 5;

        for (int i = 0; i<=num;i++)
        {
            for (int j = 1; j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
