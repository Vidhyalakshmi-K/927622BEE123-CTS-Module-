import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("Enter ID for student " + (i + 1) + ": ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter name for student " + (i + 1) + ": ");
            String name = sc.nextLine();
            students.put(id, name);
        }

        
        System.out.print("Enter ID to search for student name: ");
        int searchId = sc.nextInt();
        String result = students.get(searchId);

        if (result != null) {
            System.out.println("Student Name: " + result);
        } else {
            System.out.println("Student ID not found.");
        }

        sc.close();
    }
}
 
