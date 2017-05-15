/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package General;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author ricardo
 */
public class ClsFecha {
      
    static SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    
  
    public static String ObtenerFechaActual()
    {
        Date hoy = new Date();
        String fecha = formato.format(hoy);        
        return fecha;
    }
}
