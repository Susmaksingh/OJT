/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

/**
 *
 * @author abcde
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCCrudExample {
    private static final String URL = "jdbc:mysql://localhost:3307/EmployeeData";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            // Create a record
            createRecord(connection, "sksingh", "sk123@gmail.com");
            createRecord(connection, "Sri", "sri123@gmail.com");
            createRecord(connection, "sikhasingh", "sikha123@gmail.com");
            // Read records
            readRecords(connection);
            // Update a record
            updateRecord(connection, 1, "sksingh_updated", "sk123_updated@gmail.com");
            // Delete a record
            deleteRecord(connection, 1);
            // Close the connection
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Create a new record
    public static void createRecord(Connection connection, String name, String email) throws SQLException {
        String insertSQL = "INSERT INTO users (name, email) VALUES (?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
        preparedStatement.setString(1, name);
        preparedStatement.setString(2, email);
        preparedStatement.executeUpdate();
        System.out.println("Record created successfully");
    }

    // Read records from the database
    private static void readRecords(Connection connection) throws SQLException {
        String selectSQL = "SELECT * FROM users";
        PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String email = resultSet.getString("email");
            System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
        }
    }

    // Update the records
    private static void updateRecord(Connection connection, int id, String name, String email) throws SQLException {
        String updateSQL = "UPDATE users SET name = ?, email = ? WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(updateSQL);
        preparedStatement.setString(1, name);
        preparedStatement.setString(2, email);
        preparedStatement.setInt(3, id);
        preparedStatement.executeUpdate();
        System.out.println("Record updated successfully");
    }

    // Delete a record
    private static void deleteRecord(Connection connection, int id) throws SQLException {
        String deleteSQL = "DELETE FROM users WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL);
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
        System.out.println("Record deleted successfully");
    }
}
