public class MultiplyGraphics {
    public static void main(String[] args) {
        for (int row = 1; row <= 10; row++) {
            for (int i = 1; i <= 10; i++) {
                int result = i * row;

                String resultFormat = String.format("%4s", result);

                if ((row % 10 == 0) && (i % 10 == 0)) {
                    System.out.println(resultFormat);
                } else {
                    System.out.print(resultFormat + " |");
                }

            }
            System.out.println();
        }
    }
}
