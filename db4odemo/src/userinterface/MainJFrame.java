/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.EcoSystem;
import Business.DB4OUtil.DB4OUtil;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.Role.RoleType;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import userinterface.PatientRole.PatientRegistration;
//import userinterface.UserRegistration.UserRegistrationJPanel;

/**
 *
 * @author Vivek
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    UserAccount userAccount;
    Enterprise inEnterprise;
    Organization inOrganization;
    Network networkEmergency;


    public MainJFrame() {
        this.setUndecorated(true);
        initComponents();
        system = dB4OUtil.retrieveSystem();
        //EcoSystem.setInstance(system);
        loginJPanel.setVisible(true);
        container.setVisible(false);
        leftPanel.setVisible(false);
        this.setSize(1340,790);
        //getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
    }

//    private void changePanel1() {
//
//        if(userAccount==null){
//            //            log.error("Invalid credentials for user");
//            JOptionPane.showMessageDialog(null, "Invalid credentials");
//            return;
//        }
//        else{
//            //greetingUserLabel.setText(greetings + " !!!");
//            CardLayout layout = (CardLayout) container.getLayout();
//            container.add("workArea",userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, system,networkEmergency));
//            layout.next(container);
//        }
//
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftPanel = new javax.swing.JPanel();
        btnLogoutLabel = new javax.swing.JLabel();
        greetingUserLabel = new javax.swing.JLabel();
        btnBackLabel = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        loginJPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        passwordField = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        userNameJTextField = new javax.swing.JTextField();
        loginButton = new javax.swing.JLabel();
        btnRegister = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cancelButton = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 23, 1338, 800));
        setMinimumSize(new java.awt.Dimension(1338, 800));
        setPreferredSize(new java.awt.Dimension(1338, 800));
        setSize(new java.awt.Dimension(1338, 800));

        leftPanel.setBackground(new java.awt.Color(56, 154, 220));
        leftPanel.setMinimumSize(new java.awt.Dimension(1338, 60));
        leftPanel.setPreferredSize(new java.awt.Dimension(1338, 60));
        leftPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogoutLabel.setBackground(new java.awt.Color(0, 255, 0));
        btnLogoutLabel.setForeground(new java.awt.Color(51, 102, 255));
        btnLogoutLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        btnLogoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLogoutLabelMousePressed(evt);
            }
        });
        leftPanel.add(btnLogoutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 0, 40, 40));

        greetingUserLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        leftPanel.add(greetingUserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 690, 60));

        btnBackLabel.setBackground(new java.awt.Color(0, 0, 0));
        btnBackLabel.setForeground(new java.awt.Color(204, 0, 204));
        btnBackLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBackLabelMousePressed(evt);
            }
        });
        leftPanel.add(btnBackLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 0, 60, 60));

        container.setBackground(new java.awt.Color(204, 204, 204));
        container.setForeground(new java.awt.Color(204, 204, 204));
        container.setPreferredSize(new java.awt.Dimension(1338, 840));
        container.setLayout(new java.awt.CardLayout());

        loginJPanel.setBackground(new java.awt.Color(25, 56, 82));
        loginJPanel.setPreferredSize(new java.awt.Dimension(1338, 800));

        jPanel2.setBackground(new java.awt.Color(221, 44, 80));
        jPanel2.setPreferredSize(new java.awt.Dimension(554, 840));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 102, 204)));
        jPanel4.setPreferredSize(new java.awt.Dimension(302, 34));

        passwordField.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        passwordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordField.setBorder(null);
        passwordField.setCaretColor(new java.awt.Color(255, 255, 255));
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 500, 230, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 153)));
        jPanel3.setPreferredSize(new java.awt.Dimension(302, 34));

        userNameJTextField.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        userNameJTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userNameJTextField.setToolTipText("");
        userNameJTextField.setBorder(null);
        userNameJTextField.setCaretColor(new java.awt.Color(255, 255, 255));
        userNameJTextField.setDisabledTextColor(new java.awt.Color(16, 10, 55));
        userNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameJTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(userNameJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 230, -1));

        loginButton.setBackground(new java.awt.Color(0, 51, 153));
        loginButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        loginButton.setForeground(new java.awt.Color(0, 51, 153));
        loginButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginButton.setText("LOGIN");
        loginButton.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 153)));
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginButtonMousePressed(evt);
            }
        });
        jPanel2.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 410, 90, 33));

        btnRegister.setBackground(new java.awt.Color(0, 51, 153));
        btnRegister.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(0, 51, 153));
        btnRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegister.setText("SIGNUP");
        btnRegister.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 153)));
        btnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRegisterMousePressed(evt);
            }
        });
        jPanel2.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 500, 90, 33));

        jPanel1.setBackground(new java.awt.Color(249, 248, 248));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/padlock (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel3))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, -1, -1));

        jPanel5.setBackground(new java.awt.Color(249, 248, 248));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user (2).png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel6)
                .addGap(0, 0, 0))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ambulance.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 380, 330, 240));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/emergency-call.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 300, 300));

        jLabel2.setBackground(new java.awt.Color(51, 51, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/log2.jpg"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(600, 840));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1340, 900));

        cancelButton.setBackground(new java.awt.Color(51, 51, 255));
        cancelButton.setForeground(new java.awt.Color(255, 153, 0));
        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel.png"))); // NOI18N
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cancelButtonMousePressed(evt);
            }
        });
        jPanel2.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, -9, -1, 50));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(833, 213, 161, 143));

        jLabel4.setBackground(new java.awt.Color(25, 56, 82));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Password");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 47, 30));

        javax.swing.GroupLayout loginJPanelLayout = new javax.swing.GroupLayout(loginJPanel);
        loginJPanel.setLayout(loginJPanelLayout);
        loginJPanelLayout.setHorizontalGroup(
            loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1338, Short.MAX_VALUE)
        );
        loginJPanelLayout.setVerticalGroup(
            loginJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(loginJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, 1075, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutLabelMousePressed
        logout();
    }//GEN-LAST:event_btnLogoutLabelMousePressed

    private void userNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameJTextFieldActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void loginButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMousePressed
        // TODO add your handling code here:
        String userName = userNameJTextField.getText();
        char[] passwordCharArray = passwordField.getPassword();
        String password = String.valueOf(passwordCharArray);

        UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(userName, password);
        Enterprise inEnterprise = null;
        Organization inOrganization = null;
        Network inNetwork = null;

        if (userAccount == null) {
            for (Network network : system.getNetworkList()) {
                //Step 2.a: check against each enterprise
                
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    
                    userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    
                    if (userAccount == null) {
                        //Step 3:check against each organization for each enterprise
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            userAccount = organization.getUserAccountDirectory().authenticateUser(userName, password);
                            if (userAccount != null) {
                                inEnterprise = enterprise;
                                inOrganization = organization;
                                inNetwork = network;
                                break;
                            }
                        }

                    } else {
                        inEnterprise = enterprise;
                        break;
                    }
                    if (inOrganization != null) {
                        break;
                    }
                }
                if (inEnterprise != null) {
                    break;
                }
                /*if (networkEmergency != null) {//changed
                    break;
                }*/
            }
        }
        if (userAccount == null) {
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        } else {
            
            CardLayout layout = (CardLayout) container.getLayout();
            container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, system, inNetwork));
            layout.next(container);
            loginJPanel.setVisible(false);
            container.setVisible(true);
            leftPanel.setVisible(true);
            btnLogoutLabel.setVisible(true);
            btnBackLabel.setVisible(false);
            userNameJTextField.setText("");
            passwordField.setText("");
//            changePanel1();
        }

    }//GEN-LAST:event_loginButtonMousePressed

    private void cancelButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_cancelButtonMousePressed

    private void btnRegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMousePressed
        
        PatientRegistration panel = null;
        try {
            panel = new PatientRegistration(container, this.system);
        } catch (Exception ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        //emoRR panel = new demoRR(container, system);
        //container.add("UserRegistrationJPanel", panel);
        container.setVisible(true);
        loginJPanel.setVisible(false);
        leftPanel.setVisible(true);
        btnLogoutLabel.setVisible(true);
        userNameJTextField.setEnabled(true);
        passwordField.setEnabled(true);

        userNameJTextField.setText("");
        passwordField.setText("");
        //cc();
        //SystemAdminRole r = new SystemAdminRole();
            container.add("workArea", panel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);   
            
    }//GEN-LAST:event_btnRegisterMousePressed

    private void btnBackLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackLabelMousePressed
        // TODO add your handling code here:
      logout();
    }//GEN-LAST:event_btnBackLabelMousePressed

    private void logout() {
        container.removeAll();
        dB4OUtil.storeSystem(system);
        loginJPanel.setVisible(true);
        container.setVisible(false);
        leftPanel.setVisible(false);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBackLabel;
    private javax.swing.JLabel btnLogoutLabel;
    private javax.swing.JLabel btnRegister;
    private javax.swing.JLabel cancelButton;
    private javax.swing.JPanel container;
    private javax.swing.JLabel greetingUserLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JLabel loginButton;
    private javax.swing.JPanel loginJPanel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userNameJTextField;
    // End of variables declaration//GEN-END:variables

}