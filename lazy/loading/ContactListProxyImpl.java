/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lazy.loading;

import java.util.List;

/**
 *
 * @author Samreen
 */
public class ContactListProxyImpl implements ContactList {
    private ContactList contactList;
    public List<Employee> getEmployeeList()
    {
        if (contactList == null) {
            System.out.println("Fetching list of employees");
            contactList = new ContactListImpl();
        }
        return contactList.getEmployeeList();
    }
}
