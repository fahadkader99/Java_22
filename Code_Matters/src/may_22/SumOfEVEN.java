package may_22;

public class SumOfEVEN {
    // find sum of even numbers 1-10

    public static void main(String[] args) {
        int sum = 0;

        for(int i = 0; i<=10; i++){

            if (i % 2 ==0){
                sum+= i;
            }
        }
        System.out.println(sum);
    }
}
