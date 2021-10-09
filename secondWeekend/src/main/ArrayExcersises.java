import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrayExcersises {
    // Zadanie 1
    // stworzyc tablice intow, ktora przechowuje 30 wartosci
    // nastepnie przy pomocy petli wpisac do niej wartosci 1-30
    // wypisac wartosci do konsoli


    // Zadanie 2
    // stworzyc tablice stringow przetrzymujacych tytuly ksiazek
    // przy pomocy instrukcji switch wyswietlic tylko te,
    // ktore sa jakiegos ulubionego autora

    public static void main(String[] args) {
        String[] bookTitles = new String[]{
                "Harry Potter i kamień filozoficzny",
                "Harry Potter parodiowany przez komika",
                "Java podstawy",
                "Clean code",
                "Iliada",
                "Solaris",
                "Parodia: Harry Potter",
                "Parodia: Harry Potter 2",
                "Last title"
        };
        for (String bookTitle : bookTitles) { //this will do the same as for below
            switch (bookTitle) {
                // analogiczne case'y jak w zakomentowanym kodzie ponizej
            }
        }
//        for (int i = 0; i < bookTitles.length; i++) {
//            switch (bookTitles[i]) {
//                case "Solaris":
//                case "Another Lem book":
//                case "O pilocie Pirxie":
//                    System.out.println("Ksiazka Lema: ");
//                    System.out.println(bookTitles[i]);
//                    break;
//                case "Iliada":
//                case "Odyseja":
//                    System.out.println("Ksiazka Homera: ");
//                    System.out.println(bookTitles[i]);
//                    break;
//            }
//        }


        // Zadanie 3
        // przy pomocy regexa wyswietlic te, ktore sa z serii Harry Potter
        for (String bookTitle: bookTitles) {
            Pattern harryPotterPattern = Pattern.compile(
                    "Harry Potter .+");
            Matcher harryPotterMatcher = harryPotterPattern.matcher(bookTitle);
            if (harryPotterMatcher.matches()) {
                System.out.println(bookTitle);
            }
        }
    }
}
