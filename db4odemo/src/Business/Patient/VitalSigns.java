/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.time.LocalDateTime;

/**
 *
 * @author sadit
 */
public class VitalSigns {
    private double temperature;
    private double RespiratoryRate;
    private double HeartRate;
    private double BloodPressure;
    private double weight_kilo;
    private String bloodGroup;
    private LocalDateTime date; 

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
    

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getRespiratoryRate() {
        return RespiratoryRate;
    }

    public void setRespiratoryRate(double RespiratoryRate) {
        this.RespiratoryRate = RespiratoryRate;
    }

    public double getHeartRate() {
        return HeartRate;
    }

    public void setHeartRate(double HeartRate) {
        this.HeartRate = HeartRate;
    }

    public double getBloodPressure() {
        return BloodPressure;
    }

    public void setBloodPressure(double BloodPressure) {
        this.BloodPressure = BloodPressure;
    }

    public double getWeight_kilo() {
        return weight_kilo;
    }

    public void setWeight_kilo(double weight_kilo) {
        this.weight_kilo = weight_kilo;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
