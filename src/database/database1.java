/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author ThinkKING
 */
public class database1 {
       public static final String connectionUrl = "jdbc:sqlserver://localhost;"
               + "databaseName=QLNK12;user=sa;password=123456";
      
       public static Connection getDBConnect()
       {
           Connection conn = null;
           try{
               Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           }catch(Exception e)
           {
               System.out.println("Chua co Driver! " + e.toString());
           }
           
           try{
               conn = DriverManager.getConnection(connectionUrl);
               return conn;
           }catch(Exception e)
           {
               System.out.println("Loi connect" + e.toString());
           }
           return null;
       }
}
