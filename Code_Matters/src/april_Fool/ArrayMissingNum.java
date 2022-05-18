package april_Fool;

public class ArrayMissingNum {
    // find the missing number in array

    public static void main(String[] args) {

        int[] num = {1,2,3,5};

        int rangeSum = 0;
        int actualSum = 0;

        int first = num[0];
        int last = num[num.length-1];

        for (int i = first; i<=last; i++){
            rangeSum+= i;
        }
        System.out.println(rangeSum);

        for (int i = 0; i<num.length;i++){
            actualSum += num[i];
        }
        System.out.println(actualSum);

        System.out.println("Missing Num "+(rangeSum-actualSum));


    }
}
