package march_23;

public class PrintArrayPatterns {
    // print a pattern with the array
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
//        int [] arr = new int[10];
//
//        for (int i = 0; i < arr.length; i++){
//            System.out.println("- ");
//            for (int j = 0; j < i; j++){
//                System.out.print("- ");
//            }
//        }

        for (int i = 0; i< 10; i++){
            for (int j = 0; j <10; j++){
                System.out.printf("- ", arr[i][j]);
            }
            System.out.println();
        }
    }

}
