package objectsExamples.geometricFigures;

import static java.lang.Math.PI;
public class Circle {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    public double areaOfCircle() {
        return PI * r * r;
    }

    public double circumferenceOfCircle() {
        return 2 * PI * r;
    }
}
