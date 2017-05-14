/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
     * @author      Ricardo Velasquez Tejerina
     */
public class ClsETDDocumento {

     private int DOCid_documento;
     private int EPRid_entregable_proyecto;
     private int ENTid_entregable;
     private int ETAid_etapa;
     private int METid_metodologia;
     private int PROid_proyecto;
     private int USUid_usuario;
     private int VERid_version;
     private int REVid_revision;
     private String DOCresponsable;
     private String DOCcomentario;
     private String DOCfecha_limite;
     private String DOCestado;
    
     //Constructores
    public ClsETDDocumento(int DOCid_documento, int EPRid_entregable_proyecto, int ENTid_entregable, int ETAid_etapa, int METid_metodologia, int PROid_proyecto, int USUid_usuario, int VERid_version, int REVid_revision, String DOCresponsable, String DOCcomentario, String DOCfecha_limite, String DOCestado) {
        this.DOCid_documento = DOCid_documento;
        this.EPRid_entregable_proyecto = EPRid_entregable_proyecto;
        this.ENTid_entregable = ENTid_entregable;
        this.ETAid_etapa = ETAid_etapa;
        this.METid_metodologia = METid_metodologia;
        this.PROid_proyecto = PROid_proyecto;
        this.USUid_usuario = USUid_usuario;
        this.VERid_version = VERid_version;
        this.REVid_revision = REVid_revision;
        this.DOCresponsable = DOCresponsable;
        this.DOCcomentario = DOCcomentario;
        this.DOCfecha_limite = DOCfecha_limite;
        this.DOCestado = DOCestado;
    }

    //Campos Encapsulados
    
    public int getDOCid_documento() {
        return DOCid_documento;
    }

    public void setDOCid_documento(int DOCid_documento) {
        this.DOCid_documento = DOCid_documento;
    }

    public int getEPRid_entregable_proyecto() {
        return EPRid_entregable_proyecto;
    }

    public void setEPRid_entregable_proyecto(int EPRid_entregable_proyecto) {
        this.EPRid_entregable_proyecto = EPRid_entregable_proyecto;
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

    public int getVERid_version() {
        return VERid_version;
    }

    public void setVERid_version(int VERid_version) {
        this.VERid_version = VERid_version;
    }

    public int getREVid_revision() {
        return REVid_revision;
    }

    public void setREVid_revision(int REVid_revision) {
        this.REVid_revision = REVid_revision;
    }

    public String getDOCresponsable() {
        return DOCresponsable;
    }

    public void setDOCresponsable(String DOCresponsable) {
        this.DOCresponsable = DOCresponsable;
    }

    public String getDOCcomentario() {
        return DOCcomentario;
    }

    public void setDOCcomentario(String DOCcomentario) {
        this.DOCcomentario = DOCcomentario;
    }

    public String getDOCfecha_limite() {
        return DOCfecha_limite;
    }

    public void setDOCfecha_limite(String DOCfecha_limite) {
        this.DOCfecha_limite = DOCfecha_limite;
    }

    public String getDOCestado() {
        return DOCestado;
    }

    public void setDOCestado(String DOCestado) {
        this.DOCestado = DOCestado;
    }
     
     
}
