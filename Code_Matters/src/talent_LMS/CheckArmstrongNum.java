package talent_LMS;

public class CheckArmstrongNum {
    // check if the number is armstrong number or not
    // ex: 153 / 8208 / 407 / 371 / 1634

    public static void main(String[] args) {
        int num = 153;
        int ori = num;

        int n = 0;
        while (num >0){
            int remainder = num%10;
            n = (remainder*remainder*remainder*remainder)+n;
            num = num/10;
        }
        System.out.println(n);



        if (n==ori){
            System.out.println("Armstrong");
        }else System.out.println("Not armstrong");
    }
}
