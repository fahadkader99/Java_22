package april_Fool;

public class ReverseNum1 {
    // reverse a number:
    public static void main(String[] args) {
        int num = 12345;

        int a = 0;
        int count = 0;

        while (num !=0){
            int remainder = num%10;
            count++;
            a = (a*10) + remainder;
            num = num/10;
        }
        System.out.println(a);
        System.out.println("total num "+count);
    }
}
