package practice_session.Array.Single_Dimension;

import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {

       int [] num = new int[5];

       num[0] = 10;
       num[1] = 20;
       num[2] = 30;
       num[3] = 40;
       num[4] = 50;

        System.out.println(num[3]);
        System.out.println(Arrays.toString(num));
        System.out.println(num.length); // array length

        int sum = num[0] + num[1]+num[2]+ num[3]+num[4];
        int sub = num[4] - num[1];
        int mul = num[1] * num[2];
        int div = num[2] / num[1];
        int mod = num[2] % num[1];

        System.out.println();
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);

    }

}
