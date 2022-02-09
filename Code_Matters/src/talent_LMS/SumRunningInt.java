package talent_LMS;

public class SumRunningInt {
    /*Write a program called Sum Running Int to produce the sum of 1, 2, 3, ..., to 100.
    Store 1 and 100 in variables lowerbound and upperbound, so that we can change their values easily.  The output shall look like:

The sum of 1 to 100 is 5050*/

    public static void main(String[] args) {

        int lowerBound = 1;
        int upperBound = 100;
        int sum = 0;

        for (int number = lowerBound; number <= upperBound; ++number){
            sum = sum+number;
        }

//        for (int i =0; i<=upperBound;i++){
//            sum = sum+i;
//        }


        System.out.println(sum);


    }
}
