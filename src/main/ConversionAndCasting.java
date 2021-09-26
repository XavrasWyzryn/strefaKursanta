public class ConversionAndCasting {
    public static void main(String[] args) {
        int number = 1;
        double firstDouble = 1.435d;
        firstDouble += number;
        System.out.println(firstDouble);

        number = (int) firstDouble;
        System.out.println(number);

        double n = 99.9989;
        int m = (int) n;
        System.out.println(m);

        double x = 99.9989;
        int y = (int) Math.round(x);
        System.out.println(y);

        double z = 99.9989;
        z = Math.round(z);
        System.out.println(z);

        char someLetter = 'e';
        int letterNumber = someLetter;
        char randomLetter = 102;
        System.out.println(someLetter);
        System.out.println((int)someLetter);
        System.out.println(letterNumber);
        System.out.println(randomLetter);

        float smallValue = 0.0000000001f;
        double bigValue = 1235436.01d;
        bigValue += smallValue;
        System.out.println(smallValue + bigValue);

        int bigNumber = 909097758;
        System.out.println(bigNumber);

        byte someByte = 3;
        short someShort = 5;
        someShort += someByte; // someShort = someShort + someByte;
        someShort += 1; // someShort++;
                        // someShort = someShort + 1;
        System.out.println(someShort);

        float testChar = 123.5f;
        char someChar = 'G';
        System.out.println((int)someChar);
        System.out.println(testChar + someChar);
        System.out.println((char)(testChar + someChar));
    }
}
