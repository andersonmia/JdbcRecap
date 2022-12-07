# JdbcRecap
Establishing a database connection using Java-Database Connectivity

 -- Import packages required: In this case, we have to import java.sql.*;
 -- We have to load the Driver by setting it as the build path (a tar file) 
 -- Next is registering the Driver in the code: This is done by implementing the forName() method. Class.forName("com.mysql.jdbc.Driver");
    The string in the quotes is the driver you'll be using...
 -- Establish a connection by impelementing the getConnection() method which is implemented in the DriverManager class.
    Connection con=  DriverManager.getConnection();
 -- Create a statement: Statement st = con.createStatement();
 -- Exceute the query: ResultSet rs = st.executeQuery(SQLquery); //in case you want to perform a select operation
 
    int rs = st.executeUpdate(SQLquery); //in case you want to perform an insert, or delete, or update operation. remember that we use an integer in this       case
-- Process the results: rs.next(); //for the first time, it moves the cursor to the first row, then for the other times like in a loop, it moves it to the    next row.
   You can display the data read or anything as you wish
   
 --Close the connection#
    rs.close(); //in case rs is an instance of ResultSet, not when it is an integer
    st.close();
    con.close();

 
 
