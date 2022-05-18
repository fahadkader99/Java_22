package april_Fool;

public class LargestOfNumber {
    // find the largest of 2 numbers

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

/*        if (a>b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }*/

        // largest of 3 number

        int c = 30;

/*        if (a>b && a>c){
            System.out.println(a);
        }else if (b>a && b>c){
            System.out.println(b);
        }else {
            System.out.println(c);
        }*/

        // ternary operator

        int large = a>b?a:b ;
        int largest = large>c ? large:c ;
        System.out.println("Max "+largest);

    }
}
