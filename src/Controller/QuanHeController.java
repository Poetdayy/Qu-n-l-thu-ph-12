/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.Connection;
import Model.QuanHeModel;
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
public class QuanHeController {

    Connection conn = null;
    PreparedStatement sttm = null;

    public List<QuanHeModel> getAll() {
        List<QuanHeModel> listQH = new ArrayList<>();

        ResultSet rs = null;
        Statement sttm = null;
        try {
            String sSQL = "select * from QuanHe";
            conn = database1.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);

            while (rs.next()) {
                QuanHeModel qh = new QuanHeModel();
                qh.setMaHo(rs.getInt(1));
                qh.setIdThanhVien(rs.getInt(2));
                qh.setQuanHe(rs.getString(3));
                listQH.add(qh);
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
            return listQH;
        }

    }
}
