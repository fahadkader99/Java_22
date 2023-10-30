package november_22;

public class Divisible23 {
    // find the number from 1-25 which are divisible by 2 and 3 both
    public static void main(String[] args) {

        for (int i = 1; i<=25; i++){

            if (i % 2 ==0){
                if (i % 3 == 0){
                    System.out.println(i);
                }
            }
        }
    }
}
