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
public class DichVu {
    private String MaDichVu;
    private String TenDichVu;
    private float Gia;

    public DichVu() {
    }

    public DichVu(String MaDichVu, String TenDichVu, float Gia) {
        this.MaDichVu = MaDichVu;
        this.TenDichVu = TenDichVu;
        this.Gia = Gia;
    }

    public String getMaDichVu() {
        return MaDichVu;
    }

    public void setMaDichVu(String MaDichVu) {
        this.MaDichVu = MaDichVu;
    }

    public String getTenDichVu() {
        return TenDichVu;
    }

    public void setTenDichVu(String TenDichVu) {
        this.TenDichVu = TenDichVu;
    }

    public float getGia() {
        return Gia;
    }

    public void setGia(float Gia) {
        this.Gia = Gia;
    }
    
    
}
