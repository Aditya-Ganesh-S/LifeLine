/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author sadit
 */
public class PharmacyEnterprise extends Enterprise {

    private ArrayList<String> medicines;
    private HashMap<String, Integer> medicineInventory;

    public HashMap<String, Integer> getMedicineInventory() {
        return medicineInventory;
    }

    public void setMedicineInventory(HashMap<String, Integer> medicineInventory) {
        this.medicineInventory = medicineInventory;
    }

    public ArrayList<String> getMedicines() {
        return medicines;
    }

    public void setMedicines(ArrayList<String> medicines) {
        this.medicines = medicines;
    }

    public PharmacyEnterprise(String name) {
        super(name, EnterpriseType.Pharmacy);
        medicineInventory = new HashMap<String, Integer>();

    }

    public PharmacyEnterprise() {
        medicineInventory = new HashMap<String, Integer>();

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public void initialzeData() {
        medicineInventory.put("Metformin", 10);
        medicineInventory.put("Albuterol ", 10);
        medicineInventory.put("Losartan", 10);
        medicineInventory.put("Omeprazole", 12);
        medicineInventory.put("Hydrochlorothiazide", 13);
    }

}
