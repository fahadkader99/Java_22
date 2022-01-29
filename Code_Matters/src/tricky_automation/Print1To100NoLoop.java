package tricky_automation;

public class Print1To100NoLoop {
    // print 1 to 100 without using any loop
    // can use number
    //

    public static void main(String[] args) {

/*
Can be solved in 2 ways:
 1. Recursive functions
 2. Java streams
 */


        //printNum(1);
        printNumStream(10,100);


    }

    public static void printNum(int num){       // using recursion
        if (num<=100){
            System.out.println(num);
            num++;
            printNum(num);
        }
    }

    private static void printNumStream(int startNum, int endNum){   // using Streams
        if (startNum<=endNum){
            System.out.println(startNum);
            startNum++;
            printNumStream(startNum, endNum);
        }
    }

}
