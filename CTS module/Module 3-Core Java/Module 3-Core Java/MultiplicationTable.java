import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for a number
        System.out.print("Enter a number to print its multiplication table: ");
        int number = sc.nextInt();

        
        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            int product = number * i;
            System.out.println(number + " x " + i + " = " + product);
        }

        sc.close();
    }
}
