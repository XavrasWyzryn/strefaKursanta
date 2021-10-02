public class FirstDayExcersise {
    public static void main(String[] args) {
        // Zadanie 1
        // zadeklarować i zaimplementować z dowolną wartością zmienną int
        // wyświetlić informację, czy ta zmienna jest
        // ujemna, dodatnia, czy równa 0

        // Zadanie 2
        // zadeklarować i zaimplementować zmienną String trzymającą nazwę
        // piosenki (minimum dwie piosenki na zespół)
        // użyć funkcji warunkowej (sterującej) switch, która wyświetli
        // nazwę zespołu wykonującego ten utwór
        // w instrukcji domyślnej wyświetlić "unrecognized"

        // Zadanie 3
        // zadeklarować i zainicjalizować dwie zmienne float lub double
        // wyświetlić zaokrągloną wartość pierwszej, wartość absolutną drugiej
        // (część całkowitą) oraz informację,
        // czy suma obydwu jest liczbą całkowitą

        // Zadanie 4
        // zadeklarowac 3 zmienne kolejno int, float, double
        // obliczyc srednia z tych trzech zmiennych
        // podac najmniejsza wartosc z tych trzech
        // podac najwieksza wartosc z tych trzech

        //z4
        int firstValue = 10;
        float secondValue = 10.0f;
        double thirdValue = 10.0d;
        System.out.println("Srednia liczb "+ firstValue+", "+secondValue+", "+thirdValue+ " wynosi "
                + (firstValue + secondValue + thirdValue)/3);

        System.out.print("Najwieksza wartosc: ");
        if (firstValue >= secondValue && firstValue >= thirdValue)
            System.out.println(firstValue);
        else if (secondValue >= firstValue && secondValue >= thirdValue)
            System.out.println(secondValue);
        else if (thirdValue >= firstValue && thirdValue >= secondValue)
            System.out.println(thirdValue);
        System.out.println();

        System.out.println("\nExercise 4");
        int intValue = 2;
        float floatValue = 2.3f;
        double doubleValue = 2.9d;
        System.out.println("Average value: " + ((intValue + floatValue + doubleValue) / 3));
        // minimum in steps
        // float firstComparisson = Math.min(intValue, floatValue);
        // double calculatedMin = Math.min(firstComparisson, doubleValue);
        System.out.println("Min: " + Math.min(Math.min(intValue, floatValue), doubleValue));
        System.out.println("Max: " + Math.max(Math.max(intValue, floatValue), doubleValue));

        System.out.print("Najmniejsza wartosc: ");
        if (firstValue < secondValue && firstValue < thirdValue)
            System.out.println(firstValue);
    }
}
