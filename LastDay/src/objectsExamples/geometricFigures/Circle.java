package objectsExamples.geometricFigures;

import static java.lang.Math.PI;
public class Circle {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    public double circleArea() {
        return PI * r * r;
    }

    public double CircleCircumference() {
        return 2 * PI * r;
    }
}
