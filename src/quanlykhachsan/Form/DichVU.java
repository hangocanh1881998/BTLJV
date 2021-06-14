/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlykhachsan.Form;

import DAO.DichVuDAO;
import DAO.NhanVienDAO;
import java.awt.event.WindowAdapter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import javax.swing.JDialog;
import model.DichVu;
import model.NhanVien;

/**
 *
 * @author NHS
 */
public class DichVU extends javax.swing.JFrame {

    private DefaultTableModel model;
    private List<DichVu> listDichVu;
    private DichVuDAO quanly;

    public DichVU() {
        initComponents();
        quanly = new DichVuDAO();
        listDichVu = quanly.listNv();
        LoadGVTable();
        this.setLocationRelativeTo(null);
    }

    public DichVU(String string, String string0, float aFloat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbGiangVien = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        txtmadv = new javax.swing.JTextField();
        txtTendv = new javax.swing.JTextField();
        txtGia = new javax.swing.JTextField();
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
                "MA DV", "TEN DV", "Gia"
            }
        ));
        tbGiangVien.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbGiangVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbGiangVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbGiangVien);

        jLabel1.setText("Mã Dịch Vụ");

        jLabel2.setText("Tên Dịch Vụ");

        jLabel3.setText("Gía");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btSua, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btThem, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtmadv, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTendv, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(8, 8, 8))))
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
                    .addComponent(txtmadv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTendv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtGia))
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
            txtTendv.setText(listDichVu.get(index).getTenDichVu());
            txtGia.setText(String.valueOf(listDichVu.get(index).getGia()));
            txtmadv.setText(listDichVu.get(index).getMaDichVu());

           
        }
    }//GEN-LAST:event_tbGiangVienMouseClicked

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        StringBuilder sb = new StringBuilder();
        int run = 0;
        String Ma = txtmadv.getText();
        String Ten = txtTendv.getText();
        String Gia = txtGia.getText();

        //các trường hợp ngoài lệ đc bắt
        CheckTTNULL(sb);
        CheckDinhDang(sb);
        //kiểm tra nếu không có lỗi thì thực hiện thêm giang viên 
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb.toString(), "Thông Báo", HEIGHT);
        } else {
            DichVu a = new DichVu(Ma, Ten, Integer.parseInt(Gia));

            int check = 0;
            for (int i = 0; i < listDichVu.size(); i++) {
                if (txtmadv.getText().equals(listDichVu.get(i).getMaDichVu())) {
                    check = 1;
                    JOptionPane.showMessageDialog(this, "Đã Tồn Tại Mã DV Này: " + txtmadv.getText(), "Thông Báo", HEIGHT);
                }
            }
            if (check == 0) {
                System.out.println(a.getMaDichVu());
                quanly.ThemGiangVien(a);
                ResetTT();
                LoadGVTable();
            }
        }
    }//GEN-LAST:event_btThemActionPerformed

    private void CheckDinhDang(StringBuilder sb) {               //CHECK DINH DANG
        if (txtmadv.getText().contains("DV")) {

        } else {
            sb.append("Chưa Đúng Định Dạng (DV...)\n");
        }
    }

    private void ResetTT() {              // RESET THONG TIN
        txtGia.setText("");
        txtTendv.setText("");
        txtmadv.setText("");
    }

    private void CheckTTNULL(StringBuilder sb) { //CheckNull
        if (txtmadv.getText().equals("")) {
            sb.append("Điền Mã Dịch vụ \n");
        }
        if (txtTendv.getText().equals("")) {
            sb.append("Tên Trống \n");
        }
        if (txtGia.getText().equals("")) {
            sb.append("Gía Trống \n");
        }

    }
//Tương tự các chức năng trên
    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        int index = tbGiangVien.getSelectedRow();
        if (index >= 0) {
            String ma = txtmadv.getText();
            String ThayDoi = listDichVu.get(index).getMaDichVu();
            String ten = txtTendv.getText();
            String gia = txtGia.getText();
            
           
            DichVu a = new DichVu(ma, ten, Float.parseFloat(gia));
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
            String ma = txtmadv.getText();
            System.out.println(ma);
            int option = JOptionPane.showConfirmDialog(this, "Do you want to delete this item?");
            if (option == 0) {
                System.out.println("YES");
                quanly.XoaGiangVien(ma);
                listDichVu.remove(ma);
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
        listDichVu = DichVuDAO.listNv();
        for (DichVu a : listDichVu) {
           
            model.addRow(new Object[]{a.getMaDichVu(), a.getTenDichVu(), a.getGia()});
        }
        tbGiangVien.setModel(model);
    }


  

//    public static void main(String[] args) {
//        DichVU a = new DichVU();
//        a.setVisible(true);
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbGiangVien;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtTendv;
    private javax.swing.JTextField txtmadv;
    // End of variables declaration//GEN-END:variables
}
