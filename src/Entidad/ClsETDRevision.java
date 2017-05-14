/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
     * @author      Ricardo Velasquez Tejerina
     */
public class ClsETDRevision {
    
    	private int REVid_revision;
	private String REVestado;
	private String REVfecha_limite;
	private String REVcomentario;
	private String REVultima_revision;
	private String REVentregable_revision;
	private String REVentregable_anterior;
	private int VERid_version;

         //Constructores
    public ClsETDRevision(int REVid_revision, String REVestado, String REVfecha_limite, String REVcomentario, String REVultima_revision, String REVentregable_revision, String REVentregable_anterior, int VERid_version) {
        this.REVid_revision = REVid_revision;
        this.REVestado = REVestado;
        this.REVfecha_limite = REVfecha_limite;
        this.REVcomentario = REVcomentario;
        this.REVultima_revision = REVultima_revision;
        this.REVentregable_revision = REVentregable_revision;
        this.REVentregable_anterior = REVentregable_anterior;
        this.VERid_version = VERid_version;
    }

      //Campos Encapsulados
    
    public int getREVid_revision() {
        return REVid_revision;
    }

    public void setREVid_revision(int REVid_revision) {
        this.REVid_revision = REVid_revision;
    }

    public String getREVestado() {
        return REVestado;
    }

    public void setREVestado(String REVestado) {
        this.REVestado = REVestado;
    }

    public String getREVfecha_limite() {
        return REVfecha_limite;
    }

    public void setREVfecha_limite(String REVfecha_limite) {
        this.REVfecha_limite = REVfecha_limite;
    }

    public String getREVcomentario() {
        return REVcomentario;
    }

    public void setREVcomentario(String REVcomentario) {
        this.REVcomentario = REVcomentario;
    }

    public String getREVultima_revision() {
        return REVultima_revision;
    }

    public void setREVultima_revision(String REVultima_revision) {
        this.REVultima_revision = REVultima_revision;
    }

    public String getREVentregable_revision() {
        return REVentregable_revision;
    }

    public void setREVentregable_revision(String REVentregable_revision) {
        this.REVentregable_revision = REVentregable_revision;
    }

    public String getREVentregable_anterior() {
        return REVentregable_anterior;
    }

    public void setREVentregable_anterior(String REVentregable_anterior) {
        this.REVentregable_anterior = REVentregable_anterior;
    }

    public int getVERid_version() {
        return VERid_version;
    }

    public void setVERid_version(int VERid_version) {
        this.VERid_version = VERid_version;
    }
}
