public class ConditionInstructions {
    public static void main(String[] args) {
        float temperature = 38.5f;

        if (temperature > 36.6f) {
            System.out.println("You have fever!");
        } else if (temperature < 35.0f && temperature > 34.0f) {
            System.out.println("You have hypothermia!");
        } else if (temperature <= 34.0f) {
            System.out.println("Probably you are hibernated!");
        } else {
            System.out.println("You are super healthy!");
        }

        String animal = "cat";
        switch (animal) {
            case "cat":
                System.out.println("meow!");
            break;
            case "smallDog":
                System.out.println("woof!");
            case "dog":
                System.out.println("woof!");
            break;
            default:
                System.out.println("<no_voice>");
            break;
        }

        int a = 10;
        switch (a) {
            case 1:
                System.out.println(++a);
                break;
            case 2:
                a--;
                break;
            default:
                a += 2;
                break;
        }
        System.out.println(a);

        a = 5;
        System.out.println(++a);
        a = 5;
        System.out.println(a++);
        System.out.println(a);
        a = 5;
        System.out.println(a--);
        System.out.println(a);
        a = 5;
        System.out.println(--a);
    }
}
