package palindromeChecking;

import java.util.Scanner;

public class PalindromeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(PalindromeChecker.isPalindrome(number));
        Scanner scanner2 = new Scanner(System.in);
        String text = scanner2.nextLine();
        System.out.println(PalindromeChecker.isPalindrome(text));
    }
}
