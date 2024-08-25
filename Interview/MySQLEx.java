import java.sql.*;
public class MySQLEx {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/vit";
        String username="root";
        String password="password";
        try {
            String query="SHOW DATABASES";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection(url,username,password);
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            System.out.println("Databases:");
            while(rs.next()){
                System.out.println(rs.getString(1));
            }
            conn.close();            
        } catch (Exception e) {
           System.out.println(e);
        }
    }
}
