import java.sql.*;

public class SimpleJDBCExample {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:students.db"; // SQLite database file

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                System.out.println("Connected to the database.");

       
                String createTable = "CREATE TABLE IF NOT EXISTS students (id INTEGER PRIMARY KEY, name TEXT, age INTEGER)";
                try (Statement stmt = conn.createStatement()) {
                    stmt.execute(createTable);
                }

                
                String insertData = "INSERT INTO students (name, age) VALUES ('Alice', 20), ('Bob', 22)";
                try (Statement stmt = conn.createStatement()) {
                    stmt.executeUpdate(insertData);
                } catch (SQLException e) {
                   
                }

                
                String query = "SELECT * FROM students";
                try (Statement stmt = conn.createStatement();
                     ResultSet rs = stmt.executeQuery(query)) {

                    while (rs.next()) {
                        int id = rs.getInt("id");
                        String name = rs.getString("name");
                        int age = rs.getInt("age");
                        System.out.println(id + ": " + name + " (" + age + ")");
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
