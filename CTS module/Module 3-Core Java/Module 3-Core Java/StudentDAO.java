import java.sql.*;

public class StudentDAO {
    private static final String URL = "jdbc:sqlite:students.db";

 
    public void insertStudent(String name, int age) {
        String sql = "INSERT INTO students (name, age) VALUES (?, ?)";

        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, name);
            pstmt.setInt(2, age);

            int rowsInserted = pstmt.executeUpdate();
            System.out.println(rowsInserted + " row(s) inserted.");

        } catch (SQLException e) {
            System.out.println("Insert error: " + e.getMessage());
        }
    }

    
    public void updateStudentAge(int id, int newAge) {
        String sql = "UPDATE students SET age = ? WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, newAge);
            pstmt.setInt(2, id);

            int rowsUpdated = pstmt.executeUpdate();
            System.out.println(rowsUpdated + " row(s) updated.");

        } catch (SQLException e) {
            System.out.println("Update error: " + e.getMessage());
        }
    }


    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();

        dao.insertStudent("Charlie", 23);

        dao.updateStudentAge(1, 25);
    }
}
