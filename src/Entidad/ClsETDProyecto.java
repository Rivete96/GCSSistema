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
public class ClsETDProyecto {
    
    	private int PROid_proyecto;
	private String PROtitulo;
	private String PROparticipantes;
	private String PROdescripcion;
	private String PROfecha_inicio;
	private String PROelaboracion;
	private int METid_metodologia;
	private int USUid_usuario;

        //Constructores
    public ClsETDProyecto(int PROid_proyecto, String PROtitulo, String PROparticipantes, String PROdescripcion, String PROfecha_inicio, String PROelaboracion, int METid_metodologia, int USUid_usuario) {
        this.PROid_proyecto = PROid_proyecto;
        this.PROtitulo = PROtitulo;
        this.PROparticipantes = PROparticipantes;
        this.PROdescripcion = PROdescripcion;
        this.PROfecha_inicio = PROfecha_inicio;
        this.PROelaboracion = PROelaboracion;
        this.METid_metodologia = METid_metodologia;
        this.USUid_usuario = USUid_usuario;
    }
        //Campos Encapsulados
    public int getPROid_proyecto() {
        return PROid_proyecto;
    }

    public void setPROid_proyecto(int PROid_proyecto) {
        this.PROid_proyecto = PROid_proyecto;
    }

    public String getPROtitulo() {
        return PROtitulo;
    }

    public void setPROtitulo(String PROtitulo) {
        this.PROtitulo = PROtitulo;
    }

    public String getPROparticipantes() {
        return PROparticipantes;
    }

    public void setPROparticipantes(String PROparticipantes) {
        this.PROparticipantes = PROparticipantes;
    }

    public String getPROdescripcion() {
        return PROdescripcion;
    }

    public void setPROdescripcion(String PROdescripcion) {
        this.PROdescripcion = PROdescripcion;
    }

    public String getPROfecha_inicio() {
        return PROfecha_inicio;
    }

    public void setPROfecha_inicio(String PROfecha_inicio) {
        this.PROfecha_inicio = PROfecha_inicio;
    }

    public String getPROelaboracion() {
        return PROelaboracion;
    }

    public void setPROelaboracion(String PROelaboracion) {
        this.PROelaboracion = PROelaboracion;
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
