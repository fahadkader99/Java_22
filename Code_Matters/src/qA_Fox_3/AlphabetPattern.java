package qA_Fox_3;

public class AlphabetPattern {
    // print a alphabet pattern

    public static void main(String[] args) {

        int letter = 65;

        for (int i = 0; i<5;i++){
            for (int j = 0; j<=i;j++){
                System.out.print((char)(letter+i)+" ");
            }
            System.out.println();
        }
    }
}
