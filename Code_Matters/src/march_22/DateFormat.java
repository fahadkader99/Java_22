package march_22;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH.mm.ss.SSS");

        Date date = new Date();

        String dateFormat = sdf.format(date);
        System.out.println(date);


    }

}
