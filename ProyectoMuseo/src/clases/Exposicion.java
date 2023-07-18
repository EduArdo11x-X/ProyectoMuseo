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

    public Exposicion() {
    }

    public Exposicion(String cod_exposicion, String nombre_exposicion, String descripcion_exposicion) {
        this.cod_exposicion = cod_exposicion;
        this.nombre_exposicion = nombre_exposicion;
        this.descripcion_exposicion = descripcion_exposicion;
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

    @Override
    public String toString() {
        return "Exposicion{" + "cod_exposicion=" + cod_exposicion + ", nombre_exposicion=" + nombre_exposicion + ", descripcion_exposicion=" + descripcion_exposicion + '}';
    }

    
    
    
}
