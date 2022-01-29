package tricky_automation;

public class Compare2IntNum {

    // compare two int numbers (Integer caching)
        /*
        Integer caching range: -128 to 127.
            if any number given in between for Wrapper class, only then Integer caching will happen, since both the
            number are autoboxed, but outside the range it will not be true
         */

    public static void main(String[] args) {

        Integer a = 100;    // if change to 2000 for both, it will not be true.
        Integer b = 100;

        if (a==b){          // we can also use .equals
            System.out.println("True");
        }else {
            System.out.println("False");
        }



        // this is not part of the code, just for understanding
        int c = 100;
        int d = 100;

        if (c==d){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
