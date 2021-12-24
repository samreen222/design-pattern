/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lazy.loading;

/**
 *
 * @author Samreen
 */
public class Company {
    String companyName;
    String companyAddress;
    String companyContactNo;
    ContactList contactList;
  
    public Company(String companyName, String companyAddress,
            String companyContactNo, ContactList contactList)
    {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.companyContactNo = companyContactNo;
        this.contactList = contactList;
    }
  
    public String getCompanyName()
    {
        return companyName;
    }
    public String getCompanyAddress()
    {
        return companyAddress;
    }
    public String getCompanyContactNo()
    {
        return companyContactNo;
    }
    public ContactList getContactList()
    {
        return contactList;
    }
  
}
