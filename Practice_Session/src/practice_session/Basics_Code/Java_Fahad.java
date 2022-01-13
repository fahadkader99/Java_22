package practice_session.Basics_Code;

public class Java_Fahad {

    public static void main(String[] args) {
        // THe above line is the main method that comes only one, even for big program.
        // So to write java code i have to make sure that there no spelling mistake.
        System.out.println("Hi, My name is Ashikul Fahad");
        System.out.println("j       a       v      v     a");
        System.out.println("j      a  a       v    v    a  a");
        System.out.println("j     a     a       v      a     a");


        System.out.println("+********+");
        System.out.println("[| o  o  |]");
        System.out.println(" |   ^   |");
        System.out.println(" |  '_'  |");
        System.out.println("+--------+");

        System.out.println("  ------");
        System.out.println( "/      \\");
        System.out.println( "/        \\");
        System.out.println("/           \\");
        System.out.println("\\           /");
        System.out.println( "\\         /");
        System.out.println(  "\\       /");
        System.out.println(   "-------");

       // System.out.println("---------");
        //System.out.println("   /    \"" +
        //        "            "/      \" + "
          //                  "/       \");

        System.out.println("");
        System.out.print("");
        System.err.println("");
        System.err.print("");




        short sh1 = 12;
        short sh2 = 10;
        int shSum =  sh1 + sh2;



        int dividend = 4;
        double divisor = 2.2;

        System.out.println("Both operands are converted to double for this operation:" + (dividend + divisor)); //both of the operands are going to convert as double.

        char charA = 'a';
        char charB = 'b';
        int aBSum = charA+ charB;
        System.out.println("'a' plus 'b' = " + aBSum); //

        short shNum = 14;
        float floatNum = 13;
        double doubleNum = 30;

       // int nums = shNum + floatNum / doubleNum

    // Pre & post increment//

        // int a =13;
        // so we first declare the data types: int / long/ bytr and then we initialize the value into the datat type.

        // windening casting: converting smaller data types to larger / automatic

        int my1= 9;
        double my2= my1;

        System.out.println(my1);
        System.out.println(my2);

        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4L;
        float f = 3.4f;
        double d = 5.5;
        char c = 'A';

        short s1= b; // casting short to byte
        System.out.println(s1);

        float f1 = s;
        System.out.println(f1);


        double d1 = f;
        System.out.println(d1);

        float f2 = (float) d1;
        System.out.println(f2);

        //How to swap the values of 2 variables?


        int mod = 57 % 10;
        int div = 57 / 10;
        System.out.println("This is remainder: " + mod);
        System.out.println("This is division: " + div);

        System.out.println(1200 % 2);

        System.out.println( 'j' + 'a' + 'v' + 'a');

       }
}
