/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



/**
 *
 * @author ThinkKING
 */
public class Connect_database {
    public static void main(String[] args) {
        
        // Create a variable for the connection string.
        String connectionUrl = "jdbc:sqlserver://localhost;databaseName=QLNK12;user=sa;password=123456";

        try (Connection con = DriverManager.getConnection(connectionUrl); 
                Statement stmt = con.createStatement();) {
            String SQL = "SELECT TOP 10 * FROM NhanKhau";
            ResultSet rs = stmt.executeQuery(SQL);

            // Iterate through the data in the result set and display it.
            while (rs.next()) {
                System.out.println(rs.getString("MaNhanKhau") 
                + " " + rs.getString("TenNhanKhau")
                + " " + rs.getString("Tuoi")
                + " " + rs.getString("SoCMND")
                + " " + rs.getString("SDT")
                + " " + rs.getString("MaHoKhau")
                + " " + rs.getString("QuanHeChuHo")
                );
            }
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
        
        // Connect database KhoanThu
        try (Connection con = DriverManager.getConnection(connectionUrl); 
                Statement stmt = con.createStatement();) {
            String SQL = "SELECT TOP 10 * FROM KhoanThu";
            ResultSet rs = stmt.executeQuery(SQL);

            // Iterate through the data in the result set and display it.
            while (rs.next()) {
                System.out.println(rs.getInt("MaKhoanThu") 
                + " " + rs.getString("TenNhanKhau")
                + " " + rs.getDouble("SoTien")
                + " " + rs.getInt("LoaiKhoanThu")
                );
            }
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
