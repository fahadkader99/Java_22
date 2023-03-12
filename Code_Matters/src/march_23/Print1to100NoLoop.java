package march_23;

import java.util.Arrays;

public class Print1to100NoLoop {
    // print 1 to 100 with out using any loop
    public static void main(String[] args) {

        // Arrays fill: method
        Object[] num = new Object[100];

        Arrays.fill(num, new Object(){
            int count = 0;

            public String toString(){
                return Integer.toString(++count);
            }
        });
        System.out.println(Arrays.toString(num));
    }
}
