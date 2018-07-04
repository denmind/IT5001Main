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
public class EmployeeLogin extends javax.swing.JPanel {

    /**
     * Creates new form EmployeeLogin
     */
    public EmployeeLogin() {
        initComponents();
    }
    public static String username;
    public static String password;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcomeLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        welcomeLabel.setText("WELCOME!");
        add(welcomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 210, 50));

        usernameLabel.setText("Username:");
        add(usernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));
        add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 140, -1));

        passwordLabel.setText("Password:");
        add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
        });
        add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 140, -1));

        loginButton.setText("LOG-IN");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        username = usernameField.getText();
        password = passwordField.getText();

        if (username.equals("admin") && password.equals("admin")) {
            Component comp = SwingUtilities.getRoot(this);
            ((Window) comp).dispose();
            
            EmployeeMainMenu emm=new EmployeeMainMenu();
            JFrame jf = new JFrame("Employee Main Menu");
            jf.add(emm);
            jf.setSize(750, 350);
            jf.setResizable(false);
            jf.setVisible(true);
        } else {
            JOptionPane.showConfirmDialog(null, "Wrong username/password!", "Notif", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER){
            loginButtonActionPerformed(null);
        }
    }//GEN-LAST:event_passwordFieldKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
