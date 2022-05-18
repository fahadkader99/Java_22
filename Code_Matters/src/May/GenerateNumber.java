package May;

public class GenerateNumber {

    // generate a number from a given range
    public static void main(String[] args) {
        int range = 10;

        double random  = Math.random();

        System.out.println("Random number of a given range: "+(int)(random*range));


    }
}
