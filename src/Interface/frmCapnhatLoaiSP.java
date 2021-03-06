/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Proccess.LoaiSP;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class frmCapnhatLoaiSP extends javax.swing.JFrame {
 private final LoaiSP lsp = new LoaiSP();  
     private boolean cothem=true; 
     private final DefaultTableModel tableModel = new DefaultTableModel();
      public void ShowData() throws SQLException{         
        ResultSet result=  lsp.ShowLoaiSP();           
        try {             
            while(result.next()){ // nếu còn đọc tiếp được một dòng dữ liệu 
                String rows[] = new String[2]; 
                rows[0] = result.getString(1); // lấy dữ liệu tại cột số 1 (ứng với mã hàng) 
                rows[1] = result.getString(2); // lấy dữ liệu tai cột số 2 ứng với tên hàng                    
                tableModel.addRow(rows); // đưa dòng dữ liệu vào tableModel  
                //mỗi lần có sự thay đổi dữ liệu ở tableModel thì Jtable sẽ tự động update  
            } 
        }  
       catch (SQLException e) { 
        }  
    }   
    //Ham xoa du lieu trong tableModel 
    public void ClearData() throws SQLException{ 
         //Lay chi so dong cuoi cung 
         int n=tableModel.getRowCount()-1; 
         for(int i=n;i>=0;i--) 
            tableModel.removeRow(i);//Remove tung dong          
    }  
    //Ham xoa cac TextField 
    private void setNull() 
    { 
        //Xoa trang cac JtextField 
        this.txtMaLoai.setText(null); 
        this.txtTenloai.setText(null); 
        this.txtMaLoai.requestFocus();       
    } 
    //Ham khoa cac TextField 
    private void setKhoa(boolean a) 
    { 
        //Khoa hoac mo khoa cho Cac JTextField 
        this.txtMaLoai. setEnabled (!a); 
        this.txtTenloai. setEnabled (!a); 
    }   
    //Ham khoa cac Button 
    private void setButton(boolean a) 
    { 
        //Vo hieu hoac co hieu luc cho cac JButton 
        this.btnThem. setEnabled (a); 
        this.btnXoa. setEnabled (a); 
        this.btnSua. setEnabled (a); 
        this.btnLuu. setEnabled (!a); 
        this.btnKLuu. setEnabled (!a);
        this.btnThoat. setEnabled (a); 
    }    
    public frmCapnhatLoaiSP() throws SQLException{ 
        initComponents(); // Khởi tạo các components trên JFrame                   
        String []colsName = {"Mã Loai", "Tên loai"}; 
        // đặt tiêu đề cột cho tableModel 
        tableModel.setColumnIdentifiers(colsName);   
        // kết nối jtable với tableModel   
        jTableLoaiSP.setModel(tableModel);   
        //gọi hàm ShowData để đưa dữ liệu vào tableModel  
        ShowData();  
        //goi Ham xoa trang cac TextField 
        setNull(); 
        //Goi ham Khoa cac TextField 
        setKhoa(true); 
        //Goi vo hieu 2 button Luu, K.Luu. Mo khoa 4 button con lao  
        setButton(true); 
    } 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtMaLoai = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTenloai = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnKLuu = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLoaiSP = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("DANH MỤC LOẠI SẢN PHẨM");

        jLabel2.setText("Mã Loại");

        jLabel3.setText("Tên Loại");

        txtTenloai.setToolTipText("");

        btnThem.setText("Thêm");
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
        });
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaMouseClicked(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuaMouseClicked(evt);
            }
        });

        btnLuu.setText("Lưu");
        btnLuu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLuuMouseClicked(evt);
            }
        });

        btnKLuu.setText("K.Lưu");
        btnKLuu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKLuuMouseClicked(evt);
            }
        });

        btnThoat.setText("Thoát");
        btnThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThoatMouseClicked(evt);
            }
        });

        jTableLoaiSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã Loại", "Tên Loại"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableLoaiSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableLoaiSPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableLoaiSP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtMaLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTenloai, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua)
                        .addGap(18, 18, 18)
                        .addComponent(btnLuu)
                        .addGap(18, 18, 18)
                        .addComponent(btnKLuu)
                        .addGap(18, 18, 18)
                        .addComponent(btnThoat))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenloai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)
                    .addComponent(btnLuu)
                    .addComponent(btnKLuu)
                    .addComponent(btnThoat))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
      // TODO add your handling code here:
         setNull();//Xoa trang TextField 
        setKhoa(false);//Mo khoa TextField 
        setButton(false);//Goi ham khoa cac Button 
        cothem=true;//Gan cothem = true de ghi nhan trang thai them moi 

    }//GEN-LAST:event_btnThemMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked
        // TODO add your handling code here:
         String ml=txtMaLoai.getText(); 
        try { 
            if(ml.length()==0)              
                JOptionPane.showMessageDialog(null,"Chon 1 loai SP de xoa", "Thong bao",1); 
            else 
            { 
                if(JOptionPane.showConfirmDialog(null, "Ban muon xoa loai " + ml + "  nay hay khong?","Thong bao",2)==0) 
                {     
                    lsp.DeleteData(ml);//goi ham xoa du lieu theo ma loai 
                    ClearData();//Xoa du lieu trong tableModel 
                    ShowData();//Do du lieu vao table Model 
                    setNull();//Xoa trang Textfield 
                } 
             } 
        }  
        catch (SQLException ex) { 
            JOptionPane.showMessageDialog(null,"Xóa thất bại","Thong bao",1); 
        } 
    }//GEN-LAST:event_btnXoaMouseClicked

    private void btnSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseClicked
       // TODO add your handling code here:
         String ml=txtMaLoai.getText(); 
        if(ml.length()==0) //Chua chon Ma loai              
                JOptionPane.showMessageDialog(null,"Vui long chon loi can sua", "Thong bao",1);
         else 
        { 
            setKhoa(false);//Mo khoa cac TextField 
            this.txtMaLoai.enable(false); 
            setButton(false); //Khoa cac Button 
            cothem=false; //Gan cothem=false de ghi nhan trang thai la sua 
             try {
                 lsp.EditData(txtMaLoai.getText().toString(),txtTenloai.getText().toString());
             } catch (SQLException ex) {
                 Logger.getLogger(frmCapnhatLoaiSP.class.getName()).log(Level.SEVERE, null, ex);
             }
            try {
                ClearData();
            } catch (SQLException ex) {
                Logger.getLogger(frmCapnhatLoaiSP.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                ShowData();
            } catch (SQLException ex) {
                Logger.getLogger(frmCapnhatLoaiSP.class.getName()).log(Level.SEVERE, null, ex);
            }
            setNull();
        }

    }//GEN-LAST:event_btnSuaMouseClicked

    private void btnLuuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLuuMouseClicked
       // TODO add your handling code here:
         String ml=txtMaLoai.getText(); 
        String tl=txtTenloai.getText(); 
         if(ml.length()==0 || tl.length()==0)              
                JOptionPane.showMessageDialog(null, "Vui long nhap Ma loai va ten loai","Thong bao",1); 
         else 
            if(ml.length()>2 || tl.length()>30)              
                JOptionPane.showMessageDialog(null, "Ma loai chi 2 ky tu, ten loai la 20","Thong bao",1); 
            else    
            { 
              try { 
                if(cothem==true)    //Luu cho tthem moi            
                    lsp.InsertData(ml, tl); 
                else                //Luu cho sua 
                    lsp.EditData(ml, tl); 
                ClearData(); //goi ham xoa du lieu tron tableModel 
                ShowData(); //Do lai du lieu vao Table Model 
              } 
              catch (SQLException ex) { 
                   JOptionPane.showMessageDialog(null,"Cap nhat that bai", "Thong bao",1); 
              }             
             setKhoa(false); 
             setButton(true); 
         } 
    }//GEN-LAST:event_btnLuuMouseClicked

    private void btnKLuuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKLuuMouseClicked
     // TODO add your handling code here:
         setNull(); 
        setKhoa(true); 
        setButton(true);
    }//GEN-LAST:event_btnKLuuMouseClicked

    private void btnThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMouseClicked
        // TODO add your handling code here:
         this.dispose(); 
    }//GEN-LAST:event_btnThoatMouseClicked

    private void jTableLoaiSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableLoaiSPMouseClicked
        // TODO add your handling code here:
        //Hien thi du lieu len cac JTextField khi Click chuot vao JTable
        // TODO add your handling code here:
         //Hien thi du lieu len cac JTextField khi Click chuot vao JTable 
        try{ 
            //Lay chi so dong dang chon 
            int row =this.jTableLoaiSP.getSelectedRow(); 
            String ml=(this.jTableLoaiSP.getModel().getValueAt(row,0)).toString(); 
            ResultSet rs= lsp.ShowLoaiSP(ml);//Goi ham lay du lieu theo ma loai 
            if(rs.next())//Neu co du lieu 
            { 
             this.txtMaLoai.setText(rs.getString("Maloai")); 
             this.txtTenloai.setText(rs.getString("Tenloai")); 
            } 
        } 
     catch (SQLException e) { 
        }  

    }//GEN-LAST:event_jTableLoaiSPMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SQLException {
         /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmCapnhatLoaiSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCapnhatLoaiSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCapnhatLoaiSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCapnhatLoaiSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        frmCapnhatLoaiSP f = new frmCapnhatLoaiSP(); 
        f.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKLuu;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLoaiSP;
    private javax.swing.JTextField txtMaLoai;
    private javax.swing.JTextField txtTenloai;
    // End of variables declaration//GEN-END:variables
}
