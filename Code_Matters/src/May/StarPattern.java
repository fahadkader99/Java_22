package May;

public class StarPattern {

    public static void main(String[] args) {
        int num = 5;

        for (int i = 0; i<num;i++){
            System.out.println(" ");

            for (int j =0; j<=i;j++){
                System.out.print(" * ");
            }
        }
    }
}
