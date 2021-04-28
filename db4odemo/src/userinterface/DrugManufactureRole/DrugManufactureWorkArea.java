/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DrugManufactureRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DrugManufactureOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BloodRequest;
import Business.WorkQueue.DrugManufactureRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sadit
 */
public class DrugManufactureWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form DrugManufactureWorkArea
     */
    private JPanel userProcessContainer;
    private DrugManufactureOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem ecosystem;
    private Network network;
    private HashMap<String, Integer> drugList;

    public DrugManufactureWorkArea(JPanel userProcessContainer, UserAccount account, DrugManufactureOrganization drugManufactureOrganization, Enterprise enterprise, Network network) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.organization = drugManufactureOrganization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.ecosystem = ecosystem;
        this.network = network;
        this.drugList = enterprise.getDrugList();
        populateTable();
        populateDrugInventoryTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnProcessOrder = new javax.swing.JButton();
        assign = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        msgTxtField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        btnAddtoList = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        drugNametxt = new javax.swing.JTextField();
        drugQnt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jPanel5.setBackground(new java.awt.Color(241, 245, 241));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(57, 177, 178));

        jLabel2.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Drug Manufacturer Work Area");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1360, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, -1));

        jPanel8.setBackground(new java.awt.Color(241, 245, 241));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "WorkReq#", "Drug Name", "Quantity", "Status", "Message"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel8.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 25, 537, 110));

        btnProcessOrder.setBackground(new java.awt.Color(56, 154, 220));
        btnProcessOrder.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnProcessOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnProcessOrder.setText("Process Order");
        btnProcessOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessOrderActionPerformed(evt);
            }
        });
        jPanel8.add(btnProcessOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 168, 181, -1));

        assign.setBackground(new java.awt.Color(56, 154, 220));
        assign.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        assign.setForeground(new java.awt.Color(255, 255, 255));
        assign.setText("Assign to me");
        assign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignActionPerformed(evt);
            }
        });
        jPanel8.add(assign, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 168, 170, -1));

        jButton1.setBackground(new java.awt.Color(56, 154, 220));
        jButton1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Reject");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 150, -1));
        jPanel8.add(msgTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 170, 36));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setText("Message : ");
        jPanel8.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 221, 104, 34));

        btnRefresh.setBackground(new java.awt.Color(56, 154, 220));
        btnRefresh.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        jPanel8.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 168, 150, -1));

        jPanel5.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, -1, -1));

        jPanel9.setBackground(new java.awt.Color(241, 245, 241));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAddtoList.setBackground(new java.awt.Color(56, 154, 220));
        btnAddtoList.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnAddtoList.setForeground(new java.awt.Color(255, 255, 255));
        btnAddtoList.setText("Add to List");
        btnAddtoList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddtoListActionPerformed(evt);
            }
        });
        jPanel9.add(btnAddtoList, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 181, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Drug Name : ");
        jPanel9.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 104, 34));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Quantity : ");
        jPanel9.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 34, 92, 34));
        jPanel9.add(drugNametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 129, -1));
        jPanel9.add(drugQnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 43, 91, -1));

        jPanel5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Drug Name", "Value"
            }
        ));
        jTable2.setToolTipText("");
        jScrollPane2.setViewportView(jTable2);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 396, 102));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessOrderActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        int count = jTable1.getSelectedRowCount();
        if (count == 1) {
            DrugManufactureRequest drugManufactureReq = (DrugManufactureRequest) jTable1.getValueAt(selectedRow, 0);
            drugManufactureReq.setStatus("Medicines Sent");
            drugManufactureReq.setMessage(msgTxtField.getText());
            for (Map.Entry mapElement : drugList.entrySet()) {
                String key = (String) mapElement.getKey();
                if (key.equalsIgnoreCase(drugManufactureReq.getMedName())) {
                    int newValue = (Integer) mapElement.getValue() - drugManufactureReq.getQuantity();
                    drugList.replace(key, newValue);
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
        populateTable();
        populateDrugInventoryTable();
    }//GEN-LAST:event_btnProcessOrderActionPerformed

    private void assignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        int count = jTable1.getSelectedRowCount();
        if (count == 1) {
            DrugManufactureRequest drugManufactureReq = (DrugManufactureRequest) jTable1.getValueAt(selectedRow, 0);
            drugManufactureReq.setStatus("Approved!");
            drugManufactureReq.setMessage(msgTxtField.getText());

        } else {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
        populateTable();
    }//GEN-LAST:event_assignActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        int count = jTable1.getSelectedRowCount();
        if (count == 1) {
            DrugManufactureRequest drugManufactureReq = (DrugManufactureRequest) jTable1.getValueAt(selectedRow, 0);
            drugManufactureReq.setStatus("Rejected!");
            drugManufactureReq.setMessage(msgTxtField.getText());

        } else {
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
        populateTable();
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAddtoListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddtoListActionPerformed
        // TODO add your handling code here:
        String drugName;
        int drugQuantity = 0;
        drugName = drugNametxt.getText();
        try {
            drugQuantity = Integer.parseInt(drugQnt.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Enter quantity in correct format");
            drugNametxt.setText("");
        }
        if (drugName.isEmpty() || drugQuantity == 0) {
            JOptionPane.showMessageDialog(null, "Enter all the fields");
        } else {
            for (Map.Entry mapElement : drugList.entrySet()) {
                String key = (String) mapElement.getKey();
                System.out.println(key + "  " + key.getClass());
                System.out.println(drugName + " " + drugName.getClass());
                if (key.equalsIgnoreCase(drugName)) {
                    int newValue = ((int) mapElement.getValue() + drugQuantity);
                    System.out.println(newValue);
                    drugList.replace(key, newValue);
                    populateDrugInventoryTable();
                    return;
                }
            }
            drugList.put(drugName, drugQuantity);
            populateDrugInventoryTable();
        }
        drugNametxt.setText("");
        drugQnt.setText("");
    }//GEN-LAST:event_btnAddtoListActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_btnRefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assign;
    private javax.swing.JButton btnAddtoList;
    private javax.swing.JButton btnProcessOrder;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JTextField drugNametxt;
    private javax.swing.JTextField drugQnt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField msgTxtField;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.setRowCount(0);
        for (WorkRequest wr : enterprise.getWorkQueue().getWorkRequestList()) {
            if (wr instanceof DrugManufactureRequest) {
                Object[] row = new Object[model.getColumnCount()];
                row[0] = wr;
                row[1] = ((DrugManufactureRequest) wr).getMedName();
                row[2] = ((DrugManufactureRequest) wr).getQuantity();
                row[3] = ((DrugManufactureRequest) wr).getStatus();
                row[4] = ((DrugManufactureRequest) wr).getMessage();

                model.addRow(row);

            }

        }
    }

    private void populateDrugInventoryTable() {

        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        for (Map.Entry mapElement : drugList.entrySet()) {
            String key = (String) mapElement.getKey();
            Object[] row = new Object[model.getColumnCount()];
            row[0] = mapElement.getKey();
            row[1] = mapElement.getValue();
            model.addRow(row);
        }
    }
}