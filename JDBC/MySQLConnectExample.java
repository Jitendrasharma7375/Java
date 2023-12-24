import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnectExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/vit";
        String username = "root";
        String password = "1234";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            Connection connection = DriverManager.getConnection(url, username, password);
            String query="Show tables;";
            Statement statement=connection.createStatement();
            statement.executeQuery(query);
            System.out.println("connection sucessfull.");
            connection.close();

                // Class.forName("com.mysql.cj.jdbc.Driver");
                // Connection connection = DriverManager.getConnection(url, username, password);
                // PreparedStatement preparedStatement = connection.prepareStatement(query);
                // preparedStatement.setLong(1, aadhar);
                // preparedStatement.setString(2, name);
                // preparedStatement.setLong(3, mobile);
                // preparedStatement.setString(4, gender);
                // preparedStatement.setString(5, dob);
                // preparedStatement.setString(6, address);
                // preparedStatement.setString(7, gmail); // Set the Gmail address in the query

                // int rowsAffected = preparedStatement.executeUpdate();
                // if (rowsAffected > 0) {
                //     screen.setText("Insert Successfully");
                // } else {
                //     screen.setText("Insert Failed");
                // }
                // connection.close();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
