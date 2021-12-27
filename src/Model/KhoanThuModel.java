/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ThinkKING
 */
public class KhoanThuModel {
	private int maKhoanThu;
	private String tenKhoanThu;
	private double soTien;
	private String loaiKhoanThu;
	
	public KhoanThuModel() {}

    public KhoanThuModel(int maKhoanThu) {
        this.maKhoanThu = maKhoanThu;
    }

    public KhoanThuModel(int maKhoanThu, String tenKhoanThu) {
        this.maKhoanThu = maKhoanThu;
        this.tenKhoanThu = tenKhoanThu;
    }
    
    
    
	
	public KhoanThuModel(String tenKhoanThu, double soTien, String loaiKhoanThu ) {
		this.tenKhoanThu=tenKhoanThu;
		this.soTien = soTien;
		this.loaiKhoanThu = loaiKhoanThu;
	}
	
	public KhoanThuModel(int maKhoanThu ,String tenKhoanThu, double soTien, String loaiKhoanThu ) {
		this.maKhoanThu = maKhoanThu;
		this.tenKhoanThu=tenKhoanThu;
		this.soTien = soTien;
		this.loaiKhoanThu = loaiKhoanThu;
	}

	public int getMaKhoanThu() {
		return maKhoanThu;
	}

	public void setMaKhoanThu(int maKhoanThu) {
		this.maKhoanThu = maKhoanThu;
	}

	public String getTenKhoanThu() {
		return tenKhoanThu;
	}

	public void setTenKhoanThu(String tenKhoanThu) {
		this.tenKhoanThu = tenKhoanThu;
	}

	public double getSoTien() {
		return soTien;
	}

	public void setSoTien(double soTien) {
		this.soTien = soTien;
	}

	public String getLoaiKhoanThu() {
		return loaiKhoanThu;
	}

	public void setLoaiKhoanThu(String loaiKhoanThu) {
		this.loaiKhoanThu = loaiKhoanThu;
	}

    @Override
    public String toString() {
        return getTenKhoanThu();
    }
	
        
}
