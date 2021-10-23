package objectsExamples.geometricUtils;

import objectsExamples.geometricFigures.Square;

public class GeometricUtils {
    public static boolean isCircumferenceBigger(Square squareA, Square squareB) {
        return squareA.circumference() > squareB.circumference();
    }
    public static boolean isAreaBigger(Square squareA, Square squareB) {
        return squareA.area() > squareB.area();
    }

}
