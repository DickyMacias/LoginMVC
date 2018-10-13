/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.mvc;
import Controller.ControllerLogin;
import Model.EmployeeDAO;
import View.JFLogin;
/**
 *
 * @author racna
 */
public class LoginMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFLogin viewL = new JFLogin();
        EmployeeDAO modelL= new EmployeeDAO();
        ControllerLogin ControllerL= new ControllerLogin(viewL,modelL);
        viewL.setVisible(true);
        viewL.setLocationRelativeTo(null);
    }
    
}
