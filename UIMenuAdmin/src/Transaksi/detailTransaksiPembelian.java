/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transaksi;

import UiAdminPengawasan.UI_MENU;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class detailTransaksiPembelian extends javax.swing.JFrame {

    /**
     * Creates new form detailTransaksiPembelian
     */
    public detailTransaksiPembelian() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        no_transaksi = new javax.swing.JTextField();
        print_struk = new javax.swing.JButton();
        tanggal_transaksi = new javax.swing.JTextField();
        kode_barang = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nama_barang = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        stok = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        harga_satuan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        harga_total = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jenis_barang = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area_struk = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        buat_struk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(37, 37, 37));

        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Drawable/xsmol.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(25, 25, 25));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Detail transaksi pembelian");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Drawable/my stuff.png"))); // NOI18N
        jLabel6.setText("jLabel6");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Drawable/minus(1).png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(25, 25, 25));
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Kembali");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        no_transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no_transaksiActionPerformed(evt);
            }
        });

        print_struk.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        print_struk.setText("Cetak struk ");
        print_struk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_strukActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Nomor transaksi");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("Tanggal transaksi");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("Kode barang");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setText("Nama barang");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setText("Jumlah barang masuk");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel8.setText("Harga barang per satuan");

        area_struk.setColumns(20);
        area_struk.setFont(new java.awt.Font("Monospaced", 1, 15)); // NOI18N
        area_struk.setRows(5);
        jScrollPane1.setViewportView(area_struk);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel10.setText("Harga barang total");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel11.setText("Jenis barang");

        buat_struk.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        buat_struk.setText("Generate struk pembelian");
        buat_struk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buat_strukActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel7))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(no_transaksi, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                                    .addComponent(tanggal_transaksi)
                                    .addComponent(kode_barang)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(harga_satuan, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                        .addComponent(harga_total)
                                        .addComponent(jenis_barang)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(stok, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nama_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(buat_struk)
                        .addGap(59, 59, 59)
                        .addComponent(print_struk)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(no_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(tanggal_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(kode_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(nama_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(stok, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(harga_satuan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10))
                            .addComponent(harga_total, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jenis_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buat_struk)
                            .addComponent(print_struk))))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1051, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(close, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin keluar dari mystuff ? ","Konfirmasi keluar aplikasi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(response == JOptionPane.YES_OPTION){   
            System.exit(0);
        }
    }//GEN-LAST:event_closeMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void print_strukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_strukActionPerformed
        // TODO add your handling code here:
        try {
            area_struk.print();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null,"Maaf, terdapat kendala ketika ingin mencetak dokumen");
        }
    }//GEN-LAST:event_print_strukActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        dispose();
        transaksi_pembelian tp = new transaksi_pembelian();
        tp.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void buat_strukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buat_strukActionPerformed
        // TODO add your handling code here:
        area_struk.setText("======================================\n");
        area_struk.setText(area_struk.getText() + "=     Struk transaksi pembelian      =\n");
        area_struk.setText(area_struk.getText() + "=      Koperasi Pekerja Kekar        =\n");
        area_struk.setText(area_struk.getText() + "======================================\n\n\n");
        
        Date obj = new Date();
        String date = obj.toString();
        
        area_struk.setText(area_struk.getText() + " Nomor transaksi     : " +  no_transaksi.getText() + "\n" );
        area_struk.setText(area_struk.getText() + " Tanggal transaksi   : " +  tanggal_transaksi.getText() + "\n" );
        area_struk.setText(area_struk.getText() + " Kode barang         : " +  kode_barang.getText() + "\n" );
        area_struk.setText(area_struk.getText() + " Nama barang         : " +  nama_barang.getText() + "\n" );
        area_struk.setText(area_struk.getText() + " Jumlah barang masuk : " +  stok.getText() + "\n" );
        area_struk.setText(area_struk.getText() + " Harga satuan        : Rp. " +  harga_satuan.getText() + "\n" );
        area_struk.setText(area_struk.getText() + " Jenis barang        : " +  jenis_barang.getText() + "\n\n\n" );
        area_struk.setText(area_struk.getText() + " Harga total         : Rp. " +  harga_total.getText() + "\n\n\n" );
        area_struk.setText(area_struk.getText()+ " Struk dicetak pada: " + "\n");
        area_struk.setText(area_struk.getText() +" "+ date +"\n");
        
        area_struk.setText(area_struk.getText()+"======================================\n");
        area_struk.setText(area_struk.getText()+ "=   Dikembangkan oleh Two But Odd    =" + "\n");
        area_struk.setText(area_struk.getText()+"======================================\n");
        
        
        
    }//GEN-LAST:event_buat_strukActionPerformed

    private void no_transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no_transaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_no_transaksiActionPerformed

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
            java.util.logging.Logger.getLogger(detailTransaksiPembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(detailTransaksiPembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(detailTransaksiPembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(detailTransaksiPembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new detailTransaksiPembelian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area_struk;
    private javax.swing.JButton buat_struk;
    private javax.swing.JLabel close;
    public javax.swing.JTextField harga_satuan;
    public javax.swing.JTextField harga_total;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JTextField jenis_barang;
    public javax.swing.JTextField kode_barang;
    public javax.swing.JTextField nama_barang;
    public javax.swing.JTextField no_transaksi;
    private javax.swing.JButton print_struk;
    public javax.swing.JTextField stok;
    public javax.swing.JTextField tanggal_transaksi;
    // End of variables declaration//GEN-END:variables
}
