package practice2022.chirag_Youtube;

public class SumOfSeries {
    // find the sum of this series: (1 + 2 - 3 + 4 + 5 - 6 + 7 + 8 - 9 + 10)
    // note: some num are divisible by 3.

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 10; i++){
            if (i % 3==0){
                sum -=i;
            }else {
                sum +=i;
            }
        }
        System.out.println("Sum = "+ sum);
    }


}
