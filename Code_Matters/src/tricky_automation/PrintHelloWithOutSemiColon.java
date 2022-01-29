package tricky_automation;

public class PrintHelloWithOutSemiColon {
    // print Hello World without using semicolon (;)

    public static void main(String[] args) {

        // 1.
        if (System.out.printf("Hello World") == null) {

        }

        System.out.println("\n=====================");
        System.out.println("======================");

        // 2.

        if (System.out.append("Hello World") == null) {

        }

        System.out.println("\n=====================");
        System.out.println("======================");

        // 3.
        if(System.out.append("Hello World").equals(null)){

        }
        System.out.println("\n=====================");
        System.out.println("======================");

        // 4.
        for (int i = 0; i< 1; System.out.println("Hello World")){
            i++;
        }


    }
}
