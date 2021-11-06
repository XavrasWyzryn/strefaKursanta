import java.util.Scanner;

public class Ex3 {
    int a;
    int b;
    int c;

    private static double delta(int a, int b, int c) {
        double d = (b * b) - (4 * a * c);
        return d;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double d = delta(a,b,c);

        if (delta(a, b, c) < 0) {
            System.out.println("Delta ujemna");
        } else {
            double x1 = (-b - d)/(2 * a);
            System.out.println("x1 = " + x1);
            double x2 = (-b + d)/(2 * a);
            System.out.println("x1 = " + x2);
            }
        }
    }

