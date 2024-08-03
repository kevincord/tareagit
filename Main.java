public class Main {
    public static void main(String[] args) {
        greet("Kevin");
        greet("");
    }

    public static void greet(String name) {
        if (name.isEmpty()) {
            System.out.println("Hola, Estraño!");
        } else {
            System.out.println("Hello, " + name + "!");
        }
    }
}
