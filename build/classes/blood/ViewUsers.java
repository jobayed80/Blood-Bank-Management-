/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blood;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author acer
 */
public class ViewUsers extends javax.swing.JFrame {

    
    
    public ViewUsers() {
        initComponents();
        
        
    
        
        
        
    }

    public Connection getConnection() {
        Connection con = null;
        try {

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood", "root", "***###botki143JN");

            return con;
        } catch (Exception e) {
            return null;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtSearchEmail = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtEmail = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtPass = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        ErrorEmail = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        close = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(879, 355));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(36, 36, 36));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 3, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(36, 36, 36));

        txtSearchEmail.setBackground(new java.awt.Color(36, 36, 36));
        txtSearchEmail.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        txtSearchEmail.setForeground(new java.awt.Color(204, 204, 255));
        txtSearchEmail.setText("Your E-mail");
        txtSearchEmail.setBorder(null);
        txtSearchEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchEmailFocusLost(evt);
            }
        });
        txtSearchEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchEmailKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSearchEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSearchEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 190, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 190, 10));

        txtEmail.setBackground(new java.awt.Color(36, 36, 36));
        txtEmail.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(204, 204, 255));
        txtEmail.setText("E-mail Null");
        txtEmail.setBorder(null);
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 230, 40));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 230, 10));

        txtPass.setBackground(new java.awt.Color(36, 36, 36));
        txtPass.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        txtPass.setForeground(new java.awt.Color(204, 204, 255));
        txtPass.setText("Password Null");
        txtPass.setBorder(null);
        txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPassFocusLost(evt);
            }
        });
        jPanel2.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 230, 41));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 230, 10));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("E-mail");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 50, -1));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 50, 10));

        ErrorEmail.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        ErrorEmail.setForeground(new java.awt.Color(255, 51, 51));
        ErrorEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(ErrorEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 200, 30));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, 40, -1));

        close.setBackground(new java.awt.Color(36, 36, 36));
        close.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        close.setForeground(new java.awt.Color(204, 204, 255));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("Close");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel2.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 40, -1));

        jButton1.setBackground(new java.awt.Color(36, 36, 36));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 255));
        jButton1.setText("Close");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 80, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        txtEmail.setEditable(false);
        txtPass.setEditable(false);
       
    }//GEN-LAST:event_formComponentShown

    private void txtSearchEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchEmailFocusGained
       
        if(txtSearchEmail.getText().equals("Your E-mail"))
        {
            txtSearchEmail.setText("");
            txtSearchEmail.setForeground(new Color(204,204,255));
            
        }
    }//GEN-LAST:event_txtSearchEmailFocusGained

    private void txtSearchEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchEmailFocusLost
       
        if(txtSearchEmail.getText().equals(""))
        {
            txtSearchEmail.setText("Your E-mail");
            txtSearchEmail.setForeground(new Color(204,204,255));
            
        }
    }//GEN-LAST:event_txtSearchEmailFocusLost

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        
        if(txtEmail.getText().equals("E-mail Null"))
        {
            txtEmail.setText("");
            txtEmail.setForeground(new Color(204,204,255));
            
        }
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
       
        if(txtEmail.getText().equals(""))
        {
            txtEmail.setText("E-mail Null");
            txtEmail.setForeground(new Color(204,204,255));
            
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained
        
        if(txtPass.getText().equals("Password Null"))
        {
            txtPass.setText("");
            txtPass.setForeground(new Color(204,204,255));
            
        }
        
    }//GEN-LAST:event_txtPassFocusGained

    private void txtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusLost
       
        if(txtPass.getText().equals(""))
        {
            txtPass.setText("Password Null");
            txtPass.setForeground(new Color(204,204,255));
            
        }
    }//GEN-LAST:event_txtPassFocusLost

    private void txtSearchEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchEmailKeyReleased
        
        String p = txtSearchEmail.getText();
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood", "root", "***###botki143JN");
            Statement st = (Statement)con.createStatement();
            String query = "select *from reg1 where Email='"+p+"'";
            ResultSet rs = st.executeQuery(query);
            //PreparedStatement st = con.prepareStatement("select * from reg where Pass=?");  
//            st.setString(1, p); 
           
            //ResultSet rs = st.executeQuery();  
            if(rs.next())
            {
               String s = rs.getString(1);  
               String s1 = rs.getString(2);
               txtEmail.setText(s);
               txtPass.setText(s1);
               txtEmail.setEditable(false);
               txtPass.setEditable(false);
               ErrorEmail.setText(null);
//             txtEmail.setText(rs.getString(1));
//             txtPass.setText(rs.getString(2));
               
            }
            else
            {
                ErrorEmail.setText("*Sorry! E-mail id don't match");
                ///txtSearchEmail.requestFocus();
            }
           
            
//            ResultSet rs = st.executeQuery(query);
//            if(rs.next())
//            {
//                txtEmail.setText(rs.getString(1));
//                txtPass.setText(rs.getString(2));
//                
//            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
       
    }//GEN-LAST:event_txtSearchEmailKeyReleased

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked

        dispose();

    }//GEN-LAST:event_closeMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ViewUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewUsers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewUsers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ErrorEmail;
    private javax.swing.JLabel close;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtSearchEmail;
    // End of variables declaration//GEN-END:variables
}
