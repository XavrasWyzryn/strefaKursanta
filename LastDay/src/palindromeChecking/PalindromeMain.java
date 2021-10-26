package palindromeChecking;

import java.util.Scanner;

public class PalindromeMain {
    public static void main(String[] args) {
       /*Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(PalindromeChecker.isPalindrome(number));*/
        Scanner scanner2 = new Scanner(System.in);
        String text = scanner2.nextLine();
        System.out.println(PalindromeChecker.isPalindrome(text));

        int num = 123, reversedNum = 0, remainder;

        // store the number to originalNum
        int originalNum = num;

        // get the reverse of originalNum
        // store it in variable
        while (num != 0) {
            remainder = num % 10;
            System.out.println(remainder); //3, 2 1
            reversedNum = reversedNum * 10 + remainder;
            System.out.println(reversedNum); //321
            num /= 10; // 12 1 0
            System.out.println(num);
        }

        // check if reversedNum and originalNum are equal
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is Palindrome.");
        }
        else {
            System.out.println(originalNum + " is not Palindrome.");
        }
    }
}
