/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lazy.loading;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Samreen
 */
public class ContactListImpl implements ContactList {
    public List<Employee> getEmployeeList()
    {
        return getEmpList();
    }
    private static List<Employee> getEmpList()
    {
        List<Employee> empList = new ArrayList<Employee>(5);
  
        empList.add(new Employee("Lokesh", 2565.55, "SE"));
        empList.add(new Employee("Kushagra", 22574, "Manager"));
        empList.add(new Employee("Susmit", 3256.77, "G4"));
        empList.add(new Employee("Vikram", 4875.54, "SSE"));
        empList.add(new Employee("Achint", 2847.01, "SE"));
  
        return empList;
    }
}
