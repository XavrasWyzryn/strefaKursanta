public class Loops {
    public static void main(String[] args) {
        // Zadanie 1
        // napisz petle, ktora obliczy sume wszystkich elementow mniejszych od
        // wartosci sumIndex, na koniec wyswietl wartosc tej sumy
        int sumIndex = 10;
        int resultSum = 0;
        for (int i = 1; i <= 10; i++) {
            resultSum += i;
        }
        System.out.println(resultSum);

        // Zadanie 2
        // korzystajac z podanej tablicy
        // wyswietl nazwe wszystkich zwierzat, ktore nie sa psem
        // dla tych "nie psow" wyswietl instrukcje jeszcze 2x przy uzyciu petli
        String[] pets = {"dog", "cat", "parrot"};
        for (String pet: pets) {
            if (pet != "dog") {
                for (int i = 0; i < 3; i++) {
                    System.out.println(pet);
                }
            }
        }

        int i = 0;
        while (i++ < 10) {
            System.out.println(i);
            ++i;
        }

        System.out.println("\n\n");
        i = 0;
        do {
            ++i;
            if (i == 5) {
                System.out.println("skip loop step");
                continue;
            }
            System.out.println(i);
        } while (i < 10);

        // Zadanie 3
        // stworzyc petle while, ktora policzy sume liczb parzystych
        // mniejszych od 11

        for (i = 0; i < 10; i++) {
            System.out.println("Hello World!");
            if (i == 1) {
                break;
            }
        }

        // Zadanie 4
        // zadeklaruj zmienna nOddNumbers i
        // policz sume wszystkich liczb nieparzystch i niepodzielnych przez 3
        // korzystajac z funkcji continue, nie sumuj wiecej niz 20 elementow
        // (do tego przyda sie break)
    }
}
