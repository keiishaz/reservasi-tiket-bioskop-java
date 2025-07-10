package tugasbesarkel6;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;

public class PesanTiket extends javax.swing.JFrame {
    String tiketterpilih = "";
    int Mouse1, Mouse2;
    int angka, hargatiket;
    int kursiterpilih = 0;
    int jumlahtiket;
    
    public PesanTiket() {
        initComponents();
        combobox();
        radiobutton();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        kmbali = new javax.swing.JLabel();
        pesanbtn = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btn_a1 = new javax.swing.JButton();
        btn_a2 = new javax.swing.JButton();
        btn_a3 = new javax.swing.JButton();
        btn_b1 = new javax.swing.JButton();
        btn_b2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        namaPngguna = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        combobox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jumlahbox = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        reguler = new javax.swing.JRadioButton();
        premium = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        hargaFilm = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        no_kursi = new javax.swing.JTextField();
        hapuskursi = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        combojam = new javax.swing.JComboBox<>();
        okbtn = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        status = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        okbtn1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        totalharga = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        kmbali1 = new javax.swing.JLabel();
        pmbyrn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();

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

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOKET PEMESANAN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 290, -1));

        kmbali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Left_1_1.png"))); // NOI18N
        kmbali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kmbaliMouseClicked(evt);
            }
        });
        getContentPane().add(kmbali, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        pesanbtn.setText("Buat Pesanan");
        pesanbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesanbtnActionPerformed(evt);
            }
        });
        getContentPane().add(pesanbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, 110, -1));

        jPanel1.setBackground(new java.awt.Color(231, 225, 182));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Pilih bangku");

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 184, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        btn_a1.setText("A1");
        btn_a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_a1ActionPerformed(evt);
            }
        });

        btn_a2.setText("A2");
        btn_a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_a2ActionPerformed(evt);
            }
        });

        btn_a3.setText("A3");
        btn_a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_a3ActionPerformed(evt);
            }
        });

        btn_b1.setText("B1");
        btn_b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_b1ActionPerformed(evt);
            }
        });

        btn_b2.setText("B2");
        btn_b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_b2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_a1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btn_a2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(btn_a3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_b1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(btn_b2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_a1)
                    .addComponent(btn_a2)
                    .addComponent(btn_a3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_b1)
                    .addComponent(btn_b2))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 200, 160));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Nama Pemesan :");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 90, 100, -1));
        getContentPane().add(namaPngguna, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 127, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Film :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 40, -1));

        getContentPane().add(combobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 156, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Jumlah :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 50, -1));
        getContentPane().add(jumlahbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 105, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Jenis tiket :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 70, -1));

        reguler.setForeground(new java.awt.Color(255, 255, 255));
        reguler.setText("Reguler");
        reguler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regulerActionPerformed(evt);
            }
        });
        getContentPane().add(reguler, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        premium.setForeground(new java.awt.Color(255, 255, 255));
        premium.setText("Premium");
        premium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                premiumActionPerformed(evt);
            }
        });
        getContentPane().add(premium, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 72, -1));

        jPanel6.setBackground(new java.awt.Color(192, 130, 97));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Harga Tiket : Rp.");

        hargaFilm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        hargaFilm.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hargaFilm, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hargaFilm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 178, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("No. Kursi :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 60, 20));
        getContentPane().add(no_kursi, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 165, -1));

        hapuskursi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        hapuskursi.setForeground(new java.awt.Color(255, 255, 255));
        hapuskursi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Cancel.png"))); // NOI18N
        hapuskursi.setText("Hapus");
        hapuskursi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hapuskursiMouseClicked(evt);
            }
        });
        getContentPane().add(hapuskursi, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, -1, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Jam tayang :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, -1, -1));

        combojam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "09:00", "13:00", "15:00", "17:00" }));
        getContentPane().add(combojam, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, -1, -1));

        okbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        okbtn.setForeground(new java.awt.Color(255, 255, 255));
        okbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Done_2.png"))); // NOI18N
        okbtn.setText(" OK");
        okbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okbtnMouseClicked(evt);
            }
        });
        getContentPane().add(okbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, -1, 22));

        jPanel2.setBackground(new java.awt.Color(192, 130, 97));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        status.setBackground(new java.awt.Color(255, 255, 255));
        status.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total Harga");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Kembali");

        okbtn1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        okbtn1.setForeground(new java.awt.Color(255, 255, 255));
        okbtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Done_2.png"))); // NOI18N
        okbtn1.setText("Bayar");
        okbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okbtn1MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Pembayaran");

        totalharga.setBackground(new java.awt.Color(255, 255, 255));
        totalharga.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Status Pembayaran");

        kmbali1.setBackground(new java.awt.Color(255, 255, 255));
        kmbali1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bayar");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Metode bayar");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lainnya", "Bank Mandiri", "Bank BRI", "Bank BNI" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel13))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, 0, 119, Short.MAX_VALUE)
                            .addComponent(totalharga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(pmbyrn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(kmbali1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel17)
                                        .addGap(11, 11, 11)
                                        .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(okbtn1)))
                .addContainerGap(10, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalharga, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(okbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pmbyrn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kmbali1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 320, 200));

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Downloads\\5.png")); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 770, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void combobox(){
         try {
            Connection  con = (Connection) Koneksi.getConnection();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM datafilm";
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                combobox.addItem(rs.getString("film"));
            }
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Gagal" + e.getMessage());
        }
    }
    
    public void radiobutton(){
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(reguler);
        buttonGroup.add(premium);
    }
    
    public void hidupkanbutton(){
        btn_a1.setEnabled(true);
        btn_a2.setEnabled(true);
        btn_a3.setEnabled(true);
        btn_b1.setEnabled(true);
        btn_b2.setEnabled(true);
    }
    
    public void matikanbutton() {
        btn_a1.setEnabled(false);
        btn_a2.setEnabled(false);
        btn_a3.setEnabled(false);
        btn_b1.setEnabled(false);
        btn_b2.setEnabled(false);
    }
    
    private void kmbaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kmbaliMouseClicked
        new HalamanUtama().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_kmbaliMouseClicked
    
    private void regulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regulerActionPerformed
        if(reguler.isSelected()){
            int htiket = 20000;
            hargaFilm.setText(String.valueOf(htiket));
            tiketterpilih = "Reguler";
        }
    }//GEN-LAST:event_regulerActionPerformed

    private void premiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_premiumActionPerformed
        if(premium.isSelected()){
            int htiket = 30000;
            hargaFilm.setText(String.valueOf(htiket));
            tiketterpilih = "Premium";
        }
    }//GEN-LAST:event_premiumActionPerformed

    private void btn_a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_a1ActionPerformed
        jumlahtiket = Integer.parseInt(jumlahbox.getText());
        if (kursiterpilih < jumlahtiket) {
            String pilihan = no_kursi.getText() + btn_a1.getText()+" ";
            no_kursi.setText(pilihan);
            kursiterpilih++;
            btn_a1.setEnabled(false);

             if(kursiterpilih == jumlahtiket) {
                matikanbutton();
                }
        }
    }//GEN-LAST:event_btn_a1ActionPerformed

    private void btn_a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_a2ActionPerformed
        jumlahtiket = Integer.parseInt(jumlahbox.getText());
        if (kursiterpilih < jumlahtiket) {
            String pilihan = no_kursi.getText() + btn_a2.getText()+" ";
            no_kursi.setText(pilihan);
            kursiterpilih++;
            btn_a2.setEnabled(false);

             if(kursiterpilih == jumlahtiket) {
                matikanbutton();
                }
        }
    }//GEN-LAST:event_btn_a2ActionPerformed

    private void btn_a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_a3ActionPerformed
        jumlahtiket = Integer.parseInt(jumlahbox.getText());
        if (kursiterpilih < jumlahtiket) {
            String pilihan = no_kursi.getText() + btn_a3.getText()+" ";
            no_kursi.setText(pilihan);
            kursiterpilih++;
            btn_a3.setEnabled(false);

             if(kursiterpilih == jumlahtiket) {
                matikanbutton();
                }
        }
    }//GEN-LAST:event_btn_a3ActionPerformed

    private void btn_b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_b1ActionPerformed
        jumlahtiket = Integer.parseInt(jumlahbox.getText());
        if (kursiterpilih < jumlahtiket) {
            String pilihan = no_kursi.getText() + btn_b1.getText()+" ";
            no_kursi.setText(pilihan);
            kursiterpilih++;
            btn_b1.setEnabled(false);

             if(kursiterpilih == jumlahtiket) {
                matikanbutton();
                }
        }
    }//GEN-LAST:event_btn_b1ActionPerformed

    private void btn_b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_b2ActionPerformed
        jumlahtiket = Integer.parseInt(jumlahbox.getText());
        if (kursiterpilih < jumlahtiket) {
            String pilihan = no_kursi.getText() + btn_b2.getText()+" ";
            no_kursi.setText(pilihan);
            kursiterpilih++;
            btn_b2.setEnabled(false);

             if(kursiterpilih == jumlahtiket) {
                matikanbutton();
                }
        }
    }//GEN-LAST:event_btn_b2ActionPerformed

    private void hapuskursiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hapuskursiMouseClicked
        no_kursi.setText("");
        kursiterpilih = 0;
        hidupkanbutton();
    }//GEN-LAST:event_hapuskursiMouseClicked
    
    private void pesanbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesanbtnActionPerformed
        try {
                jumlahtiket = Integer.parseInt(jumlahbox.getText());
                String pemesan = namaPngguna.getText();
                String judul = (String) combobox.getSelectedItem();
                String tiket = String.valueOf(jumlahbox.getText());
                String kursi = no_kursi.getText();
                String jam = (String) combojam.getSelectedItem();
                String pmbayaranstts = status.getText();
                
                if (no_kursi.getText().isEmpty() || no_kursi.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Anda belum memilih kursi.");
                } else if (namaPngguna.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Anda belum mengisi nama.");
                } else if (kursiterpilih < jumlahtiket) {
                    JOptionPane.showMessageDialog(null, "Kursi yang anda pilih kurang.");
                }else if ("Lunas".equals(pmbayaranstts)) {
                    String sql = "INSERT INTO pesanan (pengguna, judul, jenis, jumlah, bangku, jam, status) " +
                                 "VALUES ('" + pemesan + "', '" + judul + "', '" + tiketterpilih + "', '" 
                                 + tiket + "', '" + kursi + "', '" + jam + "', '" + pmbayaranstts + "')";
                    Connection con = (Connection) Koneksi.getConnection();
                    PreparedStatement pst = con.prepareStatement(sql);
                    pst.execute();

                    JOptionPane.showMessageDialog(null, "Berhasil Dipesan");
                    new Pesanan().setVisible(true);
                    this.dispose();
                }else {
                    JOptionPane.showMessageDialog(null, "Selesaikan pembayaran terlebih dahulu.");
                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Dipesan" + e.getMessage());
        }
    }//GEN-LAST:event_pesanbtnActionPerformed

    private void okbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okbtnMouseClicked
        int angkajml = Integer.parseInt(jumlahbox.getText());
            if(angkajml < 1 || angkajml > 5){
                matikanbutton();
                JOptionPane.showMessageDialog(null, "Angka yang dimasukkan minimal 1 dan maksimal 5");
                jumlahbox.setText("");
                hidupkanbutton();
            }
        
            int tiket = Integer.parseInt(hargaFilm.getText());
            int total = angkajml * tiket;
            totalharga.setText(String.valueOf(total));
    }//GEN-LAST:event_okbtnMouseClicked

    private void okbtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okbtn1MouseClicked
        int ttlharga = Integer.parseInt(totalharga.getText());
        int bayar = Integer.parseInt(pmbyrn.getText());
            if(bayar < ttlharga){
                JOptionPane.showMessageDialog(null, "Pembayaran tidak cukup.");
                pmbyrn.setText("");
            } else {
                int kembali = bayar - ttlharga;
                kmbali1.setText(String.valueOf(kembali));
                status.setText("Lunas");
            }
    }//GEN-LAST:event_okbtn1MouseClicked

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
            java.util.logging.Logger.getLogger(PesanTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesanTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesanTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesanTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesanTiket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_a1;
    private javax.swing.JButton btn_a2;
    private javax.swing.JButton btn_a3;
    private javax.swing.JButton btn_b1;
    private javax.swing.JButton btn_b2;
    private javax.swing.JComboBox<String> combobox;
    private javax.swing.JComboBox<String> combojam;
    private javax.swing.JLabel hapuskursi;
    private javax.swing.JLabel hargaFilm;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jumlahbox;
    private javax.swing.JLabel kmbali;
    private javax.swing.JLabel kmbali1;
    private javax.swing.JTextField namaPngguna;
    private javax.swing.JTextField no_kursi;
    private javax.swing.JLabel okbtn;
    private javax.swing.JLabel okbtn1;
    private javax.swing.JToggleButton pesanbtn;
    private javax.swing.JTextField pmbyrn;
    private javax.swing.JRadioButton premium;
    private javax.swing.JRadioButton reguler;
    private javax.swing.JLabel status;
    private javax.swing.JLabel totalharga;
    // End of variables declaration//GEN-END:variables
}