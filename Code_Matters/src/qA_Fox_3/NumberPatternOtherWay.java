package qA_Fox_3;

public class NumberPatternOtherWay {
    public static void main(String[] args) {
        int num = 5;

        for (int i = num;i>=1;i--){

            for (int j = num;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
