package Nov_22;

import java.text.SimpleDateFormat;
import java.util.Date;

class DateFormat_Custom {
    // print the date & time in different format

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy  HH:mm:ss:SSS");    // whatever format i pass It will print like that

        Date date = new Date();

        String formattedDate = sdf.format(date);

        System.out.println("\nFormatted Date: " + formattedDate);
    }

}
