/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Prescription;

import java.util.Date;

/**
 *
 * @author sadit
 */
public class Prescription {
    private int NoofTimesInaday;
    private int totalDays;
    private String daignosis;
    private String medicines;

    private Date prescriptionDate;
    private String networkName;

    public int getNoofTimesInaday() {
        return NoofTimesInaday;
    }

    public void setNoofTimesInaday(int NoofTimesInaday) {
        this.NoofTimesInaday = NoofTimesInaday;
    }

    public int getTotalDays() {
        return totalDays;
    }

    public void setTotalDays(int totalDays) {
        this.totalDays = totalDays;
    }

    public String getDaignosis() {
        return daignosis;
    }

    public void setDaignosis(String daignosis) {
        this.daignosis = daignosis;
    }

    public String getMedicineName() {
        return medicines;
    }

    public void setMedicineName(String medicineName) {
        this.medicines = medicineName;
    }

    public Date getPrescriptionDate() {
        return prescriptionDate;
    }

    public void setPrescriptionDate(Date prescriptionDate) {
        this.prescriptionDate = prescriptionDate;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }
    
}
