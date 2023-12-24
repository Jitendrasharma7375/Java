import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDB {
    public static void main(String[] args) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vit","root","1234");
                Statement stmt=connection.createStatement();
                ResultSet rs = stmt.executeQuery("SHOW DATABASES");
                System.out.println("Connection successful");
                while(rs.next()){
                    System.out.println(rs.getString(1));
                }
            } catch (SQLException | ClassNotFoundException e) {
                System.out.println("Connection unsuccessful "+e.getMessage());
            }
        
    }
}
