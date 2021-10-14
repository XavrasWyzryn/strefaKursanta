import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String checkTextLength = scanner.nextLine();
        System.out.println("Length of that string is: " + checkTextLength.length());
        scanner.close();


        scanner = new Scanner("sdadasdasdasda\ndasdasdasd\n" +
                "asdasdasd\ndfdsgsdags\ndfsdafdsafd\n");
        String nextString;
        while (scanner.hasNext()) {
            nextString = scanner.nextLine();
            System.out.println(nextString);
        }
    }
}
