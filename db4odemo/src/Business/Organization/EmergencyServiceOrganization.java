/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.EmergencyServiceRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sadit
 */
public class EmergencyServiceOrganization extends Organization {

    public EmergencyServiceOrganization() {
        super(Organization.Type.EmergencyService.getValue());
        
    }
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new EmergencyServiceRole());
        return roles;
    }

}
