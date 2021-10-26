package palindromeChecking;

public class PalindromeChecker {
    public static boolean isPalindrome(int number) {
        int numberOfDigits = 0;
        int divideBy = 1;
        while(number / divideBy > 0) {
            numberOfDigits++;
            divideBy *= 10;
        }
        int[] digitsArray = new int[numberOfDigits];
        for (int i = 0; i < numberOfDigits; i++) {
            digitsArray[i] = number % 10;
            number /= 10;
        }
        for (int i = 0; i < numberOfDigits / 2; i++) {
            if (digitsArray[i] != digitsArray[numberOfDigits-1-i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(String text) {
        for (int i = 0; i < text.length() / 2; i++){
            System.out.println(text.charAt(i));
            System.out.println(text.charAt(text.length() - 1 - i));
            if (text.charAt(i) != text.charAt(text.length() - 1 - i))
                return false;
        }
        return true;

    }
}
