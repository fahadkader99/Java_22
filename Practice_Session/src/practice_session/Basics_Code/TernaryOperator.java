package practice_session.Basics_Code;

public class TernaryOperator {
    public static void main(String[] args) {



        twoNumberCondition();
        threeNumberCondition();

    }
    static void twoNumberCondition(){

        int a = 10;
        int b = 20;
        int max;

        max = (a > b) ? a : b;
        System.out.println("The max between 2 numbers : " + max);

    }

    static void threeNumberCondition(){
        int a = 15;
        int b = 10;
        int c = 15;
        int max;

        max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("The max between 3 numbers : " + max);
    }
}
