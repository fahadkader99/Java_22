package may_22;

public class CuntNumDigits {
    // count the number of digits

    public static void main(String[] args) {
        int num = 12121212;

        CuntNumDigits count = new CuntNumDigits();
        count.countDigits(num);
        count.sumDigits(num);

    }

    public void countDigits(int num){
        int digit = 0;
        while (num!=0){
            num = num/10;
            digit++;
        }
        System.out.println("Num of digits: "+ digit);
    }

    public void sumDigits(int num){
        int sum = 0;

        while (num!= 0){
            int rem = num%10;

            sum = sum+rem;

            num = num/10;
        }
        System.out.println(sum);
    }
}
