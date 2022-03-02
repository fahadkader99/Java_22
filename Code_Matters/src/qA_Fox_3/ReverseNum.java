package qA_Fox_3;

public class ReverseNum {
    public static void main(String[] args) {

        int num = 12345;
        int original = num;
        int r = 0;

        while (num>0){
            r = r*10 + num %10;
            num = num / 10;
        }
        System.out.println(r);

    }
}
