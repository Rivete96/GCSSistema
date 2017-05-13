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
public class ClsETDVersion {
    
        private int VERid_version;
	private String VERestado;
	private String VERcomentario;
	private String VERultimaRevision;
	private int VERnumero_version;
	private String VERnombre_aprobado;
	private String VERentregable_aprobado;

            //Constructores
    public ClsETDVersion(int VERid_version, String VERestado, String VERcomentario, String VERultimaRevision, int VERnumero_version, String VERnombre_aprobado, String VERentregable_aprobado) {
        this.VERid_version = VERid_version;
        this.VERestado = VERestado;
        this.VERcomentario = VERcomentario;
        this.VERultimaRevision = VERultimaRevision;
        this.VERnumero_version = VERnumero_version;
        this.VERnombre_aprobado = VERnombre_aprobado;
        this.VERentregable_aprobado = VERentregable_aprobado;
    }
    
     //Campos Encapsulados
    
    public int getVERid_version() {
        return VERid_version;
    }

    public void setVERid_version(int VERid_version) {
        this.VERid_version = VERid_version;
    }

    public String getVERestado() {
        return VERestado;
    }

    public void setVERestado(String VERestado) {
        this.VERestado = VERestado;
    }

    public String getVERcomentario() {
        return VERcomentario;
    }

    public void setVERcomentario(String VERcomentario) {
        this.VERcomentario = VERcomentario;
    }

    public String getVERultimaRevision() {
        return VERultimaRevision;
    }

    public void setVERultimaRevision(String VERultimaRevision) {
        this.VERultimaRevision = VERultimaRevision;
    }

    public int getVERnumero_version() {
        return VERnumero_version;
    }

    public void setVERnumero_version(int VERnumero_version) {
        this.VERnumero_version = VERnumero_version;
    }

    public String getVERnombre_aprobado() {
        return VERnombre_aprobado;
    }

    public void setVERnombre_aprobado(String VERnombre_aprobado) {
        this.VERnombre_aprobado = VERnombre_aprobado;
    }

    public String getVERentregable_aprobado() {
        return VERentregable_aprobado;
    }

    public void setVERentregable_aprobado(String VERentregable_aprobado) {
        this.VERentregable_aprobado = VERentregable_aprobado;
    }
}
