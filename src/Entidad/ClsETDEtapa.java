/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
     * @author      Ricardo Velasquez Tejerina
     */
public class ClsETDEtapa {
    
    	private int ETAid_etapa;
	private String ETAnombre;
	private String ETAdescripcion;
	private int METid_metodologia;

        //Constructores
    public ClsETDEtapa(int ETAid_etapa, String ETAnombre, String ETAdescripcion, int METid_metodologia) {
        this.ETAid_etapa = ETAid_etapa;
        this.ETAnombre = ETAnombre;
        this.ETAdescripcion = ETAdescripcion;
        this.METid_metodologia = METid_metodologia;
    }
         //Campos Encapsulados
    public int getETAid_etapa() {
        return ETAid_etapa;
    }

    public void setETAid_etapa(int ETAid_etapa) {
        this.ETAid_etapa = ETAid_etapa;
    }

    public String getETAnombre() {
        return ETAnombre;
    }

    public void setETAnombre(String ETAnombre) {
        this.ETAnombre = ETAnombre;
    }

    public String getETAdescripcion() {
        return ETAdescripcion;
    }

    public void setETAdescripcion(String ETAdescripcion) {
        this.ETAdescripcion = ETAdescripcion;
    }

    public int getMETid_metodologia() {
        return METid_metodologia;
    }

    public void setMETid_metodologia(int METid_metodologia) {
        this.METid_metodologia = METid_metodologia;
    }
        
}
