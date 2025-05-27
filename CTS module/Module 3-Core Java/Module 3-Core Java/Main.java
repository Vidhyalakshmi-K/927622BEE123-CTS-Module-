
class StringUtils {
    public static String greet(String name) {
        return "Hello, " + name + "!";
    }
}


public class Main {
    public static void main(String[] args) {
        String message = StringUtils.greet("Alice");
        System.out.println(message);
    }
}
