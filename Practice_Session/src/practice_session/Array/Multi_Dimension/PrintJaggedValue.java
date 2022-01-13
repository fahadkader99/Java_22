package practice_session.Array.Multi_Dimension;

public class PrintJaggedValue {
    /** Print the following way using 2D array
     *
     * 0
     * 1 2
     * 3 4 5
     * 6 7 8 9
     *
     */
    public static void main(String[] args) {
        int k = 0;  // k is used for counter
        int [][] n = new int[4][];

        n [0] = new int[1];
        n [1] = new int[2];
        n [2] = new int[3];
        n [3] = new int[4];

        for (int i = 0; i < n.length; i++){
            for (int j = 0; j < i+1; j++){
                n[i][j] = k;
                k++;
            }
        }

        for (int i = 0; i < n.length; i++){
            for (int j = 0; j < i+1; j++){
                System.out.print(n[i][j] + " ");
            }
            System.out.println();
        }
    }
}
