/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HospitalManager;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.HospitalManagerOrganization;
import Business.Organization.HospitalManagerOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.MedicineRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userinterface.PatientRole.ManageAppointmentJPanel;

/**
 *
 * @author sadit
 */
public class HospitalManagerJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private HospitalManagerOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem ecosystem;
    private Network network;
    private WorkRequest pharmacyOrder;

    public HospitalManagerJPanel(JPanel userProcessContainer, UserAccount account, HospitalManagerOrganization hospitalManagerOrganization, Enterprise enterprise, EcoSystem business, Network network) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.organization = hospitalManagerOrganization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.ecosystem = business;
        this.network = network;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnManageAppointments = new javax.swing.JButton();
        ManageRegistrations = new javax.swing.JButton();
        btnBlood = new javax.swing.JButton();
        btnManageEmp = new javax.swing.JButton();
        btnManagePatients = new javax.swing.JButton();
        btnManagePharmacyOrders = new javax.swing.JButton();

        setBackground(new java.awt.Color(241, 245, 241));

        jPanel3.setBackground(new java.awt.Color(57, 177, 178));

        jLabel2.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Hospital Manager Work Area");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(241, 245, 241));

        btnManageAppointments.setBackground(new java.awt.Color(56, 154, 220));
        btnManageAppointments.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnManageAppointments.setForeground(new java.awt.Color(255, 255, 255));
        btnManageAppointments.setText("Manage Appointments");
        btnManageAppointments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAppointmentsActionPerformed(evt);
            }
        });

        ManageRegistrations.setBackground(new java.awt.Color(56, 154, 220));
        ManageRegistrations.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        ManageRegistrations.setForeground(new java.awt.Color(255, 255, 255));
        ManageRegistrations.setText("Manage Registrations");
        ManageRegistrations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageRegistrationsActionPerformed(evt);
            }
        });

        btnBlood.setBackground(new java.awt.Color(56, 154, 220));
        btnBlood.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnBlood.setForeground(new java.awt.Color(255, 255, 255));
        btnBlood.setText("Blood ");
        btnBlood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBloodActionPerformed(evt);
            }
        });

        btnManageEmp.setBackground(new java.awt.Color(56, 154, 220));
        btnManageEmp.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnManageEmp.setForeground(new java.awt.Color(255, 255, 255));
        btnManageEmp.setText("Manage Doctors");
        btnManageEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEmpActionPerformed(evt);
            }
        });

        btnManagePatients.setBackground(new java.awt.Color(56, 154, 220));
        btnManagePatients.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnManagePatients.setForeground(new java.awt.Color(255, 255, 255));
        btnManagePatients.setText("Manage Patients");
        btnManagePatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePatientsActionPerformed(evt);
            }
        });

        btnManagePharmacyOrders.setBackground(new java.awt.Color(56, 154, 220));
        btnManagePharmacyOrders.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnManagePharmacyOrders.setForeground(new java.awt.Color(255, 255, 255));
        btnManagePharmacyOrders.setText("Manage Pharamcy Orders");
        btnManagePharmacyOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePharmacyOrdersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnManagePatients, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBlood, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageAppointments, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnManagePharmacyOrders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ManageRegistrations, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManageAppointments)
                    .addComponent(ManageRegistrations, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBlood)
                    .addComponent(btnManageEmp))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManagePatients)
                    .addComponent(btnManagePharmacyOrders))
                .addContainerGap(250, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEmpActionPerformed
        // TODO add your handling code here:
        ManageDoctors manageEmp = new ManageDoctors(userProcessContainer, userAccount, enterprise, ecosystem, network);
        userProcessContainer.add("manageEmployeeJPanel", manageEmp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageEmpActionPerformed

    private void btnManagePatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePatientsActionPerformed
        // TODO add your handling code here:
        ManagePatients managepatient = new ManagePatients(userProcessContainer, userAccount, enterprise, ecosystem, network);
        userProcessContainer.add("managePatientJPanel", managepatient);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManagePatientsActionPerformed

    private void btnManageAppointmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAppointmentsActionPerformed
        // TODO add your handling code here:
        ManageAppointmentJPanelHospitalMan manageAppt = new ManageAppointmentJPanelHospitalMan(userProcessContainer, userAccount, enterprise, ecosystem, network);
        userProcessContainer.add("managePatientJPanel", manageAppt);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnManageAppointmentsActionPerformed

    private void btnManagePharmacyOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePharmacyOrdersActionPerformed
        PharmacyOrderStatusJPanel pharmacyOrderStatus = new PharmacyOrderStatusJPanel(userProcessContainer, userAccount, enterprise, ecosystem, network);
        userProcessContainer.add("managePatientJPanel", pharmacyOrderStatus);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManagePharmacyOrdersActionPerformed

    private void ManageRegistrationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageRegistrationsActionPerformed
        // TODO add your handling code here:
        NewPatientRegistrationJPanel pharmacyOrderStatus = new NewPatientRegistrationJPanel(userProcessContainer, userAccount, enterprise, ecosystem, network);
        userProcessContainer.add("managePatientJPanel", pharmacyOrderStatus);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_ManageRegistrationsActionPerformed

    private void btnBloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBloodActionPerformed
        // TODO add your handling code here:
        BloodJPanel bloodPanel = new BloodJPanel(userProcessContainer, userAccount, enterprise, ecosystem, network);
        userProcessContainer.add("managePatientJPanel", bloodPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBloodActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManageRegistrations;
    private javax.swing.JButton btnBlood;
    private javax.swing.JButton btnManageAppointments;
    private javax.swing.JButton btnManageEmp;
    private javax.swing.JButton btnManagePatients;
    private javax.swing.JButton btnManagePharmacyOrders;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
