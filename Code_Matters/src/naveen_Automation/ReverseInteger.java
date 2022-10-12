package naveen_Automation;

import org.testng.annotations.Test;

public class ReverseInteger {
    // reverse a given integer

    @Test
    public void revNumber(){
        int a = 1234;
        int b = 0;

        while (a!=0){
            int remainder = a%10;
            b = b*10+remainder;
            a = a/10;
        }
        System.out.println(b);

    }
}
