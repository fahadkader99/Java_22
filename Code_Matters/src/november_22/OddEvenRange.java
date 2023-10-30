package november_22;

public class OddEvenRange {
    // print the odd even number from a given range
    public static void main(String[] args) {

        int range = 20;

        int odd = 0;

        int even = 0;

        System.out.println("\nEven: ");
        for (int i = 1; i<=range; i++){
            if (i % 2 ==0){
                System.out.print(i+" ");
            }
        }

        System.out.println("\nOdd:");
        for (int i = 1; i<=range; i++){
            if (i % 2 != 0){
                System.out.print(i+" ");
            }
        }




    }
}
