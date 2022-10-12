package June;

public class LargestOf3 {

    // find the largest of 3 num

    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 20;

        find1(a, b, c );
        find2(a,b,c);

    }
    public static void find1(int a, int b, int c){

        if (a > b && a >c ){
            System.out.println(a);
        }else if(b > a && b > c){
            System.out.println(b);
        }else {
            System.out.println(c);
        }
    }

    public static void find2(int a, int b, int c){

        // using ternary operator
        int first = a>b?a:b;
        int second = first>c? first:c;

        System.out.println("Largest " + second);
    }
}
