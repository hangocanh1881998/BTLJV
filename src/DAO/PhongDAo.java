/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import static java.awt.image.ImageObserver.HEIGHT;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Phong;
import quanlykhachsan.JDBC.getConnetion;

/**
 *
 * @author NHS
 */
public class PhongDAo {

    private List<Phong> listPhong;

    public PhongDAo() {
        listPhong = new ArrayList<>();
    }

    public PhongDAo(List<Phong> listPhong) {
        this.listPhong = listPhong;
    }

    public List<Phong> getlist() {

        Connection conn = getConnetion.getConnection();
        try {

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from thongtinphong");
            while (rs.next()) {
                String MaPhong = rs.getString("MaPhong");
                int SoPhong = rs.getInt("SoPhong");
                try {
                    Date NgayVao = rs.getDate("NgayVao");
                    Date NgayTra = rs.getDate("NgayTra");
                    float GiaPhong = rs.getFloat("GiaPhong");
                    String TenKh = rs.getString("TenKh");
                    String CMND = rs.getString("CMNDKh");
                    boolean TinhTrang = rs.getBoolean("TinhTrang");
                    float TongTien;
                    Phong a = new Phong(MaPhong, SoPhong, NgayVao, NgayTra, GiaPhong, TenKh, CMND, TinhTrang);
                    listPhong.add(a);
                } catch (Exception e) {

                }

                //a.setXepLoai(a.XepLoai());
            }
// close connection
            conn.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return listPhong;
    }

    public void DatPhong(Phong a) {

        String sql1 = "INSERT INTO thongtinphong(ID,MaPhong,SoPhong,GiaPhong,TenKh,CMNDKh,NgayVao,TinhTrang)"
                + "VALUES (? , ? , ? , ? ,? ,?,?,?)";

        try {

            Connection conn = getConnetion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql1);

            st.setInt(1, a.getSoPhong());
            st.setString(2, a.getMaPhong());
            st.setInt(3, a.getSoPhong());
            st.setFloat(4, a.getGiaPhong());
            st.setString(5, a.getTenKh());
            st.setString(6, a.getCMND());
            st.setDate(7, new java.sql.Date(a.getNgayVao().getTime()));
//            st.setDate(8, new java.sql.Date(a.getNgayTra().getTime()));
            st.setBoolean(8, true);

            st.executeUpdate();

            System.out.println("Them Thanh Cong");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Số Phòng Đã Được Sử Dụng");

        }
    }

    public void TraPhong(Phong a) {
        String sql = "UPDATE `thongtinphong` SET `NgayTra` = ? WHERE (`ID` = ?);";
        try {
            Connection conn = getConnetion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);

            st.setDate(1, new java.sql.Date(a.getNgayTra().getTime()));
            st.setInt(2, a.getSoPhong());
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void XoaPhong(int ID) {
        String sql = "DELETE from thongtinphong WHERE (`ID` = ?)";

        try {
            Connection conn = getConnetion.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);

            st.setInt(1,ID);

            st.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

//    public static void main(String[] args) {
////        DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
////        Date date1 = null;
////        String startDate = "2016-07-12";
////        try {
////            date1 = simpleDateFormat.parse(startDate);
////        } catch (ParseException ex) {
////            Logger.getLogger(PhongDAo.class.getName()).log(Level.SEVERE, null, ex);
////        }
//        PhongDAo a = new PhongDAo();
//
////        Phong b = new Phong("MaPhong", 3, date1, date1, 0, "Helo", "hli");
////        System.out.println(b.toString());
//        a.XoaPhong(3);
//    }
}
