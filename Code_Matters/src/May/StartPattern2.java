package May;

public class StartPattern2 {
    public static void main(String[] args) {
/*
 *
 *  *  *
 *  *  *  *  *
 *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *  *
  */

        int num = 10 ;
        int k = 1;

        for (int i = 0; i<num;i++){
            System.out.println();

            for (int j = 0; j<k; j++){
                System.out.print(" * ");
            }
            k = k+2;
        }

    }
}
