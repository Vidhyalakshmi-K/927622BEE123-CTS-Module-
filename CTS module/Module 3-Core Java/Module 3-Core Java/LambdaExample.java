import java.util.*;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("John", "Alice", "Bob", "Diana"));

        Collections.sort(names, (a, b) -> a.compareTo(b));

        for (String name : names) {
            System.out.println(name);
        }
    }
}
