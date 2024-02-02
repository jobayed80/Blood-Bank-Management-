/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blood;




    public class Product2 {
    private String Name;
    private String Blood;
    private String Contact;
    private String Address;
    private String LastDonation;
    private byte[] Image;
    
    public Product2(){}
    
    public Product2(String name,String blood,String contact,String address,String lastDonation,byte[] image)
    {
        this.Name=name;
        this.Blood=blood;
        this.Contact=contact;
        this.Address=address;
        this.LastDonation=lastDonation;
        this.Image=image;
        
  
    }
    public String getName()
    {
        return Name;
    }
    public void setName(String NAME)
    {
        this.Name=NAME;
    }
    public String getBlood()
    {
        return Blood;
    }
    public void setBlood(String BLOOD)
    {
        this.Blood=BLOOD;
    }
    public String getContact()
    {
        return Contact;
    }
    public void setContact(String CONTACT)
    {
        this.Contact=CONTACT;
    }
    public String getAddress()
    {
        return Address;
    }
    public void setAddress(String ADDRESS)
    {
        this.Address=ADDRESS;
    }
    public String getLastDonation()
    {
        return LastDonation;
    }
    public void setLastDonation(String LASTDONATION)
    {
        this.LastDonation=LASTDONATION;
    }
    public byte[] getMyImage()
    {
        return Image;
    }
   
    
}
