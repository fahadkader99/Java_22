package June;

public class EvenAndOddArray {
    // print even and odd number from array

    public static void main(String[] args) {
        int[] array  = {1,2,3,4,5,6};

        System.out.println("\n");
        for (int i = 0; i< array.length; i++){

            if (array[i] % 2 ==0){
                System.out.print("Even -> "+ array[i] + " ");
            }
        }

        System.out.println("\n");
        for (int i = 0; i<array.length; i++ ){

            if (array[i] % 2 != 0){
                System.out.print("Odd-> " + array[i] +" ");
            }
        }
    }
}
