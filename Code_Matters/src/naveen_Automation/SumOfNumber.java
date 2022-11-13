package naveen_Automation;

import org.testng.annotations.Test;

public class SumOfNumber {
    // find the sum of number

    @Test
    void findSum(){
        int num = 33;
        int sum = 0;

        while (num!=0){
            int rem = num %10;
            sum += rem;
            num = num/10;
        }
        System.out.println("Sum " + sum);
    }
}
