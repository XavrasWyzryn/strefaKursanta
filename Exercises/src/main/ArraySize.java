package main;

import java.util.Scanner;

import java.util.Scanner;

public class ArraySize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ch;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        do {
            ch = scanner.nextInt();

            if (ch < max) {
                max = ch;
            }
            if ( ch > min) {
                min = ch;
            }
        }while (ch != 0) ;
        System.out.println(max + min);
        System.out.println((max + min) / 2.0f);
        // Tu zaimplementuj rozwiązanie
    }
}

