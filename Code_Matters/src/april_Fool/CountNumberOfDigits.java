package april_Fool;

public class CountNumberOfDigits {
    // count number of digits in a num
    public static void main(String[] args) {

        int a = 123;
        int count = 0;

        while (a!=0){
            a = a/10;
            count++;
        }
        System.out.println(count);
    }
}
