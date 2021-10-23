package staticExamples;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class StaticUtils {
    public static final String hourAndMinutePattern = "HH:mm";
    public static final String hourMinuteSecondPattern = "HH:mm:ss";

    public static void showHourAndMinuteOnly(LocalTime time) {
        printTime(time, hourAndMinutePattern);
    }

    public static void showHourMinuteSecond(LocalTime time) {
        printTime(time, hourMinuteSecondPattern);
    }

    private static void printTime(LocalTime time, String pattern) {
        System.out.println(time.format(DateTimeFormatter.ofPattern(pattern)));
    }
}
