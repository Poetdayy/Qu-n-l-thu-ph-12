/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.Date;
import Model.NhanKhauModel;
import Model.KhoanThuModel;
/**
 *
 * @author ThinkKING
 */
public class NopTienModel {
	
	private NhanKhauModel tenNhanKhau;
	private KhoanThuModel tenKhoanThu;
	private Date ngayThu;

    public NopTienModel() {
    }

    public NopTienModel(NhanKhauModel tenNhanKhau, KhoanThuModel tenKhoanThu, Date ngayThu) {
        this.tenNhanKhau = tenNhanKhau;
        this.tenKhoanThu = tenKhoanThu;
        this.ngayThu = ngayThu;
    }

    public NhanKhauModel getTenNhanKhau() {
        return tenNhanKhau;
    }

    public KhoanThuModel getTenKhoanThu() {
        return tenKhoanThu;
    }

    public Date getNgayThu() {
        return ngayThu;
    }

    public void setTenNhanKhau(NhanKhauModel tenNhanKhau) {
        this.tenNhanKhau = tenNhanKhau;
    }

    public void setTenKhoanThu(KhoanThuModel tenKhoanThu) {
        this.tenKhoanThu = tenKhoanThu;
    }

    public void setNgayThu(Date ngayThu) {
        this.ngayThu = ngayThu;
    }

    @Override
    public String toString() {
        return "NopTienModel{" + "tenNhanKhau=" + tenNhanKhau + ", tenKhoanThu=" + tenKhoanThu + ", ngayThu=" + ngayThu + '}';
    }

  
	
    
}
