package practice_session.Basics_Code;

public class Practise_Basic_Primitive {
    public static void main(String[] args) {

        System.out.println("Hello World");

        // This is how single line comments are taken
        /* This is used for multi line comments
        and it goes on until the end of the sign
         */


        // VARIABLE

        //String

        String firstName = "Fahad";
        String lastName = "Kader";
        String fullName = firstName + lastName;
        System.out.println(fullName);
        System.out.println(firstName + " " + lastName); // this way we have to use spaces in between.

        String greeting ="Hello Fahad";
        System.out.println(greeting);


        // Integers

        int phoneNum = 302;
        System.out.println("My phone number is " + phoneNum);

        //

        int num = 15; num = 20; // changing the value of variable
        System.out.println(num);

        // Final Variables

        //final int num1= 10;
        //int num1= 20;   // so using 'final' will fixed the value and it is not changable
        //System.out.println(num1);


        // OTHER PRIMITIVE VARIABLES;

        // int myNum = 5
        // float myFloatNum = 5.98f;
        // char myGrade = 'A';
        // long myNumber = 3025109896;
        // boolean myBool = true;


        long cellNumber= 3025109896L;
        System.out.println(cellNumber);

        //Booleans:

        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isFishTasty);
        System.out.println(isJavaFun);


     //DECLARE MANY VARIABLES:

        int x = 5, y = 6, z = 7;
        System.out.println(x + y + z);

        // Primitive data types - includes byte, short, int, long, float, double, boolean and char
        //Non-primitive data types - such as String, Arrays and Classes


     // Data type Casting

        //Windening Casting : Automatic ; converting smaller data types to bigger

        int myInt = 9;
        double myDouble = myInt;
        System.out.println(myInt);
        System.out.println(myDouble);

        // Narrowing Casting: Manually;  larger data type to smaller.

//        double myDouble = 9.78d;
//        int myInt = (int) myDouble; // Manual casting: double to int
//
//        System.out.println(myDouble);   // Outputs 9.78
//        System.out.println(myInt);      // Outputs 9

    byte b1 =127;
    b1 +=1;
        System.out.println(b1);
//
        System.out.println(6^3);
//
        int result = 12+2 *5 % 3 - 15/4;
        String X = 12 - 6 + "Hello" + 7+5;
        System.out.println(result + "-" + X);

        int i1 = 012;
        int i2 = 20;
        System.out.println(i1*i2);

        // Decimal value of character or Letter G is 71 in ASCII table
//        char decimalOfLetterG = 71;
//        System.out.println(" ");


    // Escape Sequence: (there are couples of them)








    }

}
