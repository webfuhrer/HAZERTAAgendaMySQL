/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendamysql;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Admin
 */
class AccesoBD {
static String ruta_mysql="jdbc:mysql://localhost:3306/bd_agenda";
static String usuario="root";
static String password="";
static Connection c=null;
    static boolean grabarContacto(Contacto x) {
        String nombre=x.getNombre();
        String apellido=x.getApellido();
        String email=x.getEmail();
        String sql="INSERT INTO contactos VALUES('"+nombre+"', '"+apellido+"', '"+email+"')";
    try {
        //INSERT INTO contactos VALUES ('pepe', 'perez','pepe@mail.com')
        c=DriverManager.getConnection(ruta_mysql, usuario, password);
        Statement stmt=c.createStatement();
        stmt.executeUpdate(sql);
        return true;
    } catch (SQLException ex) {
        //Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, ex);
        
    }
 
 
    return false;
      
    }
    
}
