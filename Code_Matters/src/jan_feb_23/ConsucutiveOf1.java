package jan_feb_23;

public class ConsucutiveOf1 {
    // count the max consicutive of one

    public static void main(String[] args) {
        int[] array = { 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1 };

        int count = 0;
        int max = 0;

        for (int i = 0; i<array.length; i++){

            while (i < array.length && array[i] == 1){
                count++;
                i++;
            }
            if (max < count){
                max = count;
            }
            count = 0;

        }


        System.out.println(max);

    }
}
