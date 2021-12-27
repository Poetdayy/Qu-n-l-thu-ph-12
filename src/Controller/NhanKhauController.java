/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.Connection;
import Model.NhanKhauModel;
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
public class NhanKhauController {

    Connection conn = null;
    PreparedStatement sttm = null;  

    public int addNhanKhau(NhanKhauModel nk) {
        try {
            String sSQL = "insert NhanKhau(ID,Ten,Tuoi,CMND,SDT) \n"
                    + "values(?,?,?,?,?)";
            conn = database1.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, nk.getId());
            sttm.setString(2, nk.getTen());
            sttm.setInt(3, nk.getTuoi());
            sttm.setString(4, nk.getCmnd());
            sttm.setString(5, nk.getSdt());

            if (sttm.executeUpdate() > 0) {
                System.out.println("Insert thanh cong");
                return 1;
            }

        } catch (Exception e) {
            System.out.println("Error" + e.toString());
        }
        return -1;
    }

    public int updateNhanKhau(NhanKhauModel nk) {
        try {
            String sSQL = "update NhanKhau set Ten = ?, Tuoi = ?, CMND = ?, SDT = ? where ID = ?";    PreparedStatement sttm = null;

            conn = database1.getDBConnect();
            sttm = conn.prepareStatement(sSQL);

            sttm.setString(1, nk.getTen());
            sttm.setInt(2, nk.getTuoi());
            sttm.setString(3, nk.getCmnd());
            sttm.setString(4, nk.getSdt());
            sttm.setInt(5, nk.getId());

            if (sttm.executeUpdate() > 0) {
                System.out.println("Update thanh cong");
                return 1;
            }

        } catch (Exception e) {
            System.out.println("Error" + e.toString());
        }
        return -1;
    }

    public int delNhanKhau(int ID) {
        try {
            String sSQL = "delete NhanKhau where ID = ?";
            conn = database1.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, ID);

            if (sttm.executeUpdate() > 0) {
                System.out.println("Del thanh cong");
                return 1;
            }

        } catch (SQLException e) {
            System.out.println("Error" + e.toString());
        }
        return -1;
    }

    public List<NhanKhauModel> getAll() {
        List<NhanKhauModel> listNK = new ArrayList<>();

        ResultSet rs = null;
        Statement sttm = null;
        try {
            String sSQL = "select * from NhanKhau";
            conn = database1.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);

            while (rs.next()) {
                NhanKhauModel nk = new NhanKhauModel();
                nk.setId(rs.getInt(1));
                nk.setTen(rs.getString(2));
                nk.setTuoi(rs.getInt(3));
                nk.setCmnd(rs.getString(4));
                nk.setSdt(rs.getString(5));
                listNK.add(nk);
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
            return listNK;
        }

    }

       public List<NhanKhauModel> findNhanKhauModelbyName(String name) {
        ResultSet rs = null;
        Statement sttm = null;
        List<NhanKhauModel> ls = new ArrayList<>();
        try {
            String sSQL = "select * from NhanKhau where Ten like '%" + name + "%'";
            conn = database1.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);

            while (rs.next()) {
                NhanKhauModel nk = new NhanKhauModel();
                nk.setId(rs.getInt(1));
                nk.setTen(rs.getString(2));
                nk.setTuoi(rs.getInt(3));
                nk.setCmnd(rs.getString(4));
                nk.setSdt(rs.getString(5));
                ls.add(nk);
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

    public NhanKhauModel getByName(String name) {
        ResultSet rs = null;
        Statement stmt = null;
        try {
            
            String sSQL = "select * from NhanKhau where Ten = N'"+name+"'";
            conn = database1.getDBConnect();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sSQL);

            while (rs.next()) {
                NhanKhauModel nk = new NhanKhauModel();
                nk.setId(rs.getInt(1));
                nk.setTen(rs.getString(2));
                nk.setTuoi(rs.getInt(3));
                nk.setCmnd(rs.getString(4));
                nk.setSdt(rs.getString(5));
                return nk;
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        } finally {
            try {
                rs.close();
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                System.out.println("Error:" + e.toString());
            }
        }
        return null;
    }

}
