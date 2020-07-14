/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline;

/**
 *
 * @author Dell
 */
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
import java.util.*;

public class AddFlight extends javax.swing.JFrame {

    /**
     * Creates new form AddFlight
     */
   
    Flight flightObj;
    FlightRecord flightRecord;
    
    public AddFlight() {
        
        this.flightRecord=new FlightRecord();
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        flightNoField = new javax.swing.JTextField();
        airlineField = new javax.swing.JTextField();
        originField = new javax.swing.JTextField();
        destinationField = new javax.swing.JTextField();
        dayField = new javax.swing.JComboBox<>();
        monthField = new javax.swing.JComboBox<>();
        yearField = new javax.swing.JComboBox<>();
        saveFlightInformation = new javax.swing.JButton();
        hourField = new javax.swing.JComboBox<>();
        minuteField = new javax.swing.JComboBox<>();
        amPmField = new javax.swing.JComboBox<>();
        clearTextField = new javax.swing.JButton();
        goBackButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setText("ADD FLIGHT");

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        jLabel2.setText("FLIGHT NUMBER:");

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        jLabel3.setText("AIRLINE:");

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        jLabel4.setText("ORIGIN:");

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        jLabel5.setText("DESTINATION:");

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        jLabel6.setText("DATE:");

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        jLabel7.setText("TIME:");

        flightNoField.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N

        airlineField.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N

        originField.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N

        destinationField.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N

        dayField.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        dayField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));

        monthField.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        monthField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));

        yearField.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        yearField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2016","2017","2018","2019" }));

        saveFlightInformation.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        saveFlightInformation.setText("SAVE");
        saveFlightInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFlightInformationActionPerformed(evt);
            }
        });

        hourField.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        hourField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01","02","03","04","05","06","07","08","09","10","11","12" }));

        minuteField.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        minuteField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","51","52","53","54","55","56","57","58","59"}));

        amPmField.setFont(new java.awt.Font("Tempus Sans ITC", 0, 11)); // NOI18N
        amPmField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM","PM"}));

        clearTextField.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        clearTextField.setText("CLEAR");
        clearTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearTextFieldActionPerformed(evt);
            }
        });

        goBackButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        goBackButton.setText("GO BACK");
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(goBackButton)
                        .addGap(18, 18, 18)
                        .addComponent(clearTextField)
                        .addGap(18, 18, 18)
                        .addComponent(saveFlightInformation))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(dayField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(monthField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(hourField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(minuteField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGap(11, 11, 11)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(amPmField, 0, 44, Short.MAX_VALUE)
                                        .addComponent(yearField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(airlineField, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(flightNoField)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(originField))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(destinationField))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(146, 146, 146)
                            .addComponent(jLabel1))))
                .addGap(83, 83, 83))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flightNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(airlineField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(originField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(destinationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dayField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(monthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(hourField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(minuteField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 14, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(amPmField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(goBackButton)
                    .addComponent(clearTextField)
                    .addComponent(saveFlightInformation))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveFlightInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFlightInformationActionPerformed
        //Code for SAVE Button
        String date=dayField.getSelectedItem().toString()+" "+monthField.getSelectedItem().toString()+","+yearField.getSelectedItem().toString();
        String time=hourField.getSelectedItem().toString()+":"+minuteField.getSelectedItem().toString()+" "+amPmField.getSelectedItem().toString();
        flightObj=new Flight(flightNoField.getText(),airlineField.getText(),originField.getText(),destinationField.getText(),date,time);
        if (flightRecord.add(flightObj)){
            JOptionPane.showMessageDialog(null,flightNoField.getText()+  " added!");
            this.hide();
        }
        else{
            JOptionPane.showMessageDialog(null,"ERROR! Only UNIQUE NUMBERS are allowed in Flight Number Field!");
            this.hide();
        }
    }//GEN-LAST:event_saveFlightInformationActionPerformed

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        //Code for GO BACK BUTTON
        this.hide();
    }//GEN-LAST:event_goBackButtonActionPerformed

    private void clearTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearTextFieldActionPerformed
      //Code for CLEAR BUTTON
        flightNoField.setText("");
        airlineField.setText("");
        originField.setText("");
        destinationField.setText("");
        dayField.setSelectedIndex(0);
        monthField.setSelectedIndex(0);
        yearField.setSelectedIndex(0);
        hourField.setSelectedIndex(0);
        minuteField.setSelectedIndex(0);
        amPmField.setSelectedIndex(0);
    }//GEN-LAST:event_clearTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(AddFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddFlight().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField airlineField;
    private javax.swing.JComboBox<String> amPmField;
    private javax.swing.JButton clearTextField;
    private javax.swing.JComboBox<String> dayField;
    private javax.swing.JTextField destinationField;
    private javax.swing.JTextField flightNoField;
    private javax.swing.JButton goBackButton;
    private javax.swing.JComboBox<String> hourField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> minuteField;
    private javax.swing.JComboBox<String> monthField;
    private javax.swing.JTextField originField;
    private javax.swing.JButton saveFlightInformation;
    private javax.swing.JComboBox<String> yearField;
    // End of variables declaration//GEN-END:variables
}
