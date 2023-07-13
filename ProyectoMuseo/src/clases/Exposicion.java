/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Date;

/**
 *
 * @author EDU
 */
public class Exposicion {
    private String cod_exposicion;
    private String nombre_exposicion;
    private String descripcion_exposicion;
    private Date fecha_inicio;
    private Date fecha_fin;

    public Exposicion() {
    }

    public Exposicion(String cod_exposicion, String nombre_exposicion, String descripcion_exposicion, Date fecha_inicio, Date fecha_fin) {
        this.cod_exposicion = cod_exposicion;
        this.nombre_exposicion = nombre_exposicion;
        this.descripcion_exposicion = descripcion_exposicion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }

    public String getCod_exposicion() {
        return cod_exposicion;
    }

    public void setCod_exposicion(String cod_exposicion) {
        this.cod_exposicion = cod_exposicion;
    }

    public String getNombre_exposicion() {
        return nombre_exposicion;
    }

    public void setNombre_exposicion(String nombre_exposicion) {
        this.nombre_exposicion = nombre_exposicion;
    }

    public String getDescripcion_exposicion() {
        return descripcion_exposicion;
    }

    public void setDescripcion_exposicion(String descripcion_exposicion) {
        this.descripcion_exposicion = descripcion_exposicion;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    @Override
    public String toString() {
        return "Exposicion{" + "cod_exposicion=" + cod_exposicion + ", nombre_exposicion=" + nombre_exposicion + ", descripcion_exposicion=" + descripcion_exposicion + ", fecha_inicio=" + fecha_inicio + ", fecha_fin=" + fecha_fin + '}';
    }
    
    
    
    
}
