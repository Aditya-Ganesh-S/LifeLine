/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Patient.PatientDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private PatientDirectory patientDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter = 0;
    public ArrayList<Role> roles;
    private Type type;

    public enum Type {
        HospitalManager("Hospital Manager Organization"),
        Patient("Patient Organization"),
        Doctor("Doctor Organization"),
        EmergencyService("Emergency Service Organization Organization"),
        BloodBank("Bloog Bank Organization Organization"),
        Donor("Donor Organization Organization"),
        Pharmacy("Pharmacy Organization Organization"),
        DrugManufacture("Drug Store Organization"),
        SysAdmin("Sysadmin");

        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        patientDirectory = new PatientDirectory();
        organizationID = counter;
        ++counter;
    }

    public Organization() {

    }

    public abstract ArrayList<Role> getSupportedRole();

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }

}
