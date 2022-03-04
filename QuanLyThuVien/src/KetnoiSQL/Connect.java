/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KetnoiSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Connect {
    public static Connection getJDBCConnection(){
        final String URL = "jdbc:mysql://localhost:3306/quanlythuvien";
            final String UName = "root";
            final String UPassword = "soletrong123";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");   
            return DriverManager.getConnection(URL,UName,UPassword);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public static void main(String[] args){
        Connection connection = getJDBCConnection();
        if(connection != null){
            System.out.println("Thanh cong");
        }else {
            System.out.println("That bai");
        }
    }
}
