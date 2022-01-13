package type_casting;

public class one {
    public static void main(String[] args) {

        double d;
        int i  = 150;
        byte b = 23;

        d = i;
        d = b;
        i = (int) d;
        b = (byte) d;


        int a = 234567;
        byte c;

        c = (byte) a;   // this is downcast
        System.out.println(a);





    }
}
