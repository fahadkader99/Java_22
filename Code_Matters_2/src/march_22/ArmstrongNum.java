package march_22;

public class ArmstrongNum {
    // An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself.

    public static void main(String[] args) {

        int num = 153;

        int arm = num;
        int n = 0;

        while (num>0){
            n = n+(num %10)*(num %10)*(num %10);
            num = num/10;
        }
        System.out.println(n);

        if (arm==n){
            System.out.println("Armstrong");
        }else System.out.println("Not arm");
    }
}
