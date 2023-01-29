package Nov_22;

public class LargeOf3 {
    public static void main(String[] args) {
        // find the large of 3 numbers

        int a = 100;
        int b = 20;
        int c = 30;

        int large = (a > b? a : b);
        int max = (large > c ? large : c);
        System.out.println(max);
    }
}
