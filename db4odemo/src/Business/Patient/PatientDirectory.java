/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.Address.Address;
import Business.Customer.Customer;
import Business.EcoSystem;
import java.util.ArrayList;

/**
 *
 * @author sadit
 */
public class PatientDirectory {

    private ArrayList<Patient> patientDirectory;

    public PatientDirectory() {
        patientDirectory = new ArrayList<>();
    }

    public ArrayList<Patient> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(ArrayList<Patient> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    /**
     *
     * @return
     */
    public Patient addToPatientDirectory(String name, String phone, Address address, int age, String gender, String email) {
        Patient patient1 = new Patient("P" + (patientDirectory.size() + 1), name, phone, address, age, gender, email);
        patientDirectory.add(patient1);
        return patient1;
    }

    public void deletePatient(int index, EcoSystem system) {
        String id = patientDirectory.get(index).getId();
        System.out.println(id);
        for (int i = 0; i < system.getUserAccountDirectory().getUserAccountList().size(); i++) {
            System.out.println(system.getUserAccountDirectory().getUserAccountList().get(i).getPatient().getId());
            if (system.getUserAccountDirectory().getUserAccountList().get(i).getPatient().getId().equalsIgnoreCase(id)) {
                system.getUserAccountDirectory().getUserAccountList().remove(i);
            }
        }
        patientDirectory.remove(index);
    }

    public void delete2(String id) {
        for(Patient p: patientDirectory){
            if(p.getId() == id){
                patientDirectory.remove(p);
                return;
            }
        }
        return;
    }

    public Patient getPatient(String id) {
        for(Patient p: patientDirectory){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }

}
