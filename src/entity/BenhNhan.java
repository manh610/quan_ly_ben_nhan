/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Manh
 */
public class BenhNhan {
    private String ten, gioiTinh, diaChi, sdt;
    private int tuoi;
    private String bacSi, anh;

    public BenhNhan() {
    }

    public BenhNhan(String ten, String gioiTinh, String diaChi, String sdt, int tuoi, String bacSi, String anh) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.tuoi = tuoi;
        this.bacSi = bacSi;
        this.anh = anh;
    }

    

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getBacSi() {
        return bacSi;
    }

    public void setBacSi(String bacSi) {
        this.bacSi = bacSi;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
    @Override
    public String toString() {
        return ten+"-"+sdt+"-"+tuoi+"-"+gioiTinh+"-"+diaChi+"-"+bacSi+"-"+anh; 
    }
    
}
