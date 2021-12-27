/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.HoKhauModel;
import Model.NhanKhauModel;
import Model.QuanHeModel;
import database.database1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ThinkKING
 */
public class HoKhauController {

    Connection conn = null;
    PreparedStatement sttm = null;

    public int addHoKhau(HoKhauModel hk) {
        try {
            String sSQL = "insert HoKhau(MaHo,SoThanhVien,DiaChi) \n"
                    + "values(?,?,?)";
            conn = database1.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, hk.getMaHo());
            sttm.setInt(2, hk.getSoThanhvien());
            sttm.setString(3, hk.getDiaChi());

            if (sttm.executeUpdate() > 0) {
                System.out.println("Insert thanh cong");
                return 1;
            }

        } catch (Exception e) {
            System.out.println("Error" + e.toString());
        }
        return -1;
    }

    public List<HoKhauModel> getAll() {
        List<HoKhauModel> listHK = new ArrayList<>();

        ResultSet rs = null;
        Statement sttm = null;
        try {
            String sSQL = "select * from HoKhau";
            conn = database1.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);

            while (rs.next()) {
                HoKhauModel hk = new HoKhauModel();
                hk.setMaHo(rs.getInt(1));
                hk.setSoThanhvien(rs.getInt(3));
                hk.setDiaChi(rs.getString(4));
                listHK.add(hk);
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
            return listHK;
        }
    }
   
         

    public int delHoKhau(int ID) {
        try {
            String sSQL = "delete HoKhau where MaHo = ?";
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
    
   

}
