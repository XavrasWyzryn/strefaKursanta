package innerClasses;

public class InnerClassesRunner {
    public static void main(String[] args) {
        OutterClass outterClass = new OutterClass();
        OutterClass.MyInnerClass innerClass =
                outterClass.new MyInnerClass();
        OutterClass.MyInnerStaticClass innerStaticClass =
                new OutterClass.MyInnerStaticClass();
    }
}
