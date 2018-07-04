/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Component;
import java.awt.Window;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author GL503
 */
public class Settings extends javax.swing.JPanel {

    /**
     * Creates new form Setting
     */
    public Settings() {
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

        jLabel1 = new javax.swing.JLabel();
        menuButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        currentPasswordField = new javax.swing.JPasswordField();
        newPasswordField = new javax.swing.JPasswordField();
        retypeNewPasswordField = new javax.swing.JPasswordField();
        confirmButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Username:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        menuButton.setText("Return to Main Menu");
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });
        add(menuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel2.setText("Current Password:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel3.setText("New Password:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        jLabel4.setText("Re-type new Password:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        usernameField.setEditable(false);
        add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 180, -1));
        add(currentPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 180, -1));
        add(newPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 180, -1));
        add(retypeNewPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 180, -1));

        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });
        add(confirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        // TODO add your handling code here:
        int rc = JOptionPane.showConfirmDialog(null, "Procced?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (rc == 0) {
            int rep = JOptionPane.showConfirmDialog(null, "UPDATE SUCCESS!", "Notif", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (rep == 0) {
                Component comp = SwingUtilities.getRoot(this);
                ((Window) comp).dispose();
                new EmployeeMainMenu().setVisible(true);
            }
        }
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonActionPerformed
        // TODO add your handling code here:
        Component comp = SwingUtilities.getRoot(this);
        ((Window) comp).dispose();
        EmployeeMainMenu emm = new EmployeeMainMenu();
        JFrame jf = new JFrame("Employee Main Menu");
        jf.add(emm);
        jf.setSize(750, 350);
        jf.setResizable(false);
        jf.setVisible(true);
    }//GEN-LAST:event_menuButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmButton;
    private javax.swing.JPasswordField currentPasswordField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton menuButton;
    private javax.swing.JPasswordField newPasswordField;
    private javax.swing.JPasswordField retypeNewPasswordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}