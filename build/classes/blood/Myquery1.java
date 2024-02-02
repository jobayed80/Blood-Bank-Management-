/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blood;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author acer
 */
public class Myquery1 {
    
    
    
    
    
    public ArrayList<Product2> BindTable()
    {

        
            JFrame f;       
        f=new JFrame();    
        String country[]={"Blood Group","A RhD positive (A+)","A RhD negative (A-)","B RhD positive (B+)","B RhD positive (B+)","O RhD positive (O+)","O RhD negative (O-)","AB RhD positive (AB+),AB RhD positive (AB-)"};        
        JComboBox cb = new JComboBox(country);
        cb.setBounds(50, 50, 90, 20);
        f.add(cb);
        f.setLayout(null);
        f.setSize(300,50);
        f.setVisible(true);
        
        
        
        ArrayList<Product2> list = new ArrayList<Product2>();
        try {
            //String Search = (String)CboxYear.getSelectedItem();
        
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood", "root", "***###botki143JN");
            Statement st = (Statement)con.createStatement();
            /////String query = "SELECT 'Name','Contact','Bld','Address','LastDonation','Image' FROM 'don'";
            String query = "select *from don where Bld like '%"+cb+"%'";
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
         return list;
    }
   
}
