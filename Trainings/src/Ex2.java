import java.util.Scanner;

public class Ex2 {
    float weight;
    int height;

    public static double bmi (float weight, int height) {
        double bmi = (weight * 10000) / (height * height);
    return bmi;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wagę w kg");
        float weight = scanner.nextFloat();

        System.out.println("Podaj wzrost w cm");
        int height = scanner.nextInt();

        System.out.println(bmi(weight, height));

//        double bmi = weight/((height/100)*(height/100));
        if (bmi(weight, height) < 18.5 || bmi(weight, height) > 24.9) {
            System.out.println("BMI nieoptymalne");
        } else {
            System.out.println("BMI optymalne");
        }

    }
}
