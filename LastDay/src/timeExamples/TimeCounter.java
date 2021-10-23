package timeExamples;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class TimeCounter {
    public static void main(String[] args) {
        // inicjalizacja i wywołanie statycznej metody,
        // aby uzyskać aktualny czas
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime.toString());

        // inicjalizacja i wywołanie statycznej metody,
        // aby uzyskać aktualną datę
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime pointInTime = LocalDateTime.of(
                2021, Month.OCTOBER, 26, 10, 20, 52);
        System.out.println(pointInTime);

        LocalDateTime timeToWait = pointInTime.minusYears(localDateTime.getYear())
                .minusMonths(localDateTime.getMonth().getValue()) // z jakiegos powodu
                // ta metoda przekreca licznik, mimo ze wartosci sa poprawne
                .minusDays(localDateTime.getDayOfMonth())
                .minusHours(localDateTime.getHour())
                .minusMinutes(localDateTime.getMinute())
                .minusSeconds(localDateTime.getSecond());
        System.out.println(timeToWait);

        // istnieją dwie klasy mierzące odcinek czasu
        // Duration (odnosi się do czasu) i Period (odnosi się do dat)
        System.out.println(Duration.between(localDateTime, pointInTime).toString());
        System.out.println(Period.between(localDate,
                localDate.plusMonths(2)).getMonths());


        LocalTime secondLocalTime = LocalTime.now();
        // sekwencja wywołania metod jedna na drugiej, bo wciąż
        // zwracają obiekt typu LocalTime, na którym możemy te kolejne
        // metody wywoływać
        secondLocalTime = secondLocalTime.minusHours(localTime.getHour())
                .minusMinutes(localTime.getMinute())
                .minusSeconds(localTime.getSecond())
                .minusNanos(localTime.getNano());

        System.out.println(secondLocalTime.format(DateTimeFormatter.
                ofPattern("HH:mm:ss")));
        System.out.println(secondLocalTime);
    }
}
