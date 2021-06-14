/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlykhachsan.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author NHS
 */
public class getConnetion {
    public static Connection getConnection() {
        Connection conn = null;
        try {
            String dbURL = "jdbc:mysql://localhost/qlks";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, username, password);
            if (conn != null) {
                System.out.println("Kết nối thành công");
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return conn;
    }
    
}
