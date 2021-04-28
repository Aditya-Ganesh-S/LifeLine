/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author sadit
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())) {
            organization = new DoctorOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.HospitalManager.getValue())) {
            organization = new HospitalManagerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Pharmacy.getValue())) {
            organization = new PharmacyOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.DrugManufacture.getValue())) {
            organization = new DrugManufactureOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Patient.getValue())) {
            organization = new PatientOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.BloodBank.getValue())) {
            organization = new BloodBankOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.EmergencyService.getValue())) {
            organization = new EmergencyServiceOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Donor.getValue())) {
            organization = new DonorOrganization();
            organizationList.add(organization);
        }
        
        
        return organization;
    }
}
