package rough_and_tough;

public class SumOfArrayElement {
    // find sum of elements in array

    public static void main(String[] args) {

        int[]n ={1,2,3,4,5};

        int sum = 0;

        for (int i = 0; i <n.length;i++){
            sum = sum+n[i];
        }

        System.out.println(sum);

    }
}
