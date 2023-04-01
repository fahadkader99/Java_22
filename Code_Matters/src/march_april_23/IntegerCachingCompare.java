package march_april_23;

import java.util.Scanner;

public class IntegerCachingCompare {
    // compare to Integer number
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 Num: " );
        Integer a = scanner.nextInt();
        Integer b = scanner.nextInt();
        scanner.close();

        // Integer caching happens between (-128 to 127) - will return true in this range, more than that will return false
        // so always use .equals() for object comparing

        if (a==b){                              // true for -128 to 127
            System.out.println("Similar == ");
        }else {
            System.out.println("Not Same...!");
        }

        if (a.equals(b)){
            System.out.println("Similar - .equals()");
        }else {
            System.out.println("Not same");
        }




    }
}
