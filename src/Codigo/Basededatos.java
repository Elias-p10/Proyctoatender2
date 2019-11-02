package Codigo;

import javax.swing.JOptionPane;
import java.sql.*;


public class Basededatos {
    
    Connection conectar=null;
    
    public Connection conexion(){
        
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
           conectar=DriverManager.getConnection("jdbc:mysql://localhost/Universidad?serverTimezone=UTC","root","");
             
        } catch (ClassNotFoundException | SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Error de conexion" + e.getMessage());
        
        }
        
        return conectar;
        
    }
    
}
