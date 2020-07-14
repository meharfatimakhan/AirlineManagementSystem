/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author Dell
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import assignment2.AddFlight;
import assignment2.updateFlight;

public class ManageFlights extends javax.swing.JFrame {

    FlightRecord fRecordObj;
    /**
     * Creates new form ManageFlights (constructor)
     */
    public ManageFlights() {
        initComponents();
        this.fRecordObj = new FlightRecord();
        addRowToTable();
    }

//    public ManageFlights(FlightRecord fRecordObj) {
//        initComponents();
//        // this.fRecordObj=new FlightRecord();
//        this.fRecordObj = fRecordObj;
//        addRowToTable();
//    }
    ArrayList<Flight> LoadAllFlights() {
        dbConnectivity db = new dbConnectivity();
        return db.LoadAllFlights();
    }

    public void addRowToTable() {
        ArrayList<Flight> flights = LoadAllFlights();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object rowdata[] = new Object[6];
        for (int i = 0; i < flights.size(); i++) {
            rowdata[0] = flights.get(i).flightNo;
            rowdata[1] = flights.get(i).airline;
            rowdata[2] = flights.get(i).origin;
            rowdata[3] = flights.get(i).destination;
            rowdata[4] = flights.get(i).date;
            rowdata[5] = flights.get(i).time;
            model.addRow(rowdata);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        goBackButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setText("All Flights");

        goBackButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        goBackButton.setText("GO BACK");
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        addButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        addButton.setText("ADD");
        addButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addButtonFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                addButtonFocusLost(evt);
            }
        });
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        updateButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        updateButton.setText("UPDATE");
        updateButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                updateButtonFocusLost(evt);
            }
        });
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 11)); // NOI18N
        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 265, Short.MAX_VALUE)
                .addComponent(goBackButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteButton)
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(goBackButton)
                        .addComponent(addButton)
                        .addComponent(updateButton)
                        .addComponent(deleteButton)))
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight Number", "Airline", "Origin", "Destination", "Date", "Time"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed

        this.hide();
    }//GEN-LAST:event_goBackButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed


        AddFlight addFlight = new AddFlight();
        addFlight.setVisible(true);
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        addRowToTable();
    }//GEN-LAST:event_addButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed

       DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        try {
            int SelectedRow = jTable1.getSelectedRow();
            String flightNo = jTable1.getModel().getValueAt(SelectedRow, 0).toString();
            String airline = jTable1.getModel().getValueAt(SelectedRow, 1).toString();
            String origin = jTable1.getModel().getValueAt(SelectedRow, 2).toString();
            String destination = jTable1.getModel().getValueAt(SelectedRow, 3).toString();
            String date = jTable1.getModel().getValueAt(SelectedRow, 4).toString();
            String time = jTable1.getModel().getValueAt(SelectedRow, 5).toString();
            Flight obj = new Flight(flightNo, airline, origin, destination, date, time);

            updateFlight update = new updateFlight(obj);
            update.setVisible(true);

            this.hide();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error! Please select something!");
        }
        
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        addRowToTable();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?", "Delete", JOptionPane.YES_NO_OPTION);
        if (option == 0) {
            try {

                int SelectedRow = jTable1.getSelectedRow();
                String flightNo = jTable1.getModel().getValueAt(SelectedRow, 0).toString();

                if (fRecordObj.delete(flightNo)) {
                    System.out.println("to be deleted" + flightNo);
                    JOptionPane.showMessageDialog(null, flightNo + " deleted successfully!");
                    model.removeRow(SelectedRow);
                }

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error! Please select something!");
            }

        }
        
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        addRowToTable();

    }//GEN-LAST:event_deleteButtonActionPerformed

    private void addButtonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addButtonFocusLost
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        addRowToTable();
    }//GEN-LAST:event_addButtonFocusLost

    private void addButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addButtonFocusGained
        
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        addRowToTable();
    }//GEN-LAST:event_addButtonFocusGained

    private void updateButtonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_updateButtonFocusLost
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        addRowToTable();
    }//GEN-LAST:event_updateButtonFocusLost

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
            java.util.logging.Logger.getLogger(ManageFlights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageFlights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageFlights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageFlights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageFlights().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton goBackButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}