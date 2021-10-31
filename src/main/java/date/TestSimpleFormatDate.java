package date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSimpleFormatDate {
    public static void main(String[] args) throws ParseException {
        DateFormat Dateformat = new SimpleDateFormat("yyyy-MM-dd");

        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
        SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
        System.out.println(monthFormat.format(Dateformat.parse("2020-02-01")));
        System.out.println(monthFormat.format(Dateformat.parse("2019-07-01")));
    }
}
