package timeExamples;

public class TimeExcersises {
    public static void main(String[] args) {
        // Zadanie 1
        // pewien wróżbita wywróżył, że w roku 2123 dnia 22 listopada o godzinie 00:00:00.000
        // nastąpi koniec świata, stwórz klasę, która będzie mieć metodę statyczną
        // odliczającą ilość dni pozostałą do nastąpienia tego końca świata
        // metoda może przyjmować parametr typu LocalDate, jak poniżej
        // lub sama pobierać aktualny czas poprzez właśnie LocalDate.now()
        // najlepiej zrobić dwie metody o tej samej nazwie - jedna z druga bez parametrów :)
        System.out.println(ApocalypseCounter.timeLeft());


        // Zadanie 2
        // napisz klasę, której metoda tworzy dwuwymiarową tablicę longów
        // o wymiarach a x a (wartość a pobierana jest w parametrze metody)
        // i zapełnia ją losowymi wartościami
        // sprawdź, ile czasu Twój komputer potrzebuje na zapełnienie takiej tablicy
        System.out.println(MatrixFiller.timeToFill(10000).toString());
    }
}
