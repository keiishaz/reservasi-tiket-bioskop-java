package tugasbesarkel6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class register extends javax.swing.JFrame {
    int Mouse1, Mouse2;
    
    public register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backbtn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idbox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passbox = new javax.swing.JTextField();
        btnRegist = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        userbox1 = new javax.swing.JTextField();
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

        backbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Left.png"))); // NOI18N
        backbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backbtnMouseClicked(evt);
            }
        });
        getContentPane().add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("REGISTER");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 100, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/User Male_1.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, -1));

        idbox.setText("ID(maks. 6 karakter)");
        idbox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        idbox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idboxFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                idboxFocusLost(evt);
            }
        });
        getContentPane().add(idbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 182, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Key.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 30, 30));

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
        getContentPane().add(passbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 182, 30));

        btnRegist.setText("Register");
        btnRegist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegist, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\all u need\\tubes source\\cinema2.jpeg")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 370));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Identity Theft.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        userbox1.setText("Username");
        userbox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        userbox1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userbox1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userbox1FocusLost(evt);
            }
        });
        getContentPane().add(userbox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 182, 30));

        jPanel1.setBackground(new java.awt.Color(226, 199, 153));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 340, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtnMouseClicked
        new loginuser().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backbtnMouseClicked

    private void btnRegistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistActionPerformed
        try {
            if(userbox1.getText().isEmpty() || userbox1.getText().equals("Username") ||
                passbox.getText().isEmpty() || passbox.getText().equals("Password") ||
                idbox.getText().isEmpty() || idbox.getText().equals("ID(maks. 6 karakter)")){
                JOptionPane.showMessageDialog(null, "Username, Password, ID Tidak Boleh Kosong");
            }else {
                String sql = "INSERT INTO akun VALUES ('"  + idbox.getText() + "','"
                + userbox1.getText() + "','" + passbox.getText() + "')";
                Connection con = (Connection) Koneksi.getConnection();
                PreparedStatement pst = con.prepareStatement(sql);
                pst.execute();
                new loginuser().show();
                this.dispose();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Menyimpan " + e.getMessage());
        }
    }//GEN-LAST:event_btnRegistActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - Mouse1, y - Mouse2);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        Mouse1 = evt.getX();
        Mouse2 = evt.getY();
    }//GEN-LAST:event_formMousePressed

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

    private void userbox1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userbox1FocusLost
        String user1 = userbox1.getText();
        if(user1.equals("")){
            userbox1.setText("Username");
        }
    }//GEN-LAST:event_userbox1FocusLost

    private void userbox1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userbox1FocusGained
        String user = userbox1.getText();
        if(user.equals("Username")){
            userbox1.setText("");
        }
    }//GEN-LAST:event_userbox1FocusGained

    private void idboxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idboxFocusLost
        String user1 = idbox.getText();
        if(user1.equals("")){
            idbox.setText("ID(maks. 6 karakter)");
        }
    }//GEN-LAST:event_idboxFocusLost

    private void idboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idboxFocusGained
        String user = idbox.getText();
        if(user.equals("ID(maks. 6 karakter)")){
            idbox.setText("");
        }
    }//GEN-LAST:event_idboxFocusGained

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backbtn;
    private javax.swing.JButton btnRegist;
    private javax.swing.JTextField idbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField passbox;
    private javax.swing.JTextField userbox1;
    // End of variables declaration//GEN-END:variables
}
