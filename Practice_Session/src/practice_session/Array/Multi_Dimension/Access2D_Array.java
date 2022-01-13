package practice_session.Array.Multi_Dimension;

public class Access2D_Array {
    public static void main(String[] args) {
        /**
         * 2D Array Intro & Accessing with
         * ForEach Loop
         * Matrix -1
         *
         *
         *
         */

     forLoop();
    // forEachLoop();

    }
    static void forLoop(){

        int A [][] = new int[3][4];

        for (int i = 0; i < A.length; i++){
            for (int j = 0; j < A[0].length; j++ ){
                System.out.print(A[i][j]);
            }
           System.out.println("\n");
        }

    }
    static void forEachLoop(){

        int A [][] = new int[3][4];

        for (int x[] : A){
            for (int y : x){
                System.out.print(y);
            }
            System.out.println("\n");
        }

    }
}
