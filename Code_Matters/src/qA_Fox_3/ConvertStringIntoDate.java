package qA_Fox_3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertStringIntoDate {
    // convert a string into a date
    public static void main(String[] args) throws Exception{
        String s = "2022-02-20";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = dateFormat.parse(s);

        System.out.println(date);

    }
}
