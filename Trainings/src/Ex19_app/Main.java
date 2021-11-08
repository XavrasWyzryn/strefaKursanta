package Ex19_app;

public class Main {
//    Napisz program, składający się z kilku klas:
//    a. Klasy Author, reprezentującą autora – pisarza wierszów, składającej się z pól surname oraz nationality (oba typu String)
//    b. Klasy Poem, reprezentującą wiersz, składającą się z pól creator (typu Author) oraz stropheNumbers (typu int – reprezentującej ilość zwrotek wiersza)
//    c. Klasy Main, w której znajdzie się metoda main, a w niej kod w którym:
//    i. Stworzysz trzy obiekty klasy Poem, uzupełniając go wszystkimi danymi (używając konstruktora lub setter’ów) i zapiszesz je w tablicy
//    ii. Wypiszesz nazwisko tego autora, który napisał wiersz o największej liczbie zwrotek (niech odpowiedź obliczy Twój program!)

    public static void main(String[] args) {
//        Poem p1 = new Poem(new Author("A. Sapkowski", "Polish"), 50);
//        Poem p2 = new Poem(new Author("Dukaj", "Polish"), 15);
//        Poem p3 = new Poem(new Author("S. Lem", "Polish"), 70);
        Poem[] arrAuthor = new Poem[]{
                new Poem(new Author("A. Sapkowski", "Polish"), 50),
                new Poem(new Author("Dukaj", "Polish"), 15),
                new Poem(new Author("S. Lem", "Polish"), 70)
        };

        getMaksStrophe(arrAuthor);
    }

        private static void getMaksStrophe(Poem[] arrAuthor) {
            int maxValue = Integer.MIN_VALUE;
            int maks = 0;

            for (Poem poem : arrAuthor) {
                maks = Math.max(poem.getStropheNumbers(), maxValue);
            }
            for (Poem poem : arrAuthor) {
                if (maks == poem.getStropheNumbers()) {
                    System.out.println(poem.getCreator().getSurname());
                }
            }
//            System.out.println(maks);
        }
}