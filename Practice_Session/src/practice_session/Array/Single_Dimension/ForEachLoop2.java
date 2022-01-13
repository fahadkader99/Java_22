package practice_session.Array.Single_Dimension;

public class ForEachLoop2 {
    public static void main(String[] args) {

        int[] num = {10,20,30,40,50,60,70,80,90};
        int sum = 0;

        for (int x: num){               // in for each loop we don't have to say the start and ending, it finds out by itself
            sum = sum+ x;
        }
        System.out.println("The sum is: " + sum);

    }
}
