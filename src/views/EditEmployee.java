/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.EmployeeController;
import java.awt.Component;
import java.awt.Window;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import models.BasePlusCommission;
import models.Commission;
import models.Employees;
import models.Hourly;
import models.PieceWorker;

/**
 *
 * @author GL503
 */
public class EditEmployee extends javax.swing.JPanel {

    /**
     * Creates new form EditEmployee2
     */
    public EditEmployee() {
        initComponents();

        firstNameField.setVisible(false);
        firstNameLabel.setVisible(false);

        lastNameField.setVisible(false);
        lastNameLabel.setVisible(false);

        middleNameField.setVisible(false);
        middleNameLabel.setVisible(false);

        lastNameField.setVisible(false);
        lastNameLabel.setVisible(false);

        genderLabel.setVisible(false);
        maleRadio.setVisible(false);
        femaleRadio.setVisible(false);

        jobField.setVisible(false);
        jobLabel.setVisible(false);

        employeeType.setVisible(false);
        typeLabel.setVisible(false);

        txtFieldBottom.setVisible(false);
        baseSalaryLabel.setVisible(false);

        txtFieldTop.setVisible(false);
        totalSalesLabel.setVisible(false);

        totalHoursWorkedField.setVisible(false);
        totalHoursWorkedLabel.setVisible(false);

        ratePerHourField.setVisible(false);
        ratePerHourLabel.setVisible(false);

        ratePerPieceField.setVisible(false);
        ratePerPieceLabel.setVisible(false);

        totalPiecesFinishedField.setVisible(false);
        totalPiecesFinishedLabel.setVisible(false);

        updateButton.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderButtonGroup = new javax.swing.ButtonGroup();
        idLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        middleNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        jobLabel = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        jobField = new javax.swing.JTextField();
        firstNameField = new javax.swing.JTextField();
        middleNameField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        idField = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        femaleRadio = new javax.swing.JRadioButton();
        maleRadio = new javax.swing.JRadioButton();
        employeeType = new javax.swing.JComboBox<String>();
        txtFieldBottom = new javax.swing.JTextField();
        baseSalaryLabel = new javax.swing.JLabel();
        totalSalesLabel = new javax.swing.JLabel();
        txtFieldTop = new javax.swing.JTextField();
        totalHoursWorkedField = new javax.swing.JTextField();
        totalHoursWorkedLabel = new javax.swing.JLabel();
        ratePerHourLabel = new javax.swing.JLabel();
        ratePerHourField = new javax.swing.JTextField();
        ratePerPieceLabel = new javax.swing.JLabel();
        ratePerPieceField = new javax.swing.JTextField();
        totalPiecesFinishedLabel = new javax.swing.JLabel();
        totalPiecesFinishedField = new javax.swing.JTextField();
        insertNewEmployeeLabel = new javax.swing.JLabel();
        confirmButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idLabel.setText("ID:");
        add(idLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        firstNameLabel.setText("First Name:");
        add(firstNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 70, 30));

        middleNameLabel.setText("Middle Name (Optional):");
        add(middleNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, 20));

        lastNameLabel.setText("Last Name:");
        add(lastNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 80, 20));

        genderLabel.setText("Gender:");
        add(genderLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        jobLabel.setText("Job:");
        add(jobLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        typeLabel.setText("Type:");
        add(typeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));
        add(jobField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 160, -1));
        add(firstNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 160, -1));
        add(middleNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 160, -1));

        lastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameFieldActionPerformed(evt);
            }
        });
        add(lastNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 160, -1));
        add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 160, -1));

        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));

        genderButtonGroup.add(femaleRadio);
        femaleRadio.setText("Female");
        add(femaleRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        genderButtonGroup.add(maleRadio);
        maleRadio.setText("Male");
        maleRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioActionPerformed(evt);
            }
        });
        add(maleRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, -1));

        employeeType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose Type", "Base Plus Commission Employee", "Commission Employee", "Hourly Employee", "Piece Worker Employee" }));
        employeeType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeTypeActionPerformed(evt);
            }
        });
        add(employeeType, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 160, -1));

        txtFieldBottom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldBottomActionPerformed(evt);
            }
        });
        add(txtFieldBottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 160, -1));

        baseSalaryLabel.setText("Base Salary:");
        add(baseSalaryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));

        totalSalesLabel.setText("Total Sales:");
        add(totalSalesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));
        add(txtFieldTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 160, -1));
        add(totalHoursWorkedField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 160, -1));

        totalHoursWorkedLabel.setText("Total Hours Worked:");
        add(totalHoursWorkedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));

        ratePerHourLabel.setText("Rate Per Hour:");
        add(ratePerHourLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));
        add(ratePerHourField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 160, -1));

        ratePerPieceLabel.setText("Rate Per Piece:");
        add(ratePerPieceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));
        add(ratePerPieceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 160, -1));

        totalPiecesFinishedLabel.setText("Total Pieces Finished:");
        add(totalPiecesFinishedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));
        add(totalPiecesFinishedField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 160, -1));

        insertNewEmployeeLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        insertNewEmployeeLabel.setText("EDIT EMPLOYEE");
        add(insertNewEmployeeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 320, -1));

        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });
        add(confirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));

        backButton.setText("Return to Employee Table");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void lastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameFieldActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        int rc = JOptionPane.showConfirmDialog(null, "Procced?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        //CODE TO UPDATE
        try {
            maleRadio.setActionCommand("Male");
            femaleRadio.setActionCommand("Female");
            String gender = genderButtonGroup.getSelection().getActionCommand();

            int id = Integer.parseInt(idField.getText());
            String firstName = firstNameField.getText();
            String middleName = middleNameField.getText();
            String lastName = lastNameField.getText();
            String job = jobField.getText();
            String jobType = (String) employeeType.getSelectedItem();
            Double salary = 0.0;

            double X = 0;
            double Y = 0;

            Employees emp = new Employees();

            switch (jobType) {
                case "Base Plus Commission Employee":
                    System.out.println(txtFieldBottom.getText());
                    System.out.println(txtFieldTop.getText());
                    X = Double.parseDouble(txtFieldTop.getText());
                    Y = Double.parseDouble(txtFieldBottom.getText());
                    BasePlusCommission B = new BasePlusCommission(Y, (int) X, id, firstName, middleName, lastName, gender, job, jobType, salary);
                    B.setSalary(B.computeMySalary());
                    emp = B;
                    break;
                case "Commission Employee":
                    System.out.println(txtFieldTop.getText());
                    X = Double.parseDouble(txtFieldTop.getText());
                    Commission C = new Commission((int) X, id, firstName, middleName, lastName, gender, job, jobType, salary);
                    C.setSalary(C.computeMySalary());
                    emp = C;
                    break;
                case "Hourly Employee":
                    Y = Double.parseDouble(totalHoursWorkedField.getText());
                    X = Double.parseDouble(ratePerHourField.getText());
                    System.out.println(X);
                    System.out.println(Y);
                    Hourly H = new Hourly(Y, X, id, firstName, middleName, lastName, gender, job, jobType, salary);
                    H.setSalary(H.computeMySalary());
                    emp = H;
                    break;
                case "Piece Worker Employee":
                    Y = Double.parseDouble(totalPiecesFinishedField.getText());
                    X = Double.parseDouble(ratePerPieceField.getText());
                    System.out.println(X);
                    System.out.println(Y);
                    PieceWorker P = new PieceWorker((int) Y, X, id, firstName, middleName, lastName, gender, job, jobType, salary);
                    P.setSalary(P.computeMySalary());
                    emp = P;
                    break;

            }

            EmployeeController empC = new EmployeeController();

            if (EmployeeController.updateEmployee(emp) == 1 && rc == 0) {
                int rep = JOptionPane.showConfirmDialog(null, "UPDATE SUCCESS!", "Notif", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                if (rep == 0) {
                    Component comp = SwingUtilities.getRoot(this);
                    ((Window) comp).dispose();
                    EmployeeTableList etl = new EmployeeTableList();
                    JFrame jf = new JFrame("Employee Management");
                    jf.add(etl);
                    jf.setSize(600, 550);
                    jf.setResizable(false);
                    jf.setVisible(true);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void maleRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleRadioActionPerformed

    private void employeeTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeTypeActionPerformed
        // TODO add your handling code here:
        String chosenEmployeeType = (String) employeeType.getSelectedItem();
        if (chosenEmployeeType.equals("Choose Type")) {
            txtFieldBottom.setVisible(false);
            baseSalaryLabel.setVisible(false);

            txtFieldTop.setVisible(false);
            totalSalesLabel.setVisible(false);

            totalHoursWorkedField.setVisible(false);
            totalHoursWorkedLabel.setVisible(false);

            ratePerHourField.setVisible(false);
            ratePerHourLabel.setVisible(false);

            ratePerPieceField.setVisible(false);
            ratePerPieceLabel.setVisible(false);

            totalPiecesFinishedField.setVisible(false);
            totalPiecesFinishedLabel.setVisible(false);

        } else if (chosenEmployeeType.equals("Base Plus Commission Employee")) {
            txtFieldBottom.setVisible(true);
            baseSalaryLabel.setVisible(true);

            txtFieldTop.setVisible(true);
            totalSalesLabel.setVisible(true);

            totalHoursWorkedField.setVisible(false);
            totalHoursWorkedLabel.setVisible(false);

            ratePerHourField.setVisible(false);
            ratePerHourLabel.setVisible(false);

            ratePerPieceField.setVisible(false);
            ratePerPieceLabel.setVisible(false);

            totalPiecesFinishedField.setVisible(false);
            totalPiecesFinishedLabel.setVisible(false);

        } else if (chosenEmployeeType.equals("Commission Employee")) {
            txtFieldBottom.setVisible(false);
            baseSalaryLabel.setVisible(false);

            txtFieldTop.setVisible(true);
            totalSalesLabel.setVisible(true);

            totalHoursWorkedField.setVisible(false);
            totalHoursWorkedLabel.setVisible(false);

            ratePerHourField.setVisible(false);
            ratePerHourLabel.setVisible(false);

            ratePerPieceField.setVisible(false);
            ratePerPieceLabel.setVisible(false);

            totalPiecesFinishedField.setVisible(false);
            totalPiecesFinishedLabel.setVisible(false);

        } else if (chosenEmployeeType.equals("Hourly Employee")) {
            txtFieldBottom.setVisible(false);
            baseSalaryLabel.setVisible(false);

            txtFieldTop.setVisible(false);
            totalSalesLabel.setVisible(false);

            totalHoursWorkedField.setVisible(true);
            totalHoursWorkedLabel.setVisible(true);

            ratePerHourField.setVisible(true);
            ratePerHourLabel.setVisible(true);

            ratePerPieceField.setVisible(false);
            ratePerPieceLabel.setVisible(false);

            totalPiecesFinishedField.setVisible(false);
            totalPiecesFinishedLabel.setVisible(false);

        } else if (chosenEmployeeType.equals("Piece Worker Employee")) {
            txtFieldBottom.setVisible(false);
            baseSalaryLabel.setVisible(false);

            txtFieldTop.setVisible(false);
            totalSalesLabel.setVisible(false);

            totalHoursWorkedField.setVisible(false);
            totalHoursWorkedLabel.setVisible(false);

            ratePerHourField.setVisible(false);
            ratePerHourLabel.setVisible(false);

            ratePerPieceField.setVisible(true);
            ratePerPieceLabel.setVisible(true);

            totalPiecesFinishedField.setVisible(true);
            totalPiecesFinishedLabel.setVisible(true);

        }
    }//GEN-LAST:event_employeeTypeActionPerformed

    private void txtFieldBottomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldBottomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFieldBottomActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        // TODO add your handling code here:
        try {
            int rc = JOptionPane.showConfirmDialog(null, "Procced?", "Confirmation", JOptionPane.YES_NO_OPTION);

            Employees emp = new Employees();

            emp.updateEmployees(Integer.parseInt(idField.getText()));

            Employees empList = EmployeeController.getRecordById(emp);
            //System.out.println(id);
            EmployeeController empC = new EmployeeController();

            if (empC.checkID(emp) == 1 && rc == 0) {
                idField.disable();

                updateButton.setVisible(true);
                confirmButton.setVisible(false);

                firstNameField.setVisible(true);
                firstNameField.setText(empList.getFirstName());
                firstNameLabel.setVisible(true);

                middleNameField.setVisible(true);
                middleNameField.setText(empList.getMiddleName());
                middleNameLabel.setVisible(true);

                lastNameField.setVisible(true);
                lastNameField.setText(empList.getLastName());
                lastNameLabel.setVisible(true);

                if (empList.getGender().equals("Female")) {
                    genderLabel.setVisible(true);
                    maleRadio.setVisible(true);
                    femaleRadio.setVisible(true);
                    femaleRadio.setSelected(true);
                } else if (empList.getGender().equals("Male")) {
                    genderLabel.setVisible(true);
                    maleRadio.setVisible(true);
                    femaleRadio.setVisible(true);
                    maleRadio.setSelected(true);
                } else {
                    genderLabel.setVisible(true);
                    maleRadio.setVisible(true);
                    femaleRadio.setVisible(true);
                }

                jobField.setVisible(true);
                jobField.setText(empList.getJob());
                jobLabel.setVisible(true);

                employeeType.setVisible(true);
                //employeeType.setActio;
                employeeType.setSelectedItem(empList.getJobType());
                typeLabel.setVisible(true);

            } else {
                JOptionPane.showConfirmDialog(null, "Error! ID not found!", "Notif", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showConfirmDialog(null, "Error! Incorrect Input!", "Notif", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_confirmButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        Component comp = SwingUtilities.getRoot(this);
        ((Window) comp).dispose();
        EmployeeTableList etl = new EmployeeTableList();
        JFrame jf = new JFrame("Employee Management");
        jf.add(etl);
        jf.setSize(600, 550);
        jf.setResizable(false);
        jf.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel baseSalaryLabel;
    private javax.swing.JButton confirmButton;
    private javax.swing.JComboBox<String> employeeType;
    private javax.swing.JRadioButton femaleRadio;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.ButtonGroup genderButtonGroup;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idLabel;
    private javax.swing.JLabel insertNewEmployeeLabel;
    private javax.swing.JTextField jobField;
    private javax.swing.JLabel jobLabel;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JRadioButton maleRadio;
    private javax.swing.JTextField middleNameField;
    private javax.swing.JLabel middleNameLabel;
    private javax.swing.JTextField ratePerHourField;
    private javax.swing.JLabel ratePerHourLabel;
    private javax.swing.JTextField ratePerPieceField;
    private javax.swing.JLabel ratePerPieceLabel;
    private javax.swing.JTextField totalHoursWorkedField;
    private javax.swing.JLabel totalHoursWorkedLabel;
    private javax.swing.JTextField totalPiecesFinishedField;
    private javax.swing.JLabel totalPiecesFinishedLabel;
    private javax.swing.JLabel totalSalesLabel;
    private javax.swing.JTextField txtFieldBottom;
    private javax.swing.JTextField txtFieldTop;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
