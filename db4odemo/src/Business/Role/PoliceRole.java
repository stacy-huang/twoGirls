/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DocumentOrganization;
import Business.Organization.Organization;
import Business.Organization.PoliceOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DocumentRole.DocumentWorkAreaJPanel;
import userinterface.PoliceRole.PoliceWorkAreaJPanel;

/**
 *
 * @author stacyhuang
 */
public class PoliceRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PoliceWorkAreaJPanel(userProcessContainer, account, (PoliceOrganization)organization, enterprise,business);
    }
}