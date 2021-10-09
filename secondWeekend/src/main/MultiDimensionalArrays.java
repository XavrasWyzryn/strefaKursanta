import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int[][] myArray = new int[3][];
        int[] firstColumn = new int[]{1, 2};
        int[] secondColumn = new int[]{3, 4, 5};
        int[] thirdColumn = new int[]{6, 7, 8, 9};
//        int[][] myArray = {{1, 2}, {3, 4, 5}, {6, 7, 8, 9}}; // alternative way o initialization
        myArray[0] = firstColumn;
        myArray[1] = secondColumn;
        myArray[2] = thirdColumn;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }

        int[][][] generatedNumber = new int[4][4][];
        for (int i = 0; i < generatedNumber.length; i++) {
            for (int j = 0; j < generatedNumber[i].length; j++) {
//                for (int k = 0; k < generatedNumber[i][j].length; k++) {
//                    generatedNumber[i][j][k] = i + j + k;
//                    System.out.print(generatedNumber[i][j][k] + " ");
//                }
                int[] array = {1, 2, 3, 4};
                generatedNumber[i][j] = array;
                System.out.println(Arrays.toString(array));
            }
            System.out.println("\n");
        }
    }
}
