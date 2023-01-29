package Nov_22;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat1 {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        String formattedDate = sdf.format(date);
        System.out.println("\n> " + formattedDate);
    }
}
