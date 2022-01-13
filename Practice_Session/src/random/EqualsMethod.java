package random;

public class EqualsMethod {

    public static void main(String[] args) {

        String a = "Fahad";
        String b = "Fahad";
        String c = new String("Fahad");
        String d = new String("Fahad");

        System.out.println(a.equals(d));        // best way to compare object or string is using equals()
        System.out.println(b.equals(c));
        System.out.println(a==b);
        System.out.println(a==d);

        int i = 10;
        int j = 10;

        System.out.println(i==j);

    }
}






/*
equals() method compare the value/ the content.

== operator compare the reference of the object. It do not compare the value
 */