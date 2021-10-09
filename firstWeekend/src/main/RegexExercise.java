import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstText = scanner.nextLine();

        Pattern emailPattern = Pattern.compile(
                ".{1,15}@[a-z0-9]{2,5}\\.[a-z]{2,3}");
        Matcher emailMatcher = emailPattern.matcher(firstText);
        System.out.println(emailMatcher.matches());
        emailMatcher.reset();
        System.out.println(emailMatcher.find());
        
        String secondText = scanner.nextLine();
        Pattern streetPattern = Pattern.compile(
                "[au]l\\. [A-ZĄĘĆŚŹŻŃÓ][a-ząęćśżźńó]{1,20} \\d{1,3}(/\\d{1,4})?");
        Matcher streetMatcher = streetPattern.matcher(secondText);
        System.out.println(streetMatcher.matches());
        streetMatcher.reset();
        System.out.println(streetMatcher.find());

        // Zadanie 1
        // przyjmij jednego Stringa przy pomocy Scanner
        // sprawdz czy w tym Stringu mamy kod pocztowy
        // sprawdz rowniez czy mamy miasto (zalozmy, ze miasto ma jedno slowo)
        String thirdText = scanner.nextLine();
        Pattern postalCodePattern = Pattern.compile("[0-9]{2}-[0-9]{3}[ ]+[A-Z][a-z]{1,10}");
        Matcher postalCodeMatcher = postalCodePattern.matcher(thirdText);

        Pattern cityPattern = Pattern.compile("[A-Z][a-z]{1,10}");
        Matcher cityMatcher = cityPattern.matcher(thirdText);

        System.out.println(postalCodeMatcher.find());
        System.out.println(cityMatcher.find());
        scanner.close();
    }
}
