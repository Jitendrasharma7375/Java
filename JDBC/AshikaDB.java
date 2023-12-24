import java.sql.*;
public class AshikaDB
{
    public static void main(String[] args) {
        String username="root";
        String password="1234";
        String query="SHOW DATABASES";
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/vit",username,password);
            Statement stmt=connection.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            System.out.println("Connection successful");
            while(rs.next())
            {
                System.out.println(rs.getString(1));
            }
            connection.close();
        }
        catch (Exception e) 
        {
            System.out.println("Error "+e.getMessage());
        }
    }
}