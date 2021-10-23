package objectsExamples.geometricFigures;

public class Square {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double circumference() {
        return 4 * a;
    }

    public double area() {
        return a * a;
    }
}
