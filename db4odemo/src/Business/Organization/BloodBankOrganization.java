/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.BloodBankRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sadit
 */
public class BloodBankOrganization extends Organization {

    public BloodBankOrganization() {
        super(Organization.Type.BloodBank.getValue());

    }

    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BloodBankRole());
        return roles;
    }

}
