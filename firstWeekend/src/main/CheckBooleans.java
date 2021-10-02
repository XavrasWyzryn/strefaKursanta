public class CheckBooleans {
    public static void main(String[] args) {
        System.out.println("Test conjunction");
        System.out.println(false && true);
        System.out.println(false && false);
        System.out.println(true && true);
        System.out.println(true && false);

        System.out.println("Test alternative");
        System.out.println(false || true);
        System.out.println(false || false);
        System.out.println(true || true);
        System.out.println(true || false);

        System.out.println("Test negative");
        System.out.println(!false);
        System.out.println(!true);

        System.out.println("Test alternative negation is conjunction of negations");
        System.out.println(!(false || false) == (!false && !false));
        System.out.println(!(false || true) == (!false && !true));
        System.out.println(!(true || false) == (!true && !false));
        System.out.println(!(true || true) == (!true && !true));

        System.out.println("Test conjuction negation is alternative of negations");
        System.out.println(!(false && false) == (!false || !false));
        System.out.println(!(false && true) == (!false || !true));
        System.out.println(!(true && false) == (!true || !false));
        System.out.println(!(true && true) == (!true || !true));
    }
}
