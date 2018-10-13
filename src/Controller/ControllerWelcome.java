/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.Employee;
import Model.EmployeeDAO;
import View.JFWelcome;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author racna
 */
public class ControllerWelcome implements ActionListener {
    
    JFWelcome viewWelcome= new JFWelcome();
    EmployeeDAO modelWelcome = new EmployeeDAO();
    Employee employee = new Employee();
    String id, password, position;
    
    public ControllerWelcome (JFWelcome viewWelcome, EmployeeDAO modelWelcome){
        this.viewWelcome=viewWelcome;
        this.modelWelcome=modelWelcome;
        this.viewWelcome.btnDataWelcome.addActionListener(this);
    }
    
    public void InitializeWelcome(String id, String password, String position){
        this.id=id;
        this.password=password;
        this.position=position;
    }
    
    public void actionPerformed(ActionEvent e){
        employee=modelWelcome.verifyUser(id, password, position);
        
        JOptionPane.showMessageDialog(viewWelcome,"Manager's User data \n"
        +"Name and last name: " + employee.getLastName()+ ", " + employee.getPassword() + "\n"
        + "Position: " + employee.getPosition());
    }

  

            
    }
    

