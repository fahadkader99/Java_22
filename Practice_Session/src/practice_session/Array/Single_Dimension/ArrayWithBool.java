package practice_session.Array.Single_Dimension;

import java.util.Arrays;

public class ArrayWithBool {
    public static void main(String[] args) {

        boolean[] bool = {true, false, true, true, false};

        int x = 0;
        int y = 0;

        System.out.println(Arrays.toString(bool));
        System.out.println(bool[1]);
        System.out.println(bool.length);
        System.out.println(bool.length-1);
        System.out.println(bool[bool.length-1]);

        ArrayWithBool a = new ArrayWithBool();
        System.out.println(a.isBigger(x,y));
        a.printBoolean();

    }
     boolean isBigger(int x, int y){
        boolean isBigger = x>y;
        return isBigger;
     }

     void printBoolean(){

         boolean[] b1 = new boolean[2];
         b1 [0] = true;
         b1 [1] = isBigger(2,4);
         System.out.println("the b1 value is: " + Arrays.toString(b1));

     }


}
