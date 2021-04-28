/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Patient.PatientDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sadit
 */
public class HospitalEnterprise extends Enterprise {
    
    private PatientDirectory parientList;
    
    public HospitalEnterprise(String name){
        super(name,EnterpriseType.Hospital);
        parientList = new PatientDirectory();
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public PatientDirectory getParientList() {
        return parientList;
    }

    public void setParientList(PatientDirectory parientList) {
        this.parientList = parientList;
    }

   
    
    
}
