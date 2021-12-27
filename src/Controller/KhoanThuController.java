/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.Connection;
import Model.KhoanThuModel;
import database.database1;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ThinkKING
 */
public class KhoanThuController {
       
    Connection conn  = null;
    PreparedStatement sttm = null;
    
    public int addKhoanThu(KhoanThuModel kt ){
        try {
            String sSQL = "insert Khoanthu(MaKhoanThu,TenKhoanThu,SoTien,LoaiKhoanThu) values (?,?,?,?)";
            conn = database1.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1,kt.getMaKhoanThu());
            sttm.setString(2,kt.getTenKhoanThu());
            sttm.setDouble(3, kt.getSoTien());
            sttm.setString(4,kt.getLoaiKhoanThu());
            
            if(sttm.executeUpdate()>0){
                System.out.println("Insert thanh cong");
                return 1;
            }
            
        } catch (Exception e) {
            System.out.println("Error" + e.toString());
        }
            return -1;
    }
    
     public int updateKhoanThu(KhoanThuModel kt){
        try {
            String sSQL = "update KhoanThu set TenKhoanThu = ?, SoTien = ?, LoaiKhoanThu = ? where MaKhoanThu = ?";
            conn = database1.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1,kt.getTenKhoanThu());
            sttm.setDouble(2, kt.getSoTien());
            sttm.setString(3, kt.getLoaiKhoanThu());
            sttm.setInt(4,kt.getMaKhoanThu());
            
            if(sttm.executeUpdate()>0){
                System.out.println("Update thanh cong");
                return 1;
            }
            
        } catch (Exception e) {
            System.out.println("Error" + e.toString());
        }
            return -1;
    }
     
    public int delKhoanThu(int MaKhoanThu){
        try {
            String sSQL = "delete KhoanThu where MaKhoanThu = ?";
            conn = database1.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1,MaKhoanThu);
            
            if(sttm.executeUpdate()>0){
                System.out.println("Del thanh cong");
                return 1;
            }
            
        } catch (SQLException e) {
            System.out.println("Error" + e.toString());
        }
            return -1;
    }
    
    public List<KhoanThuModel> getAllKhoanThu() {
        List<KhoanThuModel> listKT = new ArrayList<>();

        ResultSet rs = null;
        Statement sttm = null;
        try {
            String sSQL = "select * from KhoanThu";
            conn = database1.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);

            while (rs.next()) {
                KhoanThuModel kt = new KhoanThuModel();
                kt.setMaKhoanThu(rs.getInt(1));
                kt.setTenKhoanThu(rs.getString(2));
                kt.setSoTien(rs.getDouble(3));
                kt.setLoaiKhoanThu(rs.getString(4));
                listKT.add(kt);
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        } finally {
            try {
                rs.close();
                sttm.close();
                conn.close();
            } catch (Exception e) {
            }
            return listKT;
        }

    }
    
    public KhoanThuModel findKhoanThuModelByID(int MaKhoanThu) {
        ResultSet rs = null;
        Statement stmt = null;
        try {
            String sSQL = "select * from KhoanThu where MaKhoanThu ='" + MaKhoanThu + "'";
            conn = database1.getDBConnect();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sSQL);

            while (rs.next()) {
                KhoanThuModel kt = new KhoanThuModel();
                kt.setMaKhoanThu(rs.getInt(1));
                kt.setTenKhoanThu(rs.getString(2));
                kt.setSoTien(rs.getDouble(3));
                kt.setLoaiKhoanThu(rs.getString(4));
                return kt;
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        } finally {
            try {
                rs.close();
                stmt.close();
                conn.close();
            } catch (SQLException e) {
            }
        }
        return null;
    }
    
    public List<KhoanThuModel> findKhoanThuModelbyName(String name) {
        ResultSet rs = null;
        Statement sttm = null;
        List<KhoanThuModel> ls = new ArrayList<>();
        try {
            String sSQL = "select * from KhoanThu where TenKhoanThu like '%" + name + "%'";
            conn = database1.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);

            while (rs.next()) {
                KhoanThuModel kt = new KhoanThuModel();
                kt.setMaKhoanThu(rs.getInt(1));
                kt.setTenKhoanThu(rs.getString(2));
                kt.setSoTien(rs.getDouble(3));
                kt.setLoaiKhoanThu(rs.getString(4));
                ls.add(kt);
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        } finally {
            try {
                rs.close();
                sttm.close();
                conn.close();
            } catch (Exception e) {
            }
        }
        return ls;
    }
    
     public KhoanThuModel getByName1(String name) {
        ResultSet rs = null;
        Statement sttment = null;
        try {
            String sSQL = "select * from KhoanThu where TenKhoanThu = N'"+name+"'";
            conn = database1.getDBConnect();
            sttment = conn.createStatement();
            rs = sttment.executeQuery(sSQL);

            while (rs.next()) {
                KhoanThuModel kt = new KhoanThuModel();
                kt.setMaKhoanThu(rs.getInt(1));
                kt.setTenKhoanThu(rs.getString(2));
                kt.setSoTien(rs.getDouble(3));
                kt.setLoaiKhoanThu(rs.getString(4));
                return kt;
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        } finally {
            try {
                rs.close();
                sttment.close();
                conn.close();
            } catch (Exception e) {
               System.out.println("Error:" + e.toString());
            }
        }
        return null;
    }
    
}
