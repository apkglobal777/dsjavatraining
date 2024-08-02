import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String username="root";
        String password="";
        String url="jdbc:mysql://localhost:3310/expencedb";
        try {

            Connection conn= DriverManager.getConnection(url, username, password);
            System.out.println("Connected");
            String insertdata = " insert into expencetb"
                    + " values (?,?)";
            PreparedStatement preparedStmt = conn.prepareStatement(insertdata);
            preparedStmt.setString(1,"food");
            preparedStmt.setInt(2,100);
            preparedStmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}