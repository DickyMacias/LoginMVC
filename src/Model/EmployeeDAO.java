/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.sql.*;

/**
 *
 * @author racna
 */
public class EmployeeDAO {
    Connection connection;
    
    public EmployeeDAO(){
        connection = new Connection();
    }
    
    public Employee verifyUser (String id, String password, String position){
        Employee employee = null;
        java.sql.Connection accesoDB = connection.getConnection();
        try {
         PreparedStatement ps= accesoDB.prepareStatement ("select * from user where id=? and password=? and position=?");   
         ps.setString (1, id);
         ps.setString(2, password);
         ps.setString(3, position);
         
         ResultSet rs= ps.executeQuery();
         if (rs.next()){
             employee = new Employee();
             employee.setId(rs.getString(1));
             employee.setPassword(rs.getString(2));
             employee.setLast_name(rs.getString(3));
             employee.setName(rs.getString(4));
             employee.setPosition(rs.getString(5));
             return employee;
         }
        }   catch (Exception e){
            System.err.printf(e.getMessage());
        }
        return employee;
    }
    
}
