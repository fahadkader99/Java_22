package naveen_Automation;

import org.testng.annotations.Test;

public class SwapString {
    // swap 2 string without 3rd variable

    @Test
    void swapStr(){
        String a = "Fahad";
        String b = "Kader";

        System.out.println("Before Swap " +a);
        System.out.println("Before Swap " +b);

     /*
     1. append the string
     2. store initial A to string B
     3. store B to A
      */

        a = a+b;
        b= a.substring(0,a.length()-b.length());
        a = a.substring(b.length());

        System.out.println("\nAfter Swap "+a);
        System.out.println("After Swap "+b);




    }
}
