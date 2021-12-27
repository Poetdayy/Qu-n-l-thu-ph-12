/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ThinkKING
 */
public class HoKhauModel {
	int maHo;
	int soThanhvien;
	String diaChi;
        int IDChuHo;
	
	public HoKhauModel() {
		
	}

    public HoKhauModel(int maHo, int soThanhvien, String diaChi, int IDChuHo) {
        this.maHo = maHo;
        this.soThanhvien = soThanhvien;
        this.diaChi = diaChi;
        this.IDChuHo = IDChuHo;
    }

    public int getMaHo() {
        return maHo;
    }

    public int getSoThanhvien() {
        return soThanhvien;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getIDChuHo() {
        return IDChuHo;
    }

    public void setMaHo(int maHo) {
        this.maHo = maHo;
    }

    public void setSoThanhvien(int soThanhvien) {
        this.soThanhvien = soThanhvien;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setIDChuHo(int IDChuHo) {
        this.IDChuHo = IDChuHo;
    }
	
	
}
