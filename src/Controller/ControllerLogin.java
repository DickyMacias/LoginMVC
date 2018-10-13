/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import javax.swing.*;
import Model.Employee;
import Model.EmployeeDAO;
import View.JFLogin;
import View.JFWelcome;
import java.awt.event.*;

/**
 *
 * @author racna
 */
public class ControllerLogin implements ActionListener {
    JFLogin viewLogin = new JFLogin();
    EmployeeDAO modelLogin = new EmployeeDAO();
    Employee employee = new Employee();
    
    public ControllerLogin (JFLogin viewLogin, EmployeeDAO modelLogin){
        this.viewLogin = viewLogin;
        this.modelLogin = modelLogin;
        this.viewLogin.btnGo.addActionListener(this);
    }
    public void InitializeLogin(){

}
    
    
    
    
    public void actionPerformed (ActionEvent e){
        String id = viewLogin.txtID.getText();
        String password = String.valueOf(viewLogin.txtPassword.getPassword());
        String position = String.valueOf(viewLogin.cboPosition.getSelectedItem());
        employee= modelLogin.verifyUser(id,password,position);
        if (employee==null){
            JOptionPane.showMessageDialog(viewLogin, "Employee not found");
        }
        else{
            JOptionPane.showMessageDialog(viewLogin, "Employee found");
            JFWelcome viewG= new JFWelcome ();
            viewG.lblWelcome.setText("Welcome " + employee.getPassword());
            ControllerWelcome controllerW= new ControllerWelcome (viewG, modelLogin);
            controllerW.InitializeWelcome(id,password,position);
            viewG.setVisible(true);
            viewG.setLocationRelativeTo(null);
            viewLogin.setVisible(false);
            
        }
        
    }
}


