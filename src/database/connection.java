/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class connection {
    private static final String URL = "jdbc:mysql://localhost:3306/alecer_mr";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            // This line is MANDATORY to fix the "No suitable driver" error
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected Successfully!");
        } catch (Exception e) {
            System.out.println("Connection Failed: " + e.getMessage());
        }
        return conn;
    }
}
    

