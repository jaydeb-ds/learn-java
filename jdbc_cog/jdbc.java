/*----------------------------------------------------
 Program : JDBC Table Creation Example
 Purpose : Create a Student table using JDBC
----------------------------------------------------*/

import java.io.*;
import java.sql.*;

class jdbcdemo
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

            // Execute SQL Query
            st.executeUpdate("create table Student(SID INTEGER,SNAME VARCHAR(30),SROLL INTEGER)");

            // Display Success Message
            System.out.println("Table Created Successfully");

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