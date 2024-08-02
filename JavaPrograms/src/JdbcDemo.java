import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcDemo {
    public static void main(String[] args) {
        String username="root";
        String password="";
        String url="jdbc:mysql://localhost:3309/javabatch2";
        try {
            Connection c= DriverManager.getConnection( url,username,password);
            System.out.println("Database Connected");
        } catch (SQLException e) {
            throw new RuntimeException(e+ "not connected");
        }
    }
}
