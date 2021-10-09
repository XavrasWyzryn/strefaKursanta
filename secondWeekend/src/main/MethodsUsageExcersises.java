import java.util.Scanner;

public class MethodsUsageExcersises {
    // Zadanie 1
    void stringsExample() {
        String example = "first part";
        String example2 = "second part";
        example.length();
        example.concat(example2);

        Scanner scanner = new Scanner(System.in);
        scanner.nextDouble();
    }

    String cutStringToMaxSize(String stringToCut, int maxStringSize) {
        if (stringToCut.length() <= maxStringSize) {
            return stringToCut;
        }
        return stringToCut.substring(0, maxStringSize);
    }

    void showStringIfLong(String stringToPrint, int minStringSize) {
        if (stringToPrint.length() < minStringSize) {
            return;
        }
        System.out.println(stringToPrint);
    }

    int sumFromOneToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
