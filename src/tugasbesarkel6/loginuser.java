package tugasbesarkel6;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class loginuser extends javax.swing.JFrame {
    int Mouse1, Mouse2;
    
    public loginuser() {
        initComponents();
        pilihanid();
        kosong();
    }
    
    public void pilihanid(){
        try {
            Connection  con = (Connection) Koneksi.getConnection();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM akun";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                pilihanid.addItem(rs.getString("ID"));
            }
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Gagal" + e.getMessage());
        }
    }
    
    public void kosong(){
        pilihanid.setSelectedIndex(-1);
        userbox.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        passbox = new javax.swing.JTextField();
        back1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tomboldaftar = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pilihanid = new javax.swing.JComboBox<>();
        userbox = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("LOGIN USER");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 130, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Key.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 30, 30));

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, -1, -1));

        passbox.setText("Password");
        passbox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        passbox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passboxFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passboxFocusLost(evt);
            }
        });
        getContentPane().add(passbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 182, 30));

        back1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Left.png"))); // NOI18N
        back1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back1MouseClicked(evt);
            }
        });
        getContentPane().add(back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/User Male_1.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\all u need\\tubes source\\cinema2.jpeg")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 370));

        jLabel8.setText("Tidak memiliki akun?");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 111, 20));

        tomboldaftar.setForeground(new java.awt.Color(51, 51, 255));
        tomboldaftar.setText("Daftar Sekarang.");
        tomboldaftar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tomboldaftarMouseClicked(evt);
            }
        });
        getContentPane().add(tomboldaftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 100, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Identity Theft.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        pilihanid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pilihanid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihanidActionPerformed(evt);
            }
        });
        getContentPane().add(pilihanid, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 180, 30));

        userbox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        userbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userboxActionPerformed(evt);
            }
        });
        getContentPane().add(userbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 180, 30));

        jPanel1.setBackground(new java.awt.Color(226, 199, 153));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 340, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - Mouse1, y - Mouse2);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        Mouse1 = evt.getX();
        Mouse2 = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void back1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back1MouseClicked
        new pilihanlogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back1MouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        try {
            String sql = "SELECT * FROM akun WHERE "+" username='" + userbox.getText() + "'";
            Connection  con = (Connection) Koneksi.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()){
                if (passbox.getText().equals(rs.getString("Password"))){
                        new HalamanUtama().show();
                        this.dispose();
                }else{
                    JOptionPane.showMessageDialog(rootPane,"Password salah");
                    passbox.setText("");
                    userbox.requestFocus();
                }
            }else{
                JOptionPane.showMessageDialog(rootPane,"User Tidak DItemukan");
                userbox.setText("");
                passbox.setText("");
                userbox.requestFocus();
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(rootPane, "Gagal");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void passboxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passboxFocusLost
        String pass1 = passbox.getText();
        if(pass1.equals("")){
            passbox.setText("Password");
        }
    }//GEN-LAST:event_passboxFocusLost

    private void passboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passboxFocusGained
        String pass = passbox.getText();
        if(pass.equals("Password")){
            passbox.setText("");
        }
    }//GEN-LAST:event_passboxFocusGained

    private void tomboldaftarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tomboldaftarMouseClicked
        new register().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tomboldaftarMouseClicked

    private void pilihanidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihanidActionPerformed
        String idterpilih = (String) pilihanid.getSelectedItem();
         try {
            Connection  con = (Connection) Koneksi.getConnection();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM akun WHERE ID = '" + idterpilih + "'";
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                userbox.setText(rs.getString("Username"));
            }
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Gagal" + e.getMessage());
        }
    }//GEN-LAST:event_pilihanidActionPerformed

    private void userboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userboxActionPerformed

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
            java.util.logging.Logger.getLogger(loginuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginuser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back1;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField passbox;
    private javax.swing.JComboBox<String> pilihanid;
    private javax.swing.JLabel tomboldaftar;
    private javax.swing.JTextField userbox;
    // End of variables declaration//GEN-END:variables
}
