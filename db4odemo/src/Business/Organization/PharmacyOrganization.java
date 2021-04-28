/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.PharmacyRole;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author sadit
 */
public class PharmacyOrganization extends Organization {

    private HashMap<String, Integer> medicineInventory;

    public PharmacyOrganization() {
        super(Organization.Type.Pharmacy.getValue());
        medicineInventory = new HashMap<String, Integer>();

    }

    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PharmacyRole());
        return roles;
    }

    public HashMap<String, Integer> getMedicineInventory() {
        return medicineInventory;
    }

    public void setMedicineInventory(HashMap<String, Integer> medicineInventory) {
        this.medicineInventory = medicineInventory;
    }

    public void initialzeData() {
        medicineInventory.put("Metformin", 10);
        medicineInventory.put("Albuterol ", 10);
        medicineInventory.put("Losartan", 10);
        medicineInventory.put("Omeprazole", 12);
        medicineInventory.put("Hydrochlorothiazide", 13);
    }

}
