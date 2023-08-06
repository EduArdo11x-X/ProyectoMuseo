/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Date;


public class Control_guardia {
    private String cod_control_guardia;
    private Date fecha;
    private String observaciones;
    private String id_guardia;
    private String cod_exposicion;

    public Control_guardia(String cod_control_guardia, Date fecha, String observaciones, String id_guardia, String cod_exposicion) {
        this.cod_control_guardia = cod_control_guardia;
        this.fecha = fecha;
        this.observaciones = observaciones;
        this.id_guardia = id_guardia;
        this.cod_exposicion = cod_exposicion;
    }

    public Control_guardia() {
    }

    public String getCod_control_guardia() {
        return cod_control_guardia;
    }

    public void setCod_control_guardia(String cod_control_guardia) {
        this.cod_control_guardia = cod_control_guardia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getId_guardia() {
        return id_guardia;
    }

    public void setId_guardia(String id_guardia) {
        this.id_guardia = id_guardia;
    }

    public String getCod_exposicion() {
        return cod_exposicion;
    }

    public void setCod_exposicion(String cod_exposicion) {
        this.cod_exposicion = cod_exposicion;
    }

    @Override
    public String toString() {
        return "Control_guardia{" + "cod_control_guardia=" + cod_control_guardia + ", fecha=" + fecha + ", observaciones=" + observaciones + ", id_guardia=" + id_guardia + ", cod_exposicion=" + cod_exposicion + '}';
    }

    
}
