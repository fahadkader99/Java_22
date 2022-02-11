package leetCode;

public class PalindromeNum {
    public static void main(String[] args) {
        int num = 113;

        int original = num;

        int first = 0;
        while (num>0){
            first = first*10+num%10;
            num = num/10;
        }

        if (original==first){
            System.out.println("Palindrome");
        }else System.out.println("Not palindrome");

    }
}
