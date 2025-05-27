public class PatternMatchingSwitch {
    public static void checkType(Object obj) {
        switch (obj) {
            case Integer i -> System.out.println("It's an Integer with value: " + i);
            case String s -> System.out.println("It's a String with value: " + s);
            case Double d -> System.out.println("It's a Double with value: " + d);
            case null -> System.out.println("It's null");
            default -> System.out.println("Unknown type: " + obj.getClass().getSimpleName());
        }
    }

    public static void main(String[] args) {
        checkType(10);
        checkType("Hello");
        checkType(3.14);
        checkType(true);
        checkType(null);
    }
}
