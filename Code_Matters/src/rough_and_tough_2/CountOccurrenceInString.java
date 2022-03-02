package rough_and_tough_2;

import java.util.Scanner;

abstract class one{
    public abstract void Occurrence();
}
class method1 extends one{
    @Override
    public void Occurrence() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a string: ");
        String str = sc.nextLine().toLowerCase();
        System.out.println("Char to find: ");
        char ch = sc.next().charAt(0);

        int count = 0;

         for (int i = 0; i<str.length();i++){
             if (str.charAt(i)==ch){
                 count++;
             }
         }
        System.out.println("\nFrom Method 1");
        System.out.println(ch+ " repeats "+ count+" times ");
    }
}

class method2 extends one{
    @Override
    public void Occurrence() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a string: ");
        String str = sc.nextLine().toLowerCase();
        System.out.println("Char to find: ");
        String ch = sc.nextLine();

        int beforeLength = str.length();
        int afterLength = str.replace(ch,"").length();

        int count = beforeLength-afterLength;


        System.out.println("\nFrom Method 2");
        System.out.println(ch+ " repeats "+ count+" times ");

    }
}

public class CountOccurrenceInString {

    public static void main(String[] args) {
        one fun1 = new method1();
        one fun2 = new method2();
        fun1.Occurrence();
        fun2.Occurrence();

    }
}
