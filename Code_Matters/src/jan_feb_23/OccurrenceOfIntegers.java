package jan_feb_23;

public class OccurrenceOfIntegers {
    // find the longest occurrence of integer in an array
    public static void main(String[] args) {

        int[] arr = {4, 3, 25, 6, 7, 8, 9, 2, 3, 10 };

        int count = 0;
        int max = 0;

        for (int i = 0; i <arr.length-1; i++){
            if (arr[i] + 1 == arr[i+1]){
                count++;
            }else {
                count = 0;
            }

            max = Math.max(max, count + 1);
        }


        System.out.println(max);
    }
}
