package staticExamples;

import java.time.LocalTime;

import static staticExamples.OneStaticField.getCounter;
import static staticExamples.StaticUtils.showHourAndMinuteOnly;
import static staticExamples.StaticUtils.showHourMinuteSecond;

public class StaticsMain {
    public static void main(String[] args) {
        showHourAndMinuteOnly(LocalTime.now());
        showHourMinuteSecond(LocalTime.now());
        System.out.println(StaticUtils.hourAndMinutePattern);

//        OneStaticField objectOne = new OneStaticField();
//        System.out.println(getCounter());
//        OneStaticField objectTwo = new OneStaticField();
//        System.out.println(getCounter());
//        OneStaticField objectThree = new OneStaticField();
//        System.out.println(getCounter());
//        OneStaticField objectFour = new OneStaticField();
//        System.out.println(getCounter());

        OneStaticField[] fields = new OneStaticField[10];
        System.out.println(getCounter());
        for (int i = 0; i < fields.length; i++) {
            OneStaticField dummy = new OneStaticField();
            fields[i] = dummy;
        }
        System.out.println(getCounter());
        fields[0].setRandom(20);
        fields[1].setRandom(30);
        for (OneStaticField field: fields) {
            System.out.print(field.getRandom() + ", ");
        }
    }
}
