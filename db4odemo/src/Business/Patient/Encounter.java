/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Enterprise.Enterprise;
import Business.Prescription.PrescriptionList;
import java.time.LocalDateTime;

/**
 *
 * @author sadit
 */
public class Encounter {

    private VitalSigns vitalSign;
    private LocalDateTime date;
    private String doctorRemark;
    private PrescriptionList prescriptionList;
    private Enterprise hospital;

    public PrescriptionList getPresciption() {
        return prescriptionList;
    }

    public void setPresciption(Prescription presciption) {
        this.prescriptionList = prescriptionList;
    }
    Encounter() {
        vitalSign = new VitalSigns();
        prescriptionList = new PrescriptionList();
    }

    public PrescriptionList getPrescriptionList() {
        return prescriptionList;
    }

    public void setPrescriptionList(PrescriptionList prescriptionList) {
        this.prescriptionList = prescriptionList;
    }

    public Enterprise getHospital() {
        return hospital;
    }

    public void setHospital(Enterprise hospital) {
        this.hospital = hospital;
    }

    
    public String getDoctorRemark() {
        return doctorRemark;
    }

    public void setDoctorRemark(String doctorRemark) {
        this.doctorRemark = doctorRemark;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public VitalSigns getVitalSign() {
        return vitalSign;
    }

    public void setVitalSign(VitalSigns vitalSign) {
        this.vitalSign = vitalSign;
    }

}
