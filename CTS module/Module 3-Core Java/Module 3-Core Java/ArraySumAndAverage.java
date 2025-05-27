import java.util.Scanner;

public class ArraySumAndAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Number of elements should be positive.");
        } else {
            int[] arr = new int[n];
            int sum = 0;

            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }

            double average = (double) sum / n;

            System.out.println("Sum of elements: " + sum);
            System.out.println("Average of elements: " + average);
        }

        sc.close();
    }
}
