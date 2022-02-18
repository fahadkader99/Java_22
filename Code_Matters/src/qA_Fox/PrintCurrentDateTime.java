package qA_Fox;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintCurrentDateTime {
    // print current date and time by using program.

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("\nThe current date is: "+date);

        String version = System.getProperty("java.version");
        System.out.println("\nThe Java version on my OS : "+ version);


        // Print data and time in different format

        SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date today = new Date();

        String formattedDate = dt.format(today);

        System.out.println("\nAnother format: "+ formattedDate);



    }
}
