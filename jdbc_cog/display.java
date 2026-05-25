/*----------------------------------------------------
 Program : JDBC Display Record Example
 Purpose : Display records from Employee table
----------------------------------------------------*/

import java.io.*;
import java.sql.*;

class jdbcdisplayrecord
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

            // Execute Select Query
            ResultSet res =
                st.executeQuery("select * from Employee");

            // Display Records
            while(res.next())
            {
                System.out.println("Employee Code : "
                                   + res.getInt(1));

                System.out.println("Employee Name : "
                                   + res.getString(2));

                System.out.println("Employee Salary : "
                                   + res.getInt(3));
            }

            // Success Message
            System.out.println("Record Displayed Successfully");

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