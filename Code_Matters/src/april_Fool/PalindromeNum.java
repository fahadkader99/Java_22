package april_Fool;

public class PalindromeNum {

    //  palindrome is a number that remains the save after reversing

    public static void main(String[] args) {

        int a = 121;

        int b= a;

        int c = 0;

        while (a!=0){
            int remainder = a%10;
            c = (c*10)+remainder;
            a = a/10;
        }
        System.out.println(c);

        if (c==b){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not palindrome");
        }
    }
}
