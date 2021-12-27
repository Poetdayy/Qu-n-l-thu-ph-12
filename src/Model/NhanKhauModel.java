/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ThinkKING
 */
public class NhanKhauModel {

    int id;
    String ten;
    int tuoi;
    String cmnd;
    String sdt;

    public NhanKhauModel() {
    }

    public NhanKhauModel(int id, String ten, int tuoi, String cmnd, String sdt) {
        this.id = id;
        this.ten = ten;
        this.tuoi = tuoi;
        this.cmnd = cmnd;
        this.sdt = sdt;
    }

    public NhanKhauModel(int id, String ten) {
        this.id = id;
        this.ten = ten;
    }

    

    public NhanKhauModel(int id) {
        this.id = id;
    }

    public NhanKhauModel(String ten) {
        this.ten = ten;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return getTen();
    }

    

}
