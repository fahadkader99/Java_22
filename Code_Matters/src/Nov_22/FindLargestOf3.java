package Nov_22;

public class FindLargestOf3 {
    // find the largest of 3 num
    public static void main(String[] args) {
        int a = 100;
        int b = 40;
        int c = 30;

        int max = (a > b  ) ? a : b;
        int madMax = (max > c) ? max : c;
        System.out.println(madMax);
    }
}
