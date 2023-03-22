package march_23;

public class NaN {
    public static void main(String[] args) {
        /**
         * NaN - Not a Number
         * How Nan is defined in different language ?
         *
         * It is a number that is not defined
         */

        //System.out.println(2 / 0);          // arithmetic exception
        //System.out.println(2.0 / 0.0);      // infinity
        //System.out.println(0.0/ 0.0);           // number not defined - so NAN

        System.out.println(Math.sqrt(-1));

        System.out.println(Float.NaN);

        System.out.println(Float.NaN == Float.NaN);

        System.out.println(Float.NaN != Float.NaN);

        double nan = 2.1 % 0;
        System.out.println(nan);

        System.out.println(Float.NaN == nan);

    }
}
