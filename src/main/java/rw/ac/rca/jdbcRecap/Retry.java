package rw.ac.rca.jdbcRecap;
/*
 * Import the package
 * Load the driver and register it
 * Establish connection
 * Create a statement
 * Execute the query
 * Process the results
 * Close the connection
 */
import java.sql.*;
public class Retry {
    public static void main(String[] args) throws Exception{
        String url = "jdbc:mysql://localhost:3306/jdbcRecap?characterEncoding=utf8";
        String username = "root";
        String password = "root";
        String[] queries ={
                "INSERT INTO users(first,last) values('Gaudence','Majura')",
                "INSERT INTO users(first,last) values('Mia','Anderson')",
                "INSERT INTO users(first,last) values('Daisy','Gonzalez')",
                "INSERT INTO users(first,last) values('Divine','Ingabire')"
        } ;
        String query = "";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();

        for (int i=0; i<queries.length; i++){
        query = queries[i];
        //in order to insert, we use an integer
        int rs = st.executeUpdate(query);
        System.out.println("Data Inserted...");

        }
        st.close();
        System.out.println("Statement closed...");
        System.out.println("Closing connection...");
        con.close();
    }
}
