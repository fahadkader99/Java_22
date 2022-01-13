package practice_session.Basics_Code;

public class FindTheMissingNum {

    public static void main(String[] args) {

        int[] num = {1,2,3,4,5,6,8,9,10};
        int sum = 0;
        int withMissingNum = 0;

        for (int i = 0; i < num.length; i++){
            sum += num[i];

        }
        System.out.println(sum);



        for (int i =1; i <11; i++){
            System.out.println(i+ " ");
            withMissingNum +=1;
        }
        System.out.println(withMissingNum);
        int result = Math.abs(withMissingNum -sum);
        System.out.println(result);
    }
}
