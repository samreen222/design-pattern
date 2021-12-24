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
class Employee {
    private String employeeName;
  
    private double employeeSalary;
    private String employeeDesignation;
  
    public Employee(String employeeName,
             double employeeSalary, String employeeDesignation)
    {
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.employeeDesignation = employeeDesignation;
    }
    public String getEmployeeName()
    {
        return employeeName;
    }
    public double getEmployeeSalary()
    {
        return employeeSalary;
    }
    public String getEmployeeDesignation()
    {
        return employeeDesignation;
    }
    public String toString()
    {
        return "Employee Name: " + employeeName + ", EmployeeDesignation : " + employeeDesignation + ",Employee Salary : " + employeeSalary;
    }
}
