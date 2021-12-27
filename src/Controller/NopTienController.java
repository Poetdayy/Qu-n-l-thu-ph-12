/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.KhoanThuModel;
import Model.NhanKhauModel;
import java.sql.Connection;
import Model.NopTienModel;
import database.database1;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ThinkKING
 */
public class NopTienController {

    SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
    Connection conn = null;
    PreparedStatement sttm = null;

    public int addNopTien(NopTienModel nt) {
        try {
            String sSQL = "insert NopTien(IDNopTien,MaKhoanThu,NgayThu) values\n"
                    + "(?,?,?-?-?)";
            conn = database1.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, nt.getTenNhanKhau().getId());
            sttm.setInt(2, nt.getTenKhoanThu().getMaKhoanThu());
            sttm.setString(3, formatDate.format(nt.getNgayThu()));

            if (sttm.executeUpdate() > 0) {
                System.out.println("Insert thành công");
                return 1;
            }

        } catch (Exception e) {
            System.out.println("Error" + e.toString());
        }
        return -1;
    }

    public int delNopTien(String name) {
        try {
            String sSQL = "delete NhanKhau where TenNhanKhau = ?";
            conn = database1.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, name);

            if (sttm.executeUpdate() > 0) {
                System.out.println("Del thanh cong");
                return 1;
            }

        } catch (SQLException e) {
            System.out.println("Error" + e.toString());
        }
        return -1;
    }

    public List<NopTienModel> getAll() {
        List<NopTienModel> listNT = new ArrayList<>();

        ResultSet rs = null;
        Statement sttm = null;
        try {
            String sSQL = "select Ten,TenKhoanThu,NgayThu,ID,NopTien.MaKhoanThu from NopTien \n"
                    + "join NhanKhau on NopTien.IDNopTien = NhanKhau.ID \n"
                    + "join KhoanThu on NopTien.MaKhoanThu = KhoanThu.MaKhoanThu";
            conn = database1.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);

            while (rs.next()) {

                NopTienModel nt = new NopTienModel();
                nt.setTenNhanKhau(new NhanKhauModel(rs.getInt(4), rs.getString(1)));
                nt.setTenKhoanThu(new KhoanThuModel(rs.getInt(5), rs.getString(2)));
                nt.setNgayThu(formatDate.parse(rs.getString(3)));
                listNT.add(nt);

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
            return listNT;
        }
    }

   public NopTienModel findbyName(String name) {

        ResultSet rs = null;
        Statement sttm = null;
        try {
            String sSQL = "select Ten,TenKhoanThu,NgayThu,ID,NopTien.MaKhoanThu from NopTien \n" +
"       join NhanKhau on NopTien.IDNopTien = NhanKhau.ID \n" +
"       join KhoanThu on NopTien.MaKhoanThu = KhoanThu.MaKhoanThu\n" +
"	where NhanKhau.Ten like '%"+name+"%'";
            conn = database1.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);

            while (rs.next()) {

                NopTienModel nt = new NopTienModel();
                nt.setTenNhanKhau(new NhanKhauModel(rs.getInt(4), rs.getString(1)));
                nt.setTenKhoanThu(new KhoanThuModel(rs.getInt(5), rs.getString(2)));
                nt.setNgayThu(formatDate.parse(rs.getString(3)));
                return nt;

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
            return null;
        }
    }

    
    
}
