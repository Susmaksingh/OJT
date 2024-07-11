/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbc;

/**
 *
 * @author abcde
 */
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC{
    //Database URL,username,password

    private static final String URL="jdbc:mysql://localhost:3307/mysql";
    private static final String USER="root";
    private static final String PASSWORD="";

    public static void main(String[] args) {
        Connection connection=null;
        try
        {
            //establishing the connection
            connection=DriverManager.getConnection(URL,USER,PASSWORD);

            if(connection!=null)
            {
                System.out.println("successfully connected to the database");
            }
        }catch(SQLException e){
            e.printStackTrace();
            System.out.println("failed to connect the database!");
        }finally{
            //Close the connection
            try{
                if(connection!=null&&!connection.isClosed())
                {
                    connection.close();
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }

}




