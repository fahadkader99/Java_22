package march_22;

public class ReverseNumFunction {
    // write a function to reverse a number in java
    public static void main(String[] args) {
        int num = 4321;

        int n=0;

        while (num != 0){
            int remainder = num % 10;
            n = (n * 10) + remainder;
            num = num / 10;
        }
        System.out.println(n);

    }
}
