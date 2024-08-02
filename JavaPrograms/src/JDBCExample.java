import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) {
        //establish the database connection
        // 1. url, username password database name
        String username = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3310/javaTraining";
        //to maek the connection
        try {
            Connection conn = DriverManager.getConnection(url, username,
                    password);
            System.out.println("Database connection established");

            // to delete the data
            //String deleteQuery = "delete from  Trainer " + "where Sno = 1";
            //PreparedStatement stmt = conn.prepareStatement(deleteQuery);


            //to insert the data
            String insertQuery= "INSERT INTO Trainer(Tname, Temail,Tmobile, Ttechnology, Taddress) VALUES (?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(insertQuery);

//            stmt.setString(1,"Pawan");
//            stmt.setString(2,"demo@gmail.com");
//            stmt.setString(3,"mobile");
//            stmt.setString(4,"technology");
//            stmt.setString(5,"address");
            stmt.execute();
        } catch (SQLException e) {
            throw new RuntimeException("Db not connected "+e);
        }

    }
}
