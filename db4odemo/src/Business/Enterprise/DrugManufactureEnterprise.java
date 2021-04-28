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
public class DrugManufactureEnterprise extends Enterprise {
    private HashMap<String, Integer> medicineInventory;

    public DrugManufactureEnterprise(String name) {
         super(name,Enterprise.EnterpriseType.DrugManufacture);
         medicineInventory  = new HashMap<String, Integer>();
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public HashMap<String, Integer> getMedicineInventory() {
        return medicineInventory;
    }

    public void setMedicineInventory(HashMap<String, Integer> medicineInventory) {
        this.medicineInventory = medicineInventory;
    }
    
    
}
