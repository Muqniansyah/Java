/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectUas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class aplikasiperpus extends javax.swing.JFrame {
//buat objek baru dari class
    buku book = new buku();
    
    public aplikasiperpus() {
        initComponents();
        
//        cStatus.addItem("PILIH");
        cStatus.addItem("Dipinjam");
        cStatus.addItem("Dikembalikan");
        
        tKode.addItem("PILIH");
        tKode.addItem("BK001");
        tKode.addItem("BK002");
        tKode.addItem("BK003");
        tKode.addItem("BK004");
        tKode.addItem("BK005");
        
//        untuk membuat judul buku tidak aktif/tidak bisa dirubah
        tJudul.setEnabled(false);
    }
    
//    method & fungsi
    void bersih(){
        tNama.setText("");
        tKode.setSelectedItem("PILIH");
        tJudul.setText("");
        tJumlah.setText("");
        cStatus.setSelectedItem("PILIH");     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tNama = new javax.swing.JTextField();
        tKode = new javax.swing.JComboBox();
        tJudul = new javax.swing.JTextField();
        tJumlah = new javax.swing.JTextField();
        cStatus = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        bRefresh = new javax.swing.JButton();
        bHapus = new javax.swing.JButton();
        bEdit = new javax.swing.JButton();
        bSimpan = new javax.swing.JButton();
        bKeluar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Peminjaman Buku Perpus");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tNama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tNamaActionPerformed(evt);
            }
        });
        getContentPane().add(tNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 183, -1));

        tKode.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tKode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tKodeActionPerformed(evt);
            }
        });
        getContentPane().add(tKode, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 183, -1));

        tJudul.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(tJudul, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 183, -1));

        tJumlah.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(tJumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 183, -1));

        cStatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(cStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 183, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/log-out.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 550, 30, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/check.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 564, 40, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/refresh-ccw.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 564, 30, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/edit-2.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(304, 560, 30, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/trash.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 550, -1, 50));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/menu.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 30, 30));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "Kode Buku", "Judul Buku", "Jumlah Buku", "Status"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, -1, 310));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Page Peminjaman Buku.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        bRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRefreshActionPerformed(evt);
            }
        });
        getContentPane().add(bRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 550, 110, 50));

        bHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHapusActionPerformed(evt);
            }
        });
        getContentPane().add(bHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 550, 110, 50));

        bEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditActionPerformed(evt);
            }
        });
        getContentPane().add(bEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 550, 120, 50));

        bSimpan.setBackground(new java.awt.Color(255, 255, 255));
        bSimpan.setForeground(new java.awt.Color(255, 255, 255));
        bSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/check.png"))); // NOI18N
        bSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(bSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 550, 110, 50));

        bKeluar.setText("KELUAR");
        bKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(bKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(751, 553, 110, 50));

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 50, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2070, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1270, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -4, 2070, 1270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSimpanActionPerformed
        // TODO add your handling code here:
//        code load data
            //validation for not leave blank data
        if(tNama.getText().equals("")||tKode.getSelectedItem().equals("")||tJudul.getText().equals("")||tJumlah.getText().equals("")||cStatus.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(this, "Tolong Isi Data dengan Lengkap!");
        }
        else {
//            jika sudah diisi dengan lengkap, maka letakkan data pada aarray data
            String data[]={tNama.getText(),tKode.getSelectedItem().toString(),tJudul.getText(),tJumlah.getText(),cStatus.getSelectedItem().toString()};
            
//            buat objek table
            DefaultTableModel tblModel =(DefaultTableModel)jTable1.getModel();
            
//            tambahkan string ke array data
            tblModel.addRow(data);
            
//            pesan ketika berhasil ditambahkan
            JOptionPane.showMessageDialog(this, "Data Berhasil Masuk..! ");
//            bersihkan textfield jika data berhasil ditambahkan
            tNama.setText("");
            tKode.setSelectedItem("PILIH");
            tJudul.setText("");
            tJumlah.setText("");
            cStatus.setSelectedItem("PILIH");   
        }
    }//GEN-LAST:event_bSimpanActionPerformed

    private void bKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bKeluarActionPerformed
        // TODO add your handling code here:
        int x;
//        JOptionPane mirip dengan jendela Pop Up
        x=JOptionPane.showConfirmDialog(null, "Yakin mau keluar?","Kofirm",JOptionPane.YES_NO_OPTION);
        
        if(x==JOptionPane.YES_NO_OPTION){
            // buat objek baru
            Login Jframe1 = new Login();
                // display jframe1
            Jframe1.show();  
                // tutup jframe2 setelah buka jframe1
            dispose();           
        }
        else{
            return;
        }
    }//GEN-LAST:event_bKeluarActionPerformed

    private void bRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRefreshActionPerformed
        // TODO add your handling code here:
        bersih();
    }//GEN-LAST:event_bRefreshActionPerformed

    private void tKodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tKodeActionPerformed
        // TODO add your handling code here:
        book.setCode(tKode.getSelectedItem().toString());
        book.setSeleksiCode();
        tJudul.setText(book.getBuku());

    }//GEN-LAST:event_tKodeActionPerformed

    private void tNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tNamaActionPerformed

    private void bEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditActionPerformed
        // TODO add your handling code here:
//            buat objek table
        DefaultTableModel tblModel =(DefaultTableModel)jTable1.getModel();
        
        if(jTable1.getSelectedRowCount()==1){
//            jika baris dipilih untuk diupdate
            String nama = tNama.getText();
            String kode = tKode.getSelectedItem().toString();
            String judul = tJudul.getText();
            String jumlah = tJumlah.getText();
            String status = cStatus.getSelectedItem().toString();
            
//            set update nilai pada table 
            tblModel.setValueAt(nama, jTable1.getSelectedRow(), 0);
            tblModel.setValueAt(kode, jTable1.getSelectedRow(), 1);
            tblModel.setValueAt(judul, jTable1.getSelectedRow(), 2);
            tblModel.setValueAt(jumlah, jTable1.getSelectedRow(), 3);
            tblModel.setValueAt(status, jTable1.getSelectedRow(), 4);
            
//            pesan update
            JOptionPane.showMessageDialog(this, "Update Berhasil..");
        }
        else {
            if(jTable1.getRowCount()==0){
//                jika table kosong(tidak ada data)
               JOptionPane.showMessageDialog(this, "Table Kosong.");
            }
            else {
//                jika table tidak kosong tapi tidak ada row yang dipilih atau lebih dari 2 row yang dipilih
                JOptionPane.showMessageDialog(this, "Pilih row yang ingin diedit.");
            }
        }
    }//GEN-LAST:event_bEditActionPerformed

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
        // TODO add your handling code here:
//        buat objek table
        DefaultTableModel tblModel =(DefaultTableModel)jTable1.getModel();
        
//        hapus baris
        if(jTable1.getSelectedRowCount()==1){
//            jika satu baris dipilih untuk dihapus
            tblModel.removeRow(jTable1.getSelectedRow());
        }
        else{
            if(jTable1.getRowCount()==0){
//                jika table kosong(tidak ada data)
                JOptionPane.showMessageDialog(this, "Table Kosong.");
            }
            else {
//                jika table tidak kosong tapi tidak ada row yang dipilih
                JOptionPane.showMessageDialog(this, "Pilih row yang ingin dihapus.");
            }
        }
    }//GEN-LAST:event_bHapusActionPerformed
//event mouse clicked pada table
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
                // atur data ke textfield
//        buat objek table
        DefaultTableModel tblModel =(DefaultTableModel)jTable1.getModel();
        
//        set data ke textfield ketika ada baris yang dipilih
        String tblName = tblModel.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String tblKode = tblModel.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String tblJudul = tblModel.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String tblJumlah = tblModel.getValueAt(jTable1.getSelectedRow(), 3).toString();
        String tblStatus = tblModel.getValueAt(jTable1.getSelectedRow(), 4).toString();

//        set ke textfield
        tNama.setText(tblName);
        tKode.setSelectedItem(tblKode);
        tJudul.setText(tblJudul);
        tJumlah.setText(tblJumlah);
        cStatus.setSelectedItem(tblStatus);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        // buat objek baru
            panel Jframe2 = new panel();
                // display jframe2
            Jframe2.show();  
                // tutup jframe1 setelah buka jframe2
            dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(aplikasiperpus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aplikasiperpus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aplikasiperpus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aplikasiperpus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aplikasiperpus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEdit;
    private javax.swing.JButton bHapus;
    private javax.swing.JButton bKeluar;
    private javax.swing.JButton bRefresh;
    private javax.swing.JButton bSimpan;
    private javax.swing.JComboBox cStatus;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tJudul;
    private javax.swing.JTextField tJumlah;
    private javax.swing.JComboBox tKode;
    private javax.swing.JTextField tNama;
    // End of variables declaration//GEN-END:variables
}
