/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import Proccess.Sanpham; 
import java.util.logging.Level; 
import java.util.logging.Logger; 
import javax.swing.JOptionPane; 
import javax.swing.table.DefaultTableModel; 

/**
 *
 * @author Administrator
 */
public class frmCapnhatSP extends javax.swing.JFrame {
 private final Sanpham sp = new Sanpham();  
    private boolean cothem=true; 
    private final DefaultTableModel tableModel = new DefaultTableModel(); 
   //Ham do du lieu vao combobox 
    public final void ShowDataCombo() {         
        ResultSet result=null;           
        try { 
            result = sp.ShowLoaiSP();            
            while(result.next()){  
                cboLoaiSP.addItem(result.getString("Maloai")); 
            } 
        }  
        catch (SQLException e) { 
        } 
    }
    
    public void ShowTenloai(String ma) throws SQLException{         
        ResultSet result=  sp.ShowLoaiSP(ma);           
        if(result.next()){ // nếu còn đọc tiếp được một dòng dữ liệu 
           txtTenloai.setText(result.getString("Tenloai"));
            }         
    }   
   public final void ShowData() throws SQLException {         
        ResultSet result=null;           
        result = sp.ShowSanpham(); 
        try {   
            ClearData(); 
            while(result.next()){  
                String rows[] = new String[4]; 
                rows[0] = result.getString(1);  
                rows[1] = result.getString(2);  
                rows[2] = result.getString(3);  
                rows[3] = result.getString(5);                 
                tableModel.addRow(rows); 
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
    //Ham xoa trang cac TextField 
    private void setNull() 
    { 
        //Xoa trang cac JtextField 
        txtMaSP.setText(null); 
        txtMaSP.requestFocus(); 
        txtTenSP.setText(null);         
        txtGB.setText(null);     
        txtTenloai.setText(null); 
    } 
    //Ham khoa cac TextField 
    private void setKhoa(boolean a) 
    { 
        //Khoa hoac mo khoa cho Cac JTextField 
        txtMaSP.setEnabled(!a); 
        txtTenSP.setEnabled(!a); 
        txtGB.setEnabled(!a); 
        cboLoaiSP.setEnabled(!a);  
        txtTenloai. setEnabled (!a) ;       
    }   
    //Ham khoa cac Button 
      private void setButton(boolean a) 
    { 
        //Vo hieu hoac co hieu luc cho cac JButton 
        btnThem.setEnabled(a); 
        btnXoa.setEnabled(a); 
        btnSua.setEnabled(a); 
        btnLuu.setEnabled(!a); 
        btnKLuu.setEnabled(!a); 
        btnThoat.setEnabled(a); 
    }    
    public frmCapnhatSP() throws SQLException{ 
        initComponents(); // Khởi tạo các components trên JFrame                   
        String []colsName = {"Mã SP", "Tên sản phẩm","Giá bán"," Mã loại"}; 
        // đặt tiêu đề cột cho tableModel 
        tableModel.setColumnIdentifiers(colsName);   
        // kết nối jtable với tableModel   
        tbLoaiSP.setModel(tableModel);   
        //gọi hàm ShowData để đưa dữ liệu vào tableModel  
        ShowData();  
        //Show loaisp vao Combobox 
        ShowDataCombo(); 
        //goi Ham xoa trang cac TextField 
        setNull(); 
        //Goi ham Khoa cac TextField 
        setKhoa(true); 
        //Goi vo hieu 2 button Luu, K.Luu. Mo khoa 4 button con lao  
        setButton(true); 
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtTenSP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaSP = new javax.swing.JTextField();
        txtGB = new javax.swing.JTextField();
        btnSua = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnKLuu = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbLoaiSP = new javax.swing.JTable();
        cboLoaiSP = new javax.swing.JComboBox<>();
        txtTenloai = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("QUẢN LÝ DANH MỤC SẢN PHẨM");

        jLabel2.setText("Mã SP:");

        jLabel3.setText("Giá Bán");

        txtGB.setToolTipText("");

        btnSua.setText("Sửa");
        btnSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuaMouseClicked(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
        });

        btnLuu.setText("Lưu");
        btnLuu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLuuMouseClicked(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaMouseClicked(evt);
            }
        });

        btnKLuu.setText("K.Lưu");
        btnKLuu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKLuuMouseClicked(evt);
            }
        });
        btnKLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKLuuActionPerformed(evt);
            }
        });

        jLabel4.setText("Tên Sản Phẩm");

        btnThoat.setText("Thoát");
        btnThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThoatMouseClicked(evt);
            }
        });

        jLabel5.setText("Loại SP");

        tbLoaiSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã SP", "Tên SP", "Giá Bán", "Loại SP"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbLoaiSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbLoaiSPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbLoaiSP);

        cboLoaiSP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboLoaiSPItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(btnThem)
                                .addGap(18, 18, 18)
                                .addComponent(btnXoa)
                                .addGap(18, 18, 18)
                                .addComponent(btnSua))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtGB, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnLuu)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnKLuu)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnThoat))
                                    .addComponent(txtTenSP)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(cboLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTenloai, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtGB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cboLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenloai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)
                    .addComponent(btnLuu)
                    .addComponent(btnKLuu)
                    .addComponent(btnThoat))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaMouseClicked
        // TODO add your handling code here:
        String ml=txtMaSP.getText();
        if(ml.length()==0) //Chua chon Ma loai
        JOptionPane.showMessageDialog(null,"Vui long chon loi can sua", "Thong bao",1);
        else
        {
            setKhoa(false);//Mo khoa cac TextField
            setButton(false); //Khoa cac Button
            cothem=false; //Gan cothem=false de ghi nhan trang thai la sua
        }
    }//GEN-LAST:event_btnSuaMouseClicked

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
        // TODO add your handling code here:
        setNull();//Xoa trang TextField
        setKhoa(false);//Mo khoa TextField
        setButton(false);//Goi ham khoa cac Button
        cothem=true;//Gan cothem = true de ghi nhan trang thai them moi
    }//GEN-LAST:event_btnThemMouseClicked

    private void btnLuuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLuuMouseClicked
        // TODO add your handling code here:
        String ma=txtMaSP.getText();
        String ten=txtTenSP.getText();
        int gia;
        gia = Integer.parseInt(txtGB.getText());
        String loai=cboLoaiSP.getSelectedItem().toString();
        if(ma.length()==0 || ten.length()==0)
        JOptionPane.showMessageDialog(null,"Vui long nhap Ma SP va ten sp", "Thong bao",1);
        else
        if(ma.length()>4 || ten.length()>30)
        JOptionPane.showMessageDialog(null,"Ma SP chi 2 ky tu, ten SP la 30", "Thong bao",1);
        else
        {
            try {
                if(cothem==true)    //Luu cho tthem moi
                sp.InsertSanpham(ma,ten,gia,loai);
                else                //Luu cho sua
                sp.EditSanpham(ma,ten,gia,loai);
                ClearData(); //goi ham xoa du lieu tron tableModel
                ShowData(); //Do lai du lieu vao Table Model
            }
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Cap nhat that bai","Thong bao",1);
            }
            setNull();
            setKhoa(true);
            setButton(true);
        }
    }//GEN-LAST:event_btnLuuMouseClicked

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked
        // TODO add your handling code here:
        String ma=txtMaSP.getText();
        try {
            if(ma.length()==0)
            JOptionPane.showMessageDialog(null,"Can chon 1 SP de xoa","Thong bao",1);
            else
            {
                if(JOptionPane.showConfirmDialog(null, "Ban muon xoa sp " + ma + " này hay khong?","Thong bao",2)==0)
                {
                    sp.DeleteSanpham(ma);//goi ham xoa du lieu theo ma loai
                    ClearData();//Xoa du lieu trong tableModel
                    ShowData();//Do du lieu vao table Model
                    setNull();//Xoa trang Textfield
                }
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(frmCapnhatSP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnXoaMouseClicked

    private void btnKLuuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKLuuMouseClicked
        // TODO add your handling code here:
        setNull();
        setKhoa(true);
        setButton(true);
    }//GEN-LAST:event_btnKLuuMouseClicked

    private void btnKLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKLuuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKLuuActionPerformed

    private void btnThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnThoatMouseClicked

    private void tbLoaiSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbLoaiSPMouseClicked
        // TODO add your handling code here:
        //Hien thi du lieu len cac JTextField khi Click chuot vao JTable
        try{
            //Lay chi so dong dang chon
            int row =tbLoaiSP.getSelectedRow();
            String ma=(tbLoaiSP.getModel().getValueAt(row,0)).toString();
            ResultSet rs= sp.ShowSPTheoma(ma);//Goi ham lay du lieu theo ma loai
            if(rs.next())//Neu co du lieu
            {
                txtMaSP.setText(rs.getString("MaSP"));
                txtTenSP.setText(rs.getString("TenSP"));
                txtGB.setText(rs.getString("Dongia"));
                cboLoaiSP.setSelectedItem(rs.getString("Maloai"));
                txtTenloai.setText(rs.getString("Tenloai"));
            }
        }
        catch (SQLException e) {
        }
    }//GEN-LAST:event_tbLoaiSPMouseClicked

    private void cboLoaiSPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboLoaiSPItemStateChanged
        // TODO add your handling code here:
        try {
            String ml=cboLoaiSP.getSelectedItem().toString();
            ShowTenloai(ml);
        } catch (SQLException ex) {
            Logger.getLogger(frmCapnhatSP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cboLoaiSPItemStateChanged

    /**
     * @param args the command line arguments
     */
   public static void main(String args[]) throws SQLException {
         frmCapnhatSP f = new frmCapnhatSP(); 
                    f.setVisible(true);
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
            java.util.logging.Logger.getLogger(frmCapnhatSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCapnhatSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCapnhatSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCapnhatSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                  
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKLuu;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboLoaiSP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbLoaiSP;
    private javax.swing.JTextField txtGB;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtTenSP;
    private javax.swing.JTextField txtTenloai;
    // End of variables declaration//GEN-END:variables
}
