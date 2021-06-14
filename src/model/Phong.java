/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author NHS
 */
public class Phong {

    private String MaPhong;
    private int SoPhong;
    private Date NgayVao;
    private Date NgayTra;
    private float GiaPhong;
    private String TenKh;
    private String CMND;
    private long TongTien;
    private boolean TinhTrang;

    public Phong() {
    }

    public Phong(String MaPhong, int SoPhong, float GiaPhong) {
        this.MaPhong = MaPhong;
        this.SoPhong = SoPhong;
        this.GiaPhong = 1500000;
    }

    public Phong(String MaPhong, int SoPhong, Date NgayVao, Date NgayTra, float GiaPhong, String TenKh, String CMND) {
        this.MaPhong = MaPhong;
        this.SoPhong = SoPhong;
        this.NgayVao = NgayVao;
        this.NgayTra = NgayTra;
        this.GiaPhong = 1500000;
        this.TenKh = TenKh;
        this.CMND = CMND;
    }

    public Phong(String MaPhong, int SoPhong, Date NgayVao, Date NgayTra, float GiaPhong, String TenKh, String CMND, boolean TinhTrang) {
        this.MaPhong = MaPhong;
        this.SoPhong = SoPhong;
        this.NgayVao = NgayVao;
        this.NgayTra = NgayTra;
        this.GiaPhong = 1500000;
        this.TenKh = TenKh;
        this.CMND = CMND;
        this.TinhTrang = TinhTrang;
    }

    public Phong(String MaPhong, int SoPhong, Date NgayVao, String TenKh, String CMND, boolean TinhTrang) {
        this.MaPhong = MaPhong;
        this.SoPhong = SoPhong;
        this.NgayVao = NgayVao;
        this.GiaPhong = 1500000;
        this.TenKh = TenKh;
        this.CMND = CMND;
        this.TinhTrang = TinhTrang;
        this.TongTien =TinhTongTien();
    }

    public Phong(String MaPhong, int SoPhong, Date NgayVao, Date NgayTra, float GiaPhong, String TenKh, String CMND, float TongTien) {
        this.MaPhong = MaPhong;
        this.SoPhong = SoPhong;
        this.NgayVao = NgayVao;
        this.NgayTra = NgayTra;
        this.GiaPhong = 1500000;
        this.TenKh = TenKh;
        this.CMND = CMND;
        this.TongTien = (long) TongTien;
    }

    public long TinhTongTien() {
        DateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        long getDaysDiff = 0;
        Date currentDate = new Date();
        long getDiff = 0;
        try {
            Date NgayTra1 = NgayVao;
            Date NgayVao1 = NgayTra;
            if (NgayTra1 != null && NgayVao1 != null) {
                getDiff = NgayVao1.getTime() - NgayTra1.getTime();
            }

            getDaysDiff = getDiff / (24 * 60 * 60 * 1000);
            System.out.println(getDaysDiff);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return getDaysDiff * 1500000;
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
    }

    public int getSoPhong() {
        return SoPhong;
    }

    public void setSoPhong(int SoPhong) {
        this.SoPhong = SoPhong;
    }

    public Date getNgayVao() {
        return NgayVao;
    }

    public void setNgayVao(Date NgayVao) {
        this.NgayVao = NgayVao;
    }

    public Date getNgayTra() {
        return NgayTra;
    }

    public void setNgayTra(Date NgayTra) {
        this.NgayTra = NgayTra;
    }

    public float getGiaPhong() {
        return GiaPhong;
    }

    public void setGiaPhong(float GiaPhong) {
        this.GiaPhong = GiaPhong;
    }

    public String getTenKh() {
        return TenKh;
    }

    public void setTenKh(String TenKh) {
        this.TenKh = TenKh;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public float getTongTien() {
        return TongTien;
    }

    public void setTongTien(float TongTien) {
        this.TongTien = (long) TongTien;
    }

    public boolean isTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(boolean TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    @Override
    public String toString() {
        return "Phong{" + "MaPhong=" + MaPhong + ", SoPhong=" + SoPhong + ", NgayVao=" + NgayVao + ", NgayTra=" + NgayTra + ", GiaPhong=" + GiaPhong + ", TenKh=" + TenKh + ", CMND=" + CMND + ", TongTien=" + TongTien + ", TinhTrang=" + TinhTrang + '}';
    }

}
