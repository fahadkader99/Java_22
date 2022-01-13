package practice2022.chirag_Youtube;

public class FindSumDivision {
    // program to find result tof this series
    // 1/2 + 2/3 + 3/4 + 4/5+ 5/6+ 6/7+ 7/8+ 8/9+ 9/10+ 10/11

    public static void main(String[] args) {

        double sum = 0;

        for (double i = 1; i <=10;i++){
            sum = sum + i/(i+1);
        }
        System.out.println("Sum = "+ sum);


    }

}
