package tugasbesarkel6;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class loginadmin extends javax.swing.JFrame {
    int Mouse1, Mouse2;
    
    public loginadmin() {
        initComponents();
        pilihanid();
        kosong();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        passbox = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pilihanid = new javax.swing.JComboBox<>();
        userbox = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

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

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/User Male_1.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Key.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 30, 30));

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
        getContentPane().add(passbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 182, 30));

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("LOGIN ADMIN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 140, -1));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Left.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Identity Theft.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, 50));

        pilihanid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pilihanid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihanidActionPerformed(evt);
            }
        });
        getContentPane().add(pilihanid, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 182, 30));

        userbox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(userbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 180, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\all u need\\tubes source\\cinema2.jpeg")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 370));

        jPanel1.setBackground(new java.awt.Color(226, 199, 153));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 340, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void pilihanid(){
        try {
            Connection  con = (Connection) Koneksi.getConnection();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM admin";
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
    
    private void passboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passboxFocusGained
        String pass = passbox.getText();
        if(pass.equals("Password")){
            passbox.setText("");
        }
    }//GEN-LAST:event_passboxFocusGained

    private void passboxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passboxFocusLost
        String pass1 = passbox.getText();
        if(pass1.equals("")){
            passbox.setText("Password");
        }
    }//GEN-LAST:event_passboxFocusLost

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        try {
            String sql = "SELECT * FROM admin WHERE "+" Username='" + userbox.getText() + "'";
            Connection  con = (Connection) Koneksi.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()){
                if (passbox.getText().equals(rs.getString("Password"))){
                        new pageAdmin().show();
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

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        new pilihanlogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void pilihanidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihanidActionPerformed
        String idterpilih = (String) pilihanid.getSelectedItem();
         try {
            Connection  con = (Connection) Koneksi.getConnection();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM admin WHERE ID = '" + idterpilih + "'";
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                userbox.setText(rs.getString("Username"));
            }
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Gagal" + e.getMessage());
        }
    }//GEN-LAST:event_pilihanidActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        Mouse1 = evt.getX();
        Mouse2 = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - Mouse1, y - Mouse2);
    }//GEN-LAST:event_formMouseDragged

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
            java.util.logging.Logger.getLogger(loginadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginadmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField passbox;
    private javax.swing.JComboBox<String> pilihanid;
    private javax.swing.JTextField userbox;
    // End of variables declaration//GEN-END:variables
}
