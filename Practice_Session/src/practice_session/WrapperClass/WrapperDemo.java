package practice_session.WrapperClass;

public class WrapperDemo {
    public static void main(String[] args) {

        autoBoxing();
        unBoxing();

    }
    static void autoBoxing(){       // Primitive to obj
        int x = 30;
        Integer y = Integer.valueOf(x);     // autoBoxing 1st way
        System.out.println(y);

        double d = 100.00d;
        Double D = d;           // autoboxing 2nd way, we can directly box it.
        System.out.println(D);

        short a = 28;
        Short b = Short.valueOf(a);
        System.out.println(a);

    }

    static void unBoxing(){     // obj to primitive
        Double D = 2.90;
        double d = D;                    // unboxing 1st way
        System.out.println(d);

        Boolean B = new Boolean(true);
        boolean b = B.booleanValue();           // unboxing 2nd way

        Character c = 'F';
        char c1 = c.charValue();
        System.out.println(c1);


    }
}
