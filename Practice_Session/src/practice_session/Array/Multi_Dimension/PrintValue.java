package practice_session.Array.Multi_Dimension;

public class PrintValue {
    /**
     * Run a program to match this output       // need to  use 2D array
     * 0 1 2 3 4            // we have 4 Row and 5 column
     * 5 6 7 8 9
     * 10 11 12 13 14
     * 15 16 17 18 19
     */
    public static void main(String[] args) {
        int k = 0;      // took k for counter

        int n[][] = new int[4][5];

        for (int i =0; i < n.length;i++){               // this loop is for assigning value
            for (int j = 0; j < n[0].length; j++){
                n[i][j] = k;
                k++;
            }
        }
        for (int i = 0; i < n.length; i++){
            for (int j = 0; j < n[0].length; j++){
                System.out.print(n[i][j]+ " ");
            }
            System.out.println();
        }

    }

}
