/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Patient.PatientDirectory;
import java.util.HashMap;

/**
 *
 * @author sadit
 */
public abstract class Enterprise extends Organization {

    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private PatientDirectory patientList = new PatientDirectory();
    private HashMap<String, Integer> drugList;
    private HashMap<String, Integer> bloodList;

    public enum EnterpriseType {
        Hospital("Hospital"),
        Pharmacy("Pharmacy"),
        DrugManufacture("Drug"),
        BloodBank("BloodBank");

        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public HashMap<String, Integer> getBloodList() {
        if(this.bloodList == null){
            return new HashMap<String, Integer>();
        }
        else{
            return bloodList;
        }
    }

    public void setBloodList(HashMap<String, Integer> bloodList) {
        this.bloodList = bloodList;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
        patientList = new PatientDirectory();
        drugList = new HashMap<String, Integer>();
        bloodList = new HashMap<String, Integer>();

    }

    public Enterprise() {

    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public PatientDirectory getPatientList() {
        return patientList;
    }

    public void setPatientList(PatientDirectory patientList) {
        this.patientList = patientList;
    }

    public HashMap<String, Integer> getDrugList() {
        return drugList;
    }

    public void setDrugList(HashMap<String, Integer> drugList) {
        this.drugList = drugList;
    }

    public void addToDrugList(String medName, int quantity) {
        drugList.put(medName, quantity);
    }
}
