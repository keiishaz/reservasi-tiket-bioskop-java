package tugasbesarkel6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class pageAdmin extends javax.swing.JFrame {
    int Mouse1, Mouse2;

    public pageAdmin() {
        initComponents();
        table();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        judulfilm = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        genrefilm = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        durasifilm = new javax.swing.JTextField();
        ratingfilm = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        perbaruifilm = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        tambahfilm = new javax.swing.JButton();
        hapusfilm = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelfilm = new javax.swing.JTable();
        exit = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

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

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setText("Selamat Datang, Admin!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 14, 230, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Sparkling.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 14, 40, 40));

        jLabel5.setText("Judul Film :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 64, 70, -1));
        getContentPane().add(judulfilm, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 64, 209, -1));

        jLabel2.setText("Genre :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 104, -1, -1));
        getContentPane().add(genrefilm, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 104, 209, -1));

        jLabel4.setText("Durasi :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 144, 50, -1));
        getContentPane().add(durasifilm, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 144, 209, -1));
        getContentPane().add(ratingfilm, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 184, 210, -1));

        jLabel7.setText("Rating film :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        perbaruifilm.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        perbaruifilm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Windows Update.png"))); // NOI18N
        perbaruifilm.setText(" Perbarui Film");
        perbaruifilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perbaruifilmActionPerformed(evt);
            }
        });
        getContentPane().add(perbaruifilm, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 273, -1, -1));

        refresh.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Available Updates.png"))); // NOI18N
        refresh.setText(" Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        getContentPane().add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 273, 130, -1));

        tambahfilm.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        tambahfilm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Plus_3.png"))); // NOI18N
        tambahfilm.setText(" Tambah Film");
        tambahfilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahfilmActionPerformed(evt);
            }
        });
        getContentPane().add(tambahfilm, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 224, -1, -1));

        hapusfilm.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        hapusfilm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Remove.png"))); // NOI18N
        hapusfilm.setText(" Hapus Film");
        hapusfilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusfilmActionPerformed(evt);
            }
        });
        getContentPane().add(hapusfilm, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 224, 131, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setText("Data Film");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 20, 70, 30));

        tabelfilm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelfilm.setMinimumSize(new java.awt.Dimension(60, 79));
        tabelfilm.setPreferredSize(new java.awt.Dimension(300, 79));
        tabelfilm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelfilmMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelfilm);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 56, 480, 250));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Logout.png"))); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 30, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\4 (1).png")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void table(){
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("Judul Film");
        tbl.addColumn("Genre");
        tbl.addColumn("Durasi");
        tbl.addColumn("Rating Film");
    
        try {
            Statement st = (Statement) Koneksi.getConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM datafilm");
            
            while(rs.next()){
                tbl.addRow(new Object[] {
                    rs.getString("film"),
                    rs.getString("Genre"),
                    rs.getString("Durasi"),
                    rs.getString("Rating"),
                });
                  tabelfilm.setModel(tbl);
            }
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Koneksi Database Gagal" + e.getMessage());
        }
    }
    
    public void hapus(){
        judulfilm.setText("");
        genrefilm.setText("");
        durasifilm.setText("");
        ratingfilm.setText("");
    }
    
    private void perbaruifilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perbaruifilmActionPerformed
        try {
            if(judulfilm.getText().isEmpty() || genrefilm.getText().isEmpty() ||
                durasifilm.getText().isEmpty() || ratingfilm.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Tidak ada data yang diperbarui");
            } else {
                String sebelum = tabelfilm.getValueAt(tabelfilm.getSelectedRow(), 0).toString();
                String sql = "UPDATE datafilm SET film='" + judulfilm.getText() + "',Genre ='" + genrefilm.getText()
                + "',Durasi ='" + durasifilm.getText() + "',Rating ='"
                + ratingfilm.getText() + "' WHERE film='" + sebelum + "'";
                Connection con = (Connection) Koneksi.getConnection();
                PreparedStatement pst = con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Berhasil Update Data");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Update Data "+e.getMessage());
        }
        hapus();
    }//GEN-LAST:event_perbaruifilmActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        try {
            String sql = "SELECT * FROM datafilm";
            Connection con = (Connection) Koneksi.getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Berhasil Refresh Data");
            tambahfilm.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        table();
        hapus();
    }//GEN-LAST:event_refreshActionPerformed

    private void tambahfilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahfilmActionPerformed
        try {
            if(judulfilm.getText().isEmpty() || genrefilm.getText().isEmpty() ||
                durasifilm.getText().isEmpty() || ratingfilm.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Data Kosong.");
                hapus();
            } else {
                String sql = "INSERT INTO datafilm (film, Genre, Durasi, rating) " +
                "VALUES ('" + judulfilm.getText() + "', '" + genrefilm.getText() + "', '"
                + durasifilm.getText() + "', '" + ratingfilm.getText() + "')";
                Connection con = (Connection) Koneksi.getConnection();
                PreparedStatement pst = con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Berhasil Menyimpan");
                hapus();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Menyimpan" + e.getMessage());
        }
    }//GEN-LAST:event_tambahfilmActionPerformed

    private void hapusfilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusfilmActionPerformed
        try {
            if(judulfilm.getText().isEmpty() || genrefilm.getText().isEmpty() ||
                durasifilm.getText().isEmpty() || ratingfilm.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Tidak ada data yang dihapus.");
            } else{
                int pilihan = tabelfilm.getSelectedRow();
                String akanDihapus = tabelfilm.getValueAt(pilihan, 0).toString();

                String sql = "DELETE FROM datafilm WHERE film='" + akanDihapus + "'";
                Connection con = (Connection) Koneksi.getConnection();
                PreparedStatement pst = con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Berhasil Menghapus Data");
                hapus();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Menghapus Data" + e.getMessage());
        }
    }//GEN-LAST:event_hapusfilmActionPerformed

    private void tabelfilmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelfilmMouseClicked
        int tabeldata = tabelfilm.getSelectedRow();
        judulfilm.setText(tabelfilm.getValueAt(tabeldata, 0).toString());
        genrefilm.setText(tabelfilm.getValueAt(tabeldata, 1).toString());
        durasifilm.setText(tabelfilm.getValueAt(tabeldata, 2).toString());
        ratingfilm.setText(tabelfilm.getValueAt(tabeldata, 3).toString());
        tambahfilm.setEnabled(false);
    }//GEN-LAST:event_tabelfilmMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        Mouse1 = evt.getX();
        Mouse2 = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - Mouse1, y - Mouse2);
    }//GEN-LAST:event_formMouseDragged

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        int pilihan = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin logout?", 
                                                "Konfirmasi Logout", JOptionPane.YES_NO_OPTION);
        if (pilihan == JOptionPane.YES_OPTION) {
            new pilihanlogin().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_exitMouseClicked


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
            java.util.logging.Logger.getLogger(pageAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pageAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pageAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pageAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pageAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField durasifilm;
    private javax.swing.JLabel exit;
    private javax.swing.JTextField genrefilm;
    private javax.swing.JButton hapusfilm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField judulfilm;
    private javax.swing.JButton perbaruifilm;
    private javax.swing.JTextField ratingfilm;
    private javax.swing.JButton refresh;
    private javax.swing.JTable tabelfilm;
    private javax.swing.JButton tambahfilm;
    // End of variables declaration//GEN-END:variables
}
