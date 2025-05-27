
public class BytecodeDemo {
    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        BytecodeDemo obj = new BytecodeDemo();
        int result = obj.multiply(4, 5);
        System.out.println("Result: " + result);
    }
}
