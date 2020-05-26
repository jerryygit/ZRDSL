package tool;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * FileName:    FormatterDate
 * Author:      JERRY
 * Date:        2020/5/13 20:25
 * Description:
 */
public class FormatterDate {
    static DateTimeFormatter formatterYmdHms = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    static DateTimeFormatter formatterYmd = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static String formatter(String startTime, DateTimeFormatter formatter) {
        LocalDateTime dateTime = LocalDateTime.parse(startTime, formatterYmdHms);
        return formatter.format(dateTime);
    }

    public static String formatterYmd(String startTime) {
        return formatter(startTime, formatterYmd);
    }

    //    public static void main(String[] args) {
    //        System.out.println(formatterYmd("2017-08-16 00:18:20"));
    //        System.out.println(formatterYmd("2018-11-22 06:58:20"));
    //        System.out.println(formatterYmd("2018-02-24 23:08:19"));
    //    }
}
