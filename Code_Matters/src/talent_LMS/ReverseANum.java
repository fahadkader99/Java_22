package talent_LMS;

public class ReverseANum {
    public static void main(String[] args) {
        int num = 54321;

        int r = 0;
        while (num>0){
            int remainder = num%10;
            r = r*10+remainder;
            num = num / 10;

        }
        System.out.println(r);

    }
}
