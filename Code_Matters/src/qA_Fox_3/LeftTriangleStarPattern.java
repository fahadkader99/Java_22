package qA_Fox_3;

public class LeftTriangleStarPattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {

            for (int j = 1; j < 2 * (n - i); j++) {            // don't know what is going on
                System.out.print(" ");                  // if i delete the space i will get right pattern ...! and with space i will get left pattern
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
