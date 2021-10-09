import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] firstIntArray = new int[4];
        System.out.println(firstIntArray[0]);
//        this will throw OutOfBoundException
//        System.out.println(firstIntArray[4]);

        int[] secondIntArray = new int[]{1, 2, 3};
        System.out.println(secondIntArray[2]);

        String[] firstStringArray = new String[6];
        System.out.println(firstStringArray[0]);

        String[] secondStringArray = new String[]{"", "", ""};
        System.out.println(secondStringArray[1]);

        String[] imiona = new String[4];
        imiona[0] = "Jan";
        imiona[3] = "roman";
        System.out.println("Element numer 1: " + imiona[0]); // Element numer 1: Jan
        System.out.println("Element numer 2: " + imiona[1]); // Element numer 2: null
        System.out.println("Element numer 3: " + imiona[2]); // Element numer 3: null
        System.out.println("Element numer 4: " + imiona[3]); // Element numer 4: roman

        int arraySize = 5;
        long[] firstLongArray = new long[arraySize];
        firstLongArray[0] = 1;
        firstLongArray[2] = 2;
        firstLongArray[4] = 3;
        for (int i = 0; i < arraySize; i++) {
            System.out.println(firstLongArray[i]); // wez i-ty element z tablicy
        }

        System.out.println(Arrays.toString(firstLongArray));
        System.out.println(firstLongArray.length);

        double[] firstDoubleArray = new double[]{1.2d, 3.5d, 20.0d};
        for (int i = 0; i < firstDoubleArray.length; i++) {
            System.out.println(firstDoubleArray[i]);
        }
    }
}
