import java.util.Scanner;

public class StringsTesting {
    public static void main(String[] args) {
//        String text1 = "This is a test";
//        String text2 = "This is a test";
//        text2 = "Some new text";
//
//        String val1 = text1.intern();           // zostanie pobrana wartość 'This is a test'
//        String val2 = text2.intern();           // zostanie pobrana wartość 'This is a test'
//
//        System.out.println(val1.equals(val2));

//        String text1 = "My name is ";
//        String text2 = "John Doe";
//        String finalText = text1 + text2;
//        String finalTextConcat = text1.concat(text2);
//        System.out.println(finalText);
//        System.out.println(finalTextConcat);
//        System.out.println(finalText == finalTextConcat);
//        System.out.println(finalText.equals(finalTextConcat));
//
//        String text3 = "This is ";
//        String text4 = "a test";
//        String finalText2 = text3.concat(text4);
//        System.out.println(finalText2);
//
//
//        finalText = finalText.toLowerCase();
////        System.out.println(finalText.toLowerCase());
//        System.out.println(finalText);
//
//        finalText = finalText.toUpperCase();
////        System.out.println(finalText.toLowerCase());
//        System.out.println(finalText);
//
//        System.out.println(finalText.indexOf("IS"));
//
//        System.out.println(finalText.replaceAll("Y", "INE"));
//        System.out.print(finalText.replaceAll("JOHN", "JOE"));
//
//        System.out.println("Podaj jakis tekst");
//        Scanner scan = new Scanner(System.in);
//        double textLine = scan.nextDouble();
////        boolean logicValue = scan.nextBoolean();
////
////        System.out.print("Wpisales nastepujacy tekst: " + logicValue + "\n");
////        System.out.println("Wpisales nastepujacy tekst: " + logicValue);
//
//        System.out.printf("100.0 / 3.0 = %5.2f\n", textLine);
//        System.out.printf("%10.10f\n", textLine);

        // Zadanie 1
        // przyjac dwa teksty przy uzyciu Scanner
        // wyswietlic nastepujace rzeczy:
        // konkatenacje tych dwoch Stringow
        // konkatenacje tych Stringow, gdzie pierwszy ma tylko duze litery a drugi tylko male
        // podac dlugosc kazdego z tych Stringow

        //Zadanie 2
        // przyjac jedna wartosc typu int
        // wyswietlic sume wszystkich elementow mniejszych lub rownych tej wartosci (wiekszych od 0)
        // w przypadku wartosci ujemnej wyswietlic sume wszystkich wiekszych elementow
        // (mniejszych od 0)

        String[] someCurseWords = {"123", "23", "12"};
        for (String someCurseWord: someCurseWords) {
            System.out.println("next word");
            System.out.println(someCurseWord.contains("123"));
            System.out.println(someCurseWord.contains("23"));
            System.out.println(someCurseWord.contains("12"));
            System.out.println(someCurseWord.contains("321"));
        }
        // Zadanie 3
        // przyjac 3 wartosci typu double
        // obliczyc ich srednia
        // zaokraglic wartosc w dol
        // wyswietlic liste liczb podniesionych do kwadratu mniejszych od tej sredniej
        // np. dla wartosci 1.5 2.5 3.0 wyswietlic 1
        // np. dla wartosci 75.5 30.8 90.1 wyswietlic 1, 4, 9, 16, 25, 36, 49, 64
        Scanner scanner = new Scanner(System.in);
        double firstValue = scanner.nextDouble();
        double secondValue = scanner.nextDouble();
        double thirdValue = scanner.nextDouble();
        double average = (firstValue + secondValue + thirdValue) / 3.0d;
        //int roundedAverage = (int)Math.floor(average);
        int roundedAverage = (int)average;
        int i = 1;
        //while (i*i < roundedAverage) {
        while (Math.pow(i, 2) < roundedAverage) {
            System.out.println(i * i);
            i++;
        }
    }


}
