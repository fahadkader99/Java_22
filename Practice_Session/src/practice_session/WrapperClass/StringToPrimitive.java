package practice_session.WrapperClass;

public class StringToPrimitive {
    public static void main(String[] args) {

        stringToPrimitive();
        //primitiveToString();
    }
    static void stringToPrimitive(){        // 2 ways to convert( parse  &   valueOf )

        String s = "100";
        int i = Integer.parseInt(s);
        double d = Double.parseDouble(s);   // using part method
        byte q = Byte.parseByte(s);
        short w = Short.parseShort(s);

        System.out.println(i);
        System.out.println(d);
        System.out.println(q);
        System.out.println(w);

        String x = "32";                        // using valueOf method
        int a = Integer.valueOf(x);
        byte b = Byte.valueOf(x);
        short c = Short.valueOf(x);
        long l = Long.valueOf(x);
        float f = Float.valueOf(x);
        double g = Double.valueOf(x);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(l);
        System.out.println(f);
        System.out.println(g);


    }

    static void primitiveToString(){        // toString method
        int i = 100;
        String s = Integer.toString(i);
        System.out.println(s);

        boolean b = true;
        String bool = Boolean.toString(b);
        System.out.println(bool);

        char c = 'F';
        String ch = Character.toString(c);
        System.out.println(ch);

        double d = 2.34d;
        String d1 = Double.toString(d);
        System.out.println(d1);


    }
}
