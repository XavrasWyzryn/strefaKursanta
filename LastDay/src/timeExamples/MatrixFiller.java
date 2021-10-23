package timeExamples;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Random;

public class MatrixFiller {
    public static Duration timeToFill(int matrixSize) {
        long[][] matrix = new long[matrixSize][matrixSize];
        Random random = new Random();
        LocalTime start = LocalTime.now();
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrix[i][j] = random.nextLong();
            }
        }
        return Duration.between(start, LocalTime.now());
    }
}
