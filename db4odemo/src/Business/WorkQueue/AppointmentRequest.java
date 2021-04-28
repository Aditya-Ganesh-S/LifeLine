/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author sadit
 */
public class AppointmentRequest extends WorkRequest {

    private Network network;
    private Enterprise enterprise;
    private Organization.Type orgType;
    private Patient patient;
    private Employee doctor;
    private Date date;
    private String Patientstatus;
    private String HopitalAdminStatus;

    public Employee getDoctor() {
        return doctor;
    }

    public void setDoctor(Employee doctor) {
        this.doctor = doctor;
    }

    public String getPatientstatus() {
        return Patientstatus;
    }

    public void setPatientstatus(String Patientstatus) {
        this.Patientstatus = Patientstatus;
    }

    public String getHopitalAdminStatus() {
        return HopitalAdminStatus;
    }

    public void setHopitalAdminStatus(String HopitalAdminStatus) {
        this.HopitalAdminStatus = HopitalAdminStatus;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Organization.Type getOrgType() {
        return orgType;
    }

    public void setOrgType(Organization.Type orgType) {
        this.orgType = orgType;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

}
