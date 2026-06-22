/*----------------------------------------------------
 Program : JDBC Insert Record Example
 Purpose : Insert a record into Employee table
----------------------------------------------------*/

import java.io.*;
import java.sql.*;

class jdbcinsertrecord
{
    public static void main(String[] args)
            throws IOException, ClassNotFoundException
    {
        try
        {
            // Load JDBC-ODBC Driver
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

            // Establish Connection
            Connection con =
                DriverManager.getConnection("jdbc:odbc:BATCH");

            // Create Statement Object
            Statement st = con.createStatement();

            // Execute Insert Query
            st.executeUpdate("insert into Employee values(111,'Jaydeb Das',12500)");

            // Display Success Message
            System.out.println("Record Inserted Successfully");

            // Close Connection
            st.close();
            con.close();
        }

        catch(Exception ex)
        {
            System.out.println("Connection Failed");
        }
    }
}