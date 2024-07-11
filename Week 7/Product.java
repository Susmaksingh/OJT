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
import java.sql.Statement;

public class Product {

    // JDBC URL, username, and password of MySQL server
    private static final String URL = "jdbc:mysql://localhost:3307/";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        String databaseName = "InventoryDB";
        String tableName = "Products";

        try {
            // Establishing a connection to the MySQL database
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);

            // Creating a new database
            createDatabase(connection, databaseName);

            // Switch to the newly created database
            connection.setCatalog(databaseName);

            // Creating a table within the database
            createTable(connection, tableName);

            // Closing the connection
            connection.close();

            System.out.println("Database and table created successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to create a new database
    private static void createDatabase(Connection connection, String databaseName) throws SQLException {
        String createDatabaseSQL = "CREATE DATABASE IF NOT EXISTS " + databaseName;
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(createDatabaseSQL);
            System.out.println("Database '" + databaseName + "' created successfully.");
        }
    }

    // Method to create a new table within the database
    private static void createTable(Connection connection, String tableName) throws SQLException {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS " + tableName + " (" +
                                "product_id INT AUTO_INCREMENT PRIMARY KEY, " +
                                "product_name VARCHAR(255) NOT NULL, " +
                                "price DOUBLE NOT NULL, " +
                                "stock_quantity INT NOT NULL)";
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(createTableSQL);
            System.out.println("Table '" + tableName + "' created successfully.");
        }
    }
}

