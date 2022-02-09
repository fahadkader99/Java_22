package talent_LMS;

public class PrintPattern {

    public static void main(String[] args) {
        int size = 7;


        // outer loop for each row
        for (int row = 1; row <= size; row++){

            // inner loop for columns
            for (int col = 1; col <= size; col++){

                if (row % 2==0){
                    //System.out.print("$");
                }
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
