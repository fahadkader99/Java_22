package May;

public class Fibo {
    public static void main(String[] args) {
        // write a fibonacci series up to 30;

        int range = 30;

        int a = 0;
        int b = 1;
        int temp = 0;
        System.out.print(a+" "+b+" ");

        while (temp<=range){
            temp = a+b;
            if (temp>range)break;
            System.out.print(temp+" ");
            a = b;
            b = temp;
        }

    }
}
