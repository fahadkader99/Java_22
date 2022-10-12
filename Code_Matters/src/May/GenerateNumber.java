package May;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateNumber {

    // generate a number from a given range
    public static void main(String[] args) {
        int range = 10;

        double random  = Math.random();

        System.out.println("Random number of a given range: "+(int)(random*range));


        String a = RandomStringUtils.randomNumeric(5);
        System.out.println(a);
    }
}
