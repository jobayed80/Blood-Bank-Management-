package blood;


import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
//import net.proteanit.sql.DbUtils;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author acer
 */
public class HomeSafe1 extends javax.swing.JFrame implements Runnable{

    
    
    
    
   
    
    public int z =0; ////variable
    public int user = 0;
    public int donor=0;
    // COLOR for Menu Panel
    Color paneDefault;
    Color paneClick;
    
    int hour,min,sec;
    
    public HomeSafe1() {
        initComponents();
        
        //jTable1.setVisible(false);
        //panelTable.setVisible(false);
        CboxBloodSearch.setVisible(false);
        txtLocationSearch.setVisible(false);
        separateLocation.setVisible(false);
        
        
        Thread t = new Thread(this);
        t.start();
        
        
        
        // COLOR for Menu Panel
        paneDefault= new Color(22,22,22);
        paneClick = new Color(102,0,0);
        panelM1.setBackground(paneDefault);
        panelM2.setBackground(paneDefault);
        //panelM3.setBackground(paneDefault);
        panelMm3.setBackground(paneDefault);
        panelMm4.setBackground(paneDefault);
        panelM5.setBackground(paneDefault);
        panelM6.setBackground(paneDefault);
        panelMm7.setBackground(paneDefault);
       
        panelViewUsers.setBackground(paneDefault);
        panelUpgradeUsers.setBackground(paneDefault);
        panelAddDonors.setBackground(paneDefault);
        panelViewDonor.setBackground(paneDefault);
        panelUpgradeDonors.setBackground(paneDefault);
        panelDeleteDonors.setBackground(paneDefault);
        
        // Home page Write hide
        labelW1.setVisible(true);
        labelW3.setVisible(true);
        labelW2.setVisible(true);
        labelW4.setVisible(true);
        labelW5.setVisible(true);
        labelW6.setVisible(true);
        bld6.setVisible(true);
        bld2.setVisible(true);
        bld3.setVisible(true);
        
        //Menu hiding
        panelM1.setVisible(false);
        panelM2.setVisible(false);
        //panelM3.setVisible(false);
        panelMm3.setVisible(false);
        panelMm4.setVisible(false);
        panelM5.setVisible(false);
        panelM6.setVisible(false);
        panelMm7.setVisible(false);
       
        labelM1.setVisible(false);
        labelM2.setVisible(false);
        //labelM3.setVisible(false);
        labelMm3.setVisible(false);
        labelMm4.setVisible(false);
        labelM5.setVisible(false);
        labelM6.setVisible(false);
        labelMm7.setVisible(false);
       
                
        //Menu click then next feautures hide
        panelViewUsers.setVisible(false);
        panelUpgradeUsers.setVisible(false);
        panelAddDonors.setVisible(false);
        panelViewDonor.setVisible(false);
        //panelViewDonors.setVisible(false);
        //panelViewDonor.setVisible(false);
        panelUpgradeDonors.setVisible(false);
        labelViewUsers.setVisible(false);
        labelUpgradeUsers.setVisible(false);
        labelAddDonors.setVisible(false);
        labelViewDonor.setVisible(false);
        labelUpgradeDonors.setVisible(false);
        labelDeleteDonors.setVisible(false);
        
        
       
        
      
   
       
      
    }

    
    
    public boolean Hiding()
    {
        panelViewUsers.setVisible(false);
        panelUpgradeUsers.setVisible(false);
        panelAddDonors.setVisible(false);
        panelViewDonor.setVisible(false);
        //panelViewDonors.setVisible(false);
        //panelViewDonor.setVisible(false);
        panelUpgradeDonors.setVisible(false);
        labelViewUsers.setVisible(false);
        labelUpgradeUsers.setVisible(false);
        labelAddDonors.setVisible(false);
        labelViewDonor.setVisible(false);
        labelUpgradeDonors.setVisible(false);
        labelDeleteDonors.setVisible(false);
        return true;
    }
    
    public ArrayList<Product2> BindTable()
    {

        
        ArrayList<Product2> list = new ArrayList<Product2>();
        try {
            String Search = (String)CboxBloodSearch.getSelectedItem();
        
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood", "root", "***###botki143JN");
            Statement st = (Statement)con.createStatement();
            /////String query = "SELECT 'Name','Contact','Bld','Address','LastDonation','Image' FROM 'don'";
            String query = "select Name,Contact,Bld,Address,LastDonation,Image from don where Bld like '%"+Search+"%'";
            ResultSet rs = st.executeQuery(query);
            
           
            Product2 p;
            while(rs.next())
            {
                p = new Product2(
                
//                        rs.getString(1),
//                        rs.getString("Contact"),
//                        rs.getString("Bld"),
//                        rs.getString("Address"),
//                        
//                        rs.getString("LastDonation"),
//                       rs.getBytes("Image")
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        
                        rs.getString(5),
                       rs.getBytes(6)
                
                );
                list.add(p);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
         
        
        
        
        
//        MyQuery mq = new MyQuery();
//        ArrayList<Product2> list = mq.BindTable();
        String[] columnName = {"Name","Blood","Contact","Address","Image","LastDonation"};
        Object[][] rows = new Object[list.size()][6];
        for (int i = 0; i <list.size(); i++) {
            
            rows[i][0] = list.get(i).getName();
            rows[i][1] = list.get(i).getContact();
            rows[i][2] = list.get(i).getBlood();
            rows[i][3] = list.get(i).getAddress();
            
            
            if(list.get(i).getMyImage()!=null)
            {
                ImageIcon image = new ImageIcon(new ImageIcon(list.get(i).getMyImage()).getImage().getScaledInstance(150,120,Image.SCALE_SMOOTH));
                rows[i][4] = image;
            }
            else
            {
                rows[i][4]=null;
            }
            rows[i][5] = list.get(i).getLastDonation();
            
        }
        
        try {
            //UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
          // UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteTabbedPaneUI");
        } catch (Exception e) {
        }
        
        TheModel1 model = new TheModel1(rows, columnName);
        //jTable1.setModel(model);
        //jTable1.setRowHeight(120);
       //jTable1.getColumnModel().getColumn(4).setPreferredWidth(150);
        return null;
       
    }

    
    
    
    
    
    public ArrayList<Product2> BindTable1()
    {

        
        ArrayList<Product2> list = new ArrayList<Product2>();
        try {
            String Search = txtLocationSearch.getText();
        
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood", "root", "***###botki143JN");
            Statement st = (Statement)con.createStatement();
            /////String query = "SELECT 'Name','Contact','Bld','Address','LastDonation','Image' FROM 'don'";
            String query = "select Name,Contact,Bld,Address,LastDonation,Image from don where Address like '%"+Search+"%'";
            ResultSet rs = st.executeQuery(query);
            
           
            Product2 p;
            while(rs.next())
            {
                p = new Product2(
                
//                        rs.getString(1),
//                        rs.getString("Contact"),
//                        rs.getString("Bld"),
//                        rs.getString("Address"),
//                        
//                        rs.getString("LastDonation"),
//                       rs.getBytes("Image")
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        
                        rs.getString(5),
                       rs.getBytes(6)
                
                );
                list.add(p);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
         
        
        
        
        
//        MyQuery mq = new MyQuery();
//        ArrayList<Product2> list = mq.BindTable();
        String[] columnName = {"Name","Blood","Contact","Address","Image","LastDonation"};
        Object[][] rows = new Object[list.size()][6];
        for (int i = 0; i <list.size(); i++) {
            
            rows[i][0] = list.get(i).getName();
            rows[i][1] = list.get(i).getContact();
            rows[i][2] = list.get(i).getBlood();
            rows[i][3] = list.get(i).getAddress();
            
            
            if(list.get(i).getMyImage()!=null)
            {
                ImageIcon image = new ImageIcon(new ImageIcon(list.get(i).getMyImage()).getImage().getScaledInstance(150,120,Image.SCALE_SMOOTH));
                rows[i][4] = image;
            }
            else
            {
                rows[i][4]=null;
            }
            rows[i][5] = list.get(i).getLastDonation();
            
        }
        
        TheModel1 model = new TheModel1(rows, columnName);
        //jTable1.setModel(model);
        //jTable1.setRowHeight(120);
        //jTable1.getColumnModel().getColumn(4).setPreferredWidth(150);
        return null;
       
    }

   
    
    
   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        panelViewUsers = new javax.swing.JPanel();
        labelViewUsers = new javax.swing.JLabel();
        panelUpgradeUsers = new javax.swing.JPanel();
        labelUpgradeUsers = new javax.swing.JLabel();
        panelAddDonors = new javax.swing.JPanel();
        labelAddDonors = new javax.swing.JLabel();
        panelUpgradeDonors = new javax.swing.JPanel();
        labelUpgradeDonors = new javax.swing.JLabel();
        panelDeleteDonors = new javax.swing.JPanel();
        labelDeleteDonors = new javax.swing.JLabel();
        panelViewDonor = new javax.swing.JPanel();
        labelViewDonor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        CboxBloodSearch = new javax.swing.JComboBox<>();
        txtLocationSearch = new javax.swing.JTextField();
        separateLocation = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Exit = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Menu = new javax.swing.JLabel();
        Minimize = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelW1 = new javax.swing.JLabel();
        labelW3 = new javax.swing.JLabel();
        labelW2 = new javax.swing.JLabel();
        labelW4 = new javax.swing.JLabel();
        labelW5 = new javax.swing.JLabel();
        labelW6 = new javax.swing.JLabel();
        bld6 = new javax.swing.JLabel();
        bld3 = new javax.swing.JLabel();
        bld2 = new javax.swing.JLabel();
        bld4 = new javax.swing.JLabel();
        bld5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        panelM1 = new javax.swing.JPanel();
        labelM1 = new javax.swing.JLabel();
        panelM2 = new javax.swing.JPanel();
        labelM2 = new javax.swing.JLabel();
        panelM5 = new javax.swing.JPanel();
        labelM5 = new javax.swing.JLabel();
        panelM6 = new javax.swing.JPanel();
        labelM6 = new javax.swing.JLabel();
        panelMm3 = new javax.swing.JPanel();
        labelMm3 = new javax.swing.JLabel();
        panelMm4 = new javax.swing.JPanel();
        labelMm4 = new javax.swing.JLabel();
        panelMm7 = new javax.swing.JPanel();
        labelMm7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(255, 0, 153));
        setLocation(new java.awt.Point(50, 20));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(22, 22, 22));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 0, -1, 700));

        jPanel10.setBackground(new java.awt.Color(22, 22, 22));

        panelViewUsers.setBackground(new java.awt.Color(22, 22, 22));
        panelViewUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelViewUsersMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelViewUsersMousePressed(evt);
            }
        });
        panelViewUsers.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                panelViewUsersComponentShown(evt);
            }
        });

        labelViewUsers.setBackground(new java.awt.Color(22, 22, 22));
        labelViewUsers.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        labelViewUsers.setForeground(new java.awt.Color(153, 153, 255));
        labelViewUsers.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelViewUsers.setText(" View Users");

        javax.swing.GroupLayout panelViewUsersLayout = new javax.swing.GroupLayout(panelViewUsers);
        panelViewUsers.setLayout(panelViewUsersLayout);
        panelViewUsersLayout.setHorizontalGroup(
            panelViewUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelViewUsers, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        panelViewUsersLayout.setVerticalGroup(
            panelViewUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelViewUsers, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panelUpgradeUsers.setBackground(new java.awt.Color(22, 22, 22));
        panelUpgradeUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelUpgradeUsersMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelUpgradeUsersMousePressed(evt);
            }
        });

        labelUpgradeUsers.setBackground(new java.awt.Color(22, 22, 22));
        labelUpgradeUsers.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        labelUpgradeUsers.setForeground(new java.awt.Color(153, 153, 255));
        labelUpgradeUsers.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelUpgradeUsers.setText(" Upgrade Users");

        javax.swing.GroupLayout panelUpgradeUsersLayout = new javax.swing.GroupLayout(panelUpgradeUsers);
        panelUpgradeUsers.setLayout(panelUpgradeUsersLayout);
        panelUpgradeUsersLayout.setHorizontalGroup(
            panelUpgradeUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelUpgradeUsers, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        panelUpgradeUsersLayout.setVerticalGroup(
            panelUpgradeUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelUpgradeUsers, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panelAddDonors.setBackground(new java.awt.Color(22, 22, 22));
        panelAddDonors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelAddDonorsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelAddDonorsMousePressed(evt);
            }
        });
        panelAddDonors.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                panelAddDonorsComponentShown(evt);
            }
        });

        labelAddDonors.setBackground(new java.awt.Color(22, 22, 22));
        labelAddDonors.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        labelAddDonors.setForeground(new java.awt.Color(153, 153, 255));
        labelAddDonors.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelAddDonors.setText(" Add Donors");

        javax.swing.GroupLayout panelAddDonorsLayout = new javax.swing.GroupLayout(panelAddDonors);
        panelAddDonors.setLayout(panelAddDonorsLayout);
        panelAddDonorsLayout.setHorizontalGroup(
            panelAddDonorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelAddDonors, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        panelAddDonorsLayout.setVerticalGroup(
            panelAddDonorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelAddDonors, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panelUpgradeDonors.setBackground(new java.awt.Color(22, 22, 22));
        panelUpgradeDonors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelUpgradeDonorsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelUpgradeDonorsMousePressed(evt);
            }
        });
        panelUpgradeDonors.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                panelUpgradeDonorsComponentShown(evt);
            }
        });

        labelUpgradeDonors.setBackground(new java.awt.Color(22, 22, 22));
        labelUpgradeDonors.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        labelUpgradeDonors.setForeground(new java.awt.Color(153, 153, 255));
        labelUpgradeDonors.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelUpgradeDonors.setText(" Upgrade Donors");

        javax.swing.GroupLayout panelUpgradeDonorsLayout = new javax.swing.GroupLayout(panelUpgradeDonors);
        panelUpgradeDonors.setLayout(panelUpgradeDonorsLayout);
        panelUpgradeDonorsLayout.setHorizontalGroup(
            panelUpgradeDonorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelUpgradeDonors, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        panelUpgradeDonorsLayout.setVerticalGroup(
            panelUpgradeDonorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelUpgradeDonors, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        panelDeleteDonors.setBackground(new java.awt.Color(22, 22, 22));
        panelDeleteDonors.setForeground(new java.awt.Color(204, 204, 255));
        panelDeleteDonors.setPreferredSize(new java.awt.Dimension(160, 30));
        panelDeleteDonors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelDeleteDonorsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelDeleteDonorsMousePressed(evt);
            }
        });
        panelDeleteDonors.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                panelDeleteDonorsComponentShown(evt);
            }
        });

        labelDeleteDonors.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        labelDeleteDonors.setForeground(new java.awt.Color(153, 153, 255));
        labelDeleteDonors.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelDeleteDonors.setText(" Delete Donors");

        javax.swing.GroupLayout panelDeleteDonorsLayout = new javax.swing.GroupLayout(panelDeleteDonors);
        panelDeleteDonors.setLayout(panelDeleteDonorsLayout);
        panelDeleteDonorsLayout.setHorizontalGroup(
            panelDeleteDonorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelDeleteDonors, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        panelDeleteDonorsLayout.setVerticalGroup(
            panelDeleteDonorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeleteDonorsLayout.createSequentialGroup()
                .addComponent(labelDeleteDonors, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panelViewDonor.setBackground(new java.awt.Color(22, 22, 22));
        panelViewDonor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelViewDonorMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelViewDonorMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelViewDonorMouseReleased(evt);
            }
        });
        panelViewDonor.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                panelViewDonorComponentShown(evt);
            }
        });

        labelViewDonor.setBackground(new java.awt.Color(22, 22, 22));
        labelViewDonor.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        labelViewDonor.setForeground(new java.awt.Color(153, 153, 255));
        labelViewDonor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelViewDonor.setText(" View Donors");

        javax.swing.GroupLayout panelViewDonorLayout = new javax.swing.GroupLayout(panelViewDonor);
        panelViewDonor.setLayout(panelViewDonorLayout);
        panelViewDonorLayout.setHorizontalGroup(
            panelViewDonorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewDonorLayout.createSequentialGroup()
                .addComponent(labelViewDonor, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelViewDonorLayout.setVerticalGroup(
            panelViewDonorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelViewDonor, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelViewUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelUpgradeUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelAddDonors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelViewDonor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelUpgradeDonors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelDeleteDonors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelViewUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelUpgradeUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelAddDonors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelViewDonor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelUpgradeDonors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelDeleteDonors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 190));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("jLabel1");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 87, 20));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 30, 87, 10));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 255));
        jLabel2.setText("jLabel2");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 40, 90, 20));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 60, 87, 10));

        CboxBloodSearch.setBackground(new java.awt.Color(36, 36, 36));
        CboxBloodSearch.setForeground(new java.awt.Color(204, 204, 255));
        CboxBloodSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blood Group Search", "A RhD positive (A+)", "A RhD negative (A-)", "B RhD positive (B+)", "B RhD negative (B-)", "O RhD positive (O+)", "O RhD negative (O-)", "AB RhD positive (AB+)", "AB RhD negative (AB-)" }));
        CboxBloodSearch.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                CboxBloodSearchComponentShown(evt);
            }
        });
        CboxBloodSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CboxBloodSearchActionPerformed(evt);
            }
        });
        jPanel3.add(CboxBloodSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 150, 30));

        txtLocationSearch.setBackground(new java.awt.Color(22, 22, 22));
        txtLocationSearch.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtLocationSearch.setForeground(new java.awt.Color(204, 204, 255));
        txtLocationSearch.setText(" Location Search");
        txtLocationSearch.setBorder(null);
        txtLocationSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtLocationSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLocationSearchFocusLost(evt);
            }
        });
        txtLocationSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationSearchActionPerformed(evt);
            }
        });
        txtLocationSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLocationSearchKeyReleased(evt);
            }
        });
        jPanel3.add(txtLocationSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 160, 30));
        jPanel3.add(separateLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 160, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/Dashboard picture_prev_ui.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 410, 420));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 920, 670));

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));

        Exit.setBackground(new java.awt.Color(22, 22, 22));
        Exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/closeAni.gif"))); // NOI18N
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(153, 0, 0));

        Menu.setBackground(new java.awt.Color(153, 0, 0));
        Menu.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        Menu.setForeground(new java.awt.Color(204, 204, 255));
        Menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Menu.setText("Menu");
        Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 156, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        Minimize.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 870, Short.MAX_VALUE)
                .addComponent(Minimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Minimize, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 50));

        jPanel1.setBackground(new java.awt.Color(36, 36, 36));
        jPanel1.setForeground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelW1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        labelW1.setForeground(new java.awt.Color(204, 204, 255));
        labelW1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelW1.setText("    \"Blood Donation will cost you");
        jPanel1.add(labelW1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 220, 30));

        labelW3.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        labelW3.setForeground(new java.awt.Color(204, 204, 255));
        labelW3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelW3.setText(" \"Every blood donor is a life saver\" ");
        jPanel1.add(labelW3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 220, -1));

        labelW2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        labelW2.setForeground(new java.awt.Color(204, 204, 255));
        labelW2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelW2.setText("   nothing, but it will save a life!\"");
        jPanel1.add(labelW2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 220, 30));

        labelW4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        labelW4.setForeground(new java.awt.Color(204, 204, 255));
        labelW4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelW4.setText("     “Blood is a life, pass it on!”");
        jPanel1.add(labelW4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 220, 20));

        labelW5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        labelW5.setForeground(new java.awt.Color(204, 204, 255));
        labelW5.setText(" “Blood donation is the real act");
        jPanel1.add(labelW5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 220, 20));

        labelW6.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        labelW6.setForeground(new java.awt.Color(204, 204, 255));
        labelW6.setText("real act of humanity.”");
        jPanel1.add(labelW6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 160, 20));

        bld6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/rsz_blood.png"))); // NOI18N
        jPanel1.add(bld6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, 80, 110));

        bld3.setForeground(new java.awt.Color(204, 204, 255));
        jPanel1.add(bld3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, -1, 100));
        jPanel1.add(bld2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        bld4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/rsz_blood.png"))); // NOI18N
        jPanel1.add(bld4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 80, 110));

        bld5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blood/rsz_blood.png"))); // NOI18N
        jPanel1.add(bld5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 80, 110));

        jPanel5.setBackground(new java.awt.Color(22, 22, 22));
        jPanel5.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel5.setMinimumSize(new java.awt.Dimension(220, 670));
        jPanel5.setPreferredSize(new java.awt.Dimension(220, 670));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelM1.setBackground(new java.awt.Color(22, 22, 22));
        panelM1.setBorder(new javax.swing.border.MatteBorder(null));
        panelM1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelM1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelM1MousePressed(evt);
            }
        });
        panelM1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                panelM1ComponentShown(evt);
            }
        });

        labelM1.setBackground(new java.awt.Color(22, 22, 22));
        labelM1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        labelM1.setForeground(new java.awt.Color(204, 204, 255));
        labelM1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelM1.setText("  Users");

        javax.swing.GroupLayout panelM1Layout = new javax.swing.GroupLayout(panelM1);
        panelM1.setLayout(panelM1Layout);
        panelM1Layout.setHorizontalGroup(
            panelM1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelM1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelM1Layout.setVerticalGroup(
            panelM1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelM1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        jPanel5.add(panelM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 129, 220, -1));

        panelM2.setBackground(new java.awt.Color(22, 22, 22));
        panelM2.setBorder(new javax.swing.border.MatteBorder(null));
        panelM2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelM2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelM2MousePressed(evt);
            }
        });
        panelM2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                panelM2ComponentShown(evt);
            }
        });

        labelM2.setBackground(new java.awt.Color(22, 22, 22));
        labelM2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        labelM2.setForeground(new java.awt.Color(204, 204, 255));
        labelM2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelM2.setText("  Donors");

        javax.swing.GroupLayout panelM2Layout = new javax.swing.GroupLayout(panelM2);
        panelM2.setLayout(panelM2Layout);
        panelM2Layout.setHorizontalGroup(
            panelM2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelM2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelM2Layout.setVerticalGroup(
            panelM2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelM2, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        jPanel5.add(panelM2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 187, 220, -1));

        panelM5.setBackground(new java.awt.Color(22, 22, 22));
        panelM5.setBorder(new javax.swing.border.MatteBorder(null));
        panelM5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelM5MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelM5MousePressed(evt);
            }
        });
        panelM5.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                panelM5ComponentShown(evt);
            }
        });

        labelM5.setBackground(new java.awt.Color(22, 22, 22));
        labelM5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        labelM5.setForeground(new java.awt.Color(204, 204, 255));
        labelM5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelM5.setText("  Help Us");

        javax.swing.GroupLayout panelM5Layout = new javax.swing.GroupLayout(panelM5);
        panelM5.setLayout(panelM5Layout);
        panelM5Layout.setHorizontalGroup(
            panelM5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelM5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelM5Layout.setVerticalGroup(
            panelM5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelM5, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        jPanel5.add(panelM5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 361, 220, -1));

        panelM6.setBackground(new java.awt.Color(22, 22, 22));
        panelM6.setBorder(new javax.swing.border.MatteBorder(null));
        panelM6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelM6MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelM6MousePressed(evt);
            }
        });
        panelM6.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                panelM6ComponentShown(evt);
            }
        });

        labelM6.setBackground(new java.awt.Color(22, 22, 22));
        labelM6.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        labelM6.setForeground(new java.awt.Color(204, 204, 255));
        labelM6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelM6.setText("  About US");

        javax.swing.GroupLayout panelM6Layout = new javax.swing.GroupLayout(panelM6);
        panelM6.setLayout(panelM6Layout);
        panelM6Layout.setHorizontalGroup(
            panelM6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelM6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
        );
        panelM6Layout.setVerticalGroup(
            panelM6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelM6, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        jPanel5.add(panelM6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 419, -1, -1));

        panelMm3.setBackground(new java.awt.Color(22, 22, 22));
        panelMm3.setBorder(new javax.swing.border.MatteBorder(null));
        panelMm3.setPreferredSize(new java.awt.Dimension(70, 40));
        panelMm3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMm3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMm3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelMm3MouseReleased(evt);
            }
        });
        panelMm3.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                panelMm3ComponentShown(evt);
            }
        });

        labelMm3.setBackground(new java.awt.Color(22, 22, 22));
        labelMm3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        labelMm3.setForeground(new java.awt.Color(204, 204, 255));
        labelMm3.setText("  Stock");

        javax.swing.GroupLayout panelMm3Layout = new javax.swing.GroupLayout(panelMm3);
        panelMm3.setLayout(panelMm3Layout);
        panelMm3Layout.setHorizontalGroup(
            panelMm3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelMm3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMm3Layout.setVerticalGroup(
            panelMm3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelMm3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        jPanel5.add(panelMm3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 245, 220, -1));

        panelMm4.setBackground(new java.awt.Color(22, 22, 22));
        panelMm4.setBorder(new javax.swing.border.MatteBorder(null));
        panelMm4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMm4MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMm4MousePressed(evt);
            }
        });
        panelMm4.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                panelMm4ComponentShown(evt);
            }
        });

        labelMm4.setBackground(new java.awt.Color(22, 22, 22));
        labelMm4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        labelMm4.setForeground(new java.awt.Color(204, 204, 255));
        labelMm4.setText("  Reports");

        javax.swing.GroupLayout panelMm4Layout = new javax.swing.GroupLayout(panelMm4);
        panelMm4.setLayout(panelMm4Layout);
        panelMm4Layout.setHorizontalGroup(
            panelMm4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelMm4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMm4Layout.setVerticalGroup(
            panelMm4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelMm4, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        jPanel5.add(panelMm4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 303, 220, -1));

        panelMm7.setBackground(new java.awt.Color(22, 22, 22));
        panelMm7.setBorder(new javax.swing.border.MatteBorder(null));
        panelMm7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMm7MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMm7MousePressed(evt);
            }
        });
        panelMm7.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                panelMm7ComponentShown(evt);
            }
        });

        labelMm7.setBackground(new java.awt.Color(22, 22, 22));
        labelMm7.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        labelMm7.setForeground(new java.awt.Color(204, 204, 255));
        labelMm7.setText("  Logout");

        javax.swing.GroupLayout panelMm7Layout = new javax.swing.GroupLayout(panelMm7);
        panelMm7.setLayout(panelMm7Layout);
        panelMm7Layout.setHorizontalGroup(
            panelMm7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelMm7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMm7Layout.setVerticalGroup(
            panelMm7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelMm7, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        jPanel5.add(panelMm7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 477, 220, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 220, 670));

        jPanel7.setBackground(new java.awt.Color(153, 0, 0));
        jPanel7.setPreferredSize(new java.awt.Dimension(9, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 10, 680));

        jPanel6.setBackground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, 690));

        jPanel8.setBackground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1160, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 720, 1160, 10));

        jPanel11.setBackground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 50, 10, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
       
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

    private void MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseClicked
       
       
       
        labelW1.setVisible(false);
        labelW3.setVisible(false);
        labelW2.setVisible(false);
        labelW4.setVisible(false);
        labelW5.setVisible(false);
        labelW6.setVisible(false);
        bld6.setVisible(false);
        bld5.setVisible(false);
        bld4.setVisible(false);
        if(z==0)
        {
            try {
                
                Thread.sleep(150);
                panelM1.setVisible(true);
                labelM1.setVisible(true);
                
            } catch (Exception e) {
            }
        }
        else
        {
         
            try {
                
                Thread.sleep(100);
                labelW1.setVisible(true);
                labelW3.setVisible(true);
                labelW2.setVisible(true);
                labelW4.setVisible(true);
                labelW5.setVisible(true);
                labelW6.setVisible(true);
                bld6.setVisible(true);
                bld5.setVisible(true);
                bld4.setVisible(true);

                panelM1.setVisible(false);
                panelM2.setVisible(false);
               // panelM3.setVisible(false);
                panelMm3.setVisible(false);
                panelMm4.setVisible(false);
                panelM5.setVisible(false);
                panelM6.setVisible(false);
                panelMm7.setVisible(false);
                
                labelM1.setVisible(false);
                labelM2.setVisible(false);
                //labelM3.setVisible(false);
                labelMm3.setVisible(false);
                labelMm4.setVisible(false);
                labelM5.setVisible(false);
                labelM6.setVisible(false);
                labelMm7.setVisible(false);
             
                
                panelViewUsers.setVisible(false);
                panelUpgradeUsers.setVisible(false);
                panelAddDonors.setVisible(false);
                panelViewDonor.setVisible(false);
                panelUpgradeDonors.setVisible(false);
                panelDeleteDonors.setVisible(false);
                labelViewUsers.setVisible(false);
                labelUpgradeUsers.setVisible(false);
                labelAddDonors.setVisible(false);
                labelViewDonor.setVisible(false);
                labelUpgradeDonors.setVisible(false);
                labelDeleteDonors.setVisible(false);
                
                txtLocationSearch.setVisible(false);
                separateLocation.setVisible(false);
                CboxBloodSearch.setVisible(false);
                
                z = 0;
            } catch (Exception e) {
            }
        }

         
    }//GEN-LAST:event_MenuMouseClicked

    private void MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseClicked
        
        this.setExtendedState(HomeSafe1.ICONIFIED);
    }//GEN-LAST:event_MinimizeMouseClicked

    private void panelM1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_panelM1ComponentShown
       try {
                
                Thread.sleep(150);
                panelM2.setVisible(true);
                labelM2.setVisible(true);
            } catch (Exception e) {
            }
    }//GEN-LAST:event_panelM1ComponentShown

    private void panelM2ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_panelM2ComponentShown
      
        try {
                
                Thread.sleep(150);
                panelMm3.setVisible(true);
                labelMm3.setVisible(true);
            } catch (Exception e) {
            }
//        try {
//                
//                Thread.sleep(150);
//                panelMm3.setVisible(true);
//                labelMm3.setVisible(true);
//            } catch (Exception e) {
//            }
    }//GEN-LAST:event_panelM2ComponentShown

    private void panelM5ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_panelM5ComponentShown
      
        try {
                
                Thread.sleep(150);
                panelM6.setVisible(true);
                labelM6.setVisible(true);
            } catch (Exception e) {
            }
    }//GEN-LAST:event_panelM5ComponentShown

    private void panelM6ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_panelM6ComponentShown
       
        try {
                
                Thread.sleep(150);
                panelMm7.setVisible(true);
                labelMm7.setVisible(true);
               
            } catch (Exception e) {
            }
    }//GEN-LAST:event_panelM6ComponentShown

    private void panelM1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelM1MousePressed
        
        panelM1.setBackground(paneClick);
        panelM2.setBackground(paneDefault);
        panelMm3.setBackground(paneDefault);
        panelMm4.setBackground(paneDefault);
        panelM5.setBackground(paneDefault);
        panelM6.setBackground(paneDefault);
        panelMm7.setBackground(paneDefault);
        
    }//GEN-LAST:event_panelM1MousePressed

    private void panelM2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelM2MousePressed
       
        panelM2.setBackground(paneClick);
        panelM1.setBackground(paneDefault);
        panelMm3.setBackground(paneDefault);
        panelMm4.setBackground(paneDefault);
        panelM5.setBackground(paneDefault);
        panelM6.setBackground(paneDefault);
        panelMm7.setBackground(paneDefault);
     
    }//GEN-LAST:event_panelM2MousePressed

    private void panelM5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelM5MousePressed
       
        panelM5.setBackground(paneClick);
        panelM1.setBackground(paneDefault);
        panelM2.setBackground(paneDefault);
        panelMm3.setBackground(paneDefault);
        panelMm4.setBackground(paneDefault);
        panelM6.setBackground(paneDefault);
        panelMm7.setBackground(paneDefault);
       
    }//GEN-LAST:event_panelM5MousePressed

    private void panelM6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelM6MousePressed
       
        panelM6.setBackground(paneClick);
        panelM1.setBackground(paneDefault);
        panelM2.setBackground(paneDefault);
        panelMm3.setBackground(paneDefault);
        panelMm4.setBackground(paneDefault);
        panelM5.setBackground(paneDefault);
        panelMm7.setBackground(paneDefault);
       
    }//GEN-LAST:event_panelM6MousePressed

    private void panelM1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelM1MouseClicked
        
       if(user==0)
       {
           try {
               
               Thread.sleep(50);
               panelViewUsers.setVisible(true);
               labelViewUsers.setVisible(true);
               panelAddDonors.setVisible(false);
               panelViewDonor.setVisible(false);
               panelUpgradeDonors.setVisible(false);
               panelDeleteDonors.setVisible(false);
               labelAddDonors.setVisible(false);
               labelViewDonor.setVisible(false);
               labelUpgradeDonors.setVisible(false);
               labelDeleteDonors.setVisible(false);
               
           } catch (Exception e) {
           }
       }
       else
       {
           panelViewUsers.setVisible(false);
           panelUpgradeUsers.setVisible(false);
//           panelAddDonors.setVisible(false);
//           panelViewDonors.setVisible(false);
//           panelUpgradeDonors.setVisible(false);
           labelViewUsers.setVisible(false);
           labelUpgradeUsers.setVisible(false);
//           labelAddDonors.setVisible(false);
//           labelViewDonors.setVisible(false);
//           labelUpgradeDonors.setVisible(false);
           
           user=0;
           
       }
    }//GEN-LAST:event_panelM1MouseClicked

    private void panelViewUsersComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_panelViewUsersComponentShown
        
        try {
               
               Thread.sleep(50);
               panelUpgradeUsers.setVisible(true);
               labelUpgradeUsers.setVisible(true);
               user=1;
           } catch (Exception e) {
           }
    }//GEN-LAST:event_panelViewUsersComponentShown

    private void panelViewUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelViewUsersMouseClicked
       
        new ViewUsers().setVisible(true);
       
      
    }//GEN-LAST:event_panelViewUsersMouseClicked

    private void panelViewUsersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelViewUsersMousePressed
      
        panelViewUsers.setBackground(paneClick);
        panelUpgradeUsers.setBackground(paneDefault);
        panelM1.setBackground(paneDefault);
    }//GEN-LAST:event_panelViewUsersMousePressed

    private void panelM2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelM2MouseClicked
       
        if(donor==0)
        {
            try {
                
                Thread.sleep(50);
                panelAddDonors.setVisible(true);
                labelAddDonors.setVisible(true);
                panelViewUsers.setVisible(false);
                panelUpgradeUsers.setVisible(false);
                labelViewUsers.setVisible(false);
                labelUpgradeUsers.setVisible(false); 
               
            } catch (Exception e) {
            }
        }
        else
        {
//            panelViewUsers.setVisible(false);
//            panelUpgradeUsers.setVisible(false);
            panelAddDonors.setVisible(false);
            panelViewDonor.setVisible(false);
            panelUpgradeDonors.setVisible(false);
//            labelViewUsers.setVisible(false);
//            labelUpgradeUsers.setVisible(false);
                panelDeleteDonors.setVisible(false);
                labelDeleteDonors.setVisible(false);
            labelAddDonors.setVisible(false);
            labelViewDonor.setVisible(false);
            labelUpgradeDonors.setVisible(false);
            labelDeleteDonors.setVisible(false);
            donor=0;
            
        }
        
    }//GEN-LAST:event_panelM2MouseClicked

    private void panelUpgradeUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelUpgradeUsersMouseClicked
       
        
        new UpgradeUsers().setVisible(true);
    }//GEN-LAST:event_panelUpgradeUsersMouseClicked

    private void panelUpgradeUsersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelUpgradeUsersMousePressed
       
        panelViewUsers.setBackground(paneDefault);
        panelUpgradeUsers.setBackground(paneClick);
         panelM1.setBackground(paneDefault);
    }//GEN-LAST:event_panelUpgradeUsersMousePressed

    private void panelAddDonorsComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_panelAddDonorsComponentShown
        
        try {
                
                Thread.sleep(50);
                panelViewDonor.setVisible(true);
                labelViewDonor.setVisible(true);
            } catch (Exception e) {
            }
    }//GEN-LAST:event_panelAddDonorsComponentShown

    private void panelAddDonorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAddDonorsMouseClicked
      
        UpgradeUsers u = new UpgradeUsers();
        u.setVisible(false);
        ViewUsers v = new ViewUsers();
        v.setVisible(false);
        
        new AddDonors().setVisible(true);
    }//GEN-LAST:event_panelAddDonorsMouseClicked

    private void panelAddDonorsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAddDonorsMousePressed
        
        panelAddDonors.setBackground(paneClick);
        panelViewDonor.setBackground(paneDefault);
        panelUpgradeDonors.setBackground(paneDefault);
        panelDeleteDonors.setBackground(paneDefault);
        panelM2.setBackground(paneDefault);
        
    }//GEN-LAST:event_panelAddDonorsMousePressed

    private void panelUpgradeDonorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelUpgradeDonorsMouseClicked
        
         new UpdateDonor().setVisible(true);
    }//GEN-LAST:event_panelUpgradeDonorsMouseClicked

    private void panelUpgradeDonorsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelUpgradeDonorsMousePressed
       
        panelAddDonors.setBackground(paneDefault);
        panelViewDonor.setBackground(paneDefault);
        panelUpgradeDonors.setBackground(paneClick);
        panelDeleteDonors.setBackground(paneDefault);
        panelM2.setBackground(paneDefault);
    }//GEN-LAST:event_panelUpgradeDonorsMousePressed

    private void panelDeleteDonorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDeleteDonorsMouseClicked
       
        new VIEWDONOR().setVisible(true);
    }//GEN-LAST:event_panelDeleteDonorsMouseClicked

    private void panelDeleteDonorsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDeleteDonorsMousePressed
       
        
        
        panelAddDonors.setBackground(paneDefault);
        panelViewDonor.setBackground(paneDefault);
        panelUpgradeDonors.setBackground(paneDefault);
        panelDeleteDonors.setBackground(paneClick);
        panelM2.setBackground(paneDefault);
    }//GEN-LAST:event_panelDeleteDonorsMousePressed

    private void panelDeleteDonorsComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_panelDeleteDonorsComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_panelDeleteDonorsComponentShown

    private void panelUpgradeDonorsComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_panelUpgradeDonorsComponentShown
        
        try {
                
                Thread.sleep(50);
                panelDeleteDonors.setVisible(true);
                labelDeleteDonors.setVisible(true);
                donor=1;
            } catch (Exception e) {
            }
    }//GEN-LAST:event_panelUpgradeDonorsComponentShown

    private void panelViewDonorComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_panelViewDonorComponentShown
       
        
        try {
                
                Thread.sleep(50);
                panelUpgradeDonors.setVisible(true);
                labelUpgradeDonors.setVisible(true);
                
            } catch (Exception e) {
            }
    }//GEN-LAST:event_panelViewDonorComponentShown

    private void panelViewDonorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelViewDonorMouseClicked
       
        new ViewDon().setVisible(true);
    }//GEN-LAST:event_panelViewDonorMouseClicked

    private void panelViewDonorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelViewDonorMouseReleased
       
        panelAddDonors.setBackground(paneDefault);
        panelViewDonor.setBackground(paneClick);
        panelUpgradeDonors.setBackground(paneDefault);
        panelDeleteDonors.setBackground(paneDefault);
        panelM2.setBackground(paneDefault);
    }//GEN-LAST:event_panelViewDonorMouseReleased

    private void panelViewDonorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelViewDonorMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_panelViewDonorMousePressed

    private void panelMm3ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_panelMm3ComponentShown
       
         try {
                
                Thread.sleep(150);
                panelMm4.setVisible(true);
                labelMm4.setVisible(true);
            } catch (Exception e) {
            }
    }//GEN-LAST:event_panelMm3ComponentShown

    private void panelMm3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMm3MousePressed
       
        panelMm7.setBackground(paneDefault);
        panelM1.setBackground(paneDefault);
        panelM2.setBackground(paneDefault);
        panelMm3.setBackground(paneClick);
        panelMm4.setBackground(paneDefault);
        panelM5.setBackground(paneDefault);
        panelM6.setBackground(paneDefault);
       
    }//GEN-LAST:event_panelMm3MousePressed

    private void panelMm3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMm3MouseClicked
        
        
        
        new JTableWithImage().setVisible(true);
    }//GEN-LAST:event_panelMm3MouseClicked

    private void panelMm4ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_panelMm4ComponentShown
       
        try {
                
                Thread.sleep(150);
                panelM5.setVisible(true);
                labelM5.setVisible(true);
            } catch (Exception e) {
            }
    }//GEN-LAST:event_panelMm4ComponentShown

    private void panelMm4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMm4MousePressed
        
        panelMm7.setBackground(paneDefault);
        panelM1.setBackground(paneDefault);
        panelM2.setBackground(paneDefault);
        panelMm3.setBackground(paneDefault);
        panelMm4.setBackground(paneClick);
        panelM5.setBackground(paneDefault);
        panelM6.setBackground(paneDefault);
       
    }//GEN-LAST:event_panelMm4MousePressed

    private void panelMm4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMm4MouseClicked
        
        Hiding();
        new JTableWithRprts().setVisible(true);
    }//GEN-LAST:event_panelMm4MouseClicked

    private void panelMm3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMm3MouseReleased
       Hiding();
    }//GEN-LAST:event_panelMm3MouseReleased

    private void panelMm7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMm7MouseClicked
        Hiding();
        int a= JOptionPane.showConfirmDialog(null,"Do you really want to logout","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            dispose();
        }
    }//GEN-LAST:event_panelMm7MouseClicked

    private void panelMm7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMm7MousePressed
      
        panelMm7.setBackground(paneClick);
        panelM1.setBackground(paneDefault);
        panelM2.setBackground(paneDefault);
        panelMm3.setBackground(paneDefault);
        panelMm4.setBackground(paneDefault);
        panelM5.setBackground(paneDefault);
        panelM6.setBackground(paneDefault);
    }//GEN-LAST:event_panelMm7MousePressed

    private void CboxBloodSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CboxBloodSearchActionPerformed

        Hiding();
        BindTable();
        //jTable1.setVisible(true);
        //panelTable.setVisible(true);
   
        
    }//GEN-LAST:event_CboxBloodSearchActionPerformed

    private void txtLocationSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLocationSearchKeyReleased
        
        Hiding();
        BindTable1();
        //jTable1.setVisible(true);
        //panelTable.setVisible(true);
        
        
    }//GEN-LAST:event_txtLocationSearchKeyReleased

    private void txtLocationSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocationSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocationSearchActionPerformed

    private void txtLocationSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLocationSearchFocusGained
        
        if(txtLocationSearch.getText().equals(" Location Search"))
        {
            txtLocationSearch.setText("");
            txtLocationSearch.setForeground(new Color(204,204,255));
            
        } 
    }//GEN-LAST:event_txtLocationSearchFocusGained

    private void txtLocationSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLocationSearchFocusLost
       
        if(txtLocationSearch.getText().equals(""))
        {
            txtLocationSearch.setText(" Location Search");
            txtLocationSearch.setForeground(new Color(204,204,255));
            
        }
    }//GEN-LAST:event_txtLocationSearchFocusLost

    private void CboxBloodSearchComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_CboxBloodSearchComponentShown
       
         try {
                
                Thread.sleep(150);
                txtLocationSearch.setVisible(true);
                separateLocation.setVisible(true);
                z=1;
            } catch (Exception e) {
            }
    }//GEN-LAST:event_CboxBloodSearchComponentShown

    private void panelMm7ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_panelMm7ComponentShown
        
        
         try {
                
                Thread.sleep(150);
                CboxBloodSearch.setVisible(true);
                
                
            } catch (Exception e) {
            }
    }//GEN-LAST:event_panelMm7ComponentShown

    private void panelM5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelM5MouseClicked
        Hiding();
        new HelpUs().setVisible(true);
    }//GEN-LAST:event_panelM5MouseClicked

    private void panelM6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelM6MouseClicked
       
        Hiding();
    }//GEN-LAST:event_panelM6MouseClicked

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
            java.util.logging.Logger.getLogger(HomeSafe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeSafe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeSafe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeSafe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeSafe1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CboxBloodSearch;
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel Menu;
    private javax.swing.JLabel Minimize;
    private javax.swing.JLabel bld2;
    private javax.swing.JLabel bld3;
    private javax.swing.JLabel bld4;
    private javax.swing.JLabel bld5;
    private javax.swing.JLabel bld6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelAddDonors;
    private javax.swing.JLabel labelDeleteDonors;
    private javax.swing.JLabel labelM1;
    private javax.swing.JLabel labelM2;
    private javax.swing.JLabel labelM5;
    private javax.swing.JLabel labelM6;
    private javax.swing.JLabel labelMm3;
    private javax.swing.JLabel labelMm4;
    private javax.swing.JLabel labelMm7;
    private javax.swing.JLabel labelUpgradeDonors;
    private javax.swing.JLabel labelUpgradeUsers;
    private javax.swing.JLabel labelViewDonor;
    private javax.swing.JLabel labelViewUsers;
    private javax.swing.JLabel labelW1;
    private javax.swing.JLabel labelW2;
    private javax.swing.JLabel labelW3;
    private javax.swing.JLabel labelW4;
    private javax.swing.JLabel labelW5;
    private javax.swing.JLabel labelW6;
    private javax.swing.JPanel panelAddDonors;
    private javax.swing.JPanel panelDeleteDonors;
    private javax.swing.JPanel panelM1;
    private javax.swing.JPanel panelM2;
    private javax.swing.JPanel panelM5;
    private javax.swing.JPanel panelM6;
    private javax.swing.JPanel panelMm3;
    private javax.swing.JPanel panelMm4;
    private javax.swing.JPanel panelMm7;
    private javax.swing.JPanel panelUpgradeDonors;
    private javax.swing.JPanel panelUpgradeUsers;
    private javax.swing.JPanel panelViewDonor;
    private javax.swing.JPanel panelViewUsers;
    private javax.swing.JSeparator separateLocation;
    private javax.swing.JTextField txtLocationSearch;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
      
        while(true)
        {
            Calendar cal = Calendar.getInstance();
            hour = cal.get(Calendar.HOUR_OF_DAY);
            min = cal.get(Calendar.MINUTE);
            sec = cal.get(Calendar.SECOND);
            
            
            SimpleDateFormat sdf12 = new SimpleDateFormat("hh:mm:ss aa");
           
            java.util.Date dat =  cal.getTime();
            String time12 = sdf12.format(dat);
            jLabel1.setText(time12);
            
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");
            
            jLabel2.setText(sdf.format(dat));
            
            
        }
        
    
   }
}
