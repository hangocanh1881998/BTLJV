/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlykhachsan.Form;

import DAO.NhanVienDAO;
import java.awt.event.WindowAdapter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import javax.swing.JDialog;
import model.NhanVien;

/**
 *
 * @author NHS
 */
public class Manager extends javax.swing.JFrame {

    private DefaultTableModel model;
    private List<NhanVien> listNhanVien;
    private NhanVienDAO quanly;

    public Manager() {
        initComponents();
        quanly = new NhanVienDAO();
        listNhanVien = quanly.listNv();
        LoadGVTable();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbGiangVien = new javax.swing.JTable();
        cbNam = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        cbNu = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        txtMagv = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbGiangVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MA NV", "HO TEN", "GIOI TINH", "DIA CHI"
            }
        ));
        tbGiangVien.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbGiangVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGiangVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbGiangVien);

        buttonGroup1.add(cbNam);
        cbNam.setSelected(true);
        cbNam.setText("Nam");

        jLabel1.setText("Mã NV");

        buttonGroup1.add(cbNu);
        cbNu.setText("Nữ");

        jLabel2.setText("Họ Tên");

        jLabel3.setText("Địa Chỉ");

        btThem.setText("Thêm");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        btSua.setText("Sửa");
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });

        btXoa.setText("Xóa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        jButton2.setText("Quay Lại");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtMagv, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbNam)
                                    .addComponent(cbNu)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbNam)
                    .addComponent(txtMagv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbNu))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDiaChi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btXoa)
                    .addComponent(btSua)
                    .addComponent(btThem))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbGiangVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbGiangVienMouseClicked
        // bắt sự kiến nếu người dùng bấm vào 1 dòng trong tbGiangVien
        int index = tbGiangVien.getSelectedRow();
        if (index >= 0) { //Kiểm Tra người dùng có bấm hay không ( nếu thì set )
            txtHoTen.setText(listNhanVien.get(index).getHoTen());
            txtDiaChi.setText(listNhanVien.get(index).getDiaChi());
            txtMagv.setText(listNhanVien.get(index).getMaNv());

            if (listNhanVien.get(index).isGioiTinh()) {
                cbNam.setSelected(true);
            } else {
                cbNu.setSelected(true);
            }
        }
        String checkbox = tbGiangVien.getValueAt(index, 3).toString();
        //set cboxkhoa có cấu trúc khác
        

    }//GEN-LAST:event_tbGiangVienMouseClicked

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        StringBuilder sb = new StringBuilder();
        int run = 0;
        boolean GioiTinh = cbNam.isSelected();
        String Ma = txtMagv.getText();
        String Ten = txtHoTen.getText();
        String DiaChi = txtDiaChi.getText();

        //các trường hợp ngoài lệ đc bắt
        CheckTTNULL(sb);
        CheckDinhDang(sb);
        //kiểm tra nếu không có lỗi thì thực hiện thêm giang viên 
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Thông Báo", HEIGHT);
        } else {
            NhanVien a = new NhanVien(Ma, Ten, DiaChi, GioiTinh);

            int check = 0;
            for (int i = 0; i < listNhanVien.size(); i++) {
                if (txtMagv.getText().equals(listNhanVien.get(i).getMaNv())) {
                    check = 1;
                    JOptionPane.showMessageDialog(this, "Đã Tồn Tại Mã GV Này: " + txtMagv.getText(), "Thông Báo", HEIGHT);
                }
            }
            if (check == 0) {
                System.out.println(a.getMaNv());

                quanly.ThemGiangVien(a);
                ResetTT();
                LoadGVTable();
            }
        }
    }//GEN-LAST:event_btThemActionPerformed

    private void CheckDinhDang(StringBuilder sb) {               //CHECK DINH DANG
        if (txtMagv.getText().contains("NV")) {

        } else {
            sb.append("Chưa Đúng Định Dạng (NV...)\n");
        }
    }

    private void ResetTT() {              // RESET THONG TIN
        txtDiaChi.setText("");
        txtHoTen.setText("");
        txtMagv.setText("");
    }

    private void CheckTTNULL(StringBuilder sb) { //CheckNull
        if (txtMagv.getText().equals("")) {
            sb.append("Điền Mã Nhân Viên \n");
        }
        if (txtHoTen.getText().equals("")) {
            sb.append("Tên Trống \n");
        }
        if (txtDiaChi.getText().equals("")) {
            sb.append("Địa Chỉ Trống \n");
        }

    }
//Tương tự các chức năng trên
    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        int index = tbGiangVien.getSelectedRow();
        if (index >= 0) {
            String ma = txtMagv.getText();
            String ThayDoi = listNhanVien.get(index).getMaNv();
            String ten = txtHoTen.getText();
            String diaChi = txtDiaChi.getText();
            boolean GioiTinh = cbNam.isSelected();
           
            NhanVien a = new NhanVien(ma, ten, diaChi,  GioiTinh);
            quanly.SuaGiangVien(a, ThayDoi);
            LoadGVTable();
            ResetTT();
        }
    }//GEN-LAST:event_btSuaActionPerformed
//Tương tự các chức năng trên

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
//
        int index = tbGiangVien.getSelectedRow();
        if (index >= 0) {
            String ma = txtMagv.getText();
            System.out.println(ma);
            int option = JOptionPane.showConfirmDialog(this, "Do you want to delete this item?");
            if (option == 0) {
                System.out.println("YES");
                quanly.XoaGiangVien(ma);
                listNhanVien.remove(ma);
                LoadGVTable();
                ResetTT();
            }
        }
    }//GEN-LAST:event_btXoaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        managerQuanLy Menu = new managerQuanLy();
        Menu.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void LoadGVTable() {

        DefaultTableModel model = (DefaultTableModel) tbGiangVien.getModel();
        String gioitinh;
        model.setRowCount(0); //Xoa Dc hET
        //model.setNumRows(0);  Xoa Dc Het
        //model.getDataVector().removeAllElements();  Khoong Xoa Dc Dong Cuoi
        listNhanVien = NhanVienDAO.listNv();
        for (NhanVien a : listNhanVien) {
            gioitinh = ShowGioiTinh(a);
            model.addRow(new Object[]{a.getMaNv(), a.getHoTen(), gioitinh, a.getDiaChi()});
        }
        tbGiangVien.setModel(model);
    }
//Lọc Giới tính nếu 1 là nam 0 là nữ

    private String ShowGioiTinh(NhanVien a) {
        String gioitinh;
        if (a.isGioiTinh()) {
            gioitinh = "Nam";
        } else {
            gioitinh = "Nữ";
        }
        return gioitinh;
    }

//    public static void main(String[] args) {
//        Manager a = new Manager();
//        a.setVisible(true);
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cbNam;
    private javax.swing.JCheckBox cbNu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbGiangVien;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMagv;
    // End of variables declaration//GEN-END:variables
}
