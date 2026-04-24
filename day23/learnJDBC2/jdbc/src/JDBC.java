import java.sql.*;

public class JDBC {
    public static void main(String[] args) {

        try {
            // Load driver (IMPORTANT)
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("Connecting to database...");

            // Connection (no DB needed for CREATE DATABASE)
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306", "root", "Jaydeb!1234"
            );

            System.out.println("Connected successfully!");

            // Create statement
            Statement stmt = con.createStatement();

            // Correct method
            stmt.executeUpdate("CREATE DATABASE JDBC");

            System.out.println("Database created successfully!");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// javac -cp ".;..\lib\mysql-connector-j-9.7.0.jar" JDBC.java
// java -cp ".;..\lib\mysql-connector-j-9.7.0.jar" JDBC