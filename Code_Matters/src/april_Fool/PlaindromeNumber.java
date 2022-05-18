package april_Fool;

public class PlaindromeNumber {
    // check if the number is palindrome number

    public static void main(String[] args) {
        int num = 16461;
        int a = num;
        int b =0;

        while (num!=0){
            int remainder = num%10;
            b = (b*10)+remainder;
            num = num/10;
        }
        System.out.println(b);

        if (a==b){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not palindrome");
        }
    }
}
