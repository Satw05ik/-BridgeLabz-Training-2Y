package com.example.srms.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseUtil {
    private static final String URL = "jdbc:h2:./data/srms";
    private static final String USER = "sa";
    private static final String PASS = "";

    static {
        try (Connection conn = getConnection(); Statement stmt = conn.createStatement()) {
            // create tables if not exists
            stmt.execute("CREATE TABLE IF NOT EXISTS student (student_id INT PRIMARY KEY, name VARCHAR(100), course VARCHAR(100))");
            stmt.execute("CREATE TABLE IF NOT EXISTS result (student_id INT PRIMARY KEY, marks INT, grade VARCHAR(10), FOREIGN KEY (student_id) REFERENCES student(student_id) ON DELETE CASCADE)");
        } catch (SQLException e) {
            System.err.println("Failed to initialize database: " + e.getMessage());
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
