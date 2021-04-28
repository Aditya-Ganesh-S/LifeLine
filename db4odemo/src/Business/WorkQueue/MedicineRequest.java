/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.Prescription.Prescription;
import Business.Prescription.PrescriptionList;

/**
 *
 * @author sadit
 */
public class MedicineRequest extends WorkRequest {
    
    private Network network;
    private Enterprise pharmacy;
    private Organization.Type orgType;
    private PrescriptionList prescription;
    private Enterprise hospital;
    private String hospitalStatus;
    private String pharmacyStatus;
    private Patient patient;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    public String getHospitalStatus() {
        return hospitalStatus;
    }

    public void setHospitalStatus(String hospitalStatus) {
        this.hospitalStatus = hospitalStatus;
    }

    public String getPharmacyStatus() {
        return pharmacyStatus;
    }

    public void setPharmacyStatus(String pharmacyStatus) {
        this.pharmacyStatus = pharmacyStatus;
    }

    public PrescriptionList getPrescription() {
        return prescription;
    }

    public void setPrescription(PrescriptionList prescriptionList) {
        this.prescription = prescriptionList;
    }
    

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public Enterprise getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(Enterprise pharmacy) {
        this.pharmacy = pharmacy;
    }

    public Enterprise getHospital() {
        return hospital;
    }

    public void setHospital(Enterprise hospital) {
        this.hospital = hospital;
    }
 

    public Organization.Type getOrgType() {
        return orgType;
    }

    public void setOrgType(Organization.Type orgType) {
        this.orgType = orgType;
    }
    
    
    
}
