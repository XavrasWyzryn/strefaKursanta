package main;

import java.util.Arrays;

public class arrayIntsSDA {
    public static void main(String[] args) {
//        int[] numbers = Arrays
//                .stream(args)
//                .mapToInt(Integer::parseInt)
//                .toArray();
        int[] numbers = new int[]{6, 5, 4, 5, 10, 5, 8, 3, 10, 6, 6, 6, 4, 3, 2, 8, 1, 3, 4, 7};

        int[] occurrences = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            occurrences[numbers[i] - 1] += 1;
            System.out.println("i= " + i + " - " + (numbers[i]-1) + " oc " + occurrences[numbers[i] - 1]);
        }

        for (int i = 0; i < occurrences.length; i++) {
            System.out.println(i + 1 + " - " + occurrences[i]);
        }
    }
}


