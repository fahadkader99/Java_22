package march_april_23;

public class WithoutNum1to100 {
    // print 1 to 100 without using any numbers

    public static void main(String[] args) {

        /*
        for (int i = 0; i <=100; i++){
            System.out.println(i+" ");
        }

         */

        int num = 'A'/'A';                  // 1
        String s1 = "..........";           // 100

        for (int i = num; i < (s1.length() * s1.length()); i++){
            System.out.print(i+" ");
        }
    }
}
