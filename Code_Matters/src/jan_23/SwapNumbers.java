package jan_23;

public class SwapNumbers {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        one(a,b);

    }

    static void one(int a , int b){
        int c = 0;

        c = a;
        a = b;
        b = c;

        System.out.println(a);
        System.out.println(b);
    }
}
