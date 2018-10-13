/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author racna
 */
public class Connection { public Connection(){
    
}
    public java.sql.Connection getConnection(){
    java.sql.Connection con=null;
        
    try {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/p1","root", "");
        
    } catch (SQLException ex){
        
    }catch (Exception e){
        
    }
    return con;
    }
          
}
