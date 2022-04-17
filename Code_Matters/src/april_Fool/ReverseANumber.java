package april_Fool;

public class ReverseANumber {

    public static void main(String[] args) {

        //rev1();
        rev2();

    }
    public static void rev1(){

        int a = 123;
        int b= 0;

        while (a !=0){
            int remainder = a % 10;
            b = (b*10) + remainder;
            a = a/10;
        }
        System.out.println(b);
    }

    public static void rev2(){

        int a = 1234;

        StringBuilder sb = new StringBuilder(String.valueOf(a));
        // or sb.append(a);

        System.out.println(sb.reverse());


    }


}
