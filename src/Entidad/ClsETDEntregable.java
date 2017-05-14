/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
     * @author      Ricardo Velasquez Tejerina
     */
public class ClsETDEntregable {

        private int ENTid_entregable;
	private String ENTnombre;
	private String ENTdescripcion;
	private String ENTnomenclatura;
	private int ETAid_etapa;
	private int METid_metodologia;
        
    //Constructores
    public ClsETDEntregable(int ENTid_entregable, String ENTnombre, String ENTdescripcion, String ENTnomenclatura, int ETAid_etapa, int METid_metodologia) {
        this.ENTid_entregable = ENTid_entregable;
        this.ENTnombre = ENTnombre;
        this.ENTdescripcion = ENTdescripcion;
        this.ENTnomenclatura = ENTnomenclatura;
        this.ETAid_etapa = ETAid_etapa;
        this.METid_metodologia = METid_metodologia;
    }

     //Campos Encapsulados
    
    public int getENTid_entregable() {
        return ENTid_entregable;
    }

    public void setENTid_entregable(int ENTid_entregable) {
        this.ENTid_entregable = ENTid_entregable;
    }

    public String getENTnombre() {
        return ENTnombre;
    }

    public void setENTnombre(String ENTnombre) {
        this.ENTnombre = ENTnombre;
    }

    public String getENTdescripcion() {
        return ENTdescripcion;
    }

    public void setENTdescripcion(String ENTdescripcion) {
        this.ENTdescripcion = ENTdescripcion;
    }

    public String getENTnomenclatura() {
        return ENTnomenclatura;
    }

    public void setENTnomenclatura(String ENTnomenclatura) {
        this.ENTnomenclatura = ENTnomenclatura;
    }

    public int getETAid_etapa() {
        return ETAid_etapa;
    }

    public void setETAid_etapa(int ETAid_etapa) {
        this.ETAid_etapa = ETAid_etapa;
    }

    public int getMETid_metodologia() {
        return METid_metodologia;
    }

    public void setMETid_metodologia(int METid_metodologia) {
        this.METid_metodologia = METid_metodologia;
    }
    
        
}
