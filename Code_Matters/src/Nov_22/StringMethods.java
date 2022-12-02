package Nov_22;

public class StringMethods {
    public static void main(String[] args) {

        String a = "12345";

        System.out.println(a.substring(2, 4));      // string ending index is always -1;

        //System.out.println(a.replace('1', '0'));

        //System.out.println(a.replaceAll("[0-9]", "0"));     // replace all using regex

        System.out.println(a.startsWith("10"));

        System.out.println(a.endsWith("45"));

        System.out.println(a.charAt(0));

        String b = "ABC.DEF.1234";

        System.out.println(b.indexOf("B"));     // giving the index position of the string

        System.out.println(b.indexOf(".", 3));      // if the '.' is found on the index it will give the index or it will return -1

        System.out.println(b.lastIndexOf("."));
        System.out.println("-----------");

        System.out.println(b.lastIndexOf("."));

        System.out.println(a.equals(b));

        System.out.println(a==b);

        String c = "abc";
        String d = "ABC";

        System.out.println(c.equals(d));    // .equals checks the value or the contents of the objects
        System.out.println(c==d);       // == checks if the objects are pointing to the same memory location or not
        System.out.println(c.equalsIgnoreCase(d));
        System.out.println(c.compareToIgnoreCase(d));       // Not sure how compareTo works in string
        System.out.println(c.compareTo(d));

        String e = "Java";
        String f = "Python";

        String g = String.valueOf(e.compareTo(f));
        System.out.println(g);

        //========================================

        int h = 123;
        System.out.println(String.valueOf(h));
        String i = "12345";
        int j = Integer.parseInt(i);
        System.out.println(j);









    }
}
