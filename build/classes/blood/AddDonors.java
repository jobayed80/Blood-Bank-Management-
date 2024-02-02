/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blood;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author acer
 */
public class AddDonors extends javax.swing.JFrame {

    /**
     * Creates new form AddDonors
     */
    public AddDonors() {
        initComponents();
        
        
         
    }

    String ImgPath = null;
    
    //Resize Image 
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
        Image img2 = img.getScaledInstance(lbl_image.getWidth(),lbl_image.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img2);
        return image;
        
    }
    
    public boolean checkInputs()
    {
                String y=(String)CboxYear.getSelectedItem();
                String m=(String)CboxMonth.getSelectedItem();
                String d=(String)CboxDate.getSelectedItem();
                String o=(String)CboxYear.getSelectedItem();
                String b=(String)CboxBlood.getSelectedItem();
        
        if(txtId.getText()==null || txtFname.getText()==null || y==null || m==null || d==null || o==null ||
         txtContact.getText()==null || b==null || txtAddress.getText()==null || txtLastDate.getText()==null || ImgPath==null)
            
        {
            return false;
        }
        else
        {
            try {
                txtId.getText();
                txtFname.getText();
                
                txtContact.getText();
                txtAddress.getText();
                txtLastDate.getText();
                
                
                
                return true;
            } catch (Exception e) {
                return false;
            }
        }
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtId = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtFname = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        CboxYear = new javax.swing.JComboBox<>();
        CboxMonth = new javax.swing.JComboBox<>();
        CboxDate = new javax.swing.JComboBox<>();
        jSeparator4 = new javax.swing.JSeparator();
        CboxOccu = new javax.swing.JComboBox<>();
        txtContact = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        CboxBlood = new javax.swing.JComboBox<>();
        txtAddress = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        lbl_image = new javax.swing.JLabel();
        Close = new javax.swing.JButton();
        txtLastDate = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        SaveBtn = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(645, 160));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(36, 36, 36));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(36, 36, 36));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("Id");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 42, 10));

        txtId.setBackground(new java.awt.Color(36, 36, 36));
        txtId.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtId.setForeground(new java.awt.Color(204, 204, 255));
        txtId.setText(" Id");
        txtId.setBorder(null);
        txtId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdFocusLost(evt);
            }
        });
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 200, 40));

        jSeparator2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 200, 10));

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
        jPanel1.add(txtFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 200, 40));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 200, -1));

        CboxYear.setBackground(new java.awt.Color(36, 36, 36));
        CboxYear.setForeground(new java.awt.Color(204, 204, 255));
        CboxYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950" }));
        CboxYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CboxYearActionPerformed(evt);
            }
        });
        jPanel1.add(CboxYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 70, 30));

        CboxMonth.setBackground(new java.awt.Color(36, 36, 36));
        CboxMonth.setForeground(new java.awt.Color(204, 204, 255));
        CboxMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "12", "11", "10", "9", "8", "7", "6", "5", "4", "3", "2", "1" }));
        jPanel1.add(CboxMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 70, 30));

        CboxDate.setBackground(new java.awt.Color(36, 36, 36));
        CboxDate.setForeground(new java.awt.Color(204, 204, 255));
        CboxDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Date", "31", "30", "29", "28", "27", "26", "25", "24", "23", "22", "21", "20", "19", "18", "17", "16", "15", "14", "13", "12", "11", "10", "9", "8", "7", "6", "5", "4", "3", "2", "1" }));
        jPanel1.add(CboxDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 60, 30));

        jSeparator4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 200, 10));

        CboxOccu.setBackground(new java.awt.Color(36, 36, 36));
        CboxOccu.setForeground(new java.awt.Color(204, 204, 255));
        CboxOccu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Occupation", "Student", "Teacher", "Others" }));
        CboxOccu.setBorder(null);
        jPanel1.add(CboxOccu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 200, 40));

        txtContact.setBackground(new java.awt.Color(36, 36, 36));
        txtContact.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtContact.setForeground(new java.awt.Color(204, 204, 255));
        txtContact.setText("Contact");
        txtContact.setBorder(null);
        txtContact.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtContactFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContactFocusLost(evt);
            }
        });
        jPanel1.add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 200, 40));

        jSeparator6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 200, 10));

        CboxBlood.setBackground(new java.awt.Color(36, 36, 36));
        CboxBlood.setForeground(new java.awt.Color(204, 204, 255));
        CboxBlood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blood Group", "A RhD positive (A+)", "A RhD negative (A-)", "B RhD positive (B+)", "B RhD negative (B-)", "O RhD positive (O+)", "O RhD negative (O-)", "AB RhD positive (AB+)", "AB RhD negative (AB-)" }));
        CboxBlood.setBorder(null);
        jPanel1.add(CboxBlood, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 200, 40));

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
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 190, 40));

        jSeparator5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 190, 10));

        lbl_image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_image.setIcon(new javax.swing.ImageIcon("E:\\Icon Image\\2.Add Image.png")); // NOI18N
        lbl_image.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        lbl_image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_imageMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 150, 150));

        Close.setBackground(new java.awt.Color(36, 36, 36));
        Close.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        Close.setForeground(new java.awt.Color(204, 204, 255));
        Close.setText("Close");
        Close.setBorder(null);
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        jPanel1.add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, 80, 30));

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
        jPanel1.add(txtLastDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 190, 40));

        jSeparator7.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 190, -1));

        SaveBtn.setBackground(new java.awt.Color(36, 36, 36));
        SaveBtn.setFont(new java.awt.Font("Comic Sans MS", 0, 15)); // NOI18N
        SaveBtn.setForeground(new java.awt.Color(204, 204, 255));
        SaveBtn.setText("Save");
        SaveBtn.setBorder(null);
        SaveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBtnActionPerformed(evt);
            }
        });
        jPanel1.add(SaveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 200, 40));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 150, 10));

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\Icon Image\\1.Add Donors.gif")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 80, 535, 8));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        
       dispose();
    }//GEN-LAST:event_CloseActionPerformed

    private void lbl_imageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_imageMouseClicked
        
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
             UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
        } catch (Exception e) {
        }
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.images","jpg","png");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            lbl_image.setIcon(ResizeImage(path,null));
            ImgPath=path;
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Sorry! No File Selected");
        }
    }//GEN-LAST:event_lbl_imageMouseClicked

    private void CboxYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CboxYearActionPerformed
       
       
     
    }//GEN-LAST:event_CboxYearActionPerformed

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
        
        if(txtContact.getText().equals("Contact"))
        {
            txtContact.setText("");
            txtContact.setForeground(new Color(204,204,255));
            
        }
    }//GEN-LAST:event_txtContactFocusGained

    private void txtContactFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContactFocusLost
        
        if(txtContact.getText().equals(""))
        {
            txtContact.setText("Contact");
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

    private void txtIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdFocusGained
        
        if(txtId.getText().equals(" Id"))
        {
            txtId.setText("");
            txtId.setForeground(new Color(204,204,255));
            
        }
    }//GEN-LAST:event_txtIdFocusGained

    private void txtIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdFocusLost
      
        if(txtId.getText().equals(""))
        {
            txtId.setText(" Id");
            txtId.setForeground(new Color(204,204,255));
            
        }
    }//GEN-LAST:event_txtIdFocusLost

    private void SaveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBtnActionPerformed
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
             UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
        } catch (Exception e) {
        }
        
        String searchId = txtId.getText();
             
              
              int flag=1;
             
              try 
              {
                  Class.forName("com.mysql.jdbc.Driver");
                  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood", "root", "***###botki143JN");
                  Statement st = (Statement) con.createStatement();
                  String query = "select *from don where Id='" + searchId + "'";

                  ResultSet rs = st.executeQuery(query);
                  while (rs.next()) 
                  {
                      String id = rs.getString(1);

                      if (id.equals(searchId)) {

                          flag = 0;
                          break;
                      }
                  }
                 if(flag==0)
                 {
                    JOptionPane.showMessageDialog(null,"Id Allready uses");
                    txtId.requestFocus();
                 }
                 else
                 {
                    
                    String year = (String) CboxYear.getSelectedItem();
                    String month = (String) CboxMonth.getSelectedItem();
                    String date = (String) CboxDate.getSelectedItem();
                    String occu = (String) CboxOccu.getSelectedItem();
                    String bld = (String) CboxBlood.getSelectedItem();
        
                    if(checkInputs() && ImgPath!= null)
                    {
                        try 
                        {
                
                            //Class.forName("com.mysql.jdbc.Driver");
                            //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood", "root", "***###botki143JN");
                            //Statement st = (Statement) con.createStatement();
                            PreparedStatement ps = con.prepareStatement("INSERT INTO don(Id,Name,Year,Month,Date,Occupation,Contact,Bld,Address,LastDonation,Image)" + "values(?,?,?,?,?,?,?,?,?,?,?)");

                            ps.setString(1, txtId.getText());
                            ps.setString(2, txtFname.getText());
                            ps.setString(3, year);
                            ps.setString(4, month);
                            ps.setString(5, date);
                            ps.setString(6, occu);
                            ps.setString(7, txtContact.getText());
                            ps.setString(8, bld);
                            ps.setString(9, txtAddress.getText());
                            ps.setString(10, txtLastDate.getText());
                            InputStream img = new FileInputStream(new File(ImgPath));
                            ps.setBlob(11, img);

                            ps.executeUpdate();
                            JOptionPane.showMessageDialog(null, "Your Data Inserted!");
                            dispose();
             
                        }catch (Exception e) 
                            {
                                JOptionPane.showMessageDialog(null,e);
                            }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Sorry! One or More Field are Empty");
                    }
      
                }
                
            }catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
            }
                  
                  
  
        
    }//GEN-LAST:event_SaveBtnActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        
//                  try {
//                      
//                      Class.forName("com.mysql.jdbc.Driver");
//                      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood", "root", "***###botki143JN");
//                      Statement st = (Statement) con.createStatement();
//                      String query = "select max(NewDonorId) from reg1 ";
//
//                      ResultSet rs = st.executeQuery(query);
//                      if(rs.next())
//                      {
//                          int id=rs.getInt(1);
//                          id=id+1;
//                          String str = String.valueOf(id);
//                          labelId.setText(str);
//                          JOptionPane.showMessageDialog(null,"Done Id");
//                          
//                      }
//                      else
//                      {
//                          labelId.setText("1");
//                      }
//                      
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null,e);
//        }
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
            java.util.logging.Logger.getLogger(AddDonors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDonors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDonors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDonors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDonors().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CboxBlood;
    private javax.swing.JComboBox<String> CboxDate;
    private javax.swing.JComboBox<String> CboxMonth;
    private javax.swing.JComboBox<String> CboxOccu;
    private javax.swing.JComboBox<String> CboxYear;
    private javax.swing.JButton Close;
    private javax.swing.JButton SaveBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lbl_image;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLastDate;
    // End of variables declaration//GEN-END:variables
}
