import java.sql.*;

public class AccountDAO {
    private static final String URL = "jdbc:sqlite:bank.db"; 

    public void transferMoney(int fromAccountId, int toAccountId, double amount) {
        String debitSQL = "UPDATE accounts SET balance = balance - ? WHERE id = ?";
        String creditSQL = "UPDATE accounts SET balance = balance + ? WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(URL)) {
            conn.setAutoCommit(false);  

            try (PreparedStatement debitStmt = conn.prepareStatement(debitSQL);
                 PreparedStatement creditStmt = conn.prepareStatement(creditSQL)) {

                
                debitStmt.setDouble(1, amount);
                debitStmt.setInt(2, fromAccountId);
                int rowsDebited = debitStmt.executeUpdate();

         
                creditStmt.setDouble(1, amount);
                creditStmt.setInt(2, toAccountId);
                int rowsCredited = creditStmt.executeUpdate();

                if (rowsDebited == 1 && rowsCredited == 1) {
                    conn.commit();
                    System.out.println("Transfer successful!");
                } else {
                    conn.rollback();
                    System.out.println("Transfer failed, transaction rolled back.");
                }

            } catch (SQLException e) {
                conn.rollback();
                System.out.println("Error during transfer, transaction rolled back.");
                e.printStackTrace();
            }

        } catch (SQLException e) {
            System.out.println("Connection error: " + e.getMessage());
        }
    }

    
    public static void main(String[] args) {
        AccountDAO dao = new AccountDAO();

        dao.transferMoney(1, 2, 100.0);
    }
}
