package tool;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CallBehavior {

    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static boolean isMidnight(String startTime, DateTimeFormatter formatter) {
        boolean isMidnightTime = false;
        LocalDateTime dateTime = LocalDateTime.parse(startTime, formatter);
        int hour = dateTime.getHour();
        if (hour <= 5 || hour >= 23) isMidnightTime = true;
        return isMidnightTime;
    }

    public static boolean isMidnight(String startTime) {
        return isMidnight(startTime, formatter);
    }

    //    public static void main(String[] args) {
    //        System.out.println(isMidnight("2017-08-16 00:18:20"));
    //        System.out.println(isMidnight("2018-11-22 06:58:20"));
    //        System.out.println(isMidnight("2018-02-24 23:08:19"));
    //    }

}
