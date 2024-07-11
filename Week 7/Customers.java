/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

/**
 *
 * @author abcde
 */
import java.sql.*;

public class Customers {

    public static final String URL = "jdbc:mysql://localhost:3307/CustomerDB";
    public static final String USER = "root";
    public static final String PASSWORD = "";

    public static void main(String[] args) {
        Connection connection = null;

        try {
            // Establishing a connection
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            
            // Inserting records
            insertRecords(connection);

            // Retrieving and printing records
            retrieveAndPrintRecords(connection);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Closing the connection
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // Method to insert records into Customers table
    private static void insertRecords(Connection connection) throws SQLException {
        // Sample data
        String[] customerNames = {"1", "Head First Java", "Kathy Sierra & Bert Bates"};
        String[] cities = {"Asansol", "Patna", "Kolkata"};

        String insertSQL = "INSERT INTO Customers (customer_name, city) VALUES (?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insertSQL, Statement.RETURN_GENERATED_KEYS);

        // Insert each record
        for (int i = 0; i < customerNames.length; i++) {
            preparedStatement.setString(1, customerNames[i]);
            preparedStatement.setString(2, cities[i]);
            preparedStatement.executeUpdate();
        }

        System.out.println("Records inserted successfully.");
    }

    // Method to retrieve and print all records from Customers table
    private static void retrieveAndPrintRecords(Connection connection) throws SQLException {
        String selectSQL = "SELECT * FROM Customers";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(selectSQL);

        System.out.println("Customer Records:");
        while (resultSet.next()) {
            int customerId = resultSet.getInt("customer_id");
            String customerName = resultSet.getString("customer_name");
            String city = resultSet.getString("city");
            System.out.println("ID: " + customerId + ", Name: " + customerName + ", City: " + city);
        }
    }
}
