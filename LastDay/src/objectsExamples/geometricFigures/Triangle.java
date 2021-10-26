package objectsExamples.geometricFigures;

import static java.lang.Math.*;

public class Triangle {
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double checkIfTriangle() {
        double max;
        double[] tab = new double[]{a, b, c}; //3 4 5
        max = tab[0];
        for (int i = 1; i < tab.length; i++) {
            if (max < tab[i]) { // 3 < 4  4 < 5
                max = tab[i]; //  4 5
            }
        }
        if ((max < a + b) && (max < b + c) && (max < a + c)) {
            return 1;
        } else {
            System.out.print("Triangle not exist ");
            return 0;
        }
    }


    public double areaOfAtriangle() {
        /*double perimeter = a + b + c;
        double p = perimeter / 2;*/
        if (checkIfTriangle() == 1) {
            double p = circumference() / 2;
            return sqrt((p * (p - a) * (p - b) * (p - c)));
        }
        return 0;
    }

    public double circumference() {
        if (checkIfTriangle() == 1) {

            return this.a + this.b + this.c;

        } else {
            return 0;
        }
    }
}
