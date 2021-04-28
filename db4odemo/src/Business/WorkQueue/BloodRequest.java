/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.Network.Network;

/**
 *
 * @author sadit
 */
public class BloodRequest extends WorkRequest {
    private Network network;
    private Enterprise bloodbank;
    private Enterprise hospital;
    private String bloodGroup;
    private int units;

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public Enterprise getBloodbank() {
        return bloodbank;
    }

    public void setBloodbank(Enterprise bloodbank) {
        this.bloodbank = bloodbank;
    }

    public Enterprise getHospital() {
        return hospital;
    }

    public void setHospital(Enterprise hospital) {
        this.hospital = hospital;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }
    
    

}
