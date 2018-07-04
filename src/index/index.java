/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package index;

import javax.swing.JFrame;
import views.EmployeeLogin;

/**
 *
 * @author GL503
 */
public class index {

    public static void main(String[] args) {
        EmployeeLogin el = new EmployeeLogin();
        JFrame jf = new JFrame("Login");
        jf.add(el);
        jf.setSize(400, 400);
        jf.setResizable(false);
        jf.setVisible(true);
    }

}
