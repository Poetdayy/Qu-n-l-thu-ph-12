/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ThinkKING
 */
public class QuanHeModel {
	int maHo;
	int idThanhVien;
	String quanHe;
	public QuanHeModel() {}
	public QuanHeModel(int maHo, int idThanhVien, String quanHe) {
		this.maHo= maHo;
		this.idThanhVien = idThanhVien;
		this.quanHe = quanHe;
	}
	public int getMaHo() {
		return maHo;
	}
	public void setMaHo(int maHo) {
		this.maHo = maHo;
	}
	public int getIdThanhVien() {
		return idThanhVien;
	}
	public void setIdThanhVien(int idThanhVien) {
		this.idThanhVien = idThanhVien;
	}
	public String getQuanHe() {
		return quanHe;
	}
	public void setQuanHe(String quanHe) {
		this.quanHe = quanHe;
	}
}
