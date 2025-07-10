package tugasbesarkel6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Pesanan extends javax.swing.JFrame {
    int Mouse1, Mouse2;
    
    public Pesanan() {
        initComponents();
        table();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pesanantbl = new javax.swing.JTable();
        batalkanbtn = new javax.swing.JButton();
        namapmsn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        perbarui = new javax.swing.JButton();
        refreshbtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Left_1_1.png"))); // NOI18N
        back2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back2MouseClicked(evt);
            }
        });
        getContentPane().add(back2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 34));

        pesanantbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", "", "", "", "", "", ""
            }
        ));
        pesanantbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pesanantblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(pesanantbl);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 730, 340));

        batalkanbtn.setText("Batalkan");
        batalkanbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalkanbtnActionPerformed(evt);
            }
        });
        getContentPane().add(batalkanbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, -1, -1));
        getContentPane().add(namapmsn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 180, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama Pemesan :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, -1, 20));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PESANAN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, 40));

        perbarui.setText("Update");
        perbarui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perbaruiActionPerformed(evt);
            }
        });
        getContentPane().add(perbarui, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, -1, -1));

        refreshbtn.setText("Refresh");
        refreshbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshbtnActionPerformed(evt);
            }
        });
        getContentPane().add(refreshbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\2.png")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void table() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Pemesan");
        model.addColumn("Judul");
        model.addColumn("Waktu");
        model.addColumn("Jenis Tiket");
        model.addColumn("Jumlah");
        model.addColumn("Nomor Kursi");
        model.addColumn("Pembayaran");
        try {
            Statement st = (Statement) Koneksi.getConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT pengguna, judul, jam, jenis, jumlah, bangku, "
                           + "status FROM pesanan");
            while(rs.next()){
                String pngguna = rs.getString("pengguna");
                String film = rs.getString("judul");
                String waktu = rs.getString("jam");
                String tiket = rs.getString("jenis");
                String banyak = rs.getString("jumlah");
                String kursi = rs.getString("bangku");
                String statuspmsn = rs.getNString("status");
                model.addRow(new Object[]{pngguna, film, waktu, tiket, banyak, kursi, statuspmsn});
            } 
            pesanantbl.setModel(model);
            pesanantbl.setRowHeight(50);
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Koneksi Database Gagal" + e.getMessage());
        }
    }
    
    private void batalkanbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalkanbtnActionPerformed
    try {
        int pilihan = pesanantbl.getSelectedRow();
        if (pilihan == -1) {
            JOptionPane.showMessageDialog(null, "Pilih baris yang ingin dibatalkan pesanannya.");
        }else{
            String filmhapus = pesanantbl.getValueAt(pilihan, 1).toString();
            String jenisTiket = pesanantbl.getValueAt(pilihan,3).toString();

            String sql = "DELETE FROM pesanan WHERE judul='" + filmhapus + "'" 
                         + "AND " + "jenis='" + jenisTiket + "'" ;
            Connection con = (Connection) Koneksi.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Membatalkan Pesanan");
            namapmsn.setText("");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Gagal Membatalkan Pesanan" + e.getMessage());
    }
    }//GEN-LAST:event_batalkanbtnActionPerformed

    private void refreshbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshbtnActionPerformed
        try {
            String sql = "SELECT * FROM pesanan";
            Connection con = (Connection) Koneksi.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Refresh Data");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        table();
    }//GEN-LAST:event_refreshbtnActionPerformed

    private void perbaruiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perbaruiActionPerformed
        try {
            if(namapmsn.getText().isEmpty()){
               JOptionPane.showMessageDialog(null, "Tidak ada data yang diperbarui");
               namapmsn.setText("");
            } else {
                String judulfilm = pesanantbl.getValueAt(pesanantbl.getSelectedRow(), 1).toString();
                String sql = "UPDATE pesanan SET pengguna='" + namapmsn.getText() 
                             + "' WHERE judul='" + judulfilm + "'";
                Connection con = (Connection) Koneksi.getConnection();
                PreparedStatement pst = con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Berhasil Update Data");
                namapmsn.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Update Data "+e.getMessage());
        }
    }//GEN-LAST:event_perbaruiActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        Mouse1 = evt.getX();
        Mouse2 = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - Mouse1, y - Mouse2);
    }//GEN-LAST:event_formMouseDragged

    private void pesanantblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesanantblMouseClicked
        namapmsn.setText(pesanantbl.getValueAt(pesanantbl.getSelectedRow(), 0).toString());
    }//GEN-LAST:event_pesanantblMouseClicked

    private void back2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back2MouseClicked
        new HalamanUtama().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back2MouseClicked
    
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pesanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back2;
    private javax.swing.JButton batalkanbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField namapmsn;
    private javax.swing.JButton perbarui;
    private javax.swing.JTable pesanantbl;
    private javax.swing.JButton refreshbtn;
    // End of variables declaration//GEN-END:variables
}
