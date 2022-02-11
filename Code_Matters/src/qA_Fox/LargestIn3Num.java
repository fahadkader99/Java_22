package qA_Fox;

public class LargestIn3Num {
    // find the largest in a given 3 number
    public static void main(String[] args) {
        int a = 10;
        int b = 11;
        int c = 10;

        if (a>b && b>c){
            System.out.println(a);
        }else if (b>a&&b>c){
            System.out.println(b);
        }else System.out.println(c);

    }
}
