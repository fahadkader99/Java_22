package rough_and_tough;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class GenerateRandomNum {
    public static void main(String[] args) {


        // 1st way = random class
        Random rand = new Random();
        int randomInt = rand.nextInt(100);

        System.out.println(randomInt);

        double d1 = rand.nextDouble();
        System.out.println(d1);


        // 2nd way = Math class;

        System.out.println(Math.random());


        // 3rd way - Apache commons-lang API    -- provides random Num and Strings
            // download from: https://commons.apache.org        (download and import the jar file)

        String n1 = RandomStringUtils.randomNumeric(15);     // even though it is a number but returns string variable
        System.out.println(n1);

        String s1 = RandomStringUtils.randomAlphabetic(8);  // randomly give 8 character
        System.out.println(s1);

    }
}
