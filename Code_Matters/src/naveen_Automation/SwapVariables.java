package naveen_Automation;

import org.testng.annotations.Test;

public class SwapVariables {

    @Test
    void swap(){

        int a = 10;
        int b= 20;
        int c = 0;

        c = a;
        a = b;
        b = c;
        System.out.println(a);
        System.out.println(b);

        int d = 30;
        int e = 40;

        d = d+e;
        e = d-e;
        d = d-e;
        System.out.println(d);
        System.out.println(e);

        int f = 5;
        int g = 9;

        f = f*g;
        g = f/g;
        f = f/g;
        System.out.println(f);
        System.out.println(g);


    }
}
