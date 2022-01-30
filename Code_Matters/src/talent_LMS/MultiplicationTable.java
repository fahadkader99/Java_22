package talent_LMS;

public class MultiplicationTable {
    /*
    Write a program in Java to display the multiplication table of a given integer.

Test Data
Input the number (Table to be calculated) : Input number of terms : 5
     */
    public static void main(String[] args) {

        int num = 10;

        for (int i = 0; i<=num; i++){
            System.out.println(num+ " x "+i+" = "+ (i*num));
        }
    }
}
