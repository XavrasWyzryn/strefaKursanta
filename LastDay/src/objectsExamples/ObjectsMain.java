package objectsExamples;

import objectsExamples.geometricFigures.Square;
import objectsExamples.geometricUtils.GeometricUtils;

public class ObjectsMain {
    public static void main(String[] args) {
        // Zadanie
        // Zrobic klasy dla figur geometrycznych:
        // 1. kwadrat
        // 2. prostokat
        // 3. trojkat
        // (pole trojkata przy znanych trzech bokach
        // pierwiastek z p(p-a)(p-b)(p-c), gdzie P to polowa obwodu)
        // 4. kolo
        // dla kazdej z tych klas stworzyc odpowiednia ilosc
        // pol potrzebnych do opisu figury (np. dla kola dlugosc promienia)
        // stworzyc dla tych klas metody obliczajace pole i obwod
        // do tego stworzyc klase GeometricUtils, ktora ma
        // statyczne metody takie jak:
        // 1. sprawdzenie, ktora figura ma wiekszy obwod
        // 2. sprawdzenie, ktora figura ma wieksze pole
        //
        // dodac w konstruktorze trojkata sprawdzenie, czy trojkat o takich
        // bokach ma prawo istniec, jesli nie - zwrocic null


        Square a = new Square(10.0);
        Square b = new Square(8.0);
        System.out.println(a.area());
        System.out.println(a.circumference());
        System.out.println(GeometricUtils.isAreaBigger(a, b));
        System.out.println(GeometricUtils.isAreaBigger(b, a));
    }
}
