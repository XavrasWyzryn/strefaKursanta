package TwentySecond;

import java.util.Random;
import java.util.Scanner;

//Utwórz tablicę zawierającą n elementów. Ilość elementów (n) podaje
//        użytkownik. Tablicę należy uzupełnić losowymi liczbami (klasa Random)
//        całkowitymi dodatnimi z przedziału <0, max). Liczbę maksymalną (max)
//        podaje użytkownik. Następnie wykonaj poniższe podpunkty (każdy w
//        osobnej metodzie):
//        a) Wyświetl wszystkie elementy tablicy.
//        b) Wyświetl tylko parzyste elementy.
//        c) Wyświetl tylko nieparzyste elementy podzielne przez 3.
//        d) Wyświetl średnią wszystkich liczb zawartych w tablicy.
//        e) Wyświetl najmniejszą i największą liczbę oraz wartość indeksu pod
//        którym są one przechowywane w tablicy.
public class Arr20s {
    public static void main(String[] args) {

        System.out.println("Podaj liczbę elementów");
        int n = getTextFromUser();
        int[] arr = new int[n];

        System.out.println("Podaj maksymalny przedział <0, max)");
        int max = getTextFromUser();

        for ( int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(max);
        }

        displayElementsArray(arr);
//        System.out.println("Parzyste elementy");
//        displayEvenNumbers(arr);
//        System.out.println("Nieparzyste elementy");
//        displayOddNumbers(arr);
        System.out.println("średnią");
        displayAverageArray(arr);
    }

    private static int getTextFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void displayElementsArray(int[] arr) {
        for ( int element: arr) {
        System.out.println(element);
        }
    }

    private static void displayEvenNumbers(int[] arr) {
        for ( int element: arr) {
            if ( element % 2 == 0)
            System.out.println(element);
        }
    }

    private static void displayOddNumbers(int[] arr) {
        for ( int element: arr) {
            if ( element % 3 == 0)
                System.out.println(element);
        }
    }

    private static void displayAverageArray(int[] arr) {
        int sum = 0;
        for ( int element: arr) {
            sum += element;
        }
        System.out.println((double)sum / arr.length);
    }

}
