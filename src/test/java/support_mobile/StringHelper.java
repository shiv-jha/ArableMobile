package support_mobile;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

import static support_mobile.World.timeMilli;
import static support_mobile.World.timeSeconds;

public class StringHelper {

    public long getTimeInMilliSeconds() {
        //Getting the current date
        Date date = new Date();
        //This method returns the time in millis
        timeMilli = date.getTime();
        return timeMilli;
    }

    public float convertTimeInSeconds(float value) {
        timeSeconds = value / 1000;
        return timeSeconds;
    }

    public int trimLastChar(String value, int count) {
        StringBuilder sb = new StringBuilder(value);
        return Integer.parseInt(sb.substring(0, sb.length() - count));
    }

    public String trimLastValue(String value, int count) {
        StringBuilder sb = new StringBuilder(value);
        return sb.substring(0, sb.length() - count);
    }

    public String currentUTCValue(long value) {
        /*Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        //df.setTimeZone(TimeZone.getTimeZone(zone));
        //String value1 = df.format(date);
        df.setTimeZone(UTC);
        return df.format(date);*/
        Instant currentDate = Instant.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss").withZone(ZoneId.of("UTC"));
        Instant ear = currentDate.minusSeconds(value);
        return formatter.format(ear);
    }

    public String pastUTCValue(long value) {
        Instant currentDate = Instant.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss").withZone(ZoneId.of("UTC"));
        Instant ear = currentDate.minusSeconds(value);
        return formatter.format(ear);
    }

    public String currentZoneValue(String zone) {
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        df.setTimeZone(TimeZone.getTimeZone(zone));
        //String value1 = df.format(date);
        return df.format(date);
    }

    public String convertDateFromString(String date) throws ParseException {
        String ds1 = date;
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf2 = new SimpleDateFormat("M/d/yy");
        String ds2 = sdf2.format(sdf1.parse(ds1));
        System.out.println(ds2);
        return ds2;
    }
}
