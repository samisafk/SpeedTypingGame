package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private final String jdbcUrl = "jdbc:mysql://localhost:3306/MySQL81"; // Change to your database
    private final String jdbcUser = "Matrix"; // Your MySQL username
    private final String jdbcPass = "heersam1524"; // Your MySQL password

    private Connection connection;

    public Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPass);
            } catch (SQLException e) {
                System.err.println("Failed to connect to database: " + e.getMessage());
            }
        }
        return connection;
    }

    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                System.err.println("Failed to close connection: " + e.getMessage());
            }
        }
    }
}

