package april_Fool;

public class Fibonachi {
    public static void main(String[] args) {

        int range = 20;

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
