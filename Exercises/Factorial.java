// Przykład rekurencji
class Factorial {
    // Metoda rekurencyjna
    int factR(int n) {
        int result;
        if(n==1) return 1;
        result = factR(n-1) * n;
        System.out.println(result);
        return result;
    }

/*  // Odpowiednik iteracyjny
  int factI(int n) {
    int t, result;

    result = 1;
    for(t=1; t <= n; t++) result *= t;
    return result;
}  */
}

class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.out.println("Silnia wyliczona przez metodę rekurencyjną.");
        /*   System.out.println("Silnia 3 wynosi " + f.factR(3));  */
        System.out.println("Silnia 4 wynosi " + f.factR(4));
/*    System.out.println("Silnia 5 wynosi " + f.factR(5));
    System.out.println();
 */
/*    System.out.println("Silnia wyliczona przez metodę iteracyjną.");
    System.out.println("Silnia 3 wynosi " + f.factI(3));
    System.out.println("Silnia 4 wynosi " + f.factI(4));
    System.out.println("Silnia 5 wynosi " + f.factI(5)); */
    }
}

