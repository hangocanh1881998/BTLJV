/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author NHS
 */
public class NhanVien {
    private String MaNv;
    private String HoTen;
    private String DiaChi;
    private boolean GioiTinh;

    public NhanVien() {
    }

    
    
    
    public NhanVien(String MaNv, String HoTen, String DiaChi, boolean GioiTinh) {
        this.MaNv = MaNv;
        this.HoTen = HoTen;
        this.DiaChi = DiaChi;
        this.GioiTinh = GioiTinh;
    }

    public String getMaNv() {
        return MaNv;
    }

    public void setMaNv(String MaNv) {
        this.MaNv = MaNv;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }
    
    
    
    
    
}
