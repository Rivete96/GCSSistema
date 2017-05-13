/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author ricardo
 */
public class ClsETDMetodologia {

        private int METid_metodologia;
	private String METfecha;
	private String METdescripcion;
	private String METnombre;
    
    //Constructores
    public ClsETDMetodologia(int METid_metodologia, String METfecha, String METdescripcion) {
        this.METid_metodologia = METid_metodologia;
        this.METfecha = METfecha;
        this.METdescripcion = METdescripcion;
    }
    //Campos Encapsulados
    public int getMETid_metodologia() {
        return METid_metodologia;
    }

    public void setMETid_metodologia(int METid_metodologia) {
        this.METid_metodologia = METid_metodologia;
    }

    public String getMETfecha() {
        return METfecha;
    }

    public void setMETfecha(String METfecha) {
        this.METfecha = METfecha;
    }

    public String getMETdescripcion() {
        return METdescripcion;
    }

    public void setMETdescripcion(String METdescripcion) {
        this.METdescripcion = METdescripcion;
    }

    public String getMETnombre() {
        return METnombre;
    }

    public void setMETnombre(String METnombre) {
        this.METnombre = METnombre;
    }
    
    
    	
}
