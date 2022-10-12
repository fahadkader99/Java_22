package June;

public class ArrayOddEven {
    // find the odd and even from the array

    public static void main(String[] args) {

        int[] num = {1,2,3,4,5,6,7,8,9};

        System.out.println("Even Numbers : ");
        for (int i = 0; i<num.length;i++){
            if (num[i] % 2 ==0){
                System.out.print(num[i] + " ");
            }
        }

        System.out.println("\nOdd Numbers ");
        for (int i = 0; i<num.length; i++){
            if (num[i] % 2 != 0){
                System.out.print(num[i] + " ");
            }
        }
    }
}
