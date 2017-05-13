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
public class ClsETDSolicitud {

        private int SLDid_solicitud;
	private String SLDnombre;
	private String SLDresponsable;
	private String SLDfecha_inicio;
	private String SLDfecha_limite;
	private String SLDdocumento;
	private String SLDcomite;
	private String SLDcomentario;
	private String SLDevaluador;
	private String SLDestado;
	private int PROid_proyecto;
	private int METid_metodologia;
	private int USUid_usuario;
    
         //Constructores
        
    public ClsETDSolicitud(int SLDid_solicitud, String SLDnombre, String SLDresponsable, String SLDfecha_inicio, String SLDfecha_limite, String SLDdocumento, String SLDcomite, String SLDcomentario, String SLDevaluador, String SLDestado, int PROid_proyecto, int METid_metodologia, int USUid_usuario) {
        this.SLDid_solicitud = SLDid_solicitud;
        this.SLDnombre = SLDnombre;
        this.SLDresponsable = SLDresponsable;
        this.SLDfecha_inicio = SLDfecha_inicio;
        this.SLDfecha_limite = SLDfecha_limite;
        this.SLDdocumento = SLDdocumento;
        this.SLDcomite = SLDcomite;
        this.SLDcomentario = SLDcomentario;
        this.SLDevaluador = SLDevaluador;
        this.SLDestado = SLDestado;
        this.PROid_proyecto = PROid_proyecto;
        this.METid_metodologia = METid_metodologia;
        this.USUid_usuario = USUid_usuario;
    }

      //Campos Encapsulados
    
    public int getSLDid_solicitud() {
        return SLDid_solicitud;
    }

    public void setSLDid_solicitud(int SLDid_solicitud) {
        this.SLDid_solicitud = SLDid_solicitud;
    }

    public String getSLDnombre() {
        return SLDnombre;
    }

    public void setSLDnombre(String SLDnombre) {
        this.SLDnombre = SLDnombre;
    }

    public String getSLDresponsable() {
        return SLDresponsable;
    }

    public void setSLDresponsable(String SLDresponsable) {
        this.SLDresponsable = SLDresponsable;
    }

    public String getSLDfecha_inicio() {
        return SLDfecha_inicio;
    }

    public void setSLDfecha_inicio(String SLDfecha_inicio) {
        this.SLDfecha_inicio = SLDfecha_inicio;
    }

    public String getSLDfecha_limite() {
        return SLDfecha_limite;
    }

    public void setSLDfecha_limite(String SLDfecha_limite) {
        this.SLDfecha_limite = SLDfecha_limite;
    }

    public String getSLDdocumento() {
        return SLDdocumento;
    }

    public void setSLDdocumento(String SLDdocumento) {
        this.SLDdocumento = SLDdocumento;
    }

    public String getSLDcomite() {
        return SLDcomite;
    }

    public void setSLDcomite(String SLDcomite) {
        this.SLDcomite = SLDcomite;
    }

    public String getSLDcomentario() {
        return SLDcomentario;
    }

    public void setSLDcomentario(String SLDcomentario) {
        this.SLDcomentario = SLDcomentario;
    }

    public String getSLDevaluador() {
        return SLDevaluador;
    }

    public void setSLDevaluador(String SLDevaluador) {
        this.SLDevaluador = SLDevaluador;
    }

    public String getSLDestado() {
        return SLDestado;
    }

    public void setSLDestado(String SLDestado) {
        this.SLDestado = SLDestado;
    }

    public int getPROid_proyecto() {
        return PROid_proyecto;
    }

    public void setPROid_proyecto(int PROid_proyecto) {
        this.PROid_proyecto = PROid_proyecto;
    }

    public int getMETid_metodologia() {
        return METid_metodologia;
    }

    public void setMETid_metodologia(int METid_metodologia) {
        this.METid_metodologia = METid_metodologia;
    }

    public int getUSUid_usuario() {
        return USUid_usuario;
    }

    public void setUSUid_usuario(int USUid_usuario) {
        this.USUid_usuario = USUid_usuario;
    }
    
    	
}
