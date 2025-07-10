package tugasbesarkel6;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class HalamanUtama extends javax.swing.JFrame {
    int Mouse1, Mouse2;
    
    public HalamanUtama() {
        initComponents();
        table();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        pesantiket = new javax.swing.JLabel();
        pesanbox = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        detailfilm1 = new javax.swing.JTable();
        exit = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("FILM YANG SEDANG TAYANG SAAT INI");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 270, -1));

        pesantiket.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        pesantiket.setForeground(new java.awt.Color(255, 255, 255));
        pesantiket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/New Ticket_2_1.png"))); // NOI18N
        pesantiket.setText("  Pesan Tiket");
        pesantiket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pesantiketMouseClicked(evt);
            }
        });
        getContentPane().add(pesantiket, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, -1, -1));

        pesanbox.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        pesanbox.setForeground(new java.awt.Color(255, 255, 255));
        pesanbox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Receipt_2.png"))); // NOI18N
        pesanbox.setText(" Pesanan");
        pesanbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pesanboxMouseClicked(evt);
            }
        });
        getContentPane().add(pesanbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 140, 30));

        detailfilm1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(detailfilm1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 500, 230));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Logout.png"))); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 30, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\1.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void table() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Judul");
        model.addColumn("Genre");
        model.addColumn("Durasi");
        model.addColumn("Rating");
    
        try {
            Statement st = (Statement) Koneksi.getConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT film, Genre, Durasi, Rating FROM datafilm");
            
            while(rs.next()){
                String judul = rs.getString("film");
                String genre = rs.getString("Genre");
                String durasi = rs.getString("Durasi");
                String rating = rs.getString("Rating");
                model.addRow(new Object[]{judul, genre, durasi, rating});
            } 
            detailfilm1.setModel(model);
            detailfilm1.setRowHeight(50);
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Koneksi Database Gagal" + e.getMessage());
        }
    }
    
    private void pesantiketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesantiketMouseClicked
        new PesanTiket().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pesantiketMouseClicked

    private void pesanboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pesanboxMouseClicked
        new Pesanan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pesanboxMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
    int pilihan = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin logout?", 
                                            "Konfirmasi Logout", JOptionPane.YES_NO_OPTION);
    if (pilihan == JOptionPane.YES_OPTION) {
        new pilihanlogin().setVisible(true);
        this.dispose();
    }
    }//GEN-LAST:event_exitMouseClicked

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - Mouse1, y - Mouse2);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        Mouse1 = evt.getX();
        Mouse2 = evt.getY();
    }//GEN-LAST:event_formMousePressed

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
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HalamanUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HalamanUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable detailfilm1;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel pesanbox;
    private javax.swing.JLabel pesantiket;
    // End of variables declaration//GEN-END:variables
}
