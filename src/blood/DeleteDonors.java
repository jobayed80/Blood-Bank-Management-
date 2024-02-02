/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blood;

import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author acer
 */
public class DeleteDonors extends javax.swing.JFrame {

    /**
     * Creates new form DeleteDonors
     */
    public DeleteDonors() {
        initComponents();
    }

    
    String ImgPath = null;
    public ImageIcon ResizeImage(String imagePath, byte[] pic)
    {
        ImageIcon myImage = null;
        if(imagePath !=null)
        {
            myImage = new ImageIcon(imagePath);
        }
        else
        {
            myImage = new ImageIcon(pic);
        }
        Image img = myImage.getImage();
        Image img2 = img.getScaledInstance(lbl_Image1.getWidth(),lbl_Image1.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img2);
        return image;
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtIdSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtFname = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        txtContact = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        txtAddress = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        lbl_Image1 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        txtLastDate = new javax.swing.JTextField();
        txtOcuu = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        txtBlood = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        ErrorId = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        txtMonth = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        BtnUpdate = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(600, 180));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(36, 36, 36));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIdSearch.setBackground(new java.awt.Color(36, 36, 36));
        txtIdSearch.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtIdSearch.setForeground(new java.awt.Color(204, 204, 255));
        txtIdSearch.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 255)));
        txtIdSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdSearchKeyReleased(evt);
            }
        });
        jPanel1.add(txtIdSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 150, 40));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Id");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 255)));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 40, 40));

        txtId.setBackground(new java.awt.Color(36, 36, 36));
        txtId.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtId.setForeground(new java.awt.Color(204, 204, 255));
        txtId.setText("Id");
        txtId.setBorder(null);
        txtId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdFocusLost(evt);
            }
        });
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 190, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 190, 10));

        txtFname.setBackground(new java.awt.Color(36, 36, 36));
        txtFname.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtFname.setForeground(new java.awt.Color(204, 204, 255));
        txtFname.setText("Full Name");
        txtFname.setBorder(null);
        txtFname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFnameFocusLost(evt);
            }
        });
        jPanel1.add(txtFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 200, 30));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 200, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 210, 10));

        txtContact.setBackground(new java.awt.Color(36, 36, 36));
        txtContact.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtContact.setForeground(new java.awt.Color(204, 204, 255));
        txtContact.setText("Contact Number");
        txtContact.setBorder(null);
        txtContact.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContactFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContactFocusLost(evt);
            }
        });
        jPanel1.add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 210, 40));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 210, 10));

        txtAddress.setBackground(new java.awt.Color(36, 36, 36));
        txtAddress.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(204, 204, 255));
        txtAddress.setText("Present Address");
        txtAddress.setBorder(null);
        txtAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAddressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAddressFocusLost(evt);
            }
        });
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 200, 30));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 190, 10));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 210, 10));

        lbl_Image1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Image1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        lbl_Image1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_Image1MouseClicked(evt);
            }
        });
        jPanel1.add(lbl_Image1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 150, 150));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 150, 10));

        txtLastDate.setBackground(new java.awt.Color(36, 36, 36));
        txtLastDate.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtLastDate.setForeground(new java.awt.Color(204, 204, 255));
        txtLastDate.setText("Last Donation Date");
        txtLastDate.setBorder(null);
        txtLastDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLastDateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLastDateFocusLost(evt);
            }
        });
        jPanel1.add(txtLastDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 210, 40));

        txtOcuu.setBackground(new java.awt.Color(36, 36, 36));
        txtOcuu.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtOcuu.setForeground(new java.awt.Color(204, 204, 255));
        txtOcuu.setText("Occupation");
        txtOcuu.setBorder(null);
        txtOcuu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtOcuuFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtOcuuFocusLost(evt);
            }
        });
        jPanel1.add(txtOcuu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 304, 210, 40));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 342, 210, 10));

        txtBlood.setBackground(new java.awt.Color(36, 36, 36));
        txtBlood.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtBlood.setForeground(new java.awt.Color(204, 204, 255));
        txtBlood.setText("Blood Group");
        txtBlood.setBorder(null);
        txtBlood.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBloodFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBloodFocusLost(evt);
            }
        });
        jPanel1.add(txtBlood, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 210, 40));
        jPanel1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 210, -1));

        ErrorId.setBackground(new java.awt.Color(36, 36, 36));
        ErrorId.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ErrorId.setForeground(java.awt.Color.green);
        ErrorId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(ErrorId, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 180, 20));

        txtYear.setEditable(false);
        txtYear.setBackground(new java.awt.Color(36, 36, 36));
        txtYear.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtYear.setForeground(new java.awt.Color(204, 204, 255));
        txtYear.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtYear.setText("Year");
        txtYear.setBorder(null);
        txtYear.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtYearFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtYearFocusLost(evt);
            }
        });
        jPanel1.add(txtYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 60, 30));

        txtMonth.setEditable(false);
        txtMonth.setBackground(new java.awt.Color(36, 36, 36));
        txtMonth.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtMonth.setForeground(new java.awt.Color(204, 204, 255));
        txtMonth.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMonth.setText("Month");
        txtMonth.setBorder(null);
        txtMonth.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMonthFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMonthFocusLost(evt);
            }
        });
        jPanel1.add(txtMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 60, 30));

        txtDate.setEditable(false);
        txtDate.setBackground(new java.awt.Color(36, 36, 36));
        txtDate.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtDate.setForeground(new java.awt.Color(204, 204, 255));
        txtDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDate.setText("Date");
        txtDate.setBorder(null);
        txtDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDateFocusLost(evt);
            }
        });
        jPanel1.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 60, 30));

        jLabel3.setBackground(new java.awt.Color(36, 36, 36));
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("/");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 30, 30));

        jLabel5.setBackground(new java.awt.Color(36, 36, 36));
        jLabel5.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("/");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 244, 30, 40));

        jButton1.setBackground(new java.awt.Color(36, 36, 36));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 255));
        jButton1.setText("Reset");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, 70, 30));

        jButton2.setBackground(new java.awt.Color(36, 36, 36));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 255));
        jButton2.setText("Close");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 470, 70, 30));

        BtnUpdate.setBackground(new java.awt.Color(36, 36, 36));
        BtnUpdate.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        BtnUpdate.setForeground(new java.awt.Color(204, 204, 255));
        BtnUpdate.setText("Delete");
        BtnUpdate.setBorder(null);
        BtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(BtnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 210, 40));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 120, 570, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/1.  Delete Donors Final.gif"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdSearchKeyReleased

        String search = txtIdSearch.getText();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood", "root", "***###botki143JN");
            Statement st = (Statement)con.createStatement();
            String query = "select *from don where Id='"+search+"'";
            ResultSet rs = st.executeQuery(query);
            
            if(rs.next())
            {
               String s1 = rs.getString(1);  
               String s2 = rs.getString(2);
               String s3 = rs.getString(3);
               String s4 = rs.getString(4);
               String s5 = rs.getString(5);
               String s6 = rs.getString(6);
               String s7 = rs.getString(7);
               String s8 = rs.getString(8);
               String s9 = rs.getString(9);
               String s10 = rs.getString(10);
               
               
               txtId.setText(s1);
               txtFname.setText(s2);
               txtYear.setText(s3);
               txtMonth.setText(s4);
               txtDate.setText(s5);
               txtOcuu.setText(s6);
               txtContact.setText(s7);
               txtBlood.setText(s8);
               txtAddress.setText(s9);
               txtLastDate.setText(s10);
               lbl_Image1.setIcon(ResizeImage(null,rs.getBytes(11)));
               ErrorId.setForeground(Color.GREEN);
               ErrorId.setText("Id matched");
               txtIdSearch.setEditable(false);
               txtId.setEditable(false);
               txtFname.setEditable(false);
               txtYear.setEditable(false);
               txtMonth.setEditable(false);
               txtDate.setEditable(false);
               txtOcuu.setEditable(false);
               txtContact.setEditable(false);
               txtBlood.setEditable(false);
               txtAddress.setEditable(false);
               txtLastDate.setEditable(false);
               
               
              
               
            }
            else
            {
                ErrorId.setText("*Sorry! Id doesn't match");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }

    }//GEN-LAST:event_txtIdSearchKeyReleased

    private void txtIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdFocusGained

        if(txtId.getText().equals("Id"))
        {
            txtId.setText("");
            txtId.setForeground(new Color(204,204,255));

        }
    }//GEN-LAST:event_txtIdFocusGained

    private void txtIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdFocusLost

        if(txtId.getText().equals(""))
        {
            txtId.setText("Id");
            txtId.setForeground(new Color(204,204,255));

        }
    }//GEN-LAST:event_txtIdFocusLost

    private void txtFnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFnameFocusGained

        if(txtFname.getText().equals("Full Name"))
        {
            txtFname.setText("");
            txtFname.setForeground(new Color(204,204,255));

        }
    }//GEN-LAST:event_txtFnameFocusGained

    private void txtFnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFnameFocusLost

        if(txtFname.getText().equals(""))
        {
            txtFname.setText("Full Name");
            txtFname.setForeground(new Color(204,204,255));

        }
    }//GEN-LAST:event_txtFnameFocusLost

    private void txtContactFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContactFocusGained

        if(txtContact.getText().equals("Contact Number"))
        {
            txtContact.setText("");
            txtContact.setForeground(new Color(204,204,255));

        }
    }//GEN-LAST:event_txtContactFocusGained

    private void txtContactFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContactFocusLost

        if(txtContact.getText().equals(""))
        {
            txtContact.setText("Contact Number");
            txtContact.setForeground(new Color(204,204,255));

        }
    }//GEN-LAST:event_txtContactFocusLost

    private void txtAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddressFocusGained

        if(txtAddress.getText().equals("Present Address"))
        {
            txtAddress.setText("");
            txtAddress.setForeground(new Color(204,204,255));

        }
    }//GEN-LAST:event_txtAddressFocusGained

    private void txtAddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddressFocusLost

        if(txtAddress.getText().equals(""))
        {
            txtAddress.setText("Present Address");
            txtAddress.setForeground(new Color(204,204,255));

        }
    }//GEN-LAST:event_txtAddressFocusLost

    private void lbl_Image1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_Image1MouseClicked

    }//GEN-LAST:event_lbl_Image1MouseClicked

    private void txtLastDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLastDateFocusGained

        if(txtLastDate.getText().equals("Last Donation Date"))
        {
            txtLastDate.setText("");
            txtLastDate.setForeground(new Color(204,204,255));

        }
    }//GEN-LAST:event_txtLastDateFocusGained

    private void txtLastDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLastDateFocusLost

        if(txtLastDate.getText().equals(""))
        {
            txtLastDate.setText("Last Donation Date");
            txtLastDate.setForeground(new Color(204,204,255));

        }
    }//GEN-LAST:event_txtLastDateFocusLost

    private void txtOcuuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtOcuuFocusGained

        if(txtOcuu.getText().equals("Occupation"))
        {
            txtOcuu.setText("");
            txtOcuu.setForeground(new Color(204,204,255));

        }
    }//GEN-LAST:event_txtOcuuFocusGained

    private void txtOcuuFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtOcuuFocusLost

        if(txtOcuu.getText().equals(""))
        {
            txtOcuu.setText("Occupation");
            txtOcuu.setForeground(new Color(204,204,255));

        }
    }//GEN-LAST:event_txtOcuuFocusLost

    private void txtBloodFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBloodFocusGained

        if(txtBlood.getText().equals("Blood Group"))
        {
            txtBlood.setText("");
            txtBlood.setForeground(new Color(204,204,255));

        }
    }//GEN-LAST:event_txtBloodFocusGained

    private void txtBloodFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBloodFocusLost

        if(txtBlood.getText().equals(""))
        {
            txtBlood.setText("Blood Group");
            txtBlood.setForeground(new Color(204,204,255));

        }
    }//GEN-LAST:event_txtBloodFocusLost

    private void txtYearFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtYearFocusGained

        if(txtYear.getText().equals("Year"))
        {
            txtYear.setText("");
            txtYear.setForeground(new Color(204,204,255));

        }
    }//GEN-LAST:event_txtYearFocusGained

    private void txtYearFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtYearFocusLost

        if(txtYear.getText().equals(""))
        {
            txtYear.setText("Year");
            txtYear.setForeground(new Color(204,204,255));

        }
    }//GEN-LAST:event_txtYearFocusLost

    private void txtMonthFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMonthFocusGained

        if(txtMonth.getText().equals("Month"))
        {
            txtMonth.setText("");
            txtMonth.setForeground(new Color(204,204,255));

        }
    }//GEN-LAST:event_txtMonthFocusGained

    private void txtMonthFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMonthFocusLost

        if(txtMonth.getText().equals(""))
        {
            txtMonth.setText("Month");
            txtMonth.setForeground(new Color(204,204,255));

        }
    }//GEN-LAST:event_txtMonthFocusLost

    private void txtDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDateFocusGained

        if(txtDate.getText().equals("Date"))
        {
            txtDate.setText("");
            txtDate.setForeground(new Color(204,204,255));

        }
    }//GEN-LAST:event_txtDateFocusGained

    private void txtDateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDateFocusLost

        if(txtDate.getText().equals(""))
        {
            txtDate.setText("Date");
            txtDate.setForeground(new Color(204,204,255));

        }
    }//GEN-LAST:event_txtDateFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        dispose();
        new DeleteDonors().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateActionPerformed

        String search = txtIdSearch.getText();
        
//        try {
//            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
//             UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
//        } catch (Exception e) {
//        } 
        int a = JOptionPane.showConfirmDialog(null,"Really! Do you want to Delete?","Select",JOptionPane.YES_NO_OPTION);
         
        
        if(a==0)
        {
            try {
                  Class.forName("com.mysql.jdbc.Driver");
                  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood", "root", "***###botki143JN");
                  Statement st = (Statement) con.createStatement();
                  String query = "delete from don where Id='" + search + "' ";
                  st.executeUpdate(query);
                  JOptionPane.showMessageDialog(null,"Deleted Your Data");
            } catch (Exception e) {
            }
        }
        
       
    }//GEN-LAST:event_BtnUpdateActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        
        txtId.setEditable(false);
        txtFname.setEditable(false);
        txtYear.setEditable(false);
        txtMonth.setEditable(false);
        txtDate.setEditable(false);
        txtOcuu.setEditable(false);
        txtContact.setEditable(false);
        txtBlood.setEditable(false);
        txtAddress.setEditable(false);
        txtLastDate.setEditable(false);
        
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(DeleteDonors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteDonors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteDonors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteDonors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteDonors().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JLabel ErrorId;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lbl_Image1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBlood;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdSearch;
    private javax.swing.JTextField txtLastDate;
    private javax.swing.JTextField txtMonth;
    private javax.swing.JTextField txtOcuu;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
