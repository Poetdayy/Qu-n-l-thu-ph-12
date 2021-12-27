/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ThinkKING
 */
public class ChuHoModel {
	int maHo;
	int idChuHo;
	
	public ChuHoModel() {}
	public ChuHoModel(int maHo, int idChuHo) {
		this.maHo = maHo;
		this.idChuHo = idChuHo;
	}
	public int getMaHo() {
		return maHo;
	}
	public void setMaHo(int maHo) {
		this.maHo = maHo;
	}
	public int getIdChuHo() {
		return idChuHo;
	}
	public void setIdChuHo(int idChuHo) {
		this.idChuHo = idChuHo;
	}
}
