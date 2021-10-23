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
    // 4. wartosc najmniejsza
    // 5. sume wszystkich wartosci dodatnich
    // 6. sume wszystkich wartosci ujemnych

    // 1. srednia
    public static double average(double... numbers) {
        double sum = 0.0d;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    // 2. suma kwadratow
    public static int squaresSum(int... numbers) {
        int squaredSum = 0;
        for (int number: numbers) {
            squaredSum += number * number;
        }
        return squaredSum;
    }

    // 3. wartosc najwieksza
    public static float maxValue(float... numbers) {
        if (numbers.length == 0) {
            return 0.0f;
        }
        float actualMax = numbers[0];
        for (float number: numbers) {
            if (number > actualMax) {
                actualMax = number;
            }
        }
        return actualMax;
    }

    // 4. wartosc najmniejsza
    public static float minValue(float... numbers) {
        if (numbers.length == 0) {
            return 0.0f;
        }
        float actualMin = numbers[0];
        for (float number: numbers) {
            if (number < actualMin) {
                actualMin = number;
            }
        }
        return actualMin;
    }

    // 5. suma dodatnich elementow
    public static double sumPlusElements(double... numbers) {
        double sum = 0.0d;
        for (double number : numbers) {
            if (number > 0) {
                sum += number;
            }
        }
        return sum;
    }

    // 6. suma ujemnych elementow
    public static double sumMinusElements(double... numbers) {
        double sum = 0.0d;
        for (double number : numbers) {
            if (number < 0) {
                sum += number;
            }
        }
        return sum;
    }
}
