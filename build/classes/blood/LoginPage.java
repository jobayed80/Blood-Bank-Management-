/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blood;


import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.prefs.Preferences;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


/**
 *
 * @author acer
 */
public class LoginPage extends javax.swing.JFrame {

   public Preferences pref = Preferences.userRoot().node("Rememberme");
   
   
  
    
    public LoginPage() {
        initComponents();
        String usr = null;
        usr = pref.get("Email", usr);
        //username.setText(usr);
        txtEmail.setText(usr);
        
        String pss = null;
        pss = pref.get("Password",pss);
        txtPass.setText(pss);

//          try {
//            UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiInternalFrameTitlePane");
//        } catch (Exception e) {
//        
        
        labelR1.setVisible(false);
        labelR2.setVisible(false);
        labelR3.setVisible(false);
        labelR4.setVisible(false);
        labelR5.setVisible(false);
        labelR6.setVisible(false);
        labelR7.setVisible(false);
        labelR8.setVisible(false);
        labelR9.setVisible(false);
        labelR10.setVisible(false);
        labelR11.setVisible(false);
        labelR12.setVisible(false);
        labelR13.setVisible(false);
        labelR14.setVisible(false);
        labelR15.setVisible(false);
        labelR16.setVisible(false);
        labelR17.setVisible(false);
        txtEmail1.setVisible(false);
        txtPass1.setVisible(false);
        txtCpass1.setVisible(false);
        CboxSP.setVisible(false);
        btnSignup.setVisible(false);
        
        
        labelL1.setVisible(true);
        labelL2.setVisible(true);
        labelL3.setVisible(true);
        labelL4.setVisible(true);
        labelL5.setVisible(true);
        labelL6.setVisible(true);
        labelL7.setVisible(true);
        labelL8.setVisible(true);
        labelL9.setVisible(true);
        labelL10.setVisible(true);
        labelL11.setVisible(true);
        labelL12.setVisible(true);
        labelL13.setVisible(true);
        CboxRememPass.setVisible(true);
        CboxShowPass.setVisible(true);
        txtEmail.setVisible(true);
        txtPass.setVisible(true);
        btnSignIn.setVisible(true);
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
     
     public void saveemailpass(String Email,String Pass)
     {
         if(Email==null || Pass==null)
         {
             JOptionPane.showMessageDialog(null,"Email And PAss null");
         }
         else
         {
             String user = Email;
             pref.put("Email",Email);
             String pass = Pass;
             pref.put("Password",pass);
              System.out.println("Data disimpan");
             
         }
     }
     public final void checked(boolean remember)
     {
         if(remember==true)
         {
             saveemailpass(txtEmail.getText(),txtPass.getText());
         }
         else
         {
             System.out.println("Null karakter");
         }
     }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtEmail = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        labelL5 = new javax.swing.JSeparator();
        labelL9 = new javax.swing.JSeparator();
        labelL10 = new javax.swing.JLabel();
        labelL11 = new javax.swing.JSeparator();
        labelL12 = new javax.swing.JLabel();
        labelL3 = new javax.swing.JLabel();
        labelL8 = new javax.swing.JSeparator();
        labelL6 = new javax.swing.JLabel();
        labelL7 = new javax.swing.JSeparator();
        labelL4 = new javax.swing.JSeparator();
        CboxShowPass = new javax.swing.JCheckBox();
        btnSignIn = new javax.swing.JButton();
        labelL1 = new javax.swing.JLabel();
        labelL2 = new javax.swing.JLabel();
        CboxRememPass = new javax.swing.JCheckBox();
        labelL13 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        txtEmail1 = new javax.swing.JTextField();
        labelR5 = new javax.swing.JSeparator();
        txtPass1 = new javax.swing.JPasswordField();
        labelR8 = new javax.swing.JSeparator();
        txtCpass1 = new javax.swing.JPasswordField();
        labelR11 = new javax.swing.JSeparator();
        btnSignup = new javax.swing.JButton();
        labelR1 = new javax.swing.JLabel();
        labelR2 = new javax.swing.JLabel();
        CboxSP = new javax.swing.JCheckBox();
        labelR3 = new javax.swing.JLabel();
        labelR4 = new javax.swing.JSeparator();
        labelR6 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        labelR7 = new javax.swing.JSeparator();
        labelR9 = new javax.swing.JLabel();
        labelR10 = new javax.swing.JSeparator();
        labelR13 = new javax.swing.JLabel();
        labelR15 = new javax.swing.JSeparator();
        labelR16 = new javax.swing.JLabel();
        labelR17 = new javax.swing.JSeparator();
        labelR14 = new javax.swing.JLabel();
        labelR12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 20));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(34, 34, 34));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 10));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon("E:\\Icon Image\\Dashboard picture_prev_ui.png")); // NOI18N

        jPanel3.setBackground(new java.awt.Color(36, 36, 36));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEmail.setBackground(new java.awt.Color(36, 36, 36));
        txtEmail.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(153, 153, 255));
        txtEmail.setText(" E-mail");
        txtEmail.setBorder(null);
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        jPanel3.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 200, 40));

        txtPass.setBackground(new java.awt.Color(36, 36, 36));
        txtPass.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        txtPass.setForeground(new java.awt.Color(153, 153, 255));
        txtPass.setText("********");
        txtPass.setBorder(null);
        txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPassFocusLost(evt);
            }
        });
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        jPanel3.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 200, 40));
        jPanel3.add(labelL5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 200, 10));
        jPanel3.add(labelL9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 130, 10));

        labelL10.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        labelL10.setForeground(new java.awt.Color(153, 153, 255));
        labelL10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelL10.setText("or");
        jPanel3.add(labelL10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 30, 20));
        jPanel3.add(labelL11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 120, 10));

        labelL12.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        labelL12.setForeground(new java.awt.Color(153, 153, 255));
        labelL12.setText("Don't have an account ?");
        jPanel3.add(labelL12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 200, -1));

        labelL3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelL3.setIcon(new javax.swing.ImageIcon("E:\\Icon\\1.E-mail F.gif")); // NOI18N
        labelL3.setToolTipText("");
        jPanel3.add(labelL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 50, 50));
        jPanel3.add(labelL8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 200, 10));

        labelL6.setIcon(new javax.swing.ImageIcon("E:\\Icon\\pass.gif")); // NOI18N
        jPanel3.add(labelL6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, 30));
        jPanel3.add(labelL7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 50, 10));
        jPanel3.add(labelL4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 50, 10));

        CboxShowPass.setBackground(new java.awt.Color(36, 36, 36));
        CboxShowPass.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        CboxShowPass.setForeground(new java.awt.Color(153, 153, 255));
        CboxShowPass.setText("show password");
        CboxShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CboxShowPassActionPerformed(evt);
            }
        });
        jPanel3.add(CboxShowPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 120, -1));

        btnSignIn.setBackground(new java.awt.Color(36, 36, 36));
        btnSignIn.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        btnSignIn.setForeground(new java.awt.Color(153, 153, 255));
        btnSignIn.setText("SignIn");
        btnSignIn.setBorder(null);
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });
        jPanel3.add(btnSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 290, 40));

        labelL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelL1.setIcon(new javax.swing.ImageIcon("E:\\Icon Image\\3.LoginFrom.gif")); // NOI18N
        jPanel3.add(labelL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 120, 100));

        labelL2.setIcon(new javax.swing.ImageIcon("E:\\Icon\\1.sign   in.gif")); // NOI18N
        jPanel3.add(labelL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, 30));

        CboxRememPass.setBackground(new java.awt.Color(36, 36, 36));
        CboxRememPass.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        CboxRememPass.setForeground(new java.awt.Color(153, 153, 255));
        CboxRememPass.setText("Keep me");
        jPanel3.add(CboxRememPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 80, -1));

        labelL13.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        labelL13.setForeground(new java.awt.Color(153, 153, 255));
        labelL13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelL13.setText("SignUp");
        labelL13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelL13MouseClicked(evt);
            }
        });
        jPanel3.add(labelL13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 70, 60));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 310, -1));

        jPanel4.setBackground(new java.awt.Color(37, 37, 37));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(153, 0, 0), new java.awt.Color(153, 0, 0), new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255)));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel4.setMinimumSize(new java.awt.Dimension(290, 430));
        jPanel4.setPreferredSize(new java.awt.Dimension(244, 351));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEmail1.setBackground(new java.awt.Color(36, 36, 36));
        txtEmail1.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        txtEmail1.setForeground(new java.awt.Color(153, 153, 255));
        txtEmail1.setText("E-mail");
        txtEmail1.setBorder(null);
        txtEmail1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmail1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmail1FocusLost(evt);
            }
        });
        txtEmail1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmail1KeyReleased(evt);
            }
        });
        jPanel4.add(txtEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 210, 40));
        jPanel4.add(labelR5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 210, 10));

        txtPass1.setBackground(new java.awt.Color(36, 36, 36));
        txtPass1.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        txtPass1.setForeground(new java.awt.Color(153, 153, 255));
        txtPass1.setText("********");
        txtPass1.setBorder(null);
        txtPass1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPass1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPass1FocusLost(evt);
            }
        });
        txtPass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPass1ActionPerformed(evt);
            }
        });
        txtPass1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPass1KeyReleased(evt);
            }
        });
        jPanel4.add(txtPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 210, 40));
        jPanel4.add(labelR8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 210, 11));

        txtCpass1.setBackground(new java.awt.Color(36, 36, 36));
        txtCpass1.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        txtCpass1.setForeground(new java.awt.Color(153, 153, 255));
        txtCpass1.setText("********");
        txtCpass1.setBorder(null);
        txtCpass1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCpass1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCpass1FocusLost(evt);
            }
        });
        txtCpass1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCpass1KeyReleased(evt);
            }
        });
        jPanel4.add(txtCpass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 210, 40));

        labelR11.setBackground(new java.awt.Color(153, 0, 0));
        jPanel4.add(labelR11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 210, 10));

        btnSignup.setBackground(new java.awt.Color(36, 36, 36));
        btnSignup.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        btnSignup.setForeground(new java.awt.Color(153, 153, 255));
        btnSignup.setText("SignUp");
        btnSignup.setBorder(null);
        btnSignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSignupMouseClicked(evt);
            }
        });
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });
        jPanel4.add(btnSignup, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 290, 42));

        labelR1.setIcon(new javax.swing.ImageIcon("E:\\Icon Image\\3.LoginFrom.gif")); // NOI18N
        jPanel4.add(labelR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 120, 100));

        labelR2.setIcon(new javax.swing.ImageIcon("E:\\Icon\\1. sign  up.gif")); // NOI18N
        jPanel4.add(labelR2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, 30));

        CboxSP.setBackground(new java.awt.Color(36, 36, 36));
        CboxSP.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        CboxSP.setForeground(new java.awt.Color(153, 153, 255));
        CboxSP.setText("show  password");
        CboxSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CboxSPActionPerformed(evt);
            }
        });
        jPanel4.add(CboxSP, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, -1));

        labelR3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelR3.setIcon(new javax.swing.ImageIcon("E:\\Icon\\1.E-mail F.gif")); // NOI18N
        jPanel4.add(labelR3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 50, -1));
        jPanel4.add(labelR4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 50, -1));

        labelR6.setIcon(new javax.swing.ImageIcon("E:\\Icon\\pass.gif")); // NOI18N
        jPanel4.add(labelR6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, 30));
        jPanel4.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, -1, -1));
        jPanel4.add(labelR7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 50, -1));

        labelR9.setIcon(new javax.swing.ImageIcon("E:\\Icon\\pass.gif")); // NOI18N
        jPanel4.add(labelR9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 30, -1));
        jPanel4.add(labelR10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 50, -1));

        labelR13.setBackground(new java.awt.Color(36, 36, 36));
        labelR13.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        labelR13.setForeground(new java.awt.Color(153, 153, 255));
        labelR13.setText("Have an account ?");
        jPanel4.add(labelR13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, 50));
        jPanel4.add(labelR15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 130, -1));

        labelR16.setBackground(new java.awt.Color(36, 36, 36));
        labelR16.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        labelR16.setForeground(new java.awt.Color(204, 204, 255));
        labelR16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelR16.setText("or");
        jPanel4.add(labelR16, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 20, 20));
        jPanel4.add(labelR17, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 140, 10));

        labelR14.setBackground(new java.awt.Color(36, 36, 36));
        labelR14.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        labelR14.setForeground(new java.awt.Color(153, 153, 255));
        labelR14.setText("SignIn");
        labelR14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelR14MouseClicked(evt);
            }
        });
        jPanel4.add(labelR14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 70, 50));

        labelR12.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        labelR12.setForeground(new java.awt.Color(0, 255, 204));
        labelR12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(labelR12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 290, 20));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 150, 307, 10));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 312, 504));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon("E:\\Icon Image\\Dashboard picture_prev_ui.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 409, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(88, 88, 88)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(79, 79, 79)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1170, 700));

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(1280, 52));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\Icon\\closeAni.gif")); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\Icon\\MinusIconAnima.gif")); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(1102, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       
         this.setExtendedState(LoginPage.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
      
        if(txtEmail.getText().equals(" E-mail"))
        {
            txtEmail.setText("");
            txtEmail.setForeground(new Color(204,204,255));
            
        }
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
       
        if(txtEmail.getText().equals(""))
        {
            txtEmail.setText(" E-mail");
            txtEmail.setForeground(new Color(204,204,255));
            
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained
        
        if(txtPass.getText().equals("********"))
        {
            txtPass.setText("");
            txtPass.setForeground(new Color(204,204,255));
            
        } 
    }//GEN-LAST:event_txtPassFocusGained

    private void txtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusLost
        
        if(txtPass.getText().equals(""))
        {
            txtPass.setText("********");
            txtPass.setForeground(new Color(204,204,255));
            
        } 
    }//GEN-LAST:event_txtPassFocusLost

    private void CboxShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CboxShowPassActionPerformed
       
        if (CboxShowPass.isSelected()) {
            txtPass.setEchoChar((char) 0); //password = JPasswordField
        } else {
           txtPass.setEchoChar('*');
        }
    }//GEN-LAST:event_CboxShowPassActionPerformed

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        int flag=1;
        if (txtEmail.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Please Write Username !");
        } else if (txtPass.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please Write Password !");
        }
        else
        {
            try {
                
                String Driver = "com.mysql.jdbc.Driver";
                String URL = "jdbc:mysql://localhost:3306/blood";
                Class.forName(Driver);
                Connection Conn = DriverManager.getConnection(URL, "root", "***###botki143JN");
                Statement S = Conn.createStatement();
                ResultSet RS = S.executeQuery(
                        "SELECT * FROM reg1 where Email ='" + txtEmail.getText()
                        + "' and Pass ='" + txtPass.getText() + "'");
                
                while(RS.next())
                {
                    String email = RS.getString("Email");
                    String pass = RS.getString("Pass");
                    
                    if (email.equals(txtEmail.getText()) & pass.equals(txtPass.getText()))
                    {
                        flag=0;
                        break;

                        
                     
                    }
                   
                  
                
                }
                if(flag==0)
                {
//                    dispose();
//                    HomeSafe1 h = new HomeSafe1();
//                    h.setVisible(true);
                    if (CboxRememPass.isSelected()) {
                        checked(true);

                    } else {
                        checked(false);

                    }
                    
                    new HomeSafe1().setVisible(true);
                    
                    this.dispose();

                }
                else
                {
                    UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
                    JOptionPane.showMessageDialog(null,"Invalid E-mail and Password");
                }
                
                
         
            } catch (Exception e) {
                
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btnSignInActionPerformed

    private void txtPass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPass1ActionPerformed

    private void txtEmail1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmail1KeyReleased
        
        String PATTERN = "^[a-z0-9---,.]{0,30}[@.diu.edu.bd]{11,15}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(txtEmail1.getText());
        if(!match.matches())
        {
            labelR12.setText("example@diu.edu.bd");
        }
        else if(match.matches())
        {
            labelR12.setText("complete");
        }
        else
        {
            labelR12.setText(null);
        }
    }//GEN-LAST:event_txtEmail1KeyReleased

    private void txtPass1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPass1KeyReleased
        
        labelR12.setText(null);
        String PATTERN = //"^[!,@,#,$,%,^,&,*,-,+A-Za-z0-9]{8,30}$";
                "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=.*[@#$%^&+=])"
                       + "(?=\\S+$).{8,20}$"; 
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(txtPass1.getText());
        if(!match.matches())
        {
            labelR12.setText("Uppercase/Lowercase/Numbers/Symbol");
        }
        else if(match.matches())
        {
            labelR12.setText("complete");
        }
        else
        {
            labelR12.setText(null);
        }
    }//GEN-LAST:event_txtPass1KeyReleased

    private void txtCpass1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpass1KeyReleased
       
        labelR12.setText(null);
        String PATTERN = //"^[!,@,#,$,%,^,&,*,-,+A-Za-z0-9]{8,30}$";
                "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=.*[@#$%^&+=])"
                       + "(?=\\S+$).{8,20}$"; 
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(txtCpass1.getText());
        if(!match.matches())
        {
            labelR12.setText("Uppercase/Lowercase/Numbers/Symbol");
        }
        else if(match.matches())
        {
            labelR12.setText("complete");
        }
        else
        {
            labelR12.setText(null);
        }
    }//GEN-LAST:event_txtCpass1KeyReleased

    private void txtEmail1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmail1FocusGained
       
        if (txtEmail1.getText().equals("E-mail")) {
            txtEmail1.setText("");
            txtEmail1.setForeground(new Color(204, 204, 255));

        }
    }//GEN-LAST:event_txtEmail1FocusGained

    private void txtEmail1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmail1FocusLost
       
        if (txtEmail1.getText().equals("")) {
            txtEmail1.setText("E-mail");
            txtEmail1.setForeground(new Color(204, 204, 255));

        }
    }//GEN-LAST:event_txtEmail1FocusLost

    private void txtPass1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPass1FocusGained
       
        if(txtPass1.getText().equals("********"))
        {
            txtPass1.setText("");
            txtPass1.setForeground(new Color(204,204,255));
            
        } 
    }//GEN-LAST:event_txtPass1FocusGained

    private void txtPass1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPass1FocusLost
       
        if(txtPass1.getText().equals(""))
        {
            txtPass1.setText("********");
            txtPass1.setForeground(new Color(204,204,255));
            
        } 
    }//GEN-LAST:event_txtPass1FocusLost

    private void txtCpass1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpass1FocusGained
        
         if(txtCpass1.getText().equals("********"))
        {
            txtCpass1.setText("");
            txtCpass1.setForeground(new Color(204,204,255));
            
        } 
    }//GEN-LAST:event_txtCpass1FocusGained

    private void txtCpass1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpass1FocusLost
        
         if(txtCpass1.getText().equals(""))
        {
            txtCpass1.setText("********");
            txtCpass1.setForeground(new Color(204,204,255));
            
        } 
    }//GEN-LAST:event_txtCpass1FocusLost

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void CboxSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CboxSPActionPerformed
        
        if (CboxSP.isSelected()) {
            txtPass1.setEchoChar((char) 0); //password = JPasswordField
            txtCpass1.setEchoChar((char) 0);
        } else {
           txtPass1.setEchoChar('*');
           txtCpass1.setEchoChar('*');
        }
    }//GEN-LAST:event_CboxSPActionPerformed

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
      
              String searchemail = txtEmail1.getText();
             
              
              int flag=1;
             
              try {

                  
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood", "root", "***###botki143JN");
                Statement st = (Statement) con.createStatement();
                String query = "select *from reg1 where Email='"+searchemail+"'";
                ResultSet rs = st.executeQuery(query);
                while(rs.next())
                {
                    String email = rs.getString(1);
                    
             
                    if(email.equals(searchemail))
                    {
                       
                        flag=0;
                        break;
                    }
                }
                  
                  
                
                if(flag==0)
                {
                    JOptionPane.showMessageDialog(null,"Sorry! E-mail Allready uses");
                    txtEmail1.requestFocus();
                }
               
                else
                {
                    if(txtPass1.getText().equals(txtCpass1.getText()))
                    {
                        
                    
                        try {
                            
                            PreparedStatement ps = con.prepareStatement("INSERT INTO reg1(Email,Pass)" + "values(?,?)");
                        ps.setString(1, txtEmail1.getText());
                        ps.setString(2, txtPass1.getText());
                        ps.executeUpdate();
//                          String em=txtEmail1.getText();
//                          String p = txtPass1.getText();
//                          
//                          String query1 = "insert into don values='"+searchemail+"'";
//                         JOptionPane.showMessageDialog(null,"Dione");
                        System.out.println("Email ="+txtEmail1.getText());
                        System.out.println("Pass ="+txtPass.getText());
                        
                        labelL1.setVisible(true);
                        labelL2.setVisible(true);
                        labelL3.setVisible(true);
                        labelL4.setVisible(true);
                        labelL5.setVisible(true);
                        labelL6.setVisible(true);
                        labelL7.setVisible(true);
                        labelL8.setVisible(true);
                        labelL9.setVisible(true);
                        labelL10.setVisible(true);
                        labelL11.setVisible(true);
                        labelL12.setVisible(true);
                        labelL13.setVisible(true);
                        CboxRememPass.setVisible(true);
                        CboxShowPass.setVisible(true);
                        txtEmail.setVisible(true);
                        txtPass.setVisible(true);
                        btnSignIn.setVisible(true);

                        labelR1.setVisible(false);
                        labelR2.setVisible(false);
                        labelR3.setVisible(false);
                        labelR4.setVisible(false);
                        labelR5.setVisible(false);
                        labelR6.setVisible(false);
                        labelR7.setVisible(false);
                        labelR8.setVisible(false);
                        labelR9.setVisible(false);
                        labelR10.setVisible(false);
                        labelR11.setVisible(false);
                        labelR12.setVisible(false);
                        labelR13.setVisible(false);
                        labelR14.setVisible(false);
                        labelR15.setVisible(false);
                        labelR16.setVisible(false);
                        labelR17.setVisible(false);
                        txtEmail1.setVisible(false);
                        txtPass1.setVisible(false);
                        txtCpass1.setVisible(false);
                        CboxSP.setVisible(false);
                        btnSignup.setVisible(false);
                    
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null,e);
                        }
                        
                        
                    }   
                        
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Sorry! password don't match");
                    }
                }   
                    
            
                    
                  

        } catch (Exception e) {

        }
              
                  
    }//GEN-LAST:event_btnSignupActionPerformed

    private void labelL13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelL13MouseClicked
      
                  labelL1.setVisible(false);
                  labelL2.setVisible(false);
                  labelL3.setVisible(false);
                  labelL4.setVisible(false);
                  labelL5.setVisible(false);
                  labelL6.setVisible(false);
                  labelL7.setVisible(false);
                  labelL8.setVisible(false);
                  labelL9.setVisible(false);
                  labelL10.setVisible(false);
                  labelL11.setVisible(false);
                  labelL12.setVisible(false);
                  labelL13.setVisible(false);
                  CboxShowPass.setVisible(false);
                  CboxRememPass.setVisible(false);
                  txtEmail.setVisible(false);
                  txtPass.setVisible(false);
                  btnSignIn.setVisible(false);
        
                  
        labelR1.setVisible(true);
        labelR2.setVisible(true);
        labelR3.setVisible(true);
        labelR4.setVisible(true);
        labelR5.setVisible(true);
        labelR6.setVisible(true);
        labelR7.setVisible(true);
        labelR8.setVisible(true);
        labelR9.setVisible(true);
        labelR10.setVisible(true);
        labelR11.setVisible(true);
        labelR12.setVisible(true);
        labelR13.setVisible(true);
        labelR14.setVisible(true);
        labelR15.setVisible(true);
        labelR16.setVisible(true);
        labelR17.setVisible(true);

        txtEmail1.setVisible(true);
        txtPass1.setVisible(true);
        txtCpass1.setVisible(true);
        CboxSP.setVisible(true);
        btnSignup.setVisible(true);
    }//GEN-LAST:event_labelL13MouseClicked

    private void btnSignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSignupMouseClicked
       
       
    }//GEN-LAST:event_btnSignupMouseClicked

    private void labelR14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelR14MouseClicked
       
                  labelL1.setVisible(true);
                  labelL2.setVisible(true);
                  labelL3.setVisible(true);
                  labelL4.setVisible(true);
                  labelL5.setVisible(true);
                  labelL6.setVisible(true);
                  labelL7.setVisible(true);
                  labelL8.setVisible(true);
                  labelL9.setVisible(true);
                  labelL10.setVisible(true);
                  labelL11.setVisible(true);
                  labelL12.setVisible(true);
                  labelL13.setVisible(true);
                  CboxRememPass.setVisible(true);
                  CboxShowPass.setVisible(true);
                  txtEmail.setVisible(true);
                  txtPass.setVisible(true);
                  btnSignIn.setVisible(true);
        
                  
        labelR1.setVisible(false);
        labelR2.setVisible(false);
        labelR3.setVisible(false);
        labelR4.setVisible(false);
        labelR5.setVisible(false);
        labelR6.setVisible(false);
        labelR7.setVisible(false);
        labelR8.setVisible(false);
        labelR9.setVisible(false);
        labelR10.setVisible(false);
        labelR11.setVisible(false);
        labelR12.setVisible(false);
        labelR13.setVisible(false);
        labelR14.setVisible(false);
        labelR15.setVisible(false);
        labelR16.setVisible(false);
        labelR17.setVisible(false);

        txtEmail1.setVisible(false);
        txtPass1.setVisible(false);
        txtCpass1.setVisible(false);
        CboxSP.setVisible(false);
        btnSignup.setVisible(false);
    }//GEN-LAST:event_labelR14MouseClicked

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CboxRememPass;
    private javax.swing.JCheckBox CboxSP;
    private javax.swing.JCheckBox CboxShowPass;
    private javax.swing.JButton btnSignIn;
    private javax.swing.JButton btnSignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelL1;
    private javax.swing.JLabel labelL10;
    private javax.swing.JSeparator labelL11;
    private javax.swing.JLabel labelL12;
    private javax.swing.JLabel labelL13;
    private javax.swing.JLabel labelL2;
    private javax.swing.JLabel labelL3;
    private javax.swing.JSeparator labelL4;
    private javax.swing.JSeparator labelL5;
    private javax.swing.JLabel labelL6;
    private javax.swing.JSeparator labelL7;
    private javax.swing.JSeparator labelL8;
    private javax.swing.JSeparator labelL9;
    private javax.swing.JLabel labelR1;
    private javax.swing.JSeparator labelR10;
    private javax.swing.JSeparator labelR11;
    private javax.swing.JLabel labelR12;
    private javax.swing.JLabel labelR13;
    private javax.swing.JLabel labelR14;
    private javax.swing.JSeparator labelR15;
    private javax.swing.JLabel labelR16;
    private javax.swing.JSeparator labelR17;
    private javax.swing.JLabel labelR2;
    private javax.swing.JLabel labelR3;
    private javax.swing.JSeparator labelR4;
    private javax.swing.JSeparator labelR5;
    private javax.swing.JLabel labelR6;
    private javax.swing.JSeparator labelR7;
    private javax.swing.JSeparator labelR8;
    private javax.swing.JLabel labelR9;
    private javax.swing.JPasswordField txtCpass1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmail1;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JPasswordField txtPass1;
    // End of variables declaration//GEN-END:variables
}
