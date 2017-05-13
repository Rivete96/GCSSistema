/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;
//Libreria de conexion a Mysql
import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author ricardo
 */
public class ClsConexionDB {
        /**
     * @author      Ricardo Velasquez Tejerina
     */
        private static Connection conexion = null;
    
    public Connection getConnection()
    {
        try
        {
            //conexion con MySQL
            MysqlConnectionPoolDataSource ds = new MysqlConnectionPoolDataSource();
            ds.setServerName("localhost"); //si esta en la web se ingresa la IP
            ds.setPort(3306);
            ds.setDatabaseName("gestiondb");
            conexion = ds.getConnection("root","");
        }
        //En el caso de la conexion falle, o algun error de logeo se de mostrara mensaje.
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,
            "Error de conexion a la BD...","Conexion",1);
        }
        return conexion;
    }
}
