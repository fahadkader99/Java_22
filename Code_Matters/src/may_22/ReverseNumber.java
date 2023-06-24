package may_22;

public class ReverseNumber {
    public static void main(String[] args) {
        // reverse a number

        int num = 4321;

        int a = 0;

        while (num!=0){
            int remainder = num%10;
            a =(a*10) +remainder;
            num = num/10;
        }
        System.out.println("Rev: "+ a);


    }
}
