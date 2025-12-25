
import java.awt.Color;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(login.class.getName());

    public login() {
        initComponents();
        jLabel2.setVisible(false);
        this.setSize(1366, 768);          // Mengatur ukuran ke 1366x768
        this.setResizable(false);         // Membuat ukuran fixed (tidak bisa dibesarkan)
        this.setLocationRelativeTo(null); // Membuat window muncul di tengah layar
        
        
        styleLoginButton();        // ← Tambahkan ini
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(255, 227, 238));
        jTextField1.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setText("Masukan Username");
        jTextField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 15, 10, 15));
        jTextField1.setSelectionColor(new java.awt.Color(102, 102, 102));
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 323, 316, 61));

        jCheckBox1.setBorder(null);
        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 440, -1, -1));

        jLabel2.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 66));
        jLabel2.setText("Username atau Password Salah");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 490, -1, -1));

        jButton2.setBackground(new java.awt.Color(238, 70, 119));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 222, 222));
        jButton2.setText("Login");
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 520, 316, 61));

        jPasswordField1.setBackground(new java.awt.Color(255, 227, 238));
        jPasswordField1.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField1.setText("Masukan Password");
        jPasswordField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 15, 10, 15));
        jPasswordField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPasswordField1.setPreferredSize(new java.awt.Dimension(146, 30));
        jPasswordField1.setSelectionColor(new java.awt.Color(102, 102, 102));
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 419, 316, 61));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(81, 6, 21));
        jLabel1.setText("Datang Kembali");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 90, 270, 40);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(81, 6, 21));
        jLabel3.setText("Password");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(42, 260, 110, 16);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(81, 6, 21));
        jLabel4.setText("Username");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(42, 160, 110, 16);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Open Sans", 1, 32)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(81, 6, 21));
        jLabel5.setText("Selamat");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 50, 140, 30);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 134, 400, 500));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/loginlek.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // login buttons style
     private void styleLoginButton() {
        // Hilangkan semua border/stroke
        jButton2.setBorderPainted(false);
        jButton2.setFocusPainted(false);
        jButton2.setContentAreaFilled(false);  // ← INI PENTING!
        jButton2.setOpaque(true);
        jButton2.setBorder(null);
        
        
        // Pastikan warna background tetap
        jButton2.setBackground(new Color(238, 70, 119));
        jButton2.setForeground(new Color(255, 222, 222));
        
        // Tambahkan hover effect (opsional)
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent e) {
                jButton2.setBackground(new Color(255, 90, 139)); // lebih terang
            }
            
            @Override
            public void mouseExited(java.awt.event.MouseEvent e) {
                jButton2.setBackground(new Color(238, 70, 119)); // warna asli
            }
            
            @Override
            public void mousePressed(java.awt.event.MouseEvent e) {
                jButton2.setBackground(new Color(218, 50, 99)); // lebih gelap
            }
            
            @Override
            public void mouseReleased(java.awt.event.MouseEvent e) {
                jButton2.setBackground(new Color(255, 90, 139));
            }
        });
    }
    
    
    //login button untuk menampilkan jika password/username salah
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jTextField1.getText().equals("admin") && jPasswordField1.getText().equals("admin123")){
            setVisible(false);
            new home().setVisible(true);
        }
        else jLabel2.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
    
    // 
    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost
        jLabel2.setVisible(false);
        if(jPasswordField1.getText().equals("'")){
            jPasswordField1.setText("Masukan Password");
            jPasswordField1.setForeground(new Color(81,6,21));
        }
    }//GEN-LAST:event_jPasswordField1FocusLost

    // jika klik field password textnya akan hilang
    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
        jLabel2.setVisible(false);
        
        if(jPasswordField1.getText().equals("Masukan Password")){
            jPasswordField1.setText("");
            jPasswordField1.setForeground(new Color(81,6,21));
        }
    }//GEN-LAST:event_jPasswordField1FocusGained

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    
    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        jLabel2.setVisible(false);
        if(jTextField1.getText().equals("Masukan Username")){
            jTextField1.setText("");
            jTextField1.setForeground(new Color(81,6,21));
        }
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        jLabel2.setVisible(false);
        if(jTextField1.getText().equals("")){
            jTextField1.setText("Masukan Username");
            jTextField1.setForeground(new Color(81,6,21));
        }
    }//GEN-LAST:event_jTextField1FocusLost

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected()){
            jPasswordField1.setEchoChar((char)0);
        }
        else {
            jPasswordField1.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new login().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
