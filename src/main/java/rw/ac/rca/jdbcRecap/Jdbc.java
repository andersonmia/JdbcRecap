package rw.ac.rca.jdbcRecap;
import java.sql.*;
public class Jdbc {
    public static void main(String [] args) throws Exception{

        String url="jdbc:mysql://localhost:3306/jdbcRecap?characterEncoding=utf8";
        String username = "root";
        String password = "root";
        String query = "SELECT * FROM users";

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url,username,password);
        System.out.println("CONNECTION ESTABLISHED...");

        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        //display the data
        while (resultSet.next()){

            int id = resultSet.getInt(1);
            String firstname = resultSet.getString(2);
            String lastname = resultSet.getString(3);

            System.out.print(id+"\t");
            System.out.print(firstname+"\t");
            System.out.print(lastname+"\t");
            System.out.println("\n");
        }

        resultSet.close();
        statement.close();
        connection.close();

    }
}
