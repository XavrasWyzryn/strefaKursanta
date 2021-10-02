public class HelloWorld {
    public static void main(String[] args) {
        boolean isTrue = true;
        boolean isFalse = false;
                        boolean checkConjunction = isFalse && isTrue;
                        System.out.println(checkConjunction);
                        boolean checkAlternative = isFalse || isTrue;
                        System.out.println(checkAlternative);
                        isTrue = isFalse;
        isTrue = isFalse || checkAlternative;

        boolean checkNotAlternative = !isFalse && !isTrue;
        boolean checkNotAlternative2 = !checkAlternative;
        System.out.println(checkNotAlternative == checkNotAlternative2); // always returns true




        int number = 6 + 4 - 3 * 2;
        number = 1;
        number++;
        System.out.println(number);
        System.out.println(number++);
        number = 3;
        System.out.println(number--);
        System.out.println(number);
        number = 1;
        System.out.println(++number);
        System.out.println(--number);


        System.out.println("\n\n");
        number = 1;
        int secondNumber = 2;
        System.out.println(secondNumber == number);
        System.out.println(secondNumber != number);
        secondNumber = 1;
        System.out.println(secondNumber == number);
        System.out.println(secondNumber != number);
        int thirdNumber = 2;
        System.out.println("\n");
        System.out.println(thirdNumber < number);
        System.out.println(thirdNumber > number);
        System.out.println(secondNumber <= number);
        System.out.println(secondNumber >= number);


        System.out.println("\n\n");
        number--;
        number += 3;
        float amount = 5.345f;
        System.out.println(number);
        number = 7;
        number *= 7;
        System.out.println(number);number = 7;
        number -= 7;
        System.out.println(number);number = 7;
        number /= 7;
        System.out.println(number);
        number = 11 % 3;
        System.out.println(number);
        double newDouble = 6.812d;
        String charTable = "Something to test\nNew line\tSecond new line";
        System.out.println(charTable);



        char letterY = 'A';
        System.out.println(letterY);
        int letterUnicodeNumber = letterY;
        System.out.println(letterUnicodeNumber);
    }
}
