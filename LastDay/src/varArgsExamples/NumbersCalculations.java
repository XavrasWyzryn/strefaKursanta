package varArgsExamples;

public class NumbersCalculations {
    public static int addNumbers(int... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static long multiplyNumbers(int... numbers) {
        long result = 1;
        for (int i = 0; i < numbers.length; i++) {
            result *= numbers[i];
        }
        return result;
    }

    // Zadanie
    // napisać metody obliczające:
    // 1. srednia
    // 2. sume kwadratow
    // 3. wartosc najwieksza
    // 4. wartosc najmniejsza
    // 5. sume wszystkich wartosci dodatnich
    // 6. sume wszystkich wartosci ujemnych
}
