package timeExamples;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ApocalypseCounter {
    public static long timeLeft(LocalDate now) {
        ChronoUnit.DAYS.between(now, LocalDate.of(2123, 11, 22));
        return ChronoUnit.DAYS.between(now, LocalDate.of(2123, 11, 22));
    }

    public static long timeLeft() {
        return timeLeft(LocalDate.now());
    }
}
