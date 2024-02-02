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
import javax.swing.JOptionPane;


/**
 *
 * @author acer
 */
public class MyQuery {
    
    
    
    
    
    public ArrayList<Product2> BindTable()
    {
        ArrayList<Product2> list = new ArrayList<Product2>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood", "root", "***###botki143JN");
            Statement st = (Statement)con.createStatement();
            /////String query = "SELECT 'Name','Contact','Bld','Address','LastDonation','Image' FROM 'don'";
            String query = "select Name,Contact,Bld,Address,LastDonation,Image from don";
            
            
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
