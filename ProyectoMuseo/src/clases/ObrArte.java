/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class ObrArte {
    private String codigo;
    private String nombre;
    private String descripcion;
    private Date fecha_creacion;

    public ObrArte() {
    }

    public ObrArte(String codigo, String nombre, String descripcion, Date fecha_creacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha_creacion = fecha_creacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    @Override
    public String toString() {
        return "ObrArte{" + "codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fecha_creacion=" + fecha_creacion + '}';
    }

   
    
}
