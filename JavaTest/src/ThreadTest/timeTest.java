package ThreadTest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
public class timeTest {
    public final static String DATEFORMATTER = "yyyy-MM-dd HH:mm:ss";
    public static void main(String[] args) {
        Date now  = new Date();
        System.out.println(date2String(now));
    }
    public static String date2String(Date date){
        String dateString = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATEFORMATTER);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        dateString = simpleDateFormat.format(date);
        return dateString;
    }
}
