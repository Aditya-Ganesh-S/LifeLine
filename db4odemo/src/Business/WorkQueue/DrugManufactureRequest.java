/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.DrugManufactureEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PharmacyEnterprise;
import Business.Network.Network;

/**
 *
 * @author sadit
 */
public class DrugManufactureRequest extends WorkRequest {
    private Network network;
    private Enterprise pharmacy;
    private Enterprise drugEnterprise;
    private String medName;
    private int quantity;

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

    public Enterprise getDrugEnterprise() {
        return drugEnterprise;
    }

    public void setDrugEnterprise(Enterprise drugEnterprise) {
        this.drugEnterprise = drugEnterprise;
    }

    public String getMedName() {
        return medName;
    }

    public void setMedName(String medName) {
        this.medName = medName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
