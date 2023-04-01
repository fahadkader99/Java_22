package march_april_23;

public class SwapStrings {
    // swap 2 strings without using 3rd variable

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 2 Strings: ");
//        String c = sc.nextLine().trim();                    // Hello
//        String d = sc.nextLine().trim();                    // World
//        sc.close();
        String a = "Hello";
        String b = "World";

        // append a & b
        a = a+b;                                            // HelloWorld
        b = a.substring(0, a.length() - b.length());        // HelloWorld - World = Hello
        a = a.substring(b.length());

        System.out.println(a +" " + b);


    }

}
