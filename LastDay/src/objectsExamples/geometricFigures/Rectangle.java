package objectsExamples.geometricFigures;

public class Rectangle {
    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double circumference() {
        return 2 * (this.a + this.b);
    }

    public double area() {
        return this.a * this.b;
    }
}
