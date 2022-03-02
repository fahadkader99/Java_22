package qA_Fox_3;

public class RightTriangleStartPattern {
    // print right triangle star pattern
    public static void main(String[] args) {
        // for patterns we have to use nested loops


        int n = 5;

        for (int i = 0; i<n; i++){

            for (int j = 0; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
