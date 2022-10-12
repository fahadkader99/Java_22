package June;

public class ReverseNum {

    public static void main(String[] args) {
        int a = 54321;
        int rev = 0;

        // reverse the number

        while (a != 0){
            int rem = a % 10;
            rev = (rev * 10) + rem;
            a = a/10;
        }

        System.out.print(rev);
    }
}
