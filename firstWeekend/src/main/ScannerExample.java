import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String checkTextLength = scanner.nextLine();
        System.out.println("Length of that string is: " + checkTextLength.length());
        scanner.close();
    }
}
