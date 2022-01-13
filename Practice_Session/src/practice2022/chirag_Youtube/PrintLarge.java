package practice2022.chirag_Youtube;

public class PrintLarge {
    // print large number out of 3 number:

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 150;

        System.out.println("Largest : ");
        if (a > b && a > c){
            System.out.println(a);
        }else if(b>a && b > c){
            System.out.println(b);
        }else System.out.println(c);



    }
}
