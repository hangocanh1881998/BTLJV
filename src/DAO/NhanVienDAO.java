/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.NhanVien;
import quanlykhachsan.JDBC.getConnetion;

/**
 *
 * @author NHS
 */
public class NhanVienDAO {

    private static Connection conn;
    private static List<NhanVien> arr;

    //Dùng Câu truy vấn và sử dụng kết nốt ở pakit ConnectionJDBC để đổ dữ liệu 
    //Vào ListGiangVien để quản lý và sửa 
    public static List<NhanVien> listNv() {
        String TruyVan = "SELECT * from nhanvien";
        //Lay Du lieu
        Statement st;
        try {
            arr = new ArrayList();

            conn = getConnetion.getConnection();
            st = conn.createStatement();
            ResultSet re = st.executeQuery(TruyVan);
            while (re.next()) {
                NhanVien a = new NhanVien(re.getString("MaNV"),
                        re.getString("HoTen"), re.getString("DiaChi"),
                        re.getBoolean("GioiTinh"));
                arr.add(a);
            }

        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        if (conn != null) {
            try {

                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }

        return arr;
    }

    //Dùng Câu truy vấn và sử dụng kết nốt ở pakit ConnectionJDBC để thêm dữ liệu 
    public void ThemGiangVien(NhanVien a) {

        //Lay Du lieu
        try {
            String sql = "INSERT INTO nhanvien (MaNV,HoTen,DiaChi,GioiTinh) VALUES (?,?,?,?)";
            conn = getConnetion.getConnection();
            PreparedStatement st = conn.prepareCall(sql); // Chen Du lieu Vao CSDL
            st.setString(1, a.getMaNv());
            st.setString(2, a.getHoTen());
            st.setString(3, a.getDiaChi());
            st.setBoolean(4, a.isGioiTinh());
            arr.add(a);
            st.execute();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        if (conn != null) {
            try {

                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
    }
//Dùng Câu truy vấn và sử dụng kết nốt ở pakit ConnectionJDBC để Xóa dữ liệu 

    public void XoaGiangVien(String MaGiangVien) {

        try {
            String sql = "delete from nhanvien WHere MaNV=?";
            conn = getConnetion.getConnection();
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setString(1, MaGiangVien);
            ps.execute();
            System.out.println("Xoa Thanh Cong");
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
//Dùng Câu truy vấn và sử dụng kết nốt ở pakit ConnectionJDBC để Sửa dữ liệu 

    public void SuaGiangVien(NhanVien a, String MaGv) {
        try {
            String sql = "update nhanvien set MaNv =?, HoTen=?, DiaChi=?, GioiTinh=? where MaNv =?";
//             String sql = "update TB_GV set FullName=?,GioiTinh=?,Khoa=?,DiaChi=? where MaGV = ?";
             conn = getConnetion.getConnection();
            PreparedStatement st = conn.prepareCall(sql);
            st.setString(1, a.getMaNv());
            st.setString(2, a.getHoTen());
            st.setString(3, a.getDiaChi());
            st.setBoolean(4, a.isGioiTinh());
            st.setString(5, MaGv);
            st.execute();

        } catch (SQLException ex) {
            System.out.println("Loi");
            System.out.println(ex.toString());
        }

        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
    }
}
