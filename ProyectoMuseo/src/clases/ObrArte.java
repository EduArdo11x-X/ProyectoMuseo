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
    private String nombre;
    private int codigo;
    private String descripcion;
    private Date fecha_creacion;

    public ObrArte() {
    }

    public ObrArte(String nombre, int codigo, String descripcion, Date fecha_creacion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.fecha_creacion = fecha_creacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
        return "ObrArte{" + "nombre=" + nombre + ", codigo=" + codigo + ", descripcion=" + descripcion + ", fecha_creacion=" + fecha_creacion + '}';
    }
    
    
}
