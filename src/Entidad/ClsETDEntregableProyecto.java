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
public class ClsETDEntregableProyecto {

        private int EPRid_entregable_proyecto;
	private String EPRparticipantes;
	private String EPRresponsable;
	private String EPRfecha_limite;
	private String EPRfecha_aprobacion;
	private String EPRestado;
	private String EPRfecha_revisado;
	private String EPRjefe_aprobado;
	private String EPRmiembro_revisado;
	private int ENTid_entregable;
	private int ETAid_etapa;
	private int METid_metodologia;
	private int PROid_proyecto;
	private int USUid_usuario;
    
            //Constructores
    public ClsETDEntregableProyecto(int EPRid_entregable_proyecto, String EPRparticipantes, String EPRresponsable, String EPRfecha_limite, String EPRfecha_aprobacion, String EPRestado, String EPRfecha_revisado, String EPRjefe_aprobado, String EPRmiembro_revisado, int ENTid_entregable, int ETAid_etapa, int METid_metodologia, int PROid_proyecto, int USUid_usuario) {
        this.EPRid_entregable_proyecto = EPRid_entregable_proyecto;
        this.EPRparticipantes = EPRparticipantes;
        this.EPRresponsable = EPRresponsable;
        this.EPRfecha_limite = EPRfecha_limite;
        this.EPRfecha_aprobacion = EPRfecha_aprobacion;
        this.EPRestado = EPRestado;
        this.EPRfecha_revisado = EPRfecha_revisado;
        this.EPRjefe_aprobado = EPRjefe_aprobado;
        this.EPRmiembro_revisado = EPRmiembro_revisado;
        this.ENTid_entregable = ENTid_entregable;
        this.ETAid_etapa = ETAid_etapa;
        this.METid_metodologia = METid_metodologia;
        this.PROid_proyecto = PROid_proyecto;
        this.USUid_usuario = USUid_usuario;
    }

     //Campos Encapsulados
    
    public int getEPRid_entregable_proyecto() {
        return EPRid_entregable_proyecto;
    }

    public void setEPRid_entregable_proyecto(int EPRid_entregable_proyecto) {
        this.EPRid_entregable_proyecto = EPRid_entregable_proyecto;
    }

    public String getEPRparticipantes() {
        return EPRparticipantes;
    }

    public void setEPRparticipantes(String EPRparticipantes) {
        this.EPRparticipantes = EPRparticipantes;
    }

    public String getEPRresponsable() {
        return EPRresponsable;
    }

    public void setEPRresponsable(String EPRresponsable) {
        this.EPRresponsable = EPRresponsable;
    }

    public String getEPRfecha_limite() {
        return EPRfecha_limite;
    }

    public void setEPRfecha_limite(String EPRfecha_limite) {
        this.EPRfecha_limite = EPRfecha_limite;
    }

    public String getEPRfecha_aprobacion() {
        return EPRfecha_aprobacion;
    }

    public void setEPRfecha_aprobacion(String EPRfecha_aprobacion) {
        this.EPRfecha_aprobacion = EPRfecha_aprobacion;
    }

    public String getEPRestado() {
        return EPRestado;
    }

    public void setEPRestado(String EPRestado) {
        this.EPRestado = EPRestado;
    }

    public String getEPRfecha_revisado() {
        return EPRfecha_revisado;
    }

    public void setEPRfecha_revisado(String EPRfecha_revisado) {
        this.EPRfecha_revisado = EPRfecha_revisado;
    }

    public String getEPRjefe_aprobado() {
        return EPRjefe_aprobado;
    }

    public void setEPRjefe_aprobado(String EPRjefe_aprobado) {
        this.EPRjefe_aprobado = EPRjefe_aprobado;
    }

    public String getEPRmiembro_revisado() {
        return EPRmiembro_revisado;
    }

    public void setEPRmiembro_revisado(String EPRmiembro_revisado) {
        this.EPRmiembro_revisado = EPRmiembro_revisado;
    }

    public int getENTid_entregable() {
        return ENTid_entregable;
    }

    public void setENTid_entregable(int ENTid_entregable) {
        this.ENTid_entregable = ENTid_entregable;
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

    public int getPROid_proyecto() {
        return PROid_proyecto;
    }

    public void setPROid_proyecto(int PROid_proyecto) {
        this.PROid_proyecto = PROid_proyecto;
    }

    public int getUSUid_usuario() {
        return USUid_usuario;
    }

    public void setUSUid_usuario(int USUid_usuario) {
        this.USUid_usuario = USUid_usuario;
    }
}
