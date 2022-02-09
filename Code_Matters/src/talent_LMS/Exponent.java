package talent_LMS;

public class Exponent {
    public static void main(String[] args) {
        int base = 3;
        int exp = 4;
        // 3 raise to the power 0f 4 is : 81

        System.out.println(expo(base,exp));



    }
    public static int expo(int base, int exp){
        int product = 1;

        // multiply product and base for exp number of time;
        for (int i = 0; i< exp;i++){
            product = product * base;
        }
        return product;

    }
}
