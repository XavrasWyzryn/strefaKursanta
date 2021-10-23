package timeExamples;

import java.time.LocalDate;

public class TimeExcersises {
    public static void main(String[] args) {
        // Zadanie 1
        // pewien wróżnita wywróżył, że w roku 2123 dnia 22 listopada o godzinie 00:00:00.000
        // nastąpi koniec świata, stwórz klasę, która będzie mieć metodę statyczną
        // odliczającą ilość dni pozostałą do nastąpienia tego końca świata
        System.out.println(ApocalypseCounter.timeLeft(LocalDate.now()));


        // Zadanie 2
        // napisz klasę, której metoda tworzy dwuwymiarową tablicę longów
        // o wymiarach a x a
        // i zapełnia ją losowymi wartościami
        // sprawdź, ile czasu Twój komputer potrzebuje na zapełnienie takiej tablicy
        System.out.println(MatrixFiller.timeToFill(1000));
    }
}
