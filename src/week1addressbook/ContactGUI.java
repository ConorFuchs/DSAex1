/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package week1addressbook;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author serpl
 */
public class ContactGUI extends javax.swing.JFrame {
ArrayList <Contact> aList = new ArrayList<>();
    /**
     * Creates new form ContactGUI
     */
    public ContactGUI() {
        initComponents();
    }

    public void clear(){
        firstNameTF.setText("");
        surnameTF.setText("");
        emailTF.setText("");
        addressTF.setText("");
        phoneTF.setText("");
        companyTF.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        titleLBL = new javax.swing.JLabel();
        firstNameLBL = new javax.swing.JLabel();
        surnameLBL = new javax.swing.JLabel();
        emailLBL = new javax.swing.JLabel();
        addressLBL = new javax.swing.JLabel();
        phoneLBL = new javax.swing.JLabel();
        addressTF = new javax.swing.JTextField();
        phoneTF = new javax.swing.JTextField();
        emailTF = new javax.swing.JTextField();
        surnameTF = new javax.swing.JTextField();
        firstNameTF = new javax.swing.JTextField();
        addBTN = new javax.swing.JButton();
        displayBTN = new javax.swing.JButton();
        searchBTN = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();
        exitBTN = new javax.swing.JButton();
        companyLBL = new javax.swing.JLabel();
        companyTF = new javax.swing.JTextField();
        contactRB = new javax.swing.JRadioButton();
        businessRB = new javax.swing.JRadioButton();

        jTextField4.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLBL.setText("Address Book");

        firstNameLBL.setText("First Name:");

        surnameLBL.setText("Surname:");

        emailLBL.setText("Email:");

        addressLBL.setText("Address:");

        phoneLBL.setText("Phone Number:");

        addBTN.setText("Add");
        addBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTNActionPerformed(evt);
            }
        });

        displayBTN.setText("Display");
        displayBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBTNActionPerformed(evt);
            }
        });

        searchBTN.setText("Search");
        searchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTNActionPerformed(evt);
            }
        });

        deleteBTN.setText("Delete");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });

        exitBTN.setText("Exit");
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });

        companyLBL.setText("Company:");

        companyTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyTFActionPerformed(evt);
            }
        });

        buttonGroup1.add(contactRB);
        contactRB.setText("Contact");
        contactRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactRBActionPerformed(evt);
            }
        });

        buttonGroup1.add(businessRB);
        businessRB.setSelected(true);
        businessRB.setText("Business Contact");
        businessRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                businessRBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(exitBTN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(companyLBL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(contactRB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(businessRB))
                                .addGap(235, 235, 235))
                            .addComponent(companyTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(titleLBL)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressLBL)
                            .addComponent(emailLBL)
                            .addComponent(surnameLBL)
                            .addComponent(phoneLBL)
                            .addComponent(firstNameLBL))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstNameTF)
                            .addComponent(phoneTF)
                            .addComponent(surnameTF)
                            .addComponent(emailTF)
                            .addComponent(addressTF)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addBTN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(displayBTN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchBTN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteBTN)
                                .addGap(0, 40, Short.MAX_VALUE)))))
                .addGap(168, 168, 168))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLBL)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLBL)
                    .addComponent(firstNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(surnameLBL)
                    .addComponent(surnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLBL)
                    .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLBL)
                    .addComponent(addressTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLBL)
                    .addComponent(phoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(companyLBL)
                    .addComponent(companyTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(contactRB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(businessRB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBTN)
                    .addComponent(displayBTN)
                    .addComponent(searchBTN)
                    .addComponent(deleteBTN))
                .addGap(9, 9, 9)
                .addComponent(exitBTN)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBTNActionPerformed

    private void addBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTNActionPerformed
        // TODO add your handling code here:
        String firstName = firstNameTF.getText();
        String surname = surnameTF.getText();
        String email = emailTF.getText();
        String address = addressTF.getText();
        String phoneNum = phoneTF.getText();
        String company = companyTF.getText();
        
        //to add a normal contact
        if(contactRB.isSelected()){
        Contact temp = new Contact(firstName, surname, email, address, phoneNum);
        aList.add(temp);
        JOptionPane.showMessageDialog(null, "New Contact Added to Address Book");
        }
        //adding a business contact
        else if(businessRB.isSelected()){
            BusinessContact tempB = new BusinessContact(firstName, surname, email, address, phoneNum, company);
            aList.add(tempB);
            JOptionPane.showMessageDialog(null, "New Business Contact Added to Address Book");
        }
        //clear textfields
        clear();
    }//GEN-LAST:event_addBTNActionPerformed

    private void displayBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBTNActionPerformed
        // TODO add your handling code here:
        if(aList.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nobody in Address Book");
        }else{
        for(int i = 0; i < aList.size(); i++){
            Contact temp = new Contact();
            temp = aList.get(i);
            JOptionPane.showMessageDialog(null, temp.printDetails());
        }
        }
    }//GEN-LAST:event_displayBTNActionPerformed

    private void searchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTNActionPerformed
        // TODO add your handling code here:
        if(aList.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nobody in Address Book");
        }else{
            String searchTerm = JOptionPane.showInputDialog(null, "Enter Phone Number");
            for(Contact temp:aList){
                if(temp.getPhoneNum().equalsIgnoreCase(searchTerm)){
                    JOptionPane.showMessageDialog(null, temp.printDetails());
                }
            }
        }
    }//GEN-LAST:event_searchBTNActionPerformed

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
        // TODO add your handling code here:
        if(aList.isEmpty()){
            JOptionPane.showMessageDialog(null, "Nobody in Address Book");
        }else{
            String searchTerm = JOptionPane.showInputDialog(null, "Enter Phone Number");
            for(int i = 0; i < aList.size(); i++){
                Contact temp = aList.get(i);
                if(temp.getPhoneNum().equalsIgnoreCase(searchTerm)){
                    aList.remove(i);
                    JOptionPane.showMessageDialog(null, "Contact Removed from Address Book");
                }
            }
        }
    }//GEN-LAST:event_deleteBTNActionPerformed

    private void contactRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactRBActionPerformed
        // TODO add your handling code here:
        companyLBL.setVisible(false);
        companyTF.setVisible(false);
        
    }//GEN-LAST:event_contactRBActionPerformed

    private void businessRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_businessRBActionPerformed
        // TODO add your handling code here:
        companyLBL.setVisible(true);
        companyTF.setVisible(true);
    }//GEN-LAST:event_businessRBActionPerformed

    private void companyTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_companyTFActionPerformed

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
            java.util.logging.Logger.getLogger(ContactGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContactGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContactGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContactGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContactGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBTN;
    private javax.swing.JLabel addressLBL;
    private javax.swing.JTextField addressTF;
    private javax.swing.JRadioButton businessRB;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel companyLBL;
    private javax.swing.JTextField companyTF;
    private javax.swing.JRadioButton contactRB;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JButton displayBTN;
    private javax.swing.JLabel emailLBL;
    private javax.swing.JTextField emailTF;
    private javax.swing.JButton exitBTN;
    private javax.swing.JLabel firstNameLBL;
    private javax.swing.JTextField firstNameTF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel phoneLBL;
    private javax.swing.JTextField phoneTF;
    private javax.swing.JButton searchBTN;
    private javax.swing.JLabel surnameLBL;
    private javax.swing.JTextField surnameTF;
    private javax.swing.JLabel titleLBL;
    // End of variables declaration//GEN-END:variables
}
