/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ojt.swingapp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

/**
 *
 * @author abcde
 */
public class SwingApp extends JFrame {
    
    //database connection details
    private static final String URL="jdbc:mysql://localhost:3307/mydatabase";
    private static final String USER="root";
    private static final String PASSWORD="";
    
    //from comnents
    private JTextField nameField;
    private JTextField emailField;
    private JButton createButton;
    private JButton readButton;
    private JButton updateButton;
    private JButton deleteButton;
    private JTextArea resultArea;
    
    public SwingApp(){
        //set up the form
        setTitle("CRUD Operation");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        JLabel nameLabel=new JLabel("Name:");
        nameLabel.setBounds(20,20,80,25);
        add(nameLabel);
        
        nameField = new JTextField();
        nameField.setBounds(100, 20, 165, 25);
        add(nameField);
        
        JLabel emailLabel = new JLabel("Email");
        emailLabel.setBounds(20, 50, 80, 25);
        add(emailLabel);
        
        emailField =new JTextField();
        emailField.setBounds(100, 50, 165, 25);
        add(emailField);
        
        createButton= new JButton("Create");
        createButton.setBounds(20, 80, 80, 25);
        add(createButton);
        
        readButton = new JButton("Read");
        readButton.setBounds(110, 80, 80, 25);
        add(readButton);
        updateButton= new JButton("Update");
        updateButton.setBounds(200, 80, 80, 25);
        add(updateButton);
        
        deleteButton = new JButton("Delete");
        deleteButton.setBounds(290, 80, 80, 25);
        add(deleteButton);
        
        resultArea = new JTextArea();
        resultArea.setBounds(20, 110, 350, 230);
        add(resultArea);
        
        //Setup button actions
        
        createButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                createUser(nameField.getText(), emailField.getText());
            }
        });
        
        readButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 readUsers();
            }
        });
        
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateUser(nameField.getText(), emailField.getText());
            }
            
        });
        
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                deleteUser(nameField.getText());
            }
        });
    }
    
    //Create (insert) a new user
    
    private void createUser(String name, String email){
        String query = "INSERT INTO users (name, email) VALUES (?, ?)";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);
            
            int rowsInserted = preparedStatement.executeUpdate();
            resultArea.setText("Rows inserted: " + rowsInserted);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
  
    //Read (retrive) all users
    
    private void readUsers() {
        String query = "SELECT * FROM users";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query)) {
            
            StringBuilder result = new StringBuilder();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                result.append("ID: ").append(id).append(", Name: ").append(name).append(", Email: ").append(email).append("\n");
                }
                resultArea.setText(result.toString());
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    // Update a user's email
    private void updateUser(String name, String newEmail) {
        String query = "UPDATE users SET email = ? WHERE name = ?";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            
            preparedStatement.setString(1, newEmail);
            preparedStatement.setString(2, name);
            
            int rowsUpdated = preparedStatement.executeUpdate();
            resultArea.setText("Rows updated: " + rowsUpdated);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Delete a user
    private void deleteUser(String name) {
        String query = "DELETE FROM users WHERE name = ?";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            
            preparedStatement.setString(1, name);
            
            int rowsDeleted = preparedStatement.executeUpdate();
            resultArea.setText("Rows deleted: " + rowsDeleted);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingApp().setVisible(true);
            }
        });
    }
}
