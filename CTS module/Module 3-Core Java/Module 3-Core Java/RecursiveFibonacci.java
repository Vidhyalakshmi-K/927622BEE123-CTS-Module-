import java.util.Scanner;

public class RecursiveFibonacci {


    public static int fibonacci(int n) {
        if (n == 0) return 0;          
        if (n == 1) return 1;          
        return fibonacci(n - 1) + fibonacci(n - 2); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer (n): ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Invalid input! Please enter a positive integer.");
        } else {
            int result = fibonacci(n);
            System.out.println("Fibonacci number at position " + n + " is: " + result);
        }

        sc.close();
    }
}
