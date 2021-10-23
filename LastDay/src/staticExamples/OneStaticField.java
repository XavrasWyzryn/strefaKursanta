package staticExamples;

public class OneStaticField {
    private static int counter = 0;

    private int random = 10;

    public OneStaticField() {
        counter++;
    }

    public int getRandom() {
        return random;
    }

    public void setRandom(int random) {
        this.random = random;
    }

    public static int getCounter() {
        return counter;
    }
}
