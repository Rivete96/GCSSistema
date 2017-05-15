/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;
//Libreria de conexion a Mysql
import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;
import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;
/**
 *
 * @author ricardo
 */
public class ClsConexionDB {
        /**
     * @author      Ricardo Velasquez Tejerina
     */

    public static Connection AbrirConexion() {
        
        Connection conexion = null;
        try
        {
            MysqlConnectionPoolDataSource ds = new MysqlConnectionPoolDataSource();
            ds.setServerName("127.0.0.1");
            ds.setPort(3306);
            ds.setDatabaseName("gestiondb");
            conexion = ds.getConnection("root","");
        }
        catch(SQLException ex)
        {
            Logger.getLogger(ClsConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;
        
    }
    
    /**
     * Cierra la conexion con MySQL.
     * <p>
     * @author  Ricardo Velasquez Tejerina
     * @param       xConexion       La conexion a cerrar.
     */
    public static void CerrarConexion(Connection xConexion) {
        
        try
        {
            xConexion.close();            
        }
        catch(SQLException ex)
        {
            Logger.getLogger(ClsConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
