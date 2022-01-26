package anotherDay.recursion;

public class RecursionItSelf {

    public static void main(String[] args) {

    // Recursion is a method who calls itself and the process is called recursion.

        RecursionItSelf r = new RecursionItSelf();
        int a = r.sum(3);    // calling

        System.out.println("Sum of first N natural Number: "+a);

    }

    int sum(int b){
        if (b>0){
            return b+sum(b-1);  // calling recursion
        }
        else {
            return 0;
        }
    }


}
