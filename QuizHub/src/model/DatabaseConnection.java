package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class DatabaseConnection {
    private static final String URL = "jdbc:sqlserver://localhost;databaseName=QuizHub";
    private static final String USER = "username";
    private static final String PASSWORD = "password";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static Connection connect() {
        Connection conn = null;
        try {
            // Establish connection
            conn = DriverManager.getConnection(URL);
            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e) {
            System.out.println("Error connecting to SQLite: " + e.getMessage());
        }
        return conn;
    }
}
