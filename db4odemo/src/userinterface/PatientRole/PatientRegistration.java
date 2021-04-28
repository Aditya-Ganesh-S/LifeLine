/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PatientRole;

import Business.Address.Address;
import Business.Broadcast.javaMailUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import static Business.Enterprise.Enterprise.EnterpriseType.Hospital;
import Business.Network.Network;
import Business.Patient.Patient;
import Business.Role.PatientRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientRegistrationRequest;
import Business.WorkQueue.WorkQueue;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author vivek
 */
public class PatientRegistration extends javax.swing.JPanel {

    /**
     * Creates new form PatientRegistration
     */
    private Enterprise enterprise;
    private EcoSystem ecosystem;
    private JPanel userProcessContainer;

    public PatientRegistration(JPanel userProcessContainer, EcoSystem system) throws Exception {
        initComponents();
        this.ecosystem = system;
        populateNetworkComboBox();
        this.userProcessContainer = userProcessContainer;
//        javaMailUtil.sendMail("s.adityaganesh@gmail.com");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        numberTxt = new javax.swing.JTextField();
        GenderTxt = new javax.swing.JTextField();
        ageTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        addressTxt = new javax.swing.JTextField();
        cityTxt = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        StateTxt = new javax.swing.JTextField();
        pincodeTxt = new javax.swing.JTextField();
        userNameTxt = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        networkBox = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        hospitalBox = new javax.swing.JComboBox();
        jPasswordField1 = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(241, 245, 241));
        setPreferredSize(new java.awt.Dimension(500, 447));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(57, 177, 178));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pngegg_1_2_200x100.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addGap(9, 9, 9)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(689, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 800));

        jPanel3.setBackground(new java.awt.Color(57, 177, 178));

        jLabel2.setBackground(new java.awt.Color(13, 27, 70));
        jLabel2.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PATIENT SIGNUP");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 0, 1130, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Patient Name : ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 98, 25));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Phone Number : ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Gender : ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 98, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Age : ");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 98, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Email : ");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 98, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Address : ");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, 98, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Username : ");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 340, 98, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Password : ");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 380, 98, -1));
        add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 125, -1));
        add(numberTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 125, -1));
        add(GenderTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, 125, -1));
        add(ageTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, 125, -1));
        add(emailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 125, -1));
        add(addressTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, 125, -1));
        add(cityTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 220, 125, -1));

        btnSubmit.setBackground(new java.awt.Color(56, 154, 220));
        btnSubmit.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit");
        btnSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 460, 195, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("City : ");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 220, 98, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("State : ");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 260, 98, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Pincode : ");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 300, 98, -1));
        add(StateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 260, 125, -1));
        add(pincodeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 300, 125, -1));
        add(userNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 340, 125, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Network");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, -1, -1));

        networkBox.setBackground(new java.awt.Color(56, 154, 220));
        networkBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkBoxActionPerformed(evt);
            }
        });
        add(networkBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, 86, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Hospital Name");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 130, -1, -1));

        hospitalBox.setBackground(new java.awt.Color(56, 154, 220));
        hospitalBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalBoxActionPerformed(evt);
            }
        });
        add(hospitalBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 130, 112, -1));
        add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 370, 125, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        PatientRegistrationRequest prq = new PatientRegistrationRequest();
        Network network = (Network) networkBox.getSelectedItem();
        Enterprise enterprise = (Enterprise) hospitalBox.getSelectedItem();

        prq.setNetwork(network);
        prq.setEnterprise(enterprise);

        String userName = userNameTxt.getText();
        String password = jPasswordField1.getText();
        String name = nameTxt.getText();
        String gender = GenderTxt.getText();
        String number = numberTxt.getText();
//        if (maleR.isSelected() == true) {
//            gender = "male";
//        }
//        if (femaleR.isSelected() == true) {
//            gender = "female";
//        }
        int age = 0;
        try {
            age = Integer.parseInt(ageTxt.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Enter Age in correct format");
        }
        String email = emailTxt.getText();
        String streetAddress = addressTxt.getText();
        String city = cityTxt.getText();
        String State = StateTxt.getText();

        int zip = 0;
        try {
            zip = Integer.parseInt(pincodeTxt.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Enter Pinceode in correct format");
        }

        if (userName.isEmpty() || password.isEmpty() || name.isEmpty() || gender.isEmpty() || age == 0 || email.isEmpty()
                || streetAddress.isEmpty() || city.isEmpty() || State.isEmpty() || zip == 0 || number.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Enter All the fields");

        } else if (!validatePhone(number)) {
            JOptionPane.showMessageDialog(null, "Please enter phone number in correct format");
        } else {
            ArrayList<String> usernameList = new ArrayList<String>();
            for (UserAccount u : enterprise.getUserAccountDirectory().getUserAccountList()) {
                usernameList.add(u.getUsername());

            }
            if (usernameList.contains(userName)) {
                JOptionPane.showMessageDialog(null, "User Name Already exists please enter a new name");
                return;
            }
            Address add = new Address();
            add.setStreetAddress(streetAddress);
            add.setCity(city);
            add.setState(State);
            add.setZipcode(zip);

            prq.setName(name);
            prq.setAge(age);
            prq.setAddress(add);
            prq.setNumber(number);
            prq.setUserName(userName);
            prq.setPassword(password);
            prq.setMailId(email);
            prq.setGender(gender);
            prq.setStatus("Waiting for Approval");
            if (enterprise.getWorkQueue() == null) {
                enterprise.setWorkQueue(new WorkQueue());
            } else {
                enterprise.getWorkQueue().getWorkRequestList().add(prq);

            }
            sendemail(email);
            JOptionPane.showMessageDialog(null, "Your request has been sent please wait for email confirmation from the hospital");
            userNameTxt.setText("");
            jPasswordField1.setText("");
            nameTxt.setText("");
            numberTxt.setText("");
            ageTxt.setText("");
            addressTxt.setText("");
            cityTxt.setText("");
            StateTxt.setText("");
            pincodeTxt.setText("");
            emailTxt.setText("");
            GenderTxt.setText("");

        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void networkBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkBoxActionPerformed
        // TODO add your handling code here:
        Network network = (Network) networkBox.getSelectedItem();
        if (network != null) {
            populateEnterpriseComboBox(network);
        }
    }//GEN-LAST:event_networkBoxActionPerformed

    private void hospitalBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hospitalBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField GenderTxt;
    private javax.swing.JTextField StateTxt;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JTextField ageTxt;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JTextField cityTxt;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JComboBox hospitalBox;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JComboBox networkBox;
    private javax.swing.JTextField numberTxt;
    private javax.swing.JTextField pincodeTxt;
    private javax.swing.JTextField userNameTxt;
    // End of variables declaration//GEN-END:variables

    private boolean validatePhone(String number) {
        String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(number);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }

    private void populateNetworkComboBox() {
        networkBox.removeAllItems();
        for (Network network : ecosystem.getNetworkList()) {
            networkBox.addItem(network);
        }
    }

    private void populateEnterpriseComboBox(Network network) {
        hospitalBox.removeAllItems();

        for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (e.getEnterpriseType() == Hospital) {
                hospitalBox.addItem(e);
            }
        }
    }

    public void sendemail(String email) {
        String host = "smtp.gmail.com";
        String port = "587";
        String mailFrom = "don1otreply@gmail.com";
        String password = "donotreply@1";

        // message info
        String mailTo = email;
        String subject = "LifeLine, Your Digital Healthy Care";
        String message = "Your Account has been activated. Congratulations";

        try {
            sendEmailWithAttachments(host, port, mailFrom, password, mailTo,
                    subject, message);
            System.out.println("Email sent.");
        } catch (Exception ex) {
            System.out.println("Could not send email.");
            ex.printStackTrace();
        }
    }

    public void sendEmailWithAttachments(String host, String port,
            final String userName, final String password, String toAddress,
            String subject, String message) throws AddressException, MessagingException {
        // sets SMTP server properties
        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", port);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.user", userName);
        properties.put("mail.password", password);
        // creates a new session with an authenticator
        Authenticator auth = new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(userName, password);
            }
        };
        Session session = Session.getInstance(properties, auth);
        // creates a new e-mail message
        Message msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress(userName));
        InternetAddress[] toAddresses = {new InternetAddress(toAddress)};
        msg.setRecipients(Message.RecipientType.TO, toAddresses);
        msg.setSubject(subject);
        msg.setSentDate(new Date());
        // creates message part
        MimeBodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setContent(message, "text/html");
        // creates multi-part
        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);
        // adds attachments
        //if (attachFiles != null && attachFiles.length > 0) {
        //for (String filePath : attachFiles) {
        //MimeBodyPart attachPart = new MimeBodyPart();
        // sets the multi-part as e-mail's content
        msg.setContent(multipart);
        // sends the e-mail
        Transport.send(msg);
    }

}