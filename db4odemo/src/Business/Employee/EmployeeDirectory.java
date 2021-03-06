/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name){
        Employee employee = new Employee(employeeList.size() + 1);
        employee.setName(name);
        employeeList.add(employee);
        return employee;
    }
    public Employee getEmployee(int id){
        for(Employee e: employeeList){
            if(e.getId() == id){
                return e;
            }
        }
        return null;
    }
    
}